package typings.d3Selection.mod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Local_[T] extends js.Object {
  
  /**
    * Retrieves a local variable stored on the node (or one of its parents).
    *
    * @param node A node element.
    */
  def get(node: Element): js.UndefOr[T] = js.native
  
  /**
    * Deletes the value associated with the given node. Values stored on ancestors are not affected, meaning that child nodes will still see inherited values.
    *
    * This function returns true if there was a value stored directly on the node, and false otherwise.
    *
    * @param node A node element.
    */
  def remove(node: Element): Boolean = js.native
  
  /**
    * Store a value for this local variable. Calling `.get()` on children of this node will also retrieve the variable's value.
    *
    * @param node A node element.
    * @param value Value to store locally
    */
  def set(node: Element, value: T): Element = js.native
}
object Local_ {
  
  @scala.inline
  def apply[T](get: Element => js.UndefOr[T], remove: Element => Boolean, set: (Element, T) => Element): Local_[T] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get), remove = js.Any.fromFunction1(remove), set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[Local_[T]]
  }
  
  @scala.inline
  implicit class Local_Ops[Self <: Local_[_], T] (val x: Self with Local_[T]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGet(value: Element => js.UndefOr[T]): Self = this.set("get", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemove(value: Element => Boolean): Self = this.set("remove", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSet(value: (Element, T) => Element): Self = this.set("set", js.Any.fromFunction2(value))
  }
}
