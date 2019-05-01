package typings
package dekuLib.dekuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("deku", "dom")
@js.native
object domNs extends js.Object {
  /**
  		 * Create a real DOM element from a virtual element, recursively looping down.
  		 * When it finds custom elements it will render them, cache them, and keep going,
  		 * so they are treated like any other native element.
  		 */
  def create[C](
    vnode: dekuLib.dekuMod.VirtualElement,
    path: java.lang.String,
    dispatch: dekuLib.dekuMod.Dispatch,
    context: C
  ): stdLib.HTMLElement = js.native
  /**
  		 * Modify a DOM element given an array of actions.
  		 */
  def update[C, A](dispatch: dekuLib.dekuMod.Dispatch, context: C): js.Function2[/* DOMElement */ stdLib.HTMLElement, /* action */ A, stdLib.HTMLElement] = js.native
}

