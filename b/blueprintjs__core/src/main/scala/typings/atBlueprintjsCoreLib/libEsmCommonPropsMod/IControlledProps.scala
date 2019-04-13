package typings
package atBlueprintjsCoreLib.libEsmCommonPropsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IControlledProps extends js.Object {
  /** Initial value of the input, for uncontrolled usage. */
  var defaultValue: js.UndefOr[java.lang.String] = js.undefined
  /** Change event handler. Use `event.target.value` for new value. */
  var onChange: js.UndefOr[reactLib.reactMod.FormEventHandler[stdLib.HTMLElement]] = js.undefined
  /** Form value of the input, for controlled usage. */
  var value: js.UndefOr[java.lang.String] = js.undefined
}

object IControlledProps {
  @scala.inline
  def apply(
    defaultValue: java.lang.String = null,
    onChange: reactLib.reactMod.FormEventHandler[stdLib.HTMLElement] = null,
    value: java.lang.String = null
  ): IControlledProps = {
    val __obj = js.Dynamic.literal()
    if (defaultValue != null) __obj.updateDynamic("defaultValue")(defaultValue)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[IControlledProps]
  }
}

