package typings.baseui.phoneInputMod

import typings.baseui.inputMod.InputProps
import typings.baseui.selectMod.OnChangeParams
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneInputProps extends InputProps {
  var country: js.UndefOr[Country] = js.native
  var mapIsoToLabel: js.UndefOr[js.Function1[/* iso */ String, String]] = js.native
  var maxDropdownHeight: js.UndefOr[String] = js.native
  var maxDropdownWidth: js.UndefOr[String] = js.native
  var onCountryChange: js.UndefOr[js.Function1[/* event */ OnChangeParams, _]] = js.native
  var onTextChange: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLInputElement, Event], _]] = js.native
  @JSName("overrides")
  var overrides_PhoneInputProps: js.UndefOr[PhoneInputOverrides] = js.native
  var text: js.UndefOr[String] = js.native
}

object PhoneInputProps {
  @scala.inline
  def apply(): PhoneInputProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneInputProps]
  }
  @scala.inline
  implicit class PhoneInputPropsOps[Self <: PhoneInputProps] (val x: Self) extends AnyVal {
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
    def setCountry(value: Country): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountry: Self = this.set("country", js.undefined)
    @scala.inline
    def setMapIsoToLabel(value: /* iso */ String => String): Self = this.set("mapIsoToLabel", js.Any.fromFunction1(value))
    @scala.inline
    def deleteMapIsoToLabel: Self = this.set("mapIsoToLabel", js.undefined)
    @scala.inline
    def setMaxDropdownHeight(value: String): Self = this.set("maxDropdownHeight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDropdownHeight: Self = this.set("maxDropdownHeight", js.undefined)
    @scala.inline
    def setMaxDropdownWidth(value: String): Self = this.set("maxDropdownWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxDropdownWidth: Self = this.set("maxDropdownWidth", js.undefined)
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
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

