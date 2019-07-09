package typings
package ddDashTraceLib.ddDashTraceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object pluginsNs {
  /**
    * This plugin automatically instruments the
    * [amqp10](https://github.com/noodlefrenzy/node-amqp10) module.
    */
  type amqp10 = Integration
  /**
    * This plugin automatically instruments the
    * [amqplib](https://github.com/squaremo/amqp.node) module.
    */
  type amqplib = Integration
  /**
    * This plugin patches the [bluebird](https://github.com/squaremo/amqp.node)
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
  type cassandra_driver = Integration
  /**
    * This plugin automatically instruments the
    * [connect](https://github.com/senchalabs/connect) module.
    */
  type connect = HttpServer
  /**
    * This plugin automatically instruments the
    * [dns](https://nodejs.org/api/dns.html) module.
    */
  type dns = Integration
  /**
    * This plugin automatically instruments the
    * [elasticsearch](https://github.com/elastic/elasticsearch-js) module.
    */
  type elasticsearch = Integration
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
  type ioredis = Integration
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
    * [memcached](https://github.com/3rd-Eden/memcached) module.
    */
  type memcached = Integration
  /**
    * This plugin automatically instruments the
    * [mongodb-core](https://github.com/mongodb-js/mongodb-core) module.
    */
  type mongodb_core = Integration
  /**
    * This plugin automatically instruments the
    * [mysql](https://github.com/mysqljs/mysql) module.
    */
  type mysql = Integration
  /**
    * This plugin automatically instruments the
    * [mysql2](https://github.com/brianmario/mysql2) module.
    */
  type mysql2 = Integration
  /**
    * This plugin automatically instruments the
    * [net](https://nodejs.org/api/net.html) module.
    */
  type net = Integration
  /**
    * This plugin automatically instruments the
    * [paperplane](https://github.com/articulate/paperplane) module.
    */
  type paperplane = HttpServer
  /**
    * This plugin automatically instruments the
    * [pg](https://node-postgres.com/) module.
    */
  type pg = Integration
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
  type redis = Integration
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
  type tedious = Integration
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
