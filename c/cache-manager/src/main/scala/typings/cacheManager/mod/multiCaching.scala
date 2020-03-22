package typings.cacheManager.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cache-manager", "multiCaching")
@js.native
object multiCaching extends js.Object {
  def apply(Caches: js.Array[Cache]): MultiCache = js.native
  def apply(Caches: js.Array[Cache], options: CacheOptions): MultiCache = js.native
}

