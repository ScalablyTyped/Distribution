package typings.baseui.phoneInputMod

import typings.baseui.AnonCountrySelectDropdown
import typings.baseui.ReadonlyArrayReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountrySelectDropdownProps extends js.Object {
  var children: js.UndefOr[ReadonlyArrayReactNode] = js.undefined
  var country: js.UndefOr[Country] = js.undefined
  var mapIsoToLabel: js.UndefOr[js.Function1[/* iso */ String, String]] = js.undefined
  var maxDropdownHeight: js.UndefOr[String] = js.undefined
  var overrides: js.UndefOr[AnonCountrySelectDropdown] = js.undefined
}

object CountrySelectDropdownProps {
  @scala.inline
  def apply(
    children: ReadonlyArrayReactNode = null,
    country: Country = null,
    mapIsoToLabel: /* iso */ String => String = null,
    maxDropdownHeight: String = null,
    overrides: AnonCountrySelectDropdown = null
  ): CountrySelectDropdownProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (mapIsoToLabel != null) __obj.updateDynamic("mapIsoToLabel")(js.Any.fromFunction1(mapIsoToLabel))
    if (maxDropdownHeight != null) __obj.updateDynamic("maxDropdownHeight")(maxDropdownHeight.asInstanceOf[js.Any])
    if (overrides != null) __obj.updateDynamic("overrides")(overrides.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountrySelectDropdownProps]
  }
}

