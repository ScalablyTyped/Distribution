package typings.cacheDashManager.cacheDashManagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cache-manager", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def caching(IConfig: StoreConfig): Cache = js.native
  def multiCaching(Caches: js.Array[Cache]): Cache = js.native
}

