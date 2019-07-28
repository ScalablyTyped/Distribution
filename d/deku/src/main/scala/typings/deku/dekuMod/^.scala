package typings.deku.dekuMod

import typings.std.HTMLElement
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
  def createApp(el: HTMLElement): Render = js.native
  def createApp(el: HTMLElement, dispatch: Dispatch): Render = js.native
  /**
  	 * This function lets us create virtual nodes using a simple syntax.
  	 * It is compatible with JSX transforms so you can use JSX to write nodes that will compile to this function.
  	 */
  def element(`type`: String): VirtualElement = js.native
  def element(`type`: Thunk): VirtualElement = js.native
  def element[A](`type`: String, attributes: A, children: js.Any*): VirtualElement = js.native
  def element[A](`type`: Thunk, attributes: A, children: js.Any*): VirtualElement = js.native
}

