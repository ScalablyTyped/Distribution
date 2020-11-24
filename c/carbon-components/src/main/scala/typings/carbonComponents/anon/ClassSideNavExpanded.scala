package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassSideNavExpanded extends js.Object {
  
  var classSideNavExpanded: String = js.native
  
  var classSideNavItemActive: String = js.native
  
  var classSideNavLinkCurrent: String = js.native
  
  var selectorInit: String = js.native
  
  var selectorSideNavItem: String = js.native
  
  var selectorSideNavLink: String = js.native
  
  var selectorSideNavLinkCurrent: String = js.native
  
  var selectorSideNavSubmenu: String = js.native
  
  var selectorSideNavToggle: String = js.native
}
object ClassSideNavExpanded {
  
  @scala.inline
  def apply(
    classSideNavExpanded: String,
    classSideNavItemActive: String,
    classSideNavLinkCurrent: String,
    selectorInit: String,
    selectorSideNavItem: String,
    selectorSideNavLink: String,
    selectorSideNavLinkCurrent: String,
    selectorSideNavSubmenu: String,
    selectorSideNavToggle: String
  ): ClassSideNavExpanded = {
    val __obj = js.Dynamic.literal(classSideNavExpanded = classSideNavExpanded.asInstanceOf[js.Any], classSideNavItemActive = classSideNavItemActive.asInstanceOf[js.Any], classSideNavLinkCurrent = classSideNavLinkCurrent.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], selectorSideNavItem = selectorSideNavItem.asInstanceOf[js.Any], selectorSideNavLink = selectorSideNavLink.asInstanceOf[js.Any], selectorSideNavLinkCurrent = selectorSideNavLinkCurrent.asInstanceOf[js.Any], selectorSideNavSubmenu = selectorSideNavSubmenu.asInstanceOf[js.Any], selectorSideNavToggle = selectorSideNavToggle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassSideNavExpanded]
  }
  
  @scala.inline
  implicit class ClassSideNavExpandedOps[Self <: ClassSideNavExpanded] (val x: Self) extends AnyVal {
    
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
    def setClassSideNavExpanded(value: String): Self = this.set("classSideNavExpanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassSideNavItemActive(value: String): Self = this.set("classSideNavItemActive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassSideNavLinkCurrent(value: String): Self = this.set("classSideNavLinkCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorSideNavItem(value: String): Self = this.set("selectorSideNavItem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorSideNavLink(value: String): Self = this.set("selectorSideNavLink", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorSideNavLinkCurrent(value: String): Self = this.set("selectorSideNavLinkCurrent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorSideNavSubmenu(value: String): Self = this.set("selectorSideNavSubmenu", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorSideNavToggle(value: String): Self = this.set("selectorSideNavToggle", value.asInstanceOf[js.Any])
  }
}
