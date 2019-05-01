package typings
package dekuLib.dekuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deku", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	 * Create a DOM renderer using a container element.
  	 * Everything will be rendered inside of that container.
  	 * Returns a function that accepts new state that can replace what is currently rendered.
  	 */
  def createApp(el: stdLib.HTMLElement): Render = js.native
  def createApp(el: stdLib.HTMLElement, dispatch: Dispatch): Render = js.native
  def element(`type`: Thunk): VirtualElement = js.native
  /**
  	 * This function lets us create virtual nodes using a simple syntax.
  	 * It is compatible with JSX transforms so you can use JSX to write nodes that will compile to this function.
  	 */
  def element(`type`: java.lang.String): VirtualElement = js.native
  def element[A](`type`: Thunk, attributes: A, children: js.Any*): VirtualElement = js.native
  def element[A](`type`: java.lang.String, attributes: A, children: js.Any*): VirtualElement = js.native
}

