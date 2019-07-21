package typings
package calidationLib.calidationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ValidationProps extends js.Object {
  var config: FieldsConfig
  var initialValues: js.UndefOr[Dictionary[_]] = js.undefined
  var transforms: js.UndefOr[Transforms] = js.undefined
  def children(context: ValidationContext): reactLib.reactMod.ReactNode
}

object ValidationProps {
  @scala.inline
  def apply(
    children: ValidationContext => reactLib.reactMod.ReactNode,
    config: FieldsConfig,
    initialValues: Dictionary[_] = null,
    transforms: Transforms = null
  ): ValidationProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), config = config)
    if (initialValues != null) __obj.updateDynamic("initialValues")(initialValues)
    if (transforms != null) __obj.updateDynamic("transforms")(transforms)
    __obj.asInstanceOf[ValidationProps]
  }
}

