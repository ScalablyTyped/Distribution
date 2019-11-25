package typings.calidation.calidationMod

import typings.react.reactMod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationProps extends js.Object {
  var config: FieldsConfig
  var initialValues: js.UndefOr[Dictionary[_]] = js.undefined
  var transforms: js.UndefOr[Transforms] = js.undefined
  def children(context: ValidationContext): ReactNode
}

object ValidationProps {
  @scala.inline
  def apply(
    children: ValidationContext => ReactNode,
    config: FieldsConfig,
    initialValues: Dictionary[_] = null,
    transforms: Transforms = null
  ): ValidationProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), config = config.asInstanceOf[js.Any])
    if (initialValues != null) __obj.updateDynamic("initialValues")(initialValues.asInstanceOf[js.Any])
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidationProps]
  }
}

