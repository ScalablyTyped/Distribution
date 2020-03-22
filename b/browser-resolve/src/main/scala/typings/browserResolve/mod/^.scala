package typings.browserResolve.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browser-resolve", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Resolve a module path and call cb(err, path)
    *
    * @param id Identifier to resolve
    * @param callback
    */
  def apply(id: String, cb: Callback): Unit = js.native
  /**
    * Resolve a module path and call cb(err, path)
    *
    * @param id Identifier to resolve
    * @param options Options to use for resolving, optional.
    * @param callback
    */
  def apply(id: String, opts: AsyncOpts, cb: Callback): Unit = js.native
}

