package typings.cacache.enMod.get

import typings.cacache.enMod.CacheObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cacache/en", "get")
@js.native
object ^ extends js.Object {
  def apply(cachePath: String, key: String): js.Promise[CacheObject] = js.native
  def apply(cachePath: String, key: String, options: Options): js.Promise[CacheObject] = js.native
}

