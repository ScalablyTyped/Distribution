package typings
package baseuiLib.buttonDashGroupMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulButtonGroupProps extends ButtonGroupProps {
  var initialState: js.UndefOr[InitialState] = js.undefined
  var stateReducer: js.UndefOr[
    js.Function3[
      /* stateType */ STATE_CHANGE_TYPE, 
      /* nextState */ State, 
      /* currentState */ State, 
      State
    ]
  ] = js.undefined
}

object StatefulButtonGroupProps {
  @scala.inline
  def apply(
    children: reactLib.reactMod.ReactNode,
    ariaLabel: java.lang.String = null,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    initialState: InitialState = null,
    mode: baseuiLib.baseuiLibStrings.checkbox | baseuiLib.baseuiLibStrings.radio = null,
    onClick: /* event */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLButtonElement, reactLib.Event] => _ = null,
    overrides: ButtonGroupOverrides = null,
    selected: scala.Double | js.Array[scala.Double] = null,
    shape: baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.round | baseuiLib.baseuiLibStrings.square = null,
    size: baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.round | baseuiLib.baseuiLibStrings.square = null,
    stateReducer: (/* stateType */ STATE_CHANGE_TYPE, /* nextState */ State, /* currentState */ State) => State = null
  ): StatefulButtonGroupProps = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any])
    if (ariaLabel != null) __obj.updateDynamic("ariaLabel")(ariaLabel)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (selected != null) __obj.updateDynamic("selected")(selected.asInstanceOf[js.Any])
    if (shape != null) __obj.updateDynamic("shape")(shape.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[StatefulButtonGroupProps]
  }
}

