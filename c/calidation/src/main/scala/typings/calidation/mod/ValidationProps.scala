package typings.calidation.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationProps[T /* <: js.Object */] extends js.Object {
  var config: FieldsConfig[T]
  var initialValues: js.UndefOr[T] = js.undefined
  var transforms: js.UndefOr[Transforms[T]] = js.undefined
  def children(context: ValidationContext[T]): ReactNode
}

object ValidationProps {
  @scala.inline
  def apply[/* <: js.Object */ T](
    children: ValidationContext[T] => ReactNode,
    config: FieldsConfig[T],
    initialValues: T = null,
    transforms: Transforms[T] = null
  ): ValidationProps[T] = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), config = config.asInstanceOf[js.Any])
    if (initialValues != null) __obj.updateDynamic("initialValues")(initialValues.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationProps[T]]
  }
}

