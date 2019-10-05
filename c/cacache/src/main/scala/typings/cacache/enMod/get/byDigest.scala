package typings.cacache.enMod.get

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("cacache/en", "get.byDigest")
@js.native
object byDigest extends js.Object {
  def apply(cachePath: String, hash: String): js.Promise[String] = js.native
  def apply(cachePath: String, hash: String, opts: Options): js.Promise[String] = js.native
}

