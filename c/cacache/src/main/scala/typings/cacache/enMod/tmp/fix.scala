package typings.cacache.enMod.tmp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cacache/en", "tmp.fix")
@js.native
object fix extends js.Object {
  
  /**
    * Sets the `uid` and `gid` properties on all files and folders within the
    * tmp folder to match the rest of the cache.
    *
    * Use this after manually writing files into `tmp.mkdir` or `tmp.withTmp`.
    */
  def apply(cachePath: String): js.Promise[Unit] = js.native
}
