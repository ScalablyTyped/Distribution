package typings.ddTrace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object plugins {
  
  /**
    * This plugin patches the [bluebird](https://github.com/petkaantonov/bluebird)
    * module to bind the promise callback the the caller context.
    */
  type bluebird = typings.ddTrace.mod.plugins.Integration
  
  /**
    * This plugin patches the [bunyan](https://github.com/trentm/node-bunyan)
    * to automatically inject trace identifiers in log records when the
    * [logInjection](interfaces/traceroptions.html#logInjection) option is enabled
    * on the tracer.
    */
  type bunyan = typings.ddTrace.mod.plugins.Integration
  
  /**
    * This plugin automatically instruments the
    * [connect](https://github.com/senchalabs/connect) module.
    */
  type connect = typings.ddTrace.mod.plugins.HttpServer
  
  /**
    * This plugin automatically instruments the
    * [express](http://expressjs.com/) module.
    */
  type express = typings.ddTrace.mod.plugins.HttpServer
  
  /**
    * This plugin automatically instruments the
    * [fastify](https://www.fastify.io/) module.
    */
  type fastify = typings.ddTrace.mod.plugins.HttpServer
  
  /**
    * This plugin patches the [generic-pool](https://github.com/coopernurse/node-pool)
    * module to bind the callbacks the the caller context.
    */
  type genericPool = typings.ddTrace.mod.plugins.Integration
  
  /**
    * This plugin automatically instruments the
    * [@google-cloud/pubsub](https://github.com/googleapis/nodejs-pubsub) module.
    */
  type googleCloudPubsub = typings.ddTrace.mod.plugins.Integration
  
  /**
    * This plugin automatically instruments the
    * [hapi](https://hapijs.com/) module.
    */
  type hapi = typings.ddTrace.mod.plugins.HttpServer
  
  /**
    * This plugin patches the [knex](https://knexjs.org/)
    * module to bind the promise callback the the caller context.
    */
  type knex = typings.ddTrace.mod.plugins.Integration
  
  /**
    * This plugin automatically instruments the
    * [koa](https://koajs.com/) module.
    */
  type koa = typings.ddTrace.mod.plugins.HttpServer
  
  /**
    * This plugin automatically instruments the
    * [limitd-client](https://github.com/limitd/node-client) module.
    */
  type limitdClient = typings.ddTrace.mod.plugins.Integration
  
  /**
    * This plugin automatically instruments the
    * [microgateway-core](https://github.com/apigee/microgateway-core) module.
    */
  type microgatewayCore = typings.ddTrace.mod.plugins.HttpServer
  
  /**
    * This plugin automatically instruments the
    * [paperplane](https://github.com/articulate/paperplane) module.
    */
  type paperplane = typings.ddTrace.mod.plugins.HttpServer
  
  /**
    * This plugin patches the [pino](http://getpino.io)
    * to automatically inject trace identifiers in log records when the
    * [logInjection](interfaces/traceroptions.html#logInjection) option is enabled
    * on the tracer.
    */
  type pino = typings.ddTrace.mod.plugins.Integration
  
  /**
    * This plugin patches the [promise](https://github.com/then/promise)
    * module to bind the promise callback the the caller context.
    */
  type promise = typings.ddTrace.mod.plugins.Integration
  
  /**
    * This plugin patches the [promise-js](https://github.com/kevincennis/promise)
    * module to bind the promise callback the the caller context.
    */
  type promiseJs = typings.ddTrace.mod.plugins.Integration
  
  /**
    * This plugin patches the [q](https://github.com/kriskowal/q)
    * module to bind the promise callback the the caller context.
    */
  type q = typings.ddTrace.mod.plugins.Integration
  
  /**
    * This plugin automatically instruments the
    * [restify](http://restify.com/) module.
    */
  type restify = typings.ddTrace.mod.plugins.HttpServer
  
  /**
    * This plugin automatically instruments the
    * [router](https://github.com/pillarjs/router) module.
    */
  type router = typings.ddTrace.mod.plugins.Integration
  
  /**
    * This plugin patches the [when](https://github.com/cujojs/when)
    * module to bind the promise callback the the caller context.
    */
  type when = typings.ddTrace.mod.plugins.Integration
  
  /**
    * This plugin patches the [winston](https://github.com/winstonjs/winston)
    * to automatically inject trace identifiers in log records when the
    * [logInjection](interfaces/traceroptions.html#logInjection) option is enabled
    * on the tracer.
    */
  type winston = typings.ddTrace.mod.plugins.Integration
}
