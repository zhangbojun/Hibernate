package org.whut.hibernate.module;

/**
 * Created with IntelliJ IDEA.
 * User: zhangbojun
 * Date: 14-12-23
 * Time: 上午10:02
 * To change this template use File | Settings | File Templates.
 */
public class Student {

    private String id;

    private String name;

    private String cardId;
    private int age;

    private Team team;

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
