package typings
package baseuiLib.checkboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulContainerProps extends js.Object {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var initialState: js.UndefOr[CheckboxState] = js.undefined
  var onBlur: js.UndefOr[reactLib.reactMod.FocusEventHandler[stdLib.HTMLInputElement]] = js.undefined
  var onChange: js.UndefOr[reactLib.reactMod.FormEventHandler[stdLib.HTMLInputElement]] = js.undefined
  var onFocus: js.UndefOr[reactLib.reactMod.FocusEventHandler[stdLib.HTMLInputElement]] = js.undefined
  var onMouseEnter: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLInputElement]] = js.undefined
  var onMouseLeave: js.UndefOr[reactLib.reactMod.MouseEventHandler[stdLib.HTMLInputElement]] = js.undefined
  var overrides: js.UndefOr[CheckboxOverrides] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object StatefulContainerProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    initialState: CheckboxState = null,
    onBlur: reactLib.reactMod.FocusEventHandler[stdLib.HTMLInputElement] = null,
    onChange: reactLib.reactMod.FormEventHandler[stdLib.HTMLInputElement] = null,
    onFocus: reactLib.reactMod.FocusEventHandler[stdLib.HTMLInputElement] = null,
    onMouseEnter: reactLib.reactMod.MouseEventHandler[stdLib.HTMLInputElement] = null,
    onMouseLeave: reactLib.reactMod.MouseEventHandler[stdLib.HTMLInputElement] = null,
    overrides: CheckboxOverrides = null,
    stateReducer: StateReducer = null
  ): StatefulContainerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (onBlur != null) __obj.updateDynamic("onBlur")(onBlur)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (onFocus != null) __obj.updateDynamic("onFocus")(onFocus)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(stateReducer)
    __obj.asInstanceOf[StatefulContainerProps]
  }
}

