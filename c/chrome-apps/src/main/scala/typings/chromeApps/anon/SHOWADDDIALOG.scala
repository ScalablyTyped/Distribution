package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.showAddDialog
import typings.chromeApps.chromeAppsStrings.showConfigureDialog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SHOWADDDIALOG extends StObject {
  
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
  implicit class SHOWADDDIALOGMutableBuilder[Self <: SHOWADDDIALOG] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSHOW_ADD_DIALOG(value: showAddDialog): Self = StObject.set(x, "SHOW_ADD_DIALOG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHOW_CONFIGURE_DIALOG(value: showConfigureDialog): Self = StObject.set(x, "SHOW_CONFIGURE_DIALOG", value.asInstanceOf[js.Any])
  }
}
