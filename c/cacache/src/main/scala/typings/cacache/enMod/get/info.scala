package typings.cacache.enMod.get

import typings.cacache.enMod.CacheObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cacache/en", "get.info")
@js.native
object info extends js.Object {
  /**
    * Looks up `key` in the cache index, returning information about the entry
    * if one exists.
    */
  def apply(cachePath: String, key: String): js.Promise[CacheObject] = js.native
}

