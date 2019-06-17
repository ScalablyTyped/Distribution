package typings
package baseuiLib.phoneDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StatefulPhoneInputProps extends js.Object {
  var `aria-label`: js.UndefOr[java.lang.String] = js.undefined
  var initialState: js.UndefOr[State] = js.undefined
  var mapIsoToLabel: js.UndefOr[js.Function1[/* iso */ java.lang.String, java.lang.String]] = js.undefined
  var onCountryChange: js.UndefOr[js.Function1[/* event */ baseuiLib.selectMod.OnChangeParams, _]] = js.undefined
  var onTextChange: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event], 
      _
    ]
  ] = js.undefined
  var overrides: js.UndefOr[PhoneInputOverrides] = js.undefined
  var stateReducer: js.UndefOr[StateReducer] = js.undefined
}

object StatefulPhoneInputProps {
  @scala.inline
  def apply(
    `aria-label`: java.lang.String = null,
    initialState: State = null,
    mapIsoToLabel: /* iso */ java.lang.String => java.lang.String = null,
    onCountryChange: /* event */ baseuiLib.selectMod.OnChangeParams => _ = null,
    onTextChange: /* event */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event] => _ = null,
    overrides: PhoneInputOverrides = null,
    stateReducer: StateReducer = null
  ): StatefulPhoneInputProps = {
    val __obj = js.Dynamic.literal()
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (initialState != null) __obj.updateDynamic("initialState")(initialState)
    if (mapIsoToLabel != null) __obj.updateDynamic("mapIsoToLabel")(js.Any.fromFunction1(mapIsoToLabel))
    if (onCountryChange != null) __obj.updateDynamic("onCountryChange")(js.Any.fromFunction1(onCountryChange))
    if (onTextChange != null) __obj.updateDynamic("onTextChange")(js.Any.fromFunction1(onTextChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (stateReducer != null) __obj.updateDynamic("stateReducer")(stateReducer)
    __obj.asInstanceOf[StatefulPhoneInputProps]
  }
}

