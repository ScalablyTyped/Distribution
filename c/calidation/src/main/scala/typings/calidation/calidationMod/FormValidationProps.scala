package typings.calidation.calidationMod

import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.ReactNode
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
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), config = config)
    if (initialValues != null) __obj.updateDynamic("initialValues")(initialValues)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onReset != null) __obj.updateDynamic("onReset")(js.Any.fromFunction0(onReset))
    if (onSubmit != null) __obj.updateDynamic("onSubmit")(js.Any.fromFunction1(onSubmit))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction1(onUpdate))
    if (transforms != null) __obj.updateDynamic("transforms")(transforms)
    __obj.asInstanceOf[FormValidationProps]
  }
}

