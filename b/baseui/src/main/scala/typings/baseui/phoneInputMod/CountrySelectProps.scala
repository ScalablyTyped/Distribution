package typings.baseui.phoneInputMod

import org.scalablytyped.runtime.StringDictionary
import typings.baseui.baseuiStrings.compact
import typings.baseui.baseuiStrings.default_
import typings.baseui.baseuiStrings.large_
import typings.baseui.baseuiStrings.mini
import typings.baseui.selectMod.OnChangeParams
import typings.react.mod.Ref
import typings.std.HTMLInputElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountrySelectProps extends js.Object {
  var countries: StringDictionary[Country]
  var country: js.UndefOr[Country] = js.undefined
  var inputRef: js.UndefOr[Ref[HTMLInputElement]] = js.undefined
  var mapIsoToLabel: js.UndefOr[js.Function1[/* iso */ String, String]] = js.undefined
  var maxDropdownHeight: js.UndefOr[String] = js.undefined
  var maxDropdownWidth: js.UndefOr[String] = js.undefined
  var onCountryChange: js.UndefOr[js.Function1[/* event */ OnChangeParams, _]] = js.undefined
  var overrides: js.UndefOr[typings.baseui.anon.CountrySelect] = js.undefined
  var size: js.UndefOr[mini | default_ | compact | large_] = js.undefined
}

object CountrySelectProps {
  @scala.inline
  def apply(
    countries: StringDictionary[Country],
    country: Country = null,
    inputRef: js.UndefOr[Null | Ref[HTMLInputElement]] = js.undefined,
    mapIsoToLabel: /* iso */ String => String = null,
    maxDropdownHeight: String = null,
    maxDropdownWidth: String = null,
    onCountryChange: /* event */ OnChangeParams => _ = null,
    overrides: typings.baseui.anon.CountrySelect = null,
    size: mini | default_ | compact | large_ = null
  ): CountrySelectProps = {
    val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (!js.isUndefined(inputRef)) __obj.updateDynamic("inputRef")(inputRef.asInstanceOf[js.Any])
    if (mapIsoToLabel != null) __obj.updateDynamic("mapIsoToLabel")(js.Any.fromFunction1(mapIsoToLabel))
    if (maxDropdownHeight != null) __obj.updateDynamic("maxDropdownHeight")(maxDropdownHeight.asInstanceOf[js.Any])
    if (maxDropdownWidth != null) __obj.updateDynamic("maxDropdownWidth")(maxDropdownWidth.asInstanceOf[js.Any])
    if (onCountryChange != null) __obj.updateDynamic("onCountryChange")(js.Any.fromFunction1(onCountryChange))
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountrySelectProps]
  }
}

