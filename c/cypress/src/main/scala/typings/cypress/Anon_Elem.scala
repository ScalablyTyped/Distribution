package typings.cypress

import typings.cypress.JQuery._ValHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Elem[TElement] extends _ValHook[TElement] {
  def get(elem: TElement): js.Any
}

object Anon_Elem {
  @scala.inline
  def apply[TElement](get: TElement => js.Any): Anon_Elem[TElement] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[Anon_Elem[TElement]]
  }
}

