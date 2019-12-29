package typings.cacache.enMod.get

import typings.cacache.cacacheBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cacache/en", "get.hasContent")
@js.native
object hasContent extends js.Object {
  /**
    * Looks up a Subresource Integrity hash in the cache. If content exists
    * for this `integrity`, it will return an object, with the specific single
    * integrity hash that was found in sri key, and the size of the found
    * content as size. If no content exists for this integrity, it will return
    * `false`.
    */
  def apply(cachePath: String, hash: String): js.Promise[HasContentObject | `false`] = js.native
}

