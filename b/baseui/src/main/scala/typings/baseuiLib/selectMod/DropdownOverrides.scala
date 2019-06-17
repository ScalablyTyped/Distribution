package typings
package baseuiLib.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownOverrides extends js.Object {
  var Dropdown: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var DropdownContainer: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var DropdownListItem: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var DropdownOption: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var OptionContent: js.UndefOr[baseuiLib.Override[_]] = js.undefined
  var StatefulMenu: js.UndefOr[baseuiLib.Override[_]] = js.undefined
}

object DropdownOverrides {
  @scala.inline
  def apply(
    Dropdown: baseuiLib.Override[_] = null,
    DropdownContainer: baseuiLib.Override[_] = null,
    DropdownListItem: baseuiLib.Override[_] = null,
    DropdownOption: baseuiLib.Override[_] = null,
    OptionContent: baseuiLib.Override[_] = null,
    StatefulMenu: baseuiLib.Override[_] = null
  ): DropdownOverrides = {
    val __obj = js.Dynamic.literal()
    if (Dropdown != null) __obj.updateDynamic("Dropdown")(Dropdown.asInstanceOf[js.Any])
    if (DropdownContainer != null) __obj.updateDynamic("DropdownContainer")(DropdownContainer.asInstanceOf[js.Any])
    if (DropdownListItem != null) __obj.updateDynamic("DropdownListItem")(DropdownListItem.asInstanceOf[js.Any])
    if (DropdownOption != null) __obj.updateDynamic("DropdownOption")(DropdownOption.asInstanceOf[js.Any])
    if (OptionContent != null) __obj.updateDynamic("OptionContent")(OptionContent.asInstanceOf[js.Any])
    if (StatefulMenu != null) __obj.updateDynamic("StatefulMenu")(StatefulMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[DropdownOverrides]
  }
}

