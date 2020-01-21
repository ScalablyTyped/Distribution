package typings.cypress

import typings.cypress.JQuery_._SpecialEventHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonEventPostDispatch[TTarget]
  extends _SpecialEventHook[TTarget, js.Any] {
  def postDispatch(event: typings.cypress.JQuery_.Event): Unit
}

object AnonEventPostDispatch {
  @scala.inline
  def apply[TTarget](postDispatch: typings.cypress.JQuery_.Event => Unit): AnonEventPostDispatch[TTarget] = {
    val __obj = js.Dynamic.literal(postDispatch = js.Any.fromFunction1(postDispatch))
  
    __obj.asInstanceOf[AnonEventPostDispatch[TTarget]]
  }
}

