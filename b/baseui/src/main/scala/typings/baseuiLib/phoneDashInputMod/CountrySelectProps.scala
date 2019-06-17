package typings
package baseuiLib.phoneDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountrySelectProps extends js.Object {
  var country: js.UndefOr[Country] = js.undefined
  var inputRef: js.UndefOr[reactLib.reactMod.Ref[stdLib.HTMLInputElement]] = js.undefined
  var mapIsoToLabel: js.UndefOr[js.Function1[/* iso */ java.lang.String, java.lang.String]] = js.undefined
  var maxDropdownHeight: js.UndefOr[java.lang.String] = js.undefined
  var maxDropdownWidth: js.UndefOr[java.lang.String] = js.undefined
  var onCountryChange: js.UndefOr[js.Function1[/* event */ baseuiLib.selectMod.OnChangeParams, _]] = js.undefined
  var overrides: js.UndefOr[baseuiLib.Anon_CountrySelect] = js.undefined
  var size: js.UndefOr[
    baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.compact | baseuiLib.baseuiLibStrings.large
  ] = js.undefined
}

object CountrySelectProps {
  @scala.inline
  def apply(
    country: Country = null,
    inputRef: reactLib.reactMod.Ref[stdLib.HTMLInputElement] = null,
    mapIsoToLabel: /* iso */ java.lang.String => java.lang.String = null,
    maxDropdownHeight: java.lang.String = null,
    maxDropdownWidth: java.lang.String = null,
    onCountryChange: /* event */ baseuiLib.selectMod.OnChangeParams => _ = null,
    overrides: baseuiLib.Anon_CountrySelect = null,
    size: baseuiLib.baseuiLibStrings.default | baseuiLib.baseuiLibStrings.compact | baseuiLib.baseuiLibStrings.large = null
  ): CountrySelectProps = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country)
    if (inputRef != null) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (mapIsoToLabel != null) __obj.updateDynamic("mapIsoToLabel")(js.Any.fromFunction1(mapIsoToLabel))
    if (maxDropdownHeight != null) __obj.updateDynamic("maxDropdownHeight")(maxDropdownHeight)
    if (maxDropdownWidth != null) __obj.updateDynamic("maxDropdownWidth")(maxDropdownWidth)
    if (onCountryChange != null) __obj.updateDynamic("onCountryChange")(js.Any.fromFunction1(onCountryChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountrySelectProps]
  }
}

