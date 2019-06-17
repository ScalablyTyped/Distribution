package typings
package baseuiLib.phoneDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountrySelectDropdownProps extends js.Object {
  var children: js.UndefOr[stdLib.Readonly[js.Array[reactLib.reactMod.ReactNode]]] = js.undefined
  var country: js.UndefOr[Country] = js.undefined
  var mapIsoToLabel: js.UndefOr[js.Function1[/* iso */ java.lang.String, java.lang.String]] = js.undefined
  var maxDropdownHeight: js.UndefOr[java.lang.String] = js.undefined
  var overrides: js.UndefOr[baseuiLib.Anon_CountrySelectDropdown] = js.undefined
}

object CountrySelectDropdownProps {
  @scala.inline
  def apply(
    children: stdLib.Readonly[js.Array[reactLib.reactMod.ReactNode]] = null,
    country: Country = null,
    mapIsoToLabel: /* iso */ java.lang.String => java.lang.String = null,
    maxDropdownHeight: java.lang.String = null,
    overrides: baseuiLib.Anon_CountrySelectDropdown = null
  ): CountrySelectDropdownProps = {
    val __obj = js.Dynamic.literal()
    if (children != null) __obj.updateDynamic("children")(children)
    if (country != null) __obj.updateDynamic("country")(country)
    if (mapIsoToLabel != null) __obj.updateDynamic("mapIsoToLabel")(js.Any.fromFunction1(mapIsoToLabel))
    if (maxDropdownHeight != null) __obj.updateDynamic("maxDropdownHeight")(maxDropdownHeight)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[CountrySelectDropdownProps]
  }
}

