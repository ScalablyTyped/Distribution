package typings.cacheManagerIoredis.mod.CacheManagerIORedis

import typings.cacheManager.mod.Cache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClusterCache extends Cache {
  @JSName("store")
  var store_ClusterCache: RedisClusterStore = js.native
}

