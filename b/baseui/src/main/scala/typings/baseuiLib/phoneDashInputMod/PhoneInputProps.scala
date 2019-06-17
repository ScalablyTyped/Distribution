package typings
package baseuiLib.phoneDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneInputProps extends js.Object {
  var `aria-label`: js.UndefOr[java.lang.String] = js.undefined
  var country: js.UndefOr[Country] = js.undefined
  var mapIsoToLabel: js.UndefOr[js.Function1[/* iso */ java.lang.String, java.lang.String]] = js.undefined
  var maxDropdownHeight: js.UndefOr[java.lang.String] = js.undefined
  var maxDropdownWidth: js.UndefOr[java.lang.String] = js.undefined
  var onCountryChange: js.UndefOr[js.Function1[/* event */ baseuiLib.selectMod.OnChangeParams, _]] = js.undefined
  var onTextChange: js.UndefOr[
    js.Function1[
      /* event */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event], 
      _
    ]
  ] = js.undefined
  var overrides: js.UndefOr[PhoneInputOverrides] = js.undefined
  var size: js.UndefOr[
    baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.compact | baseuiLib.baseuiLibStrings.large
  ] = js.undefined
  var text: js.UndefOr[java.lang.String] = js.undefined
}

object PhoneInputProps {
  @scala.inline
  def apply(
    `aria-label`: java.lang.String = null,
    country: Country = null,
    mapIsoToLabel: /* iso */ java.lang.String => java.lang.String = null,
    maxDropdownHeight: java.lang.String = null,
    maxDropdownWidth: java.lang.String = null,
    onCountryChange: /* event */ baseuiLib.selectMod.OnChangeParams => _ = null,
    onTextChange: /* event */ reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event] => _ = null,
    overrides: PhoneInputOverrides = null,
    size: baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.compact | baseuiLib.baseuiLibStrings.large = null,
    text: java.lang.String = null
  ): PhoneInputProps = {
    val __obj = js.Dynamic.literal()
    if (`aria-label` != null) __obj.updateDynamic("aria-label")(`aria-label`)
    if (country != null) __obj.updateDynamic("country")(country)
    if (mapIsoToLabel != null) __obj.updateDynamic("mapIsoToLabel")(js.Any.fromFunction1(mapIsoToLabel))
    if (maxDropdownHeight != null) __obj.updateDynamic("maxDropdownHeight")(maxDropdownHeight)
    if (maxDropdownWidth != null) __obj.updateDynamic("maxDropdownWidth")(maxDropdownWidth)
    if (onCountryChange != null) __obj.updateDynamic("onCountryChange")(js.Any.fromFunction1(onCountryChange))
    if (onTextChange != null) __obj.updateDynamic("onTextChange")(js.Any.fromFunction1(onTextChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text)
    __obj.asInstanceOf[PhoneInputProps]
  }
}

