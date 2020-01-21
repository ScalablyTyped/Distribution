package typings.cypress

import typings.cypress.JQuery_._ValHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonElem[TElement] extends _ValHook[TElement] {
  def get(elem: TElement): js.Any
}

object AnonElem {
  @scala.inline
  def apply[TElement](get: TElement => js.Any): AnonElem[TElement] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[AnonElem[TElement]]
  }
}

