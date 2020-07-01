package typings.cacheManagerIoredis.mod

import typings.cacheManager.mod.Cache
import typings.cacheManager.mod.CacheOptions
import typings.cacheManager.mod.StoreConfig
import typings.cacheManagerIoredis.mod.CacheManagerIORedis.ClusterCache
import typings.cacheManagerIoredis.mod.CacheManagerIORedis.RedisStoreClusterConfig
import typings.cacheManagerIoredis.mod.CacheManagerIORedis.RedisStoreSingleNodeConfig
import typings.cacheManagerIoredis.mod.CacheManagerIORedis.SingleNodeCache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* augmented module */
@JSImport("cache-manager", JSImport.Namespace)
@js.native
object cacheManagerAugmentingMod extends js.Object {
  def caching(IConfig: StoreConfig with CacheOptions): Cache = js.native
  def caching(IConfig: RedisStoreClusterConfig): ClusterCache = js.native
  def caching(IConfig: RedisStoreSingleNodeConfig): SingleNodeCache = js.native
}

