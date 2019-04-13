package typings
package browserDashResolveLib.browserDashResolveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browser-resolve", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var sync: js.Function2[/* id */ java.lang.String, /* opts */ js.UndefOr[SyncOpts], java.lang.String] = js.native
  /**
    * Resolve a module path and call cb(err, path [, pkg])
    *
    * @param id Identifier to resolve
    * @param callback
    */
  def apply(id: java.lang.String, cb: browserDashResolveLib.resolveCallback): scala.Unit = js.native
  /**
    * Resolve a module path and call cb(err, path [, pkg])
    *
    * @param id Identifier to resolve
    * @param options Options to use for resolving, optional.
    * @param callback
    */
  def apply(id: java.lang.String, opts: AsyncOpts, cb: browserDashResolveLib.resolveCallback): scala.Unit = js.native
}

