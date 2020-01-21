package typings.calidation.mod

import typings.react.mod.ChangeEvent
import typings.react.mod.ReactNode
import typings.std.HTMLFormElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormValidationProps
  extends FormProps
     with ValidationProps

object FormValidationProps {
  @scala.inline
  def apply(
    children: ValidationContext => ReactNode,
    config: FieldsConfig,
    initialValues: Dictionary[_] = null,
    onChange: /* event */ ChangeEvent[HTMLFormElement] => Unit = null,
    onReset: () => Unit = null,
    onSubmit: /* context */ FormContext => Unit = null,
    onUpdate: /* context */ FormContext => Unit = null,
    transforms: Transforms = null
  ): FormValidationProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), config = config.asInstanceOf[js.Any])
    if (initialValues != null) __obj.updateDynamic("initialValues")(initialValues.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction0(onReset))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    if (transforms != null) __obj.updateDynamic("transforms")(transforms.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormValidationProps]
  }
}

