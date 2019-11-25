package typings.cypress

import typings.cypress.JQuery.Event
import typings.cypress.JQuery._SpecialEventHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventPostDispatch[TTarget]
  extends _SpecialEventHook[TTarget, js.Any] {
  def postDispatch(`this`: TTarget, event: Event): Unit
}

object Anon_EventPostDispatch {
  @scala.inline
  def apply[TTarget](postDispatch: (TTarget, Event) => Unit): Anon_EventPostDispatch[TTarget] = {
    val __obj = js.Dynamic.literal(postDispatch = js.Any.fromFunction2(postDispatch))
  
    __obj.asInstanceOf[Anon_EventPostDispatch[TTarget]]
  }
}

