package typings
package baseuiLib.radioMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulContainerProps extends js.Object {
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode] = js.undefined
  var initialState: js.UndefOr[State] = js.undefined
  var onChange: js.UndefOr[
    js.Function1[
      /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event], 
      _
    ]
  ] = js.undefined
  var overrides: js.UndefOr[RadioOverrides with RadioGroupOverrides] = js.undefined
  var stateReducer: StateReducer
}

object StatefulContainerProps {
  @scala.inline
  def apply(
    stateReducer: StateReducer,
    autoFocus: js.UndefOr[scala.Boolean] = js.undefined,
    children: reactLib.reactMod.ReactNode = null,
    initialState: State = null,
    onChange: /* e */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event] => _ = null,
    overrides: RadioOverrides with RadioGroupOverrides = null
  ): StatefulContainerProps = {
    val __obj = js.Dynamic.literal(stateReducer = stateReducer)
    if (!js.isUndefined(autoFocus)) __obj.updateDynamic("autoFocus")(autoFocus)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (onChange != null) __obj.updateDynamic("onChange")(js.Any.fromFunction1(onChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[StatefulContainerProps]
  }
}

