package typings.cqrsDomain.mod

import typings.cqrsDomain.anon.AuthSource
import typings.cqrsDomain.anon.Db
import typings.cqrsDomain.anon.Host
import typings.cqrsDomain.cqrsDomainBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDomainOptions extends StObject {
  
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
  
  inline def apply(domainPath: String): CreateDomainOptions = {
    val __obj = js.Dynamic.literal(domainPath = domainPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainOptions]
  }
  
  extension [Self <: CreateDomainOptions](x: Self) {
    
    inline def setAggregateLock(value: Db): Self = StObject.set(x, "aggregateLock", value.asInstanceOf[js.Any])
    
    inline def setAggregateLockUndefined: Self = StObject.set(x, "aggregateLock", js.undefined)
    
    inline def setCommandRejectedEventName(value: String): Self = StObject.set(x, "commandRejectedEventName", value.asInstanceOf[js.Any])
    
    inline def setCommandRejectedEventNameUndefined: Self = StObject.set(x, "commandRejectedEventName", js.undefined)
    
    inline def setDeduplication(value: Host): Self = StObject.set(x, "deduplication", value.asInstanceOf[js.Any])
    
    inline def setDeduplicationUndefined: Self = StObject.set(x, "deduplication", js.undefined)
    
    inline def setDomainPath(value: String): Self = StObject.set(x, "domainPath", value.asInstanceOf[js.Any])
    
    inline def setEventStore(value: AuthSource): Self = StObject.set(x, "eventStore", value.asInstanceOf[js.Any])
    
    inline def setEventStoreUndefined: Self = StObject.set(x, "eventStore", js.undefined)
    
    inline def setRetryOnConcurrencyTimeout(value: Double): Self = StObject.set(x, "retryOnConcurrencyTimeout", value.asInstanceOf[js.Any])
    
    inline def setRetryOnConcurrencyTimeoutUndefined: Self = StObject.set(x, "retryOnConcurrencyTimeout", js.undefined)
    
    inline def setSnapshotThreshold(value: Double): Self = StObject.set(x, "snapshotThreshold", value.asInstanceOf[js.Any])
    
    inline def setSnapshotThresholdUndefined: Self = StObject.set(x, "snapshotThreshold", js.undefined)
    
    inline def setUseLoaderExtensions(value: `true`): Self = StObject.set(x, "useLoaderExtensions", value.asInstanceOf[js.Any])
    
    inline def setUseLoaderExtensionsUndefined: Self = StObject.set(x, "useLoaderExtensions", js.undefined)
  }
}
