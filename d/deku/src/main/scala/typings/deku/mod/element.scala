package typings.deku.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("deku", "element")
@js.native
object element extends js.Object {
  
  /**
    * This function lets us create virtual nodes using a simple syntax.
    * It is compatible with JSX transforms so you can use JSX to write nodes that will compile to this function.
    */
  def apply(`type`: String): VirtualElement = js.native
  def apply(`type`: Thunk): VirtualElement = js.native
  def apply[A](`type`: String, attributes: A, children: js.Any*): VirtualElement = js.native
  def apply[A](`type`: Thunk, attributes: A, children: js.Any*): VirtualElement = js.native
}
