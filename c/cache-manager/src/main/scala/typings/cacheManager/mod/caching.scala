package typings.cacheManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cache-manager", "caching")
@js.native
object caching extends js.Object {
  
  def apply(IConfig: StoreConfig with CacheOptions): Cache = js.native
}
