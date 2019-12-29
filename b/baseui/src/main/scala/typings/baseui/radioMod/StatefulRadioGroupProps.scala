package typings.baseui.radioMod

import typings.baseui.baseuiStrings.horizontal
import typings.baseui.baseuiStrings.vertical
import typings.react.reactMod.ChangeEvent
import typings.react.reactMod.ChangeEventHandler
import typings.react.reactMod.ReactNode
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulRadioGroupProps extends js.Object {
  var align: js.UndefOr[horizontal | vertical] = js.undefined
  var autoFocus: js.UndefOr[Boolean] = js.undefined
  var children: js.UndefOr[ReactNode] = js.undefined
  var initialState: js.UndefOr[State] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var onChange: js.UndefOr[ChangeEventHandler[HTMLInputElement]] = js.undefined
  var overrides: js.UndefOr[RadioOverrides with RadioGroupOverrides] = js.undefined
}

object StatefulRadioGroupProps {
  @scala.inline
  def apply(
    align: horizontal | vertical = null,
    autoFocus: js.UndefOr[Boolean] = js.undefined,
    children: ReactNode = null,
    initialState: State = null,
    name: String = null,
    onChange: ChangeEvent[HTMLInputElement] => Unit = null,
    overrides: RadioOverrides with RadioGroupOverrides = null
  ): StatefulRadioGroupProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[StatefulRadioGroupProps]
  }
}

