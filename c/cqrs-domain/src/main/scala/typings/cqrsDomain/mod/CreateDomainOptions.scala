package typings.cqrsDomain.mod

import typings.cqrsDomain.anon.AuthSource
import typings.cqrsDomain.anon.Db
import typings.cqrsDomain.anon.Host
import typings.cqrsDomain.cqrsDomainBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateDomainOptions extends js.Object {
  /**
    * optional, default is in-memory
    * currently supports: mongodb, redis, tingodb, couchdb, azuretable, dynamodb and inmemory
    * hint settings like: [eventstore](https://github.com/adrai/node-eventstore#provide-implementation-for-storage)
    */
  var aggregateLock: js.UndefOr[Db] = js.native
  /**
    * optional, default is 'commandRejected'
    * will be used if an error occurs and an event should be generated
    */
  var commandRejectedEventName: js.UndefOr[String] = js.native
  /**
    * optional, default is not set
    * checks if command was already seen in the last time -> ttl
    * currently supports: mongodb, redis, tingodb and inmemory
    * hint settings like: [eventstore](https://github.com/adrai/node-eventstore#provide-implementation-for-storage)
    */
  var deduplication: js.UndefOr[Host] = js.native
  /**
    * the path to the "working directory"
    * can be structured like
    * [set 1](https://github.com/adrai/node-cqrs-domain/tree/master/test/integration/fixture/set1) or
    * [set 2](https://github.com/adrai/node-cqrs-domain/tree/master/test/integration/fixture/set2)
    */
  var domainPath: String = js.native
  /**
    * optional, default is in-memory
    * currently supports: mongodb, redis, tingodb, azuretable and inmemory
    * hint: [eventstore](https://github.com/adrai/node-eventstore#provide-implementation-for-storage)
    */
  var eventStore: js.UndefOr[AuthSource] = js.native
  /**
    * optional, default is 800
    * if using in scaled systems and not guaranteeing that each command for an aggregate instance
    * dispatches to the same worker process, this module tries to catch the concurrency issues and
    * retries to handle the command after a timeout between 0 and the defined value
    */
  var retryOnConcurrencyTimeout: js.UndefOr[Double] = js.native
  /**
    * optional, default is 100
    * global snapshot threshold value for all aggregates
    * defines the amount of loaded events, if there are more events to load, it will do a snapshot, so next loading is faster
    * an individual snapshot threshold defining algorithm can be defined per aggregate (scroll down)
    */
  var snapshotThreshold: js.UndefOr[Double] = js.native
  /**
    * optional, default false
    * resolves valid file types from loader extensions instead of default values while parsing definition files
    */
  var useLoaderExtensions: js.UndefOr[`true`] = js.native
}

object CreateDomainOptions {
  @scala.inline
  def apply(domainPath: String): CreateDomainOptions = {
    val __obj = js.Dynamic.literal(domainPath = domainPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainOptions]
  }
  @scala.inline
  implicit class CreateDomainOptionsOps[Self <: CreateDomainOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDomainPath(value: String): Self = this.set("domainPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setAggregateLock(value: Db): Self = this.set("aggregateLock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAggregateLock: Self = this.set("aggregateLock", js.undefined)
    @scala.inline
    def setCommandRejectedEventName(value: String): Self = this.set("commandRejectedEventName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommandRejectedEventName: Self = this.set("commandRejectedEventName", js.undefined)
    @scala.inline
    def setDeduplication(value: Host): Self = this.set("deduplication", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeduplication: Self = this.set("deduplication", js.undefined)
    @scala.inline
    def setEventStore(value: AuthSource): Self = this.set("eventStore", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEventStore: Self = this.set("eventStore", js.undefined)
    @scala.inline
    def setRetryOnConcurrencyTimeout(value: Double): Self = this.set("retryOnConcurrencyTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryOnConcurrencyTimeout: Self = this.set("retryOnConcurrencyTimeout", js.undefined)
    @scala.inline
    def setSnapshotThreshold(value: Double): Self = this.set("snapshotThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotThreshold: Self = this.set("snapshotThreshold", js.undefined)
    @scala.inline
    def setUseLoaderExtensions(value: `true`): Self = this.set("useLoaderExtensions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseLoaderExtensions: Self = this.set("useLoaderExtensions", js.undefined)
  }
  
}

