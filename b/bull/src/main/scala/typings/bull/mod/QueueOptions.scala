package typings.bull.mod

import typings.bull.bullStrings.bclient
import typings.bull.bullStrings.client
import typings.bull.bullStrings.subscriber
import typings.ioredis.builtRedisRedisOptionsMod.RedisOptions
import typings.ioredis.mod.Cluster
import typings.ioredis.mod.Redis
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueOptions extends StObject {
  
  /**
    * When specified, the `Queue` will use this function to create new `ioredis` client connections.
    * This is useful if you want to re-use connections or connect to a Redis cluster.
    */
  var createClient: js.UndefOr[
    js.Function2[
      /* type */ client | subscriber | bclient, 
      /* redisOpts */ js.UndefOr[RedisOptions], 
      Redis | Cluster
    ]
  ] = js.undefined
  
  var defaultJobOptions: js.UndefOr[JobOptions] = js.undefined
  
  var limiter: js.UndefOr[RateLimiter] = js.undefined
  
  /**
    * Prefix to use for all redis keys
    */
  var prefix: js.UndefOr[String] = js.undefined
  
  /**
    * Options passed into the `ioredis` constructor's `options` parameter.
    * `connectionName` is overwritten with `Queue.clientName()`. other properties are copied
    */
  var redis: js.UndefOr[RedisOptions | String] = js.undefined
  
  var settings: js.UndefOr[AdvancedSettings] = js.undefined
}
object QueueOptions {
  
  inline def apply(): QueueOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueOptions]
  }
  
  extension [Self <: QueueOptions](x: Self) {
    
    inline def setCreateClient(
      value: (/* type */ client | subscriber | bclient, /* redisOpts */ js.UndefOr[RedisOptions]) => Redis | Cluster
    ): Self = StObject.set(x, "createClient", js.Any.fromFunction2(value))
    
    inline def setCreateClientUndefined: Self = StObject.set(x, "createClient", js.undefined)
    
    inline def setDefaultJobOptions(value: JobOptions): Self = StObject.set(x, "defaultJobOptions", value.asInstanceOf[js.Any])
    
    inline def setDefaultJobOptionsUndefined: Self = StObject.set(x, "defaultJobOptions", js.undefined)
    
    inline def setLimiter(value: RateLimiter): Self = StObject.set(x, "limiter", value.asInstanceOf[js.Any])
    
    inline def setLimiterUndefined: Self = StObject.set(x, "limiter", js.undefined)
    
    inline def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
    
    inline def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
    
    inline def setRedis(value: RedisOptions | String): Self = StObject.set(x, "redis", value.asInstanceOf[js.Any])
    
    inline def setRedisUndefined: Self = StObject.set(x, "redis", js.undefined)
    
    inline def setSettings(value: AdvancedSettings): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    
    inline def setSettingsUndefined: Self = StObject.set(x, "settings", js.undefined)
  }
}
