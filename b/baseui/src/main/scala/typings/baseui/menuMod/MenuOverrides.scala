package typings.baseui.menuMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MenuOverrides extends js.Object {
  
  var EmptyState: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var List: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var ListItem: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var OptgroupHeader: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var Option: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
}
object MenuOverrides {
  
  @scala.inline
  def apply(): MenuOverrides = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MenuOverrides]
  }
  
  @scala.inline
  implicit class MenuOverridesOps[Self <: MenuOverrides] (val x: Self) extends AnyVal {
    
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
    def setEmptyState(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("EmptyState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmptyState: Self = this.set("EmptyState", js.undefined)
    
    @scala.inline
    def setList(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("List", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteList: Self = this.set("List", js.undefined)
    
    @scala.inline
    def setListItem(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("ListItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListItem: Self = this.set("ListItem", js.undefined)
    
    @scala.inline
    def setOptgroupHeader(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("OptgroupHeader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOptgroupHeader: Self = this.set("OptgroupHeader", js.undefined)
    
    @scala.inline
    def setOption(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("Option", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOption: Self = this.set("Option", js.undefined)
  }
}
