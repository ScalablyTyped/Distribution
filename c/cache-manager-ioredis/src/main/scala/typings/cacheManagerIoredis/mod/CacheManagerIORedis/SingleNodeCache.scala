package typings.cacheManagerIoredis.mod.CacheManagerIORedis

import typings.cacheManager.mod.Cache
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SingleNodeCache extends Cache {
  
  @JSName("store")
  var store_SingleNodeCache: RedisSingleNodeStore = js.native
}
