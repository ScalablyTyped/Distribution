package typings.atBlueprintjsCore.libEsmCommonPropsMod

import typings.react.reactMod.FormEvent
import typings.react.reactMod.FormEventHandler
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IControlledProps extends js.Object {
  /** Initial value of the input, for uncontrolled usage. */
  var defaultValue: js.UndefOr[String] = js.undefined
  /** Change event handler. Use `event.target.value` for new value. */
  var onChange: js.UndefOr[FormEventHandler[HTMLElement]] = js.undefined
  /** Form value of the input, for controlled usage. */
  var value: js.UndefOr[String] = js.undefined
}

object IControlledProps {
  @scala.inline
  def apply(defaultValue: String = null, onChange: FormEvent[HTMLElement] => Unit = null, value: String = null): IControlledProps = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IControlledProps]
  }
}

