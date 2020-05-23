package typings.baseui.phoneInputMod

import typings.baseui.selectMod.OnChangeParams
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulPhoneInputProps extends js.Object {
  var `aria-label`: js.UndefOr[String] = js.undefined
  var initialState: js.UndefOr[State] = js.undefined
  var mapIsoToLabel: js.UndefOr[js.Function1[/* iso */ String, String]] = js.undefined
  var onCountryChange: js.UndefOr[js.Function1[/* event */ OnChangeParams, _]] = js.undefined
  var onTextChange: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLInputElement, Event], _]] = js.undefined
  var overrides: js.UndefOr[PhoneInputOverrides] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object StatefulPhoneInputProps {
  @scala.inline
  def apply(
    `aria-label`: String = null,
    initialState: State = null,
    mapIsoToLabel: /* iso */ String => String = null,
    onCountryChange: /* event */ OnChangeParams => _ = null,
    onTextChange: /* event */ SyntheticEvent[HTMLInputElement, Event] => _ = null,
    overrides: PhoneInputOverrides = null,
    stateReducer: (/* type */ StateChange, /* nextState */ State, /* currentState */ State) => State = null
  ): StatefulPhoneInputProps = {
    val __obj = js.Dynamic.literal()
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (initialState != null) __obj.updateDynamic("initialState")(initialState.asInstanceOf[js.Any])
    if (mapIsoToLabel != null) __obj.updateDynamic("mapIsoToLabel")(js.Any.fromFunction1(mapIsoToLabel))
    if (onCountryChange != null) __obj.updateDynamic("onCountryChange")(js.Any.fromFunction1(onCountryChange))
    if (onTextChange != null) __obj.updateDynamic("onTextChange")(js.Any.fromFunction1(onTextChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(js.Any.fromFunction3(stateReducer))
    __obj.asInstanceOf[StatefulPhoneInputProps]
  }
}

