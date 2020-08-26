package typings.baseui.phoneInputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PhoneInputOverrides extends js.Object {
  var CountrySelect: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var CountrySelectDropdown: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var CountrySelectDropdownDialcodeColumn: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var CountrySelectDropdownFlagColumn: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var CountrySelectDropdownListItem: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var CountrySelectDropdownNameColumn: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var DialCode: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var FlagContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  var Input: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
}

object PhoneInputOverrides {
  @scala.inline
  def apply(): PhoneInputOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneInputOverrides]
  }
  @scala.inline
  implicit class PhoneInputOverridesOps[Self <: PhoneInputOverrides] (val x: Self) extends AnyVal {
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
    def setCountrySelect(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("CountrySelect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountrySelect: Self = this.set("CountrySelect", js.undefined)
    @scala.inline
    def setCountrySelectDropdown(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("CountrySelectDropdown", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountrySelectDropdown: Self = this.set("CountrySelectDropdown", js.undefined)
    @scala.inline
    def setCountrySelectDropdownDialcodeColumn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("CountrySelectDropdownDialcodeColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountrySelectDropdownDialcodeColumn: Self = this.set("CountrySelectDropdownDialcodeColumn", js.undefined)
    @scala.inline
    def setCountrySelectDropdownFlagColumn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("CountrySelectDropdownFlagColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountrySelectDropdownFlagColumn: Self = this.set("CountrySelectDropdownFlagColumn", js.undefined)
    @scala.inline
    def setCountrySelectDropdownListItem(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("CountrySelectDropdownListItem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountrySelectDropdownListItem: Self = this.set("CountrySelectDropdownListItem", js.undefined)
    @scala.inline
    def setCountrySelectDropdownNameColumn(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("CountrySelectDropdownNameColumn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountrySelectDropdownNameColumn: Self = this.set("CountrySelectDropdownNameColumn", js.undefined)
    @scala.inline
    def setDialCode(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("DialCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDialCode: Self = this.set("DialCode", js.undefined)
    @scala.inline
    def setFlagContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("FlagContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlagContainer: Self = this.set("FlagContainer", js.undefined)
    @scala.inline
    def setInput(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("Input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("Input", js.undefined)
  }
  
}

