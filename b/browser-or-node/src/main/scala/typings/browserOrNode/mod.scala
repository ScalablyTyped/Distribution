package typings.browserOrNode

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("browser-or-node", JSImport.Namespace)
@js.native
object mod extends js.Object {
  val isBrowser: Boolean = js.native
  val isNode: Boolean = js.native
  val isWebWorker: Boolean = js.native
}

