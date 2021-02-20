package typings.ddTrace.mod

import typings.ddTrace.ddTraceStrings.`aws-sdk`
import typings.ddTrace.ddTraceStrings.`cassandra-driver`
import typings.ddTrace.ddTraceStrings.`generic-pool`
import typings.ddTrace.ddTraceStrings.`google-cloud-pubsub`
import typings.ddTrace.ddTraceStrings.`limitd-client`
import typings.ddTrace.ddTraceStrings.`microgateway-core`
import typings.ddTrace.ddTraceStrings.`mongodb-core`
import typings.ddTrace.ddTraceStrings.`promise-js`
import typings.ddTrace.ddTraceStrings.amqp10
import typings.ddTrace.ddTraceStrings.amqplib
import typings.ddTrace.ddTraceStrings.bluebird
import typings.ddTrace.ddTraceStrings.bunyan
import typings.ddTrace.ddTraceStrings.connect
import typings.ddTrace.ddTraceStrings.couchbase
import typings.ddTrace.ddTraceStrings.dns
import typings.ddTrace.ddTraceStrings.elasticsearch
import typings.ddTrace.ddTraceStrings.express
import typings.ddTrace.ddTraceStrings.fastify
import typings.ddTrace.ddTraceStrings.fs
import typings.ddTrace.ddTraceStrings.graphql
import typings.ddTrace.ddTraceStrings.grpc
import typings.ddTrace.ddTraceStrings.hapi
import typings.ddTrace.ddTraceStrings.http
import typings.ddTrace.ddTraceStrings.http2
import typings.ddTrace.ddTraceStrings.ioredis
import typings.ddTrace.ddTraceStrings.knex
import typings.ddTrace.ddTraceStrings.koa
import typings.ddTrace.ddTraceStrings.memcached
import typings.ddTrace.ddTraceStrings.mongoose
import typings.ddTrace.ddTraceStrings.mysql
import typings.ddTrace.ddTraceStrings.mysql2
import typings.ddTrace.ddTraceStrings.net
import typings.ddTrace.ddTraceStrings.paperplane
import typings.ddTrace.ddTraceStrings.pg
import typings.ddTrace.ddTraceStrings.pino
import typings.ddTrace.ddTraceStrings.promise
import typings.ddTrace.ddTraceStrings.q
import typings.ddTrace.ddTraceStrings.redis
import typings.ddTrace.ddTraceStrings.restify
import typings.ddTrace.ddTraceStrings.rhea
import typings.ddTrace.ddTraceStrings.router
import typings.ddTrace.ddTraceStrings.tedious
import typings.ddTrace.ddTraceStrings.when
import typings.ddTrace.ddTraceStrings.winston
import typings.ddTrace.mod.plugins.awsSdk
import typings.ddTrace.mod.plugins.cassandraDriver
import typings.ddTrace.mod.plugins.genericPool
import typings.ddTrace.mod.plugins.googleCloudPubsub
import typings.ddTrace.mod.plugins.limitdClient
import typings.ddTrace.mod.plugins.microgatewayCore
import typings.ddTrace.mod.plugins.mongodbCore
import typings.ddTrace.mod.plugins.promiseJs
import typings.opentracing.mod.Tracer
import typings.opentracing.tracerMod.SpanOptions
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Tracer_ extends Tracer {
  
  /**
    * Create and return a string that can be included in the <head> of a
    * document to enable RUM tracing to include it. The resulting string
    * should not be cached.
    */
  def getRumData(): String = js.native
  
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
    * Sets the URL for the trace agent. This should only be called _after_
    * init() is called, only in cases where the URL needs to be set after
    * initialization.
    */
  def setUrl(url: String): this.type = js.native
  
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
    *
    * If the `orphanable` option is set to false, the function will not be traced
    * unless there is already an active span or `childOf` option.
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
  def use_amqp10(plugin: amqp10, config: typings.ddTrace.mod.plugins.amqp10): this.type = js.native
  @JSName("use")
  def use_amqplib(plugin: amqplib): this.type = js.native
  @JSName("use")
  def use_amqplib(plugin: amqplib, config: Boolean): this.type = js.native
  @JSName("use")
  def use_amqplib(plugin: amqplib, config: typings.ddTrace.mod.plugins.amqplib): this.type = js.native
  @JSName("use")
  def use_awssdk(plugin: `aws-sdk`): this.type = js.native
  @JSName("use")
  def use_awssdk(plugin: `aws-sdk`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_awssdk(plugin: `aws-sdk`, config: awsSdk): this.type = js.native
  @JSName("use")
  def use_bluebird(plugin: bluebird): this.type = js.native
  @JSName("use")
  def use_bluebird(plugin: bluebird, config: Boolean): this.type = js.native
  @JSName("use")
  def use_bluebird(plugin: bluebird, config: typings.ddTrace.mod.plugins.bluebird): this.type = js.native
  @JSName("use")
  def use_bunyan(plugin: bunyan): this.type = js.native
  @JSName("use")
  def use_bunyan(plugin: bunyan, config: Boolean): this.type = js.native
  @JSName("use")
  def use_bunyan(plugin: bunyan, config: typings.ddTrace.mod.plugins.bunyan): this.type = js.native
  @JSName("use")
  def use_cassandradriver(plugin: `cassandra-driver`): this.type = js.native
  @JSName("use")
  def use_cassandradriver(plugin: `cassandra-driver`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_cassandradriver(plugin: `cassandra-driver`, config: cassandraDriver): this.type = js.native
  @JSName("use")
  def use_connect(plugin: connect): this.type = js.native
  @JSName("use")
  def use_connect(plugin: connect, config: Boolean): this.type = js.native
  @JSName("use")
  def use_connect(plugin: connect, config: typings.ddTrace.mod.plugins.connect): this.type = js.native
  @JSName("use")
  def use_couchbase(plugin: couchbase): this.type = js.native
  @JSName("use")
  def use_couchbase(plugin: couchbase, config: Boolean): this.type = js.native
  @JSName("use")
  def use_couchbase(plugin: couchbase, config: typings.ddTrace.mod.plugins.couchbase): this.type = js.native
  @JSName("use")
  def use_dns(plugin: dns): this.type = js.native
  @JSName("use")
  def use_dns(plugin: dns, config: Boolean): this.type = js.native
  @JSName("use")
  def use_dns(plugin: dns, config: typings.ddTrace.mod.plugins.dns): this.type = js.native
  @JSName("use")
  def use_elasticsearch(plugin: elasticsearch): this.type = js.native
  @JSName("use")
  def use_elasticsearch(plugin: elasticsearch, config: Boolean): this.type = js.native
  @JSName("use")
  def use_elasticsearch(plugin: elasticsearch, config: typings.ddTrace.mod.plugins.elasticsearch): this.type = js.native
  @JSName("use")
  def use_express(plugin: express): this.type = js.native
  @JSName("use")
  def use_express(plugin: express, config: Boolean): this.type = js.native
  @JSName("use")
  def use_express(plugin: express, config: typings.ddTrace.mod.plugins.express): this.type = js.native
  @JSName("use")
  def use_fastify(plugin: fastify): this.type = js.native
  @JSName("use")
  def use_fastify(plugin: fastify, config: Boolean): this.type = js.native
  @JSName("use")
  def use_fastify(plugin: fastify, config: typings.ddTrace.mod.plugins.fastify): this.type = js.native
  @JSName("use")
  def use_fs(plugin: fs): this.type = js.native
  @JSName("use")
  def use_fs(plugin: fs, config: Boolean): this.type = js.native
  @JSName("use")
  def use_fs(plugin: fs, config: typings.ddTrace.mod.plugins.fs): this.type = js.native
  @JSName("use")
  def use_genericpool(plugin: `generic-pool`): this.type = js.native
  @JSName("use")
  def use_genericpool(plugin: `generic-pool`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_genericpool(plugin: `generic-pool`, config: genericPool): this.type = js.native
  @JSName("use")
  def use_googlecloudpubsub(plugin: `google-cloud-pubsub`): this.type = js.native
  @JSName("use")
  def use_googlecloudpubsub(plugin: `google-cloud-pubsub`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_googlecloudpubsub(plugin: `google-cloud-pubsub`, config: googleCloudPubsub): this.type = js.native
  @JSName("use")
  def use_graphql(plugin: graphql): this.type = js.native
  @JSName("use")
  def use_graphql(plugin: graphql, config: Boolean): this.type = js.native
  @JSName("use")
  def use_graphql(plugin: graphql, config: typings.ddTrace.mod.plugins.graphql): this.type = js.native
  @JSName("use")
  def use_grpc(plugin: grpc): this.type = js.native
  @JSName("use")
  def use_grpc(plugin: grpc, config: Boolean): this.type = js.native
  @JSName("use")
  def use_grpc(plugin: grpc, config: typings.ddTrace.mod.plugins.grpc): this.type = js.native
  @JSName("use")
  def use_hapi(plugin: hapi): this.type = js.native
  @JSName("use")
  def use_hapi(plugin: hapi, config: Boolean): this.type = js.native
  @JSName("use")
  def use_hapi(plugin: hapi, config: typings.ddTrace.mod.plugins.hapi): this.type = js.native
  @JSName("use")
  def use_http(plugin: http): this.type = js.native
  @JSName("use")
  def use_http(plugin: http, config: Boolean): this.type = js.native
  @JSName("use")
  def use_http(plugin: http, config: typings.ddTrace.mod.plugins.http): this.type = js.native
  @JSName("use")
  def use_http2(plugin: http2): this.type = js.native
  @JSName("use")
  def use_http2(plugin: http2, config: Boolean): this.type = js.native
  @JSName("use")
  def use_http2(plugin: http2, config: typings.ddTrace.mod.plugins.http2): this.type = js.native
  @JSName("use")
  def use_ioredis(plugin: ioredis): this.type = js.native
  @JSName("use")
  def use_ioredis(plugin: ioredis, config: Boolean): this.type = js.native
  @JSName("use")
  def use_ioredis(plugin: ioredis, config: typings.ddTrace.mod.plugins.ioredis): this.type = js.native
  @JSName("use")
  def use_knex(plugin: knex): this.type = js.native
  @JSName("use")
  def use_knex(plugin: knex, config: Boolean): this.type = js.native
  @JSName("use")
  def use_knex(plugin: knex, config: typings.ddTrace.mod.plugins.knex): this.type = js.native
  @JSName("use")
  def use_koa(plugin: koa): this.type = js.native
  @JSName("use")
  def use_koa(plugin: koa, config: Boolean): this.type = js.native
  @JSName("use")
  def use_koa(plugin: koa, config: typings.ddTrace.mod.plugins.koa): this.type = js.native
  @JSName("use")
  def use_limitdclient(plugin: `limitd-client`): this.type = js.native
  @JSName("use")
  def use_limitdclient(plugin: `limitd-client`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_limitdclient(plugin: `limitd-client`, config: limitdClient): this.type = js.native
  @JSName("use")
  def use_memcached(plugin: memcached): this.type = js.native
  @JSName("use")
  def use_memcached(plugin: memcached, config: Boolean): this.type = js.native
  @JSName("use")
  def use_memcached(plugin: memcached, config: typings.ddTrace.mod.plugins.memcached): this.type = js.native
  @JSName("use")
  def use_microgatewaycore(plugin: `microgateway-core`): this.type = js.native
  @JSName("use")
  def use_microgatewaycore(plugin: `microgateway-core`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_microgatewaycore(plugin: `microgateway-core`, config: microgatewayCore): this.type = js.native
  @JSName("use")
  def use_mongodbcore(plugin: `mongodb-core`): this.type = js.native
  @JSName("use")
  def use_mongodbcore(plugin: `mongodb-core`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_mongodbcore(plugin: `mongodb-core`, config: mongodbCore): this.type = js.native
  @JSName("use")
  def use_mongoose(plugin: mongoose): this.type = js.native
  @JSName("use")
  def use_mongoose(plugin: mongoose, config: Boolean): this.type = js.native
  @JSName("use")
  def use_mongoose(plugin: mongoose, config: typings.ddTrace.mod.plugins.mongoose): this.type = js.native
  @JSName("use")
  def use_mysql(plugin: mysql): this.type = js.native
  @JSName("use")
  def use_mysql(plugin: mysql, config: Boolean): this.type = js.native
  @JSName("use")
  def use_mysql(plugin: mysql, config: typings.ddTrace.mod.plugins.mysql): this.type = js.native
  @JSName("use")
  def use_mysql2(plugin: mysql2): this.type = js.native
  @JSName("use")
  def use_mysql2(plugin: mysql2, config: Boolean): this.type = js.native
  @JSName("use")
  def use_mysql2(plugin: mysql2, config: typings.ddTrace.mod.plugins.mysql2): this.type = js.native
  @JSName("use")
  def use_net(plugin: net): this.type = js.native
  @JSName("use")
  def use_net(plugin: net, config: Boolean): this.type = js.native
  @JSName("use")
  def use_net(plugin: net, config: typings.ddTrace.mod.plugins.net): this.type = js.native
  @JSName("use")
  def use_paperplane(plugin: paperplane): this.type = js.native
  @JSName("use")
  def use_paperplane(plugin: paperplane, config: Boolean): this.type = js.native
  @JSName("use")
  def use_paperplane(plugin: paperplane, config: typings.ddTrace.mod.plugins.paperplane): this.type = js.native
  @JSName("use")
  def use_pg(plugin: pg): this.type = js.native
  @JSName("use")
  def use_pg(plugin: pg, config: Boolean): this.type = js.native
  @JSName("use")
  def use_pg(plugin: pg, config: typings.ddTrace.mod.plugins.pg): this.type = js.native
  @JSName("use")
  def use_pino(plugin: pino): this.type = js.native
  @JSName("use")
  def use_pino(plugin: pino, config: Boolean): this.type = js.native
  @JSName("use")
  def use_pino(plugin: pino, config: typings.ddTrace.mod.plugins.pino): this.type = js.native
  @JSName("use")
  def use_promise(plugin: promise): this.type = js.native
  @JSName("use")
  def use_promise(plugin: promise, config: Boolean): this.type = js.native
  @JSName("use")
  def use_promise(plugin: promise, config: typings.ddTrace.mod.plugins.promise): this.type = js.native
  @JSName("use")
  def use_promisejs(plugin: `promise-js`): this.type = js.native
  @JSName("use")
  def use_promisejs(plugin: `promise-js`, config: Boolean): this.type = js.native
  @JSName("use")
  def use_promisejs(plugin: `promise-js`, config: promiseJs): this.type = js.native
  @JSName("use")
  def use_q(plugin: q): this.type = js.native
  @JSName("use")
  def use_q(plugin: q, config: Boolean): this.type = js.native
  @JSName("use")
  def use_q(plugin: q, config: typings.ddTrace.mod.plugins.q): this.type = js.native
  @JSName("use")
  def use_redis(plugin: redis): this.type = js.native
  @JSName("use")
  def use_redis(plugin: redis, config: Boolean): this.type = js.native
  @JSName("use")
  def use_redis(plugin: redis, config: typings.ddTrace.mod.plugins.redis): this.type = js.native
  @JSName("use")
  def use_restify(plugin: restify): this.type = js.native
  @JSName("use")
  def use_restify(plugin: restify, config: Boolean): this.type = js.native
  @JSName("use")
  def use_restify(plugin: restify, config: typings.ddTrace.mod.plugins.restify): this.type = js.native
  @JSName("use")
  def use_rhea(plugin: rhea): this.type = js.native
  @JSName("use")
  def use_rhea(plugin: rhea, config: Boolean): this.type = js.native
  @JSName("use")
  def use_rhea(plugin: rhea, config: typings.ddTrace.mod.plugins.rhea): this.type = js.native
  @JSName("use")
  def use_router(plugin: router): this.type = js.native
  @JSName("use")
  def use_router(plugin: router, config: Boolean): this.type = js.native
  @JSName("use")
  def use_router(plugin: router, config: typings.ddTrace.mod.plugins.router): this.type = js.native
  @JSName("use")
  def use_tedious(plugin: tedious): this.type = js.native
  @JSName("use")
  def use_tedious(plugin: tedious, config: Boolean): this.type = js.native
  @JSName("use")
  def use_tedious(plugin: tedious, config: typings.ddTrace.mod.plugins.tedious): this.type = js.native
  @JSName("use")
  def use_when(plugin: when): this.type = js.native
  @JSName("use")
  def use_when(plugin: when, config: Boolean): this.type = js.native
  @JSName("use")
  def use_when(plugin: when, config: typings.ddTrace.mod.plugins.when): this.type = js.native
  @JSName("use")
  def use_winston(plugin: winston): this.type = js.native
  @JSName("use")
  def use_winston(plugin: winston, config: Boolean): this.type = js.native
  @JSName("use")
  def use_winston(plugin: winston, config: typings.ddTrace.mod.plugins.winston): this.type = js.native
  
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
  def wrap[T](name: String, fn: T, requiresParent: Boolean): T = js.native
  def wrap[T](name: String, options: TraceOptions with SpanOptions, fn: T): T = js.native
  def wrap[T](name: String, options: js.Function1[/* repeated */ js.Any, TraceOptions with SpanOptions], fn: T): T = js.native
}
