package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CountrySelectDropdown extends js.Object {
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
  var FlagContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
}

object CountrySelectDropdown {
  @scala.inline
  def apply(): CountrySelectDropdown = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CountrySelectDropdown]
  }
  @scala.inline
  implicit class CountrySelectDropdownOps[Self <: CountrySelectDropdown] (val x: Self) extends AnyVal {
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
    def setFlagContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("FlagContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlagContainer: Self = this.set("FlagContainer", js.undefined)
  }
  
}

