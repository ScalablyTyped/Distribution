package typings.browserResolve.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browser-resolve", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var sync: js.Function2[/* id */ String, /* opts */ js.UndefOr[SyncOpts], String] = js.native
  /**
    * Resolve a module path and call cb(err, path [, pkg])
    *
    * @param id Identifier to resolve
    * @param callback
    */
  def apply(id: String, cb: resolveCallback): Unit = js.native
  /**
    * Resolve a module path and call cb(err, path [, pkg])
    *
    * @param id Identifier to resolve
    * @param options Options to use for resolving, optional.
    * @param callback
    */
  def apply(id: String, opts: AsyncOpts, cb: resolveCallback): Unit = js.native
}

