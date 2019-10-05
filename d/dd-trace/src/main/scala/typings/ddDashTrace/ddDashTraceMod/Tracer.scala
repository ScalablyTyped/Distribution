package typings.ddDashTrace.ddDashTraceMod

import org.scalablytyped.runtime.TopLevel
import typings.ddDashTrace.ddDashTraceMod.plugins.cassandra_driver
import typings.ddDashTrace.ddDashTraceMod.plugins.generic_pool
import typings.ddDashTrace.ddDashTraceMod.plugins.limitd_client
import typings.ddDashTrace.ddDashTraceMod.plugins.mongodb_core
import typings.ddDashTrace.ddDashTraceMod.plugins.promise_js
import typings.ddDashTrace.ddDashTraceStrings.`cassandra-driver`
import typings.ddDashTrace.ddDashTraceStrings.`generic-pool`
import typings.ddDashTrace.ddDashTraceStrings.`limitd-client`
import typings.ddDashTrace.ddDashTraceStrings.`mongodb-core`
import typings.ddDashTrace.ddDashTraceStrings.`promise-js`
import typings.ddDashTrace.ddDashTraceStrings.amqp10
import typings.ddDashTrace.ddDashTraceStrings.amqplib
import typings.ddDashTrace.ddDashTraceStrings.bluebird
import typings.ddDashTrace.ddDashTraceStrings.bunyan
import typings.ddDashTrace.ddDashTraceStrings.connect
import typings.ddDashTrace.ddDashTraceStrings.couchbase
import typings.ddDashTrace.ddDashTraceStrings.dns
import typings.ddDashTrace.ddDashTraceStrings.elasticsearch
import typings.ddDashTrace.ddDashTraceStrings.express
import typings.ddDashTrace.ddDashTraceStrings.fastify
import typings.ddDashTrace.ddDashTraceStrings.graphql
import typings.ddDashTrace.ddDashTraceStrings.grpc
import typings.ddDashTrace.ddDashTraceStrings.hapi
import typings.ddDashTrace.ddDashTraceStrings.http
import typings.ddDashTrace.ddDashTraceStrings.http2
import typings.ddDashTrace.ddDashTraceStrings.ioredis
import typings.ddDashTrace.ddDashTraceStrings.knex
import typings.ddDashTrace.ddDashTraceStrings.koa
import typings.ddDashTrace.ddDashTraceStrings.memcached
import typings.ddDashTrace.ddDashTraceStrings.mysql
import typings.ddDashTrace.ddDashTraceStrings.mysql2
import typings.ddDashTrace.ddDashTraceStrings.net
import typings.ddDashTrace.ddDashTraceStrings.paperplane
import typings.ddDashTrace.ddDashTraceStrings.pg
import typings.ddDashTrace.ddDashTraceStrings.pino
import typings.ddDashTrace.ddDashTraceStrings.promise
import typings.ddDashTrace.ddDashTraceStrings.q
import typings.ddDashTrace.ddDashTraceStrings.redis
import typings.ddDashTrace.ddDashTraceStrings.restify
import typings.ddDashTrace.ddDashTraceStrings.router
import typings.ddDashTrace.ddDashTraceStrings.tedious
import typings.ddDashTrace.ddDashTraceStrings.when
import typings.ddDashTrace.ddDashTraceStrings.winston
import typings.opentracing.libTracerMod.SpanOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Tracer
  extends typings.opentracing.opentracingMod.Tracer {
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
  def inject(spanContext: SpanContext, format: String, carrier: js.Any): Unit = js.native
  def inject(spanContext: Span, format: String, carrier: js.Any): Unit = js.native
  /**
    * Returns a reference to the current scope.
    */
  def scope(): Scope = js.native
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
    name: String,
    fn: js.Function2[
      /* span */ js.UndefOr[Span], 
      /* fn */ js.UndefOr[js.Function1[/* error */ js.UndefOr[Error], _]], 
      T
    ]
  ): T = js.native
  def trace[T](
    name: String,
    options: TraceOptions with SpanOptions,
    fn: js.Function2[
      /* span */ js.UndefOr[Span], 
      /* done */ js.UndefOr[js.Function1[/* error */ js.UndefOr[Error], String]], 
      T
    ]
  ): T = js.native
  /**
    * Enable and optionally configure a plugin.
    * @param plugin The name of a built-in plugin.
    * @param config Configuration options. Can also be `false` to disable the plugin.
    */
  @JSName("use")
  def use_amqp10(plugin: amqp10): this.type = js.native
  @JSName("use")
  def use_amqp10(plugin: amqp10, config: Boolean): this.type = js.native
  @JSName("use")
  def use_amqp10(plugin: amqp10, config: typings.ddDashTrace.ddDashTraceMod.plugins.amqp10): this.type = js.native
  @JSName("use")
  def use_amqplib(plugin: amqplib): this.type = js.native
  @JSName("use")
  def use_amqplib(plugin: amqplib, config: Boolean): this.type = js.native
  @JSName("use")
  def use_amqplib(plugin: amqplib, config: typings.ddDashTrace.ddDashTraceMod.plugins.amqplib): this.type = js.native
  @JSName("use")
  def use_bluebird(plugin: bluebird): this.type = js.native
  @JSName("use")
  def use_bluebird(plugin: bluebird, config: Boolean): this.type = js.native
  @JSName("use")
  def use_bluebird(plugin: bluebird, config: typings.ddDashTrace.ddDashTraceMod.plugins.bluebird): this.type = js.native
  @JSName("use")
  def use_bunyan(plugin: bunyan): this.type = js.native
  @JSName("use")
  def use_bunyan(plugin: bunyan, config: Boolean): this.type = js.native
  @JSName("use")
  def use_bunyan(plugin: bunyan, config: typings.ddDashTrace.ddDashTraceMod.plugins.bunyan): this.type = js.native
  @JSName("use")
  def use_cassandradriver(plugin: `cassandra-driver`): this.type = js.native
  @JSName("use")
  def use_cassandradriver(plugin: `cassandra-driver`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_cassandradriver(plugin: `cassandra-driver`, config: cassandra_driver): this.type = js.native
  @JSName("use")
  def use_connect(plugin: connect): this.type = js.native
  @JSName("use")
  def use_connect(plugin: connect, config: Boolean): this.type = js.native
  @JSName("use")
  def use_connect(plugin: connect, config: typings.ddDashTrace.ddDashTraceMod.plugins.connect): this.type = js.native
  @JSName("use")
  def use_couchbase(plugin: couchbase): this.type = js.native
  @JSName("use")
  def use_couchbase(plugin: couchbase, config: Boolean): this.type = js.native
  @JSName("use")
  def use_couchbase(plugin: couchbase, config: typings.ddDashTrace.ddDashTraceMod.plugins.couchbase): this.type = js.native
  @JSName("use")
  def use_dns(plugin: dns): this.type = js.native
  @JSName("use")
  def use_dns(plugin: dns, config: Boolean): this.type = js.native
  @JSName("use")
  def use_dns(plugin: dns, config: typings.ddDashTrace.ddDashTraceMod.plugins.dns): this.type = js.native
  @JSName("use")
  def use_elasticsearch(plugin: elasticsearch): this.type = js.native
  @JSName("use")
  def use_elasticsearch(plugin: elasticsearch, config: Boolean): this.type = js.native
  @JSName("use")
  def use_elasticsearch(plugin: elasticsearch, config: typings.ddDashTrace.ddDashTraceMod.plugins.elasticsearch): this.type = js.native
  @JSName("use")
  def use_express(plugin: express): this.type = js.native
  @JSName("use")
  def use_express(plugin: express, config: Boolean): this.type = js.native
  @JSName("use")
  def use_express(plugin: express, config: typings.ddDashTrace.ddDashTraceMod.plugins.express): this.type = js.native
  @JSName("use")
  def use_fastify(plugin: fastify): this.type = js.native
  @JSName("use")
  def use_fastify(plugin: fastify, config: Boolean): this.type = js.native
  @JSName("use")
  def use_fastify(plugin: fastify, config: typings.ddDashTrace.ddDashTraceMod.plugins.fastify): this.type = js.native
  @JSName("use")
  def use_genericpool(plugin: `generic-pool`): this.type = js.native
  @JSName("use")
  def use_genericpool(plugin: `generic-pool`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_genericpool(plugin: `generic-pool`, config: generic_pool): this.type = js.native
  @JSName("use")
  def use_graphql(plugin: graphql): this.type = js.native
  @JSName("use")
  def use_graphql(plugin: graphql, config: Boolean): this.type = js.native
  @JSName("use")
  def use_graphql(plugin: graphql, config: typings.ddDashTrace.ddDashTraceMod.plugins.graphql): this.type = js.native
  @JSName("use")
  def use_grpc(plugin: grpc): this.type = js.native
  @JSName("use")
  def use_grpc(plugin: grpc, config: Boolean): this.type = js.native
  @JSName("use")
  def use_grpc(plugin: grpc, config: typings.ddDashTrace.ddDashTraceMod.plugins.grpc): this.type = js.native
  @JSName("use")
  def use_hapi(plugin: hapi): this.type = js.native
  @JSName("use")
  def use_hapi(plugin: hapi, config: Boolean): this.type = js.native
  @JSName("use")
  def use_hapi(plugin: hapi, config: typings.ddDashTrace.ddDashTraceMod.plugins.hapi): this.type = js.native
  @JSName("use")
  def use_http(plugin: http): this.type = js.native
  @JSName("use")
  def use_http(plugin: http, config: Boolean): this.type = js.native
  @JSName("use")
  def use_http(plugin: http, config: typings.ddDashTrace.ddDashTraceMod.plugins.http): this.type = js.native
  @JSName("use")
  def use_http2(plugin: http2): this.type = js.native
  @JSName("use")
  def use_http2(plugin: http2, config: Boolean): this.type = js.native
  @JSName("use")
  def use_http2(plugin: http2, config: typings.ddDashTrace.ddDashTraceMod.plugins.http2): this.type = js.native
  @JSName("use")
  def use_ioredis(plugin: ioredis): this.type = js.native
  @JSName("use")
  def use_ioredis(plugin: ioredis, config: Boolean): this.type = js.native
  @JSName("use")
  def use_ioredis(plugin: ioredis, config: typings.ddDashTrace.ddDashTraceMod.plugins.ioredis): this.type = js.native
  @JSName("use")
  def use_knex(plugin: knex): this.type = js.native
  @JSName("use")
  def use_knex(plugin: knex, config: Boolean): this.type = js.native
  @JSName("use")
  def use_knex(plugin: knex, config: typings.ddDashTrace.ddDashTraceMod.plugins.knex): this.type = js.native
  @JSName("use")
  def use_koa(plugin: koa): this.type = js.native
  @JSName("use")
  def use_koa(plugin: koa, config: Boolean): this.type = js.native
  @JSName("use")
  def use_koa(plugin: koa, config: typings.ddDashTrace.ddDashTraceMod.plugins.koa): this.type = js.native
  @JSName("use")
  def use_limitdclient(plugin: `limitd-client`): this.type = js.native
  @JSName("use")
  def use_limitdclient(plugin: `limitd-client`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_limitdclient(plugin: `limitd-client`, config: limitd_client): this.type = js.native
  @JSName("use")
  def use_memcached(plugin: memcached): this.type = js.native
  @JSName("use")
  def use_memcached(plugin: memcached, config: Boolean): this.type = js.native
  @JSName("use")
  def use_memcached(plugin: memcached, config: typings.ddDashTrace.ddDashTraceMod.plugins.memcached): this.type = js.native
  @JSName("use")
  def use_mongodbcore(plugin: `mongodb-core`): this.type = js.native
  @JSName("use")
  def use_mongodbcore(plugin: `mongodb-core`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_mongodbcore(plugin: `mongodb-core`, config: mongodb_core): this.type = js.native
  @JSName("use")
  def use_mysql(plugin: mysql): this.type = js.native
  @JSName("use")
  def use_mysql(plugin: mysql, config: Boolean): this.type = js.native
  @JSName("use")
  def use_mysql(plugin: mysql, config: typings.ddDashTrace.ddDashTraceMod.plugins.mysql): this.type = js.native
  @JSName("use")
  def use_mysql2(plugin: mysql2): this.type = js.native
  @JSName("use")
  def use_mysql2(plugin: mysql2, config: Boolean): this.type = js.native
  @JSName("use")
  def use_mysql2(plugin: mysql2, config: typings.ddDashTrace.ddDashTraceMod.plugins.mysql2): this.type = js.native
  @JSName("use")
  def use_net(plugin: net): this.type = js.native
  @JSName("use")
  def use_net(plugin: net, config: Boolean): this.type = js.native
  @JSName("use")
  def use_net(plugin: net, config: typings.ddDashTrace.ddDashTraceMod.plugins.net): this.type = js.native
  @JSName("use")
  def use_paperplane(plugin: paperplane): this.type = js.native
  @JSName("use")
  def use_paperplane(plugin: paperplane, config: Boolean): this.type = js.native
  @JSName("use")
  def use_paperplane(plugin: paperplane, config: typings.ddDashTrace.ddDashTraceMod.plugins.paperplane): this.type = js.native
  @JSName("use")
  def use_pg(plugin: pg): this.type = js.native
  @JSName("use")
  def use_pg(plugin: pg, config: Boolean): this.type = js.native
  @JSName("use")
  def use_pg(plugin: pg, config: typings.ddDashTrace.ddDashTraceMod.plugins.pg): this.type = js.native
  @JSName("use")
  def use_pino(plugin: pino): this.type = js.native
  @JSName("use")
  def use_pino(plugin: pino, config: Boolean): this.type = js.native
  @JSName("use")
  def use_pino(plugin: pino, config: typings.ddDashTrace.ddDashTraceMod.plugins.pino): this.type = js.native
  @JSName("use")
  def use_promise(plugin: promise): this.type = js.native
  @JSName("use")
  def use_promise(plugin: promise, config: Boolean): this.type = js.native
  @JSName("use")
  def use_promise(plugin: promise, config: typings.ddDashTrace.ddDashTraceMod.plugins.promise): this.type = js.native
  @JSName("use")
  def use_promisejs(plugin: `promise-js`): this.type = js.native
  @JSName("use")
  def use_promisejs(plugin: `promise-js`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_promisejs(plugin: `promise-js`, config: promise_js): this.type = js.native
  @JSName("use")
  def use_q(plugin: q): this.type = js.native
  @JSName("use")
  def use_q(plugin: q, config: Boolean): this.type = js.native
  @JSName("use")
  def use_q(plugin: q, config: typings.ddDashTrace.ddDashTraceMod.plugins.q): this.type = js.native
  @JSName("use")
  def use_redis(plugin: redis): this.type = js.native
  @JSName("use")
  def use_redis(plugin: redis, config: Boolean): this.type = js.native
  @JSName("use")
  def use_redis(plugin: redis, config: typings.ddDashTrace.ddDashTraceMod.plugins.redis): this.type = js.native
  @JSName("use")
  def use_restify(plugin: restify): this.type = js.native
  @JSName("use")
  def use_restify(plugin: restify, config: Boolean): this.type = js.native
  @JSName("use")
  def use_restify(plugin: restify, config: typings.ddDashTrace.ddDashTraceMod.plugins.restify): this.type = js.native
  @JSName("use")
  def use_router(plugin: router): this.type = js.native
  @JSName("use")
  def use_router(plugin: router, config: Boolean): this.type = js.native
  @JSName("use")
  def use_router(plugin: router, config: typings.ddDashTrace.ddDashTraceMod.plugins.router): this.type = js.native
  @JSName("use")
  def use_tedious(plugin: tedious): this.type = js.native
  @JSName("use")
  def use_tedious(plugin: tedious, config: Boolean): this.type = js.native
  @JSName("use")
  def use_tedious(plugin: tedious, config: typings.ddDashTrace.ddDashTraceMod.plugins.tedious): this.type = js.native
  @JSName("use")
  def use_when(plugin: when): this.type = js.native
  @JSName("use")
  def use_when(plugin: when, config: Boolean): this.type = js.native
  @JSName("use")
  def use_when(plugin: when, config: typings.ddDashTrace.ddDashTraceMod.plugins.when): this.type = js.native
  @JSName("use")
  def use_winston(plugin: winston): this.type = js.native
  @JSName("use")
  def use_winston(plugin: winston, config: Boolean): this.type = js.native
  @JSName("use")
  def use_winston(plugin: winston, config: typings.ddDashTrace.ddDashTraceMod.plugins.winston): this.type = js.native
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
  def wrap[T](name: String, fn: T): T = js.native
  def wrap[T](name: String, options: TraceOptions with SpanOptions, fn: T): T = js.native
}

@JSImport("dd-trace", "tracer")
@js.native
object tracer extends TopLevel[Tracer]

