package typings.cacache.enMod.tmp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("cacache/en", "tmp.withTmp")
@js.native
object withTmp extends js.Object {
  
  def apply(cachePath: String, cb: Callback): Unit = js.native
  /**
    * Creates a temporary directory with `tmp.mkdir()` and calls `cb` with it.
    * The created temporary directory will be removed when the return value of
    * `cb()` resolves -- that is, if you return a Promise from `cb()`, the tmp
    * directory will be automatically deleted once that promise completes.
    *
    * The same caveats apply when it comes to managing permissions for the tmp dir's contents.
    */
  def apply(cachePath: String, opts: Options, cb: Callback): Unit = js.native
}
