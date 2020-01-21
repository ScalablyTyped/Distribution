package typings.baseui.phoneInputMod

import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.selectMod.OnChangeParams
import typings.react.mod.SyntheticEvent
import typings.std.Event_
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneInputProps extends js.Object {
  var `aria-label`: js.UndefOr[String] = js.undefined
  var country: js.UndefOr[Country] = js.undefined
  var mapIsoToLabel: js.UndefOr[js.Function1[/* iso */ String, String]] = js.undefined
  var maxDropdownHeight: js.UndefOr[String] = js.undefined
  var maxDropdownWidth: js.UndefOr[String] = js.undefined
  var onCountryChange: js.UndefOr[js.Function1[/* event */ OnChangeParams, _]] = js.undefined
  var onTextChange: js.UndefOr[js.Function1[/* event */ SyntheticEvent[HTMLInputElement, Event_], _]] = js.undefined
  var overrides: js.UndefOr[PhoneInputOverrides] = js.undefined
  var size: js.UndefOr[default_ | compact | large_] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object PhoneInputProps {
  @scala.inline
  def apply(
    `aria-label`: String = null,
    country: Country = null,
    mapIsoToLabel: /* iso */ String => String = null,
    maxDropdownHeight: String = null,
    maxDropdownWidth: String = null,
    onCountryChange: /* event */ OnChangeParams => _ = null,
    onTextChange: /* event */ SyntheticEvent[HTMLInputElement, Event_] => _ = null,
    overrides: PhoneInputOverrides = null,
    size: default_ | compact | large_ = null,
    text: String = null
  ): PhoneInputProps = {
    val __obj = js.Dynamic.literal()
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (mapIsoToLabel != null) __obj.updateDynamic("mapIsoToLabel")(js.Any.fromFunction1(mapIsoToLabel))
    if (maxDropdownHeight != null) __obj.updateDynamic("maxDropdownHeight")(maxDropdownHeight.asInstanceOf[js.Any])
    if (maxDropdownWidth != null) __obj.updateDynamic("maxDropdownWidth")(maxDropdownWidth.asInstanceOf[js.Any])
    if (onCountryChange != null) __obj.updateDynamic("onCountryChange")(js.Any.fromFunction1(onCountryChange))
    if (onTextChange != null) __obj.updateDynamic("onTextChange")(js.Any.fromFunction1(onTextChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneInputProps]
  }
}

