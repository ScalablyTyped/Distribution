package typings
package baseuiLib.phoneDashInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhoneInputOverrides extends js.Object {
  var CountrySelect: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var CountrySelectDropdown: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var CountrySelectDropdownDialcodeColumn: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var CountrySelectDropdownFlagColumn: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var CountrySelectDropdownListItem: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var CountrySelectDropdownNameColumn: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var DialCode: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var Input: js.UndefOr[baseuiLib.Override[_]] = js.undefined
}

object PhoneInputOverrides {
  @scala.inline
  def apply(
    CountrySelect: baseuiLib.Override[_] = null,
    CountrySelectDropdown: baseuiLib.Override[_] = null,
    CountrySelectDropdownDialcodeColumn: baseuiLib.Override[_] = null,
    CountrySelectDropdownFlagColumn: baseuiLib.Override[_] = null,
    CountrySelectDropdownListItem: baseuiLib.Override[_] = null,
    CountrySelectDropdownNameColumn: baseuiLib.Override[_] = null,
    DialCode: baseuiLib.Override[_] = null,
    Input: baseuiLib.Override[_] = null
  ): PhoneInputOverrides = {
    val __obj = js.Dynamic.literal()
    if (CountrySelect != null) __obj.updateDynamic("CountrySelect")(CountrySelect.asInstanceOf[js.Any])
    if (CountrySelectDropdown != null) __obj.updateDynamic("CountrySelectDropdown")(CountrySelectDropdown.asInstanceOf[js.Any])
    if (CountrySelectDropdownDialcodeColumn != null) __obj.updateDynamic("CountrySelectDropdownDialcodeColumn")(CountrySelectDropdownDialcodeColumn.asInstanceOf[js.Any])
    if (CountrySelectDropdownFlagColumn != null) __obj.updateDynamic("CountrySelectDropdownFlagColumn")(CountrySelectDropdownFlagColumn.asInstanceOf[js.Any])
    if (CountrySelectDropdownListItem != null) __obj.updateDynamic("CountrySelectDropdownListItem")(CountrySelectDropdownListItem.asInstanceOf[js.Any])
    if (CountrySelectDropdownNameColumn != null) __obj.updateDynamic("CountrySelectDropdownNameColumn")(CountrySelectDropdownNameColumn.asInstanceOf[js.Any])
    if (DialCode != null) __obj.updateDynamic("DialCode")(DialCode.asInstanceOf[js.Any])
    if (Input != null) __obj.updateDynamic("Input")(Input.asInstanceOf[js.Any])
    __obj.asInstanceOf[PhoneInputOverrides]
  }
}

