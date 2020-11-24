package typings.cathoQuantum.hamburgerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HamburgerProps extends js.Object {
  
  var ariaLabelDescription: js.UndefOr[String] = js.native
  
  var inverted: js.UndefOr[Boolean] = js.native
  
  var isOpened: js.UndefOr[Boolean] = js.native
  
  var showNotification: js.UndefOr[Boolean] = js.native
}
object HamburgerProps {
  
  @scala.inline
  def apply(): HamburgerProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HamburgerProps]
  }
  
  @scala.inline
  implicit class HamburgerPropsOps[Self <: HamburgerProps] (val x: Self) extends AnyVal {
    
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
    def setAriaLabelDescription(value: String): Self = this.set("ariaLabelDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAriaLabelDescription: Self = this.set("ariaLabelDescription", js.undefined)
    
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInverted: Self = this.set("inverted", js.undefined)
    
    @scala.inline
    def setIsOpened(value: Boolean): Self = this.set("isOpened", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsOpened: Self = this.set("isOpened", js.undefined)
    
    @scala.inline
    def setShowNotification(value: Boolean): Self = this.set("showNotification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteShowNotification: Self = this.set("showNotification", js.undefined)
  }
}
