package typings
package baseuiLib.checkboxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulContainerProps extends js.Object {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var initialState: js.UndefOr[CheckboxState] = js.undefined
  var onBlur: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event], 
      _
    ]
  ] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event], 
      _
    ]
  ] = js.undefined
  var onFocus: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event], 
      _
    ]
  ] = js.undefined
  var onMouseEnter: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event], 
      _
    ]
  ] = js.undefined
  var onMouseLeave: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event], 
      _
    ]
  ] = js.undefined
  var overrides: js.UndefOr[CheckboxOverrides] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object StatefulContainerProps {
  @scala.inline
  def apply(
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    initialState: CheckboxState = null,
    onBlur: /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event] => _ = null,
    onChange: /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event] => _ = null,
    onFocus: /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event] => _ = null,
    onMouseEnter: /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event] => _ = null,
    onMouseLeave: /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event] => _ = null,
    overrides: CheckboxOverrides = null,
    stateReducer: StateReducer = null
  ): StatefulContainerProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (onBlur != null) __obj.updateDynamic("onBlur")(js.Any.fromFunction1(onBlur))
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (onFocus != null) __obj.updateDynamic("onFocus")(js.Any.fromFunction1(onFocus))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(stateReducer)
    __obj.asInstanceOf[StatefulContainerProps]
  }
}

