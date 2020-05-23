package typings.cqrsDomain.mod

import typings.cqrsDomain.anon.AuthSource
import typings.cqrsDomain.anon.Db
import typings.cqrsDomain.anon.Host
import typings.cqrsDomain.cqrsDomainBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDomainOptions extends js.Object {
  /**
    * optional, default is in-memory
    * currently supports: mongodb, redis, tingodb, couchdb, azuretable, dynamodb and inmemory
    * hint settings like: [eventstore](https://github.com/adrai/node-eventstore#provide-implementation-for-storage)
    */
  var aggregateLock: js.UndefOr[Db] = js.undefined
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
  var deduplication: js.UndefOr[Host] = js.undefined
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
  var eventStore: js.UndefOr[AuthSource] = js.undefined
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
    aggregateLock: Db = null,
    commandRejectedEventName: String = null,
    deduplication: Host = null,
    eventStore: AuthSource = null,
    retryOnConcurrencyTimeout: js.UndefOr[Double] = js.undefined,
    snapshotThreshold: js.UndefOr[Double] = js.undefined,
    useLoaderExtensions: `true` = null
  ): CreateDomainOptions = {
    val __obj = js.Dynamic.literal(domainPath = domainPath.asInstanceOf[js.Any])
    if (aggregateLock != null) __obj.updateDynamic("aggregateLock")(aggregateLock.asInstanceOf[js.Any])
    if (commandRejectedEventName != null) __obj.updateDynamic("commandRejectedEventName")(commandRejectedEventName.asInstanceOf[js.Any])
    if (deduplication != null) __obj.updateDynamic("deduplication")(deduplication.asInstanceOf[js.Any])
    if (eventStore != null) __obj.updateDynamic("eventStore")(eventStore.asInstanceOf[js.Any])
    if (!js.isUndefined(retryOnConcurrencyTimeout)) __obj.updateDynamic("retryOnConcurrencyTimeout")(retryOnConcurrencyTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(snapshotThreshold)) __obj.updateDynamic("snapshotThreshold")(snapshotThreshold.get.asInstanceOf[js.Any])
    if (useLoaderExtensions != null) __obj.updateDynamic("useLoaderExtensions")(useLoaderExtensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainOptions]
  }
}

