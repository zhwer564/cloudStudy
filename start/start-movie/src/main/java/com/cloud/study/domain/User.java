package com.cloud.study.domain;

import java.math.BigDecimal;

/**
 * @program: cloudStudy
 * @description:
 * @author: zhangwei
 * @create: 2019-08-14 13:48
 **/
public class User {
    private long id;
    private String username;
    private String name;
    private int age;
    private BigDecimal balance;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}

