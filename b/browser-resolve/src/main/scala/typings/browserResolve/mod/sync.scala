package typings.browserResolve.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browser-resolve", "sync")
@js.native
object sync extends js.Object {
  /**
    * Returns a module path
    * @param id Identifier to resolve
    * @param options Options to use for resolving.
    */
  def apply(id: String): String = js.native
  def apply(id: String, opts: SyncOpts): String = js.native
}

