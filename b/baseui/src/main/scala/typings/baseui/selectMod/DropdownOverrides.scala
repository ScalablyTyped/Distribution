package typings.baseui.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DropdownOverrides extends js.Object {
  var Dropdown: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var DropdownContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var DropdownListItem: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var DropdownOption: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var OptionContent: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
  var StatefulMenu: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.undefined
}

object DropdownOverrides {
  @scala.inline
  def apply(
    Dropdown: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    DropdownContainer: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    DropdownListItem: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    DropdownOption: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    OptionContent: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null,
    StatefulMenu: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any = null
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

