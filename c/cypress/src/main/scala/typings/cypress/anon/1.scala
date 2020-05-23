package typings.cypress.anon

import typings.cypress.JQuery._ValHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `1`[TElement] extends _ValHook[TElement] {
  def get(elem: TElement): js.Any
}

object `1` {
  @scala.inline
  def apply[TElement](get: TElement => js.Any): `1`[TElement] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
    __obj.asInstanceOf[`1`[TElement]]
  }
}

