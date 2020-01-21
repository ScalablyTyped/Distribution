package typings.cypress

import typings.cypress.JQuery_.HandleObject
import typings.cypress.JQuery_._SpecialEventHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHandleObj[TTarget, TData] extends _SpecialEventHook[TTarget, TData] {
  /**
    * When an event handler is removed from an element using an API such as `.off()`, this hook is called. The `this` keyword will be the element where the handler is being removed, and the `handleObj` argument is as described in the section above. The return value of this hook is ignored.
    * @see \`{@link https://learn.jquery.com/events/event-extensions/#remove-function-handleobj }\`
    */
  def remove(handleObj: HandleObject[TTarget, TData]): Unit
}

object AnonHandleObj {
  @scala.inline
  def apply[TTarget, TData](remove: HandleObject[TTarget, TData] => Unit): AnonHandleObj[TTarget, TData] = {
    val __obj = js.Dynamic.literal(remove = js.Any.fromFunction1(remove))
  
    __obj.asInstanceOf[AnonHandleObj[TTarget, TData]]
  }
}

