package typings.cqrsDashDomain.cqrsDashDomainMod

import typings.cqrsDashDomain.Anon_AuthSource
import typings.cqrsDashDomain.Anon_Db
import typings.cqrsDashDomain.Anon_DbHost
import typings.cqrsDashDomain.cqrsDashDomainNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDomainOptions extends js.Object {
  /**
    * optional, default is in-memory
    * currently supports: mongodb, redis, tingodb, couchdb, azuretable, dynamodb and inmemory
    * hint settings like: [eventstore](https://github.com/adrai/node-eventstore#provide-implementation-for-storage)
    */
  var aggregateLock: js.UndefOr[Anon_Db] = js.undefined
  /**
    * optional, default is 'commandRejected'
    * will be used if an error occurs and an event should be generated
    */
  var commandRejectedEventName: js.UndefOr[String] = js.undefined
  /**
    * optional, default is not set
    * checks if command was already seen in the last time -> ttl
    * currently supports: mongodb, redis, tingodb and inmemory
    * hint settings like: [eventstore](https://github.com/adrai/node-eventstore#provide-implementation-for-storage)
    */
  var deduplication: js.UndefOr[Anon_DbHost] = js.undefined
  /**
    * the path to the "working directory"
    * can be structured like
    * [set 1](https://github.com/adrai/node-cqrs-domain/tree/master/test/integration/fixture/set1) or
    * [set 2](https://github.com/adrai/node-cqrs-domain/tree/master/test/integration/fixture/set2)
    */
  var domainPath: String
  /**
    * optional, default is in-memory
    * currently supports: mongodb, redis, tingodb, azuretable and inmemory
    * hint: [eventstore](https://github.com/adrai/node-eventstore#provide-implementation-for-storage)
    */
  var eventStore: js.UndefOr[Anon_AuthSource] = js.undefined
  /**
    * optional, default is 800
    * if using in scaled systems and not guaranteeing that each command for an aggregate instance
    * dispatches to the same worker process, this module tries to catch the concurrency issues and
    * retries to handle the command after a timeout between 0 and the defined value
    */
  var retryOnConcurrencyTimeout: js.UndefOr[Double] = js.undefined
  /**
    * optional, default is 100
    * global snapshot threshold value for all aggregates
    * defines the amount of loaded events, if there are more events to load, it will do a snapshot, so next loading is faster
    * an individual snapshot threshold defining algorithm can be defined per aggregate (scroll down)
    */
  var snapshotThreshold: js.UndefOr[Double] = js.undefined
  /**
    * optional, default false
    * resolves valid file types from loader extensions instead of default values while parsing definition files
    */
  var useLoaderExtensions: js.UndefOr[`true`] = js.undefined
}

object CreateDomainOptions {
  @scala.inline
  def apply(
    domainPath: String,
    aggregateLock: Anon_Db = null,
    commandRejectedEventName: String = null,
    deduplication: Anon_DbHost = null,
    eventStore: Anon_AuthSource = null,
    retryOnConcurrencyTimeout: Int | Double = null,
    snapshotThreshold: Int | Double = null,
    useLoaderExtensions: `true` = null
  ): CreateDomainOptions = {
    val __obj = js.Dynamic.literal(domainPath = domainPath.asInstanceOf[js.Any])
    if (aggregateLock != null) __obj.updateDynamic("aggregateLock")(aggregateLock.asInstanceOf[js.Any])
    if (commandRejectedEventName != null) __obj.updateDynamic("commandRejectedEventName")(commandRejectedEventName.asInstanceOf[js.Any])
    if (deduplication != null) __obj.updateDynamic("deduplication")(deduplication.asInstanceOf[js.Any])
    if (eventStore != null) __obj.updateDynamic("eventStore")(eventStore.asInstanceOf[js.Any])
    if (retryOnConcurrencyTimeout != null) __obj.updateDynamic("retryOnConcurrencyTimeout")(retryOnConcurrencyTimeout.asInstanceOf[js.Any])
    if (snapshotThreshold != null) __obj.updateDynamic("snapshotThreshold")(snapshotThreshold.asInstanceOf[js.Any])
    if (useLoaderExtensions != null) __obj.updateDynamic("useLoaderExtensions")(useLoaderExtensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainOptions]
  }
}

