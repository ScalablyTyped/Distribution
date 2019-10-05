package typings.d3DashSelection.d3DashSelectionMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Local[T] extends js.Object {
  /**
    * Retrieves a local variable stored on the node (or one of its parents).
    *
    * @param node A node element.
    */
  def get(node: Element): js.UndefOr[T]
  /**
    * Deletes the value associated with the given node. Values stored on ancestors are not affected, meaning that child nodes will still see inherited values.
    *
    * This function returns true if there was a value stored directly on the node, and false otherwise.
    *
    * @param node A node element.
    */
  def remove(node: Element): Boolean
  /**
    * Store a value for this local variable. Calling `.get()` on children of this node will also retrieve the variable's value.
    *
    * @param node A node element.
    * @param value Value to store locally
    */
  def set(node: Element, value: T): Element
}

object Local {
  @scala.inline
  def apply[T](
    get: Element => js.UndefOr[T],
    remove: Element => Boolean,
    set: (Element, T) => Element,
    toString: () => String
  ): Local[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set), toString = js.Any.fromFunction0(toString))
  
    __obj.asInstanceOf[Local[T]]
  }
}

@JSImport("d3-selection", "local")
@js.native
object local extends js.Object {
  def apply[T](): Local[T] = js.native
}

