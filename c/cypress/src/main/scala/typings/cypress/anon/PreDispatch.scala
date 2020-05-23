package typings.cypress.anon

import typings.cypress.JQuery.Event
import typings.cypress.JQuery._SpecialEventHook
import typings.cypress.cypressBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreDispatch[TTarget]
  extends _SpecialEventHook[TTarget, js.Any] {
  def preDispatch(event: Event): `false` | Unit
}

object PreDispatch {
  @scala.inline
  def apply[TTarget](preDispatch: Event => `false` | Unit): PreDispatch[TTarget] = {
    val __obj = js.Dynamic.literal(preDispatch = js.Any.fromFunction1(preDispatch))
    __obj.asInstanceOf[PreDispatch[TTarget]]
  }
}

