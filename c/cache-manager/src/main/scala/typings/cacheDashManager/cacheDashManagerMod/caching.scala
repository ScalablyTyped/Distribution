package typings.cacheDashManager.cacheDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cache-manager", "caching")
@js.native
object caching extends js.Object {
  def apply(IConfig: StoreConfig with CacheOptions): Cache = js.native
}

