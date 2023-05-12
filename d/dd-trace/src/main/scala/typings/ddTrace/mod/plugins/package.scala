package typings.ddTrace.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


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
type cassandraDriver = Instrumentation

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
  * [cucumber](https://www.npmjs.com/package/@cucumber/cucumber) module.
  */
type cucumber = Integration

/**
  * This plugin automatically instruments the
  * [cypress](https://github.com/cypress-io/cypress) module.
  */
type cypress = Integration

/**
  * This plugin automatically instruments the
  * [dns](https://nodejs.org/api/dns.html) module.
  */
type dns = Instrumentation

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
type genericPool = Integration

/**
  * This plugin automatically instruments the
  * [@google-cloud/pubsub](https://github.com/googleapis/nodejs-pubsub) module.
  */
type googleCloudPubsub = Integration

/**
  * This plugin automatically instruments the
  * [hapi](https://hapijs.com/) module.
  */
type hapi = HttpServer

/**
  * This plugin automatically instruments the
  * [jest](https://github.com/facebook/jest) module.
  */
type jest = Integration

/**
  * This plugin automatically instruments the
  * [kafkajs](https://kafka.js.org/) module.
  */
type kafkajs = Instrumentation

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
  * [ldapjs](https://github.com/ldapjs/node-ldapjs/) module.
  */
type ldapjs = Instrumentation

/**
  * This plugin automatically instruments the
  * [mariadb](https://github.com/mariadb-corporation/mariadb-connector-nodejs) module.
  */
type mariadb = mysql

/**
  * This plugin automatically instruments the
  * [memcached](https://github.com/3rd-Eden/memcached) module.
  */
type memcached = Instrumentation

/**
  * This plugin automatically instruments the
  * [microgateway-core](https://github.com/apigee/microgateway-core) module.
  */
type microgatewayCore = HttpServer

/**
  * This plugin automatically instruments the
  * [mocha](https://mochajs.org/) module.
  */
type mocha = Integration

/**
  * This plugin automatically instruments the
  * [mongoose](https://mongoosejs.com/) module.
  */
type mongoose = Instrumentation

/**
  * This plugin automatically instruments the
  * [mysql2](https://github.com/sidorares/node-mysql2) module.
  */
type mysql2 = mysql

/**
  * This plugin automatically instruments the
  * [net](https://nodejs.org/api/net.html) module.
  */
type net = Instrumentation

/**
  * This plugin automatically instruments the
  * [opensearch](https://github.com/opensearch-project/opensearch-js) module.
  */
type opensearch = elasticsearch

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
  * This plugin automatically instruments the
  * [playwright](https://github.com/microsoft/playwright) module.
  */
type playwright = Integration

/**
  * This plugin automatically instruments the
  * [restify](http://restify.com/) module.
  */
type restify = HttpServer

/**
  * This plugin automatically instruments the
  * [rhea](https://github.com/amqp/rhea) module.
  */
type rhea = Instrumentation

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
  * This plugin patches the [winston](https://github.com/winstonjs/winston)
  * to automatically inject trace identifiers in log records when the
  * [logInjection](interfaces/traceroptions.html#logInjection) option is enabled
  * on the tracer.
  */
type winston = Integration
