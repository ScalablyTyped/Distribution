package typings.deku.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("deku", "dom")
@js.native
object dom extends js.Object {
  
  /**
    * Create a real DOM element from a virtual element, recursively looping down.
    * When it finds custom elements it will render them, cache them, and keep going,
    * so they are treated like any other native element.
    */
  def create[C](vnode: VirtualElement, path: String, dispatch: Dispatch, context: C): HTMLElement = js.native
  
  /**
    * Modify a DOM element given an array of actions.
    */
  def update[C, A](dispatch: Dispatch, context: C): js.Function2[/* DOMElement */ HTMLElement, /* action */ A, HTMLElement] = js.native
}
