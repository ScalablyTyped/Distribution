package typings.ddDashTrace.ddDashTraceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object plugins {
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
    * [connect](https://github.com/senchalabs/connect) module.
    */
  type connect = HttpServer
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
    * [paperplane](https://github.com/articulate/paperplane) module.
    */
  type paperplane = HttpServer
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
    * [restify](http://restify.com/) module.
    */
  type restify = HttpServer
  /**
    * This plugin automatically instruments the
    * [router](https://github.com/pillarjs/router) module.
    */
  type router = Integration
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
