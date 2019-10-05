package typings.ddDashTrace.ddDashTraceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object plugins {
  /**
    * This plugin automatically instruments the
    * [amqp10](https://github.com/noodlefrenzy/node-amqp10) module.
    */
  type amqp10 = Instrumentation
  /**
    * This plugin automatically instruments the
    * [amqplib](https://github.com/squaremo/amqp.node) module.
    */
  type amqplib = Instrumentation
  /**
    * This plugin patches the [bluebird](https://github.com/petkaantonov/bluebird)
    * module to bind the promise callback the the caller context.
    */
  type bluebird = Integration
  /**
    * This plugin patches the [bunyan](https://github.com/trentm/node-bunyan)
    * to automatically inject trace identifiers in log records when the
    * [logInjection](interfaces/traceroptions.html#logInjection) option is enabled
    * on the tracer.
    */
  type bunyan = Integration
  /**
    * This plugin automatically instruments the
    * [cassandra-driver](https://github.com/datastax/nodejs-driver) module.
    */
  type cassandra_driver = Instrumentation
  /**
    * This plugin automatically instruments the
    * [connect](https://github.com/senchalabs/connect) module.
    */
  type connect = HttpServer
  /**
    * This plugin automatically instruments the
    * [couchbase](https://www.npmjs.com/package/couchbase) module.
    */
  type couchbase = Instrumentation
  /**
    * This plugin automatically instruments the
    * [dns](https://nodejs.org/api/dns.html) module.
    */
  type dns = Instrumentation
  /**
    * This plugin automatically instruments the
    * [elasticsearch](https://github.com/elastic/elasticsearch-js) module.
    */
  type elasticsearch = Instrumentation
  /**
    * This plugin automatically instruments the
    * [express](http://expressjs.com/) module.
    */
  type express = HttpServer
  /**
    * This plugin automatically instruments the
    * [fastify](https://www.fastify.io/) module.
    */
  type fastify = HttpServer
  /**
    * This plugin patches the [generic-pool](https://github.com/coopernurse/node-pool)
    * module to bind the callbacks the the caller context.
    */
  type generic_pool = Integration
  /**
    * This plugin automatically instruments the
    * [hapi](https://hapijs.com/) module.
    */
  type hapi = HttpServer
  /**
    * This plugin automatically instruments the
    * [ioredis](https://github.com/luin/ioredis) module.
    */
  type ioredis = Instrumentation
  /**
    * This plugin patches the [knex](https://knexjs.org/)
    * module to bind the promise callback the the caller context.
    */
  type knex = Integration
  /**
    * This plugin automatically instruments the
    * [koa](https://koajs.com/) module.
    */
  type koa = HttpServer
  /**
    * This plugin automatically instruments the
    * [limitd-client](https://github.com/limitd/node-client) module.
    */
  type limitd_client = Integration
  /**
    * This plugin automatically instruments the
    * [memcached](https://github.com/3rd-Eden/memcached) module.
    */
  type memcached = Instrumentation
  /**
    * This plugin automatically instruments the
    * [mongodb-core](https://github.com/mongodb-js/mongodb-core) module.
    */
  type mongodb_core = Instrumentation
  /**
    * This plugin automatically instruments the
    * [mysql](https://github.com/mysqljs/mysql) module.
    */
  type mysql = Instrumentation
  /**
    * This plugin automatically instruments the
    * [mysql2](https://github.com/brianmario/mysql2) module.
    */
  type mysql2 = Instrumentation
  /**
    * This plugin automatically instruments the
    * [net](https://nodejs.org/api/net.html) module.
    */
  type net = Instrumentation
  /**
    * This plugin automatically instruments the
    * [paperplane](https://github.com/articulate/paperplane) module.
    */
  type paperplane = HttpServer
  /**
    * This plugin automatically instruments the
    * [pg](https://node-postgres.com/) module.
    */
  type pg = Instrumentation
  /**
    * This plugin patches the [pino](http://getpino.io)
    * to automatically inject trace identifiers in log records when the
    * [logInjection](interfaces/traceroptions.html#logInjection) option is enabled
    * on the tracer.
    */
  type pino = Integration
  /**
    * This plugin patches the [promise](https://github.com/then/promise)
    * module to bind the promise callback the the caller context.
    */
  type promise = Integration
  /**
    * This plugin patches the [promise-js](https://github.com/kevincennis/promise)
    * module to bind the promise callback the the caller context.
    */
  type promise_js = Integration
  /**
    * This plugin patches the [q](https://github.com/kriskowal/q)
    * module to bind the promise callback the the caller context.
    */
  type q = Integration
  /**
    * This plugin automatically instruments the
    * [redis](https://github.com/NodeRedis/node_redis) module.
    */
  type redis = Instrumentation
  /**
    * This plugin automatically instruments the
    * [restify](http://restify.com/) module.
    */
  type restify = HttpServer
  /**
    * This plugin automatically instruments the
    * [router](https://github.com/pillarjs/router) module.
    */
  type router = Integration
  /**
    * This plugin automatically instruments the
    * [tedious](https://github.com/tediousjs/tedious/) module.
    */
  type tedious = Instrumentation
  /**
    * This plugin patches the [when](https://github.com/cujojs/when)
    * module to bind the promise callback the the caller context.
    */
  type when = Integration
  /**
    * This plugin patches the [winston](https://github.com/winstonjs/winston)
    * to automatically inject trace identifiers in log records when the
    * [logInjection](interfaces/traceroptions.html#logInjection) option is enabled
    * on the tracer.
    */
  type winston = Integration
}
