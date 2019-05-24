package typings
package ddDashTraceLib.ddDashTraceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** @hidden */
trait Plugins extends js.Object {
  var amqp10: ddDashTraceLib.ddDashTraceMod.pluginsNs.amqp10
  var amqplib: ddDashTraceLib.ddDashTraceMod.pluginsNs.amqplib
  var bluebird: ddDashTraceLib.ddDashTraceMod.pluginsNs.bluebird
  var bunyan: ddDashTraceLib.ddDashTraceMod.pluginsNs.bunyan
  var `cassandra-driver`: ddDashTraceLib.ddDashTraceMod.pluginsNs.cassandra_driver
  var dns: ddDashTraceLib.ddDashTraceMod.pluginsNs.dns
  var elasticsearch: ddDashTraceLib.ddDashTraceMod.pluginsNs.elasticsearch
  var express: ddDashTraceLib.ddDashTraceMod.pluginsNs.express
  var `generic-pool`: ddDashTraceLib.ddDashTraceMod.pluginsNs.generic_pool
  var graphql: ddDashTraceLib.ddDashTraceMod.pluginsNs.graphql
  var hapi: ddDashTraceLib.ddDashTraceMod.pluginsNs.hapi
  var http: ddDashTraceLib.ddDashTraceMod.pluginsNs.http
  var ioredis: ddDashTraceLib.ddDashTraceMod.pluginsNs.ioredis
  var knex: ddDashTraceLib.ddDashTraceMod.pluginsNs.knex
  var koa: ddDashTraceLib.ddDashTraceMod.pluginsNs.koa
  var memcached: ddDashTraceLib.ddDashTraceMod.pluginsNs.memcached
  var `mongodb-core`: ddDashTraceLib.ddDashTraceMod.pluginsNs.mongodb_core
  var mysql: ddDashTraceLib.ddDashTraceMod.pluginsNs.mysql
  var mysql2: ddDashTraceLib.ddDashTraceMod.pluginsNs.mysql2
  var net: ddDashTraceLib.ddDashTraceMod.pluginsNs.net
  var pg: ddDashTraceLib.ddDashTraceMod.pluginsNs.pg
  var pino: ddDashTraceLib.ddDashTraceMod.pluginsNs.pino
  var q: ddDashTraceLib.ddDashTraceMod.pluginsNs.q
  var redis: ddDashTraceLib.ddDashTraceMod.pluginsNs.redis
  var restify: ddDashTraceLib.ddDashTraceMod.pluginsNs.restify
  var router: ddDashTraceLib.ddDashTraceMod.pluginsNs.router
  var when: ddDashTraceLib.ddDashTraceMod.pluginsNs.when
  var winston: ddDashTraceLib.ddDashTraceMod.pluginsNs.winston
}

object Plugins {
  @scala.inline
  def apply(
    amqp10: ddDashTraceLib.ddDashTraceMod.pluginsNs.amqp10,
    amqplib: ddDashTraceLib.ddDashTraceMod.pluginsNs.amqplib,
    bluebird: ddDashTraceLib.ddDashTraceMod.pluginsNs.bluebird,
    bunyan: ddDashTraceLib.ddDashTraceMod.pluginsNs.bunyan,
    `cassandra-driver`: ddDashTraceLib.ddDashTraceMod.pluginsNs.cassandra_driver,
    dns: ddDashTraceLib.ddDashTraceMod.pluginsNs.dns,
    elasticsearch: ddDashTraceLib.ddDashTraceMod.pluginsNs.elasticsearch,
    express: ddDashTraceLib.ddDashTraceMod.pluginsNs.express,
    `generic-pool`: ddDashTraceLib.ddDashTraceMod.pluginsNs.generic_pool,
    graphql: ddDashTraceLib.ddDashTraceMod.pluginsNs.graphql,
    hapi: ddDashTraceLib.ddDashTraceMod.pluginsNs.hapi,
    http: ddDashTraceLib.ddDashTraceMod.pluginsNs.http,
    ioredis: ddDashTraceLib.ddDashTraceMod.pluginsNs.ioredis,
    knex: ddDashTraceLib.ddDashTraceMod.pluginsNs.knex,
    koa: ddDashTraceLib.ddDashTraceMod.pluginsNs.koa,
    memcached: ddDashTraceLib.ddDashTraceMod.pluginsNs.memcached,
    `mongodb-core`: ddDashTraceLib.ddDashTraceMod.pluginsNs.mongodb_core,
    mysql: ddDashTraceLib.ddDashTraceMod.pluginsNs.mysql,
    mysql2: ddDashTraceLib.ddDashTraceMod.pluginsNs.mysql2,
    net: ddDashTraceLib.ddDashTraceMod.pluginsNs.net,
    pg: ddDashTraceLib.ddDashTraceMod.pluginsNs.pg,
    pino: ddDashTraceLib.ddDashTraceMod.pluginsNs.pino,
    q: ddDashTraceLib.ddDashTraceMod.pluginsNs.q,
    redis: ddDashTraceLib.ddDashTraceMod.pluginsNs.redis,
    restify: ddDashTraceLib.ddDashTraceMod.pluginsNs.restify,
    router: ddDashTraceLib.ddDashTraceMod.pluginsNs.router,
    when: ddDashTraceLib.ddDashTraceMod.pluginsNs.when,
    winston: ddDashTraceLib.ddDashTraceMod.pluginsNs.winston
  ): Plugins = {
    val __obj = js.Dynamic.literal(amqp10 = amqp10, amqplib = amqplib, bluebird = bluebird, bunyan = bunyan, dns = dns, elasticsearch = elasticsearch, express = express, graphql = graphql, hapi = hapi, http = http, ioredis = ioredis, knex = knex, koa = koa, memcached = memcached, mysql = mysql, mysql2 = mysql2, net = net, pg = pg, pino = pino, q = q, redis = redis, restify = restify, router = router, when = when, winston = winston)
    __obj.updateDynamic("cassandra-driver")(`cassandra-driver`)
    __obj.updateDynamic("generic-pool")(`generic-pool`)
    __obj.updateDynamic("mongodb-core")(`mongodb-core`)
    __obj.asInstanceOf[Plugins]
  }
}

