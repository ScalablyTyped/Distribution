package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentBuilder[T /* <: Component */] extends js.Object {
  def component(): T
  def withProperties[U](properties: U): ComponentBuilder[T]
  def withValidation(validation: js.Function1[/* component */ T, Boolean]): ComponentBuilder[T]
}

object ComponentBuilder {
  @scala.inline
  def apply[T /* <: Component */](
    component: () => T,
    withProperties: js.Any => ComponentBuilder[T],
    withValidation: js.Function1[/* component */ T, Boolean] => ComponentBuilder[T]
  ): ComponentBuilder[T] = {
    val __obj = js.Dynamic.literal(component = js.Any.fromFunction0(component), withProperties = js.Any.fromFunction1(withProperties), withValidation = js.Any.fromFunction1(withValidation))
  
    __obj.asInstanceOf[ComponentBuilder[T]]
  }
}

