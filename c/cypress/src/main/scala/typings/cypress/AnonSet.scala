package typings.cypress

import typings.cypress.JQuery_.Tween
import typings.cypress.JQuery_._PropHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSet[TElement] extends _PropHook[TElement] {
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  def set(tween: Tween[TElement]): Unit
}

object AnonSet {
  @scala.inline
  def apply[TElement](set: Tween[TElement] => Unit): AnonSet[TElement] = {
    val __obj = js.Dynamic.literal(set = js.Any.fromFunction1(set))
  
    __obj.asInstanceOf[AnonSet[TElement]]
  }
}

