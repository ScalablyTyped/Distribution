package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.showAddDialog
import typings.chromeApps.chromeAppsStrings.showConfigureDialog
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SHOWADDDIALOG extends js.Object {
  
  var SHOW_ADD_DIALOG: showAddDialog = js.native
  
  var SHOW_CONFIGURE_DIALOG: showConfigureDialog = js.native
}
object SHOWADDDIALOG {
  
  @scala.inline
  def apply(SHOW_ADD_DIALOG: showAddDialog, SHOW_CONFIGURE_DIALOG: showConfigureDialog): SHOWADDDIALOG = {
    val __obj = js.Dynamic.literal(SHOW_ADD_DIALOG = SHOW_ADD_DIALOG.asInstanceOf[js.Any], SHOW_CONFIGURE_DIALOG = SHOW_CONFIGURE_DIALOG.asInstanceOf[js.Any])
    __obj.asInstanceOf[SHOWADDDIALOG]
  }
  
  @scala.inline
  implicit class SHOWADDDIALOGOps[Self <: SHOWADDDIALOG] (val x: Self) extends AnyVal {
    
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
    def setSHOW_ADD_DIALOG(value: showAddDialog): Self = this.set("SHOW_ADD_DIALOG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHOW_CONFIGURE_DIALOG(value: showConfigureDialog): Self = this.set("SHOW_CONFIGURE_DIALOG", value.asInstanceOf[js.Any])
  }
}
