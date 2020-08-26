package typings.baseui.phoneInputMod

import typings.baseui.selectMod.OnChangeParams
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatefulPhoneInputProps extends js.Object {
  var `aria-label`: js.UndefOr[String] = js.native
  var initialState: js.UndefOr[State] = js.native
  var mapIsoToLabel: js.UndefOr[js.Function1[/* iso */ String, String]] = js.native
  var onCountryChange: js.UndefOr[js.Function1[/* event */ OnChangeParams, _]] = js.native
  var onTextChange: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLInputElement, Event], _]] = js.native
  var overrides: js.UndefOr[PhoneInputOverrides] = js.native
  var stateReducer: js.UndefOr[StateReducer] = js.native
}

object StatefulPhoneInputProps {
  @scala.inline
  def apply(): StatefulPhoneInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatefulPhoneInputProps]
  }
  @scala.inline
  implicit class StatefulPhoneInputPropsOps[Self <: StatefulPhoneInputProps] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def `setAria-label`(value: String): Self = this.set("aria-label", value.asInstanceOf[js.Any])
    @scala.inline
    def `deleteAria-label`: Self = this.set("aria-label", js.undefined)
    @scala.inline
    def setInitialState(value: State): Self = this.set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    @scala.inline
    def setMapIsoToLabel(value: /* iso */ String => String): Self = this.set("mapIsoToLabel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMapIsoToLabel: Self = this.set("mapIsoToLabel", js.undefined)
    @scala.inline
    def setOnCountryChange(value: /* event */ OnChangeParams => _): Self = this.set("onCountryChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnCountryChange: Self = this.set("onCountryChange", js.undefined)
    @scala.inline
    def setOnTextChange(value: /* event */ SyntheticEvent[HTMLInputElement, Event] => _): Self = this.set("onTextChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnTextChange: Self = this.set("onTextChange", js.undefined)
    @scala.inline
    def setOverrides(value: PhoneInputOverrides): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
    @scala.inline
    def setStateReducer(value: (/* type */ StateChange, /* nextState */ State, /* currentState */ State) => State): Self = this.set("stateReducer", js.Any.fromFunction3(value))
    @scala.inline
    def deleteStateReducer: Self = this.set("stateReducer", js.undefined)
  }
  
}

