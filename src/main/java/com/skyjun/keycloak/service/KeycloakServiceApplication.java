package com.skyjun.keycloak.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.liquibase.LiquibaseAutoConfiguration;

@SpringBootApplication(exclude = LiquibaseAutoConfiguration.class)
public class KeycloakServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KeycloakServiceApplication.class, args);
    }

}
