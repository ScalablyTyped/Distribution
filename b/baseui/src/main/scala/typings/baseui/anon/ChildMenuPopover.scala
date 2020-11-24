package typings.baseui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChildMenuPopover extends js.Object {
  
  var ChildMenuPopover: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
  
  var ListItem: js.UndefOr[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
  ] = js.native
}
object ChildMenuPopover {
  
  @scala.inline
  def apply(): ChildMenuPopover = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChildMenuPopover]
  }
  
  @scala.inline
  implicit class ChildMenuPopoverOps[Self <: ChildMenuPopover] (val x: Self) extends AnyVal {
    
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
    def setChildMenuPopover(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("ChildMenuPopover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildMenuPopover: Self = this.set("ChildMenuPopover", js.undefined)
    
    @scala.inline
    def setListItem(
      value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
    ): Self = this.set("ListItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListItem: Self = this.set("ListItem", js.undefined)
  }
}
