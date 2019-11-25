package typings.cypress

import typings.cypress.JQuery.Tween
import typings.cypress.JQuery._PropHook
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Get[TElement] extends _PropHook[TElement] {
  /**
    * @see \`{@link https://gist.github.com/gnarf/54829d408993526fe475#tween-hooks }\`
    * @since 1.8
    */
  def get(tween: Tween[TElement]): js.Any
}

object Anon_Get {
  @scala.inline
  def apply[TElement](get: Tween[TElement] => js.Any): Anon_Get[TElement] = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction1(get))
  
    __obj.asInstanceOf[Anon_Get[TElement]]
  }
}

