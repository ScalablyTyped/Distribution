package typings.cypress.anon

import typings.cypress.JQuery._ValHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `2`[TElement] extends _ValHook[TElement] {
  def set(elem: TElement, value: js.Any): js.Any
}

object `2` {
  @scala.inline
  def apply[TElement](set: (TElement, js.Any) => js.Any): `2`[TElement] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction2(set))
    __obj.asInstanceOf[`2`[TElement]]
  }
}

