package typings
package baseuiLib.radioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulRadioGroupProps extends js.Object {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var initialState: js.UndefOr[State] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var onChange: js.UndefOr[reactLib.reactMod.FormEventHandler[stdLib.HTMLInputElement]] = js.undefined
  var overrides: js.UndefOr[RadioOverrides with RadioGroupOverrides] = js.undefined
}

object StatefulRadioGroupProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    initialState: State = null,
    name: java.lang.String = null,
    onChange: reactLib.reactMod.FormEventHandler[stdLib.HTMLInputElement] = null,
    overrides: RadioOverrides with RadioGroupOverrides = null
  ): StatefulRadioGroupProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (name != null) __obj.updateDynamic("name")(name)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[StatefulRadioGroupProps]
  }
}

