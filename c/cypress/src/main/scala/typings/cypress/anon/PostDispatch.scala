package typings.cypress.anon

import typings.cypress.JQuery.Event
import typings.cypress.JQuery._SpecialEventHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostDispatch[TTarget]
  extends _SpecialEventHook[TTarget, js.Any] {
  def postDispatch(event: Event): Unit
}

object PostDispatch {
  @scala.inline
  def apply[TTarget](postDispatch: Event => Unit): PostDispatch[TTarget] = {
    val __obj = js.Dynamic.literal(postDispatch = js.Any.fromFunction1(postDispatch))
    __obj.asInstanceOf[PostDispatch[TTarget]]
  }
}

