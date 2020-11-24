package typings.baseui.selectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropdownOverrides extends js.Object {
  
  var Dropdown: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var DropdownContainer: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var DropdownListItem: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var DropdownOption: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var OptionContent: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var StatefulMenu: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
}
object DropdownOverrides {
  
  @scala.inline
  def apply(): DropdownOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropdownOverrides]
  }
  
  @scala.inline
  implicit class DropdownOverridesOps[Self <: DropdownOverrides] (val x: Self) extends AnyVal {
    
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
    def setDropdown(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("Dropdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdown: Self = this.set("Dropdown", js.undefined)
    
    @scala.inline
    def setDropdownContainer(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("DropdownContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdownContainer: Self = this.set("DropdownContainer", js.undefined)
    
    @scala.inline
    def setDropdownListItem(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("DropdownListItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdownListItem: Self = this.set("DropdownListItem", js.undefined)
    
    @scala.inline
    def setDropdownOption(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("DropdownOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDropdownOption: Self = this.set("DropdownOption", js.undefined)
    
    @scala.inline
    def setOptionContent(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("OptionContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptionContent: Self = this.set("OptionContent", js.undefined)
    
    @scala.inline
    def setStatefulMenu(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("StatefulMenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatefulMenu: Self = this.set("StatefulMenu", js.undefined)
  }
}
