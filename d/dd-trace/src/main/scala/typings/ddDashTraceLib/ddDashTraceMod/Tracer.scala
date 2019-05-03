package typings
package ddDashTraceLib.ddDashTraceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait Tracer extends js.Object {
  /**
    * Returns a SpanContext instance extracted from `carrier` in the given
    * `format`.
    * @param  {string} format The format of the carrier.
    * @param  {any} carrier The carrier object.
    * @return {SpanContext}
    *         The extracted SpanContext, or null if no such SpanContext could
    *         be found in `carrier`
    */
  def extract(format: java.lang.String, carrier: js.Any): SpanContext | scala.Null = js.native
  /**
    * Initializes the tracer. This should be called before importing other libraries.
    */
  def init(): this.type = js.native
  def init(options: TracerOptions): this.type = js.native
  /**
    * Injects the given SpanContext instance for cross-process propagation
    * within `carrier`
    * @param  {SpanContext} spanContext The SpanContext to inject into the
    *         carrier object. As a convenience, a Span instance may be passed
    *         in instead (in which case its .context() is used for the
    *         inject()).
    * @param  {string} format The format of the carrier.
    * @param  {any} carrier The carrier object.
    */
  def inject(spanContext: SpanContext, format: java.lang.String, carrier: js.Any): scala.Unit = js.native
  def inject(spanContext: Span, format: java.lang.String, carrier: js.Any): scala.Unit = js.native
  /**
    * Returns a reference to the current scope.
    */
  def scope(): Scope = js.native
  /**
    * Starts and returns a new Span representing a logical unit of work.
    * @param {string} name The name of the operation.
    * @param {SpanOptions} [options] Options for the newly created span.
    * @returns {Span} A new Span object.
    */
  def startSpan(name: java.lang.String): Span = js.native
  def startSpan(name: java.lang.String, options: opentracingLib.libTracerMod.SpanOptions): Span = js.native
  /**
    * Instruments a function by automatically creating a span activated on its
    * scope.
    *
    * The span will automatically be finished when one of these conditions is
    * met:
    *
    * * The function returns a promise, in which case the span will finish when
    * the promise is resolved or rejected.
    * * The function takes a callback as its second parameter, in which case the
    * span will finish when that callback is called.
    * * The function doesn't accept a callback and doesn't return a promise, in
    * which case the span will finish at the end of the function execution.
    */
  def trace[T](
    name: java.lang.String,
    fn: js.Function2[
      /* span */ js.UndefOr[Span], 
      /* fn */ js.UndefOr[js.Function1[/* error */ js.UndefOr[stdLib.Error], _]], 
      T
    ]
  ): T = js.native
  def trace[T](
    name: java.lang.String,
    options: TraceOptions with opentracingLib.libTracerMod.SpanOptions,
    fn: js.Function2[
      /* span */ js.UndefOr[Span], 
      /* done */ js.UndefOr[js.Function1[/* error */ js.UndefOr[stdLib.Error], java.lang.String]], 
      T
    ]
  ): T = js.native
  /**
    * Enable and optionally configure a plugin.
    * @param plugin The name of a built-in plugin.
    * @param config Configuration options. Can also be `false` to disable the plugin.
    */
  @JSName("use")
  def use_amqp10(plugin: ddDashTraceLib.ddDashTraceLibStrings.amqp10): this.type = js.native
  @JSName("use")
  def use_amqp10(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.amqp10,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.amqp10
  ): this.type = js.native
  @JSName("use")
  def use_amqp10(plugin: ddDashTraceLib.ddDashTraceLibStrings.amqp10, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def use_amqplib(plugin: ddDashTraceLib.ddDashTraceLibStrings.amqplib): this.type = js.native
  @JSName("use")
  def use_amqplib(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.amqplib,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.amqplib
  ): this.type = js.native
  @JSName("use")
  def use_amqplib(plugin: ddDashTraceLib.ddDashTraceLibStrings.amqplib, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def use_bluebird(plugin: ddDashTraceLib.ddDashTraceLibStrings.bluebird): this.type = js.native
  @JSName("use")
  def use_bluebird(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.bluebird,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.bluebird
  ): this.type = js.native
  @JSName("use")
  def use_bluebird(plugin: ddDashTraceLib.ddDashTraceLibStrings.bluebird, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def use_bunyan(plugin: ddDashTraceLib.ddDashTraceLibStrings.bunyan): this.type = js.native
  @JSName("use")
  def use_bunyan(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.bunyan,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.bunyan
  ): this.type = js.native
  @JSName("use")
  def use_bunyan(plugin: ddDashTraceLib.ddDashTraceLibStrings.bunyan, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def `use_cassandra-driver`(plugin: ddDashTraceLib.ddDashTraceLibStrings.`cassandra-driver`): this.type = js.native
  @JSName("use")
  def `use_cassandra-driver`(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.`cassandra-driver`,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.cassandra_driver
  ): this.type = js.native
  @JSName("use")
  def `use_cassandra-driver`(plugin: ddDashTraceLib.ddDashTraceLibStrings.`cassandra-driver`, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def use_dns(plugin: ddDashTraceLib.ddDashTraceLibStrings.dns): this.type = js.native
  @JSName("use")
  def use_dns(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.dns,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.dns
  ): this.type = js.native
  @JSName("use")
  def use_dns(plugin: ddDashTraceLib.ddDashTraceLibStrings.dns, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def use_elasticsearch(plugin: ddDashTraceLib.ddDashTraceLibStrings.elasticsearch): this.type = js.native
  @JSName("use")
  def use_elasticsearch(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.elasticsearch,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.elasticsearch
  ): this.type = js.native
  @JSName("use")
  def use_elasticsearch(plugin: ddDashTraceLib.ddDashTraceLibStrings.elasticsearch, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def use_express(plugin: ddDashTraceLib.ddDashTraceLibStrings.express): this.type = js.native
  @JSName("use")
  def use_express(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.express,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.express
  ): this.type = js.native
  @JSName("use")
  def use_express(plugin: ddDashTraceLib.ddDashTraceLibStrings.express, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def `use_generic-pool`(plugin: ddDashTraceLib.ddDashTraceLibStrings.`generic-pool`): this.type = js.native
  @JSName("use")
  def `use_generic-pool`(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.`generic-pool`,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.generic_pool
  ): this.type = js.native
  @JSName("use")
  def `use_generic-pool`(plugin: ddDashTraceLib.ddDashTraceLibStrings.`generic-pool`, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def use_graphql(plugin: ddDashTraceLib.ddDashTraceLibStrings.graphql): this.type = js.native
  @JSName("use")
  def use_graphql(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.graphql,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.graphql
  ): this.type = js.native
  @JSName("use")
  def use_graphql(plugin: ddDashTraceLib.ddDashTraceLibStrings.graphql, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def use_hapi(plugin: ddDashTraceLib.ddDashTraceLibStrings.hapi): this.type = js.native
  @JSName("use")
  def use_hapi(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.hapi,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.hapi
  ): this.type = js.native
  @JSName("use")
  def use_hapi(plugin: ddDashTraceLib.ddDashTraceLibStrings.hapi, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def use_http(plugin: ddDashTraceLib.ddDashTraceLibStrings.http): this.type = js.native
  @JSName("use")
  def use_http(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.http,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.http
  ): this.type = js.native
  @JSName("use")
  def use_http(plugin: ddDashTraceLib.ddDashTraceLibStrings.http, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def use_ioredis(plugin: ddDashTraceLib.ddDashTraceLibStrings.ioredis): this.type = js.native
  @JSName("use")
  def use_ioredis(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.ioredis,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.ioredis
  ): this.type = js.native
  @JSName("use")
  def use_ioredis(plugin: ddDashTraceLib.ddDashTraceLibStrings.ioredis, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def use_koa(plugin: ddDashTraceLib.ddDashTraceLibStrings.koa): this.type = js.native
  @JSName("use")
  def use_koa(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.koa,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.koa
  ): this.type = js.native
  @JSName("use")
  def use_koa(plugin: ddDashTraceLib.ddDashTraceLibStrings.koa, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def use_memcached(plugin: ddDashTraceLib.ddDashTraceLibStrings.memcached): this.type = js.native
  @JSName("use")
  def use_memcached(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.memcached,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.memcached
  ): this.type = js.native
  @JSName("use")
  def use_memcached(plugin: ddDashTraceLib.ddDashTraceLibStrings.memcached, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def `use_mongodb-core`(plugin: ddDashTraceLib.ddDashTraceLibStrings.`mongodb-core`): this.type = js.native
  @JSName("use")
  def `use_mongodb-core`(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.`mongodb-core`,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.mongodb_core
  ): this.type = js.native
  @JSName("use")
  def `use_mongodb-core`(plugin: ddDashTraceLib.ddDashTraceLibStrings.`mongodb-core`, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def use_mysql(plugin: ddDashTraceLib.ddDashTraceLibStrings.mysql): this.type = js.native
  @JSName("use")
  def use_mysql(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.mysql,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.mysql
  ): this.type = js.native
  @JSName("use")
  def use_mysql(plugin: ddDashTraceLib.ddDashTraceLibStrings.mysql, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def use_mysql2(plugin: ddDashTraceLib.ddDashTraceLibStrings.mysql2): this.type = js.native
  @JSName("use")
  def use_mysql2(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.mysql2,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.mysql2
  ): this.type = js.native
  @JSName("use")
  def use_mysql2(plugin: ddDashTraceLib.ddDashTraceLibStrings.mysql2, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def use_net(plugin: ddDashTraceLib.ddDashTraceLibStrings.net): this.type = js.native
  @JSName("use")
  def use_net(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.net,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.net
  ): this.type = js.native
  @JSName("use")
  def use_net(plugin: ddDashTraceLib.ddDashTraceLibStrings.net, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def use_pg(plugin: ddDashTraceLib.ddDashTraceLibStrings.pg): this.type = js.native
  @JSName("use")
  def use_pg(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.pg,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.pg
  ): this.type = js.native
  @JSName("use")
  def use_pg(plugin: ddDashTraceLib.ddDashTraceLibStrings.pg, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def use_pino(plugin: ddDashTraceLib.ddDashTraceLibStrings.pino): this.type = js.native
  @JSName("use")
  def use_pino(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.pino,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.pino
  ): this.type = js.native
  @JSName("use")
  def use_pino(plugin: ddDashTraceLib.ddDashTraceLibStrings.pino, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def use_q(plugin: ddDashTraceLib.ddDashTraceLibStrings.q): this.type = js.native
  @JSName("use")
  def use_q(plugin: ddDashTraceLib.ddDashTraceLibStrings.q, config: ddDashTraceLib.ddDashTraceMod.pluginsNs.q): this.type = js.native
  @JSName("use")
  def use_q(plugin: ddDashTraceLib.ddDashTraceLibStrings.q, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def use_redis(plugin: ddDashTraceLib.ddDashTraceLibStrings.redis): this.type = js.native
  @JSName("use")
  def use_redis(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.redis,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.redis
  ): this.type = js.native
  @JSName("use")
  def use_redis(plugin: ddDashTraceLib.ddDashTraceLibStrings.redis, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def use_restify(plugin: ddDashTraceLib.ddDashTraceLibStrings.restify): this.type = js.native
  @JSName("use")
  def use_restify(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.restify,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.restify
  ): this.type = js.native
  @JSName("use")
  def use_restify(plugin: ddDashTraceLib.ddDashTraceLibStrings.restify, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def use_router(plugin: ddDashTraceLib.ddDashTraceLibStrings.router): this.type = js.native
  @JSName("use")
  def use_router(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.router,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.router
  ): this.type = js.native
  @JSName("use")
  def use_router(plugin: ddDashTraceLib.ddDashTraceLibStrings.router, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def use_when(plugin: ddDashTraceLib.ddDashTraceLibStrings.when): this.type = js.native
  @JSName("use")
  def use_when(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.when,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.when
  ): this.type = js.native
  @JSName("use")
  def use_when(plugin: ddDashTraceLib.ddDashTraceLibStrings.when, config: scala.Boolean): this.type = js.native
  @JSName("use")
  def use_winston(plugin: ddDashTraceLib.ddDashTraceLibStrings.winston): this.type = js.native
  @JSName("use")
  def use_winston(
    plugin: ddDashTraceLib.ddDashTraceLibStrings.winston,
    config: ddDashTraceLib.ddDashTraceMod.pluginsNs.winston
  ): this.type = js.native
  @JSName("use")
  def use_winston(plugin: ddDashTraceLib.ddDashTraceLibStrings.winston, config: scala.Boolean): this.type = js.native
  /**
    * Wrap a function to automatically create a span activated on its
    * scope when it's called.
    *
    * The span will automatically be finished when one of these conditions is
    * met:
    *
    * * The function returns a promise, in which case the span will finish when
    * the promise is resolved or rejected.
    * * The function takes a callback as its last parameter, in which case the
    * span will finish when that callback is called.
    * * The function doesn't accept a callback and doesn't return a promise, in
    * which case the span will finish at the end of the function execution.
    */
  def wrap[T](name: java.lang.String, fn: T): T = js.native
  def wrap[T](name: java.lang.String, options: TraceOptions with opentracingLib.libTracerMod.SpanOptions, fn: T): T = js.native
}

