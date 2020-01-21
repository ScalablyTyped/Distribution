package typings.cypress.JQuery_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _PropHook[TElement] extends js.Object

object _PropHook {
  @scala.inline
  def AnonGet[TElement](get: Tween[TElement] => js.Any): _PropHook[TElement] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[_PropHook[TElement]]
  }
  @scala.inline
  def AnonSet[TElement](set: Tween[TElement] => Unit): _PropHook[TElement] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[_PropHook[TElement]]
  }
}

