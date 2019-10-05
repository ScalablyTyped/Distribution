package typings.cypress.JQuery

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// endregion
// region CSS
trait CSSHook[TElement] extends js.Object {
  def get(`this`: this.type, elem: TElement, computed: js.Any, extra: js.Any): js.Any
  def set(`this`: this.type, elem: TElement, value: js.Any): Unit
}

object CSSHook {
  @scala.inline
  def apply[TElement](
    get: (CSSHook[TElement], TElement, js.Any, js.Any) => js.Any,
    set: (CSSHook[TElement], TElement, js.Any) => Unit
  ): CSSHook[TElement] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction4(get), set = js.Any.fromFunction3(set))
  
    __obj.asInstanceOf[CSSHook[TElement]]
  }
}

