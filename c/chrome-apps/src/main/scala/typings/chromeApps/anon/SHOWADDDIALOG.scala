package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.showAddDialog
import typings.chromeApps.chromeAppsStrings.showConfigureDialog
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SHOWADDDIALOG extends StObject {
  
  var SHOW_ADD_DIALOG: showAddDialog
  
  var SHOW_CONFIGURE_DIALOG: showConfigureDialog
}
object SHOWADDDIALOG {
  
  inline def apply(): SHOWADDDIALOG = {
    val __obj = js.Dynamic.literal(SHOW_ADD_DIALOG = "showAddDialog", SHOW_CONFIGURE_DIALOG = "showConfigureDialog")
    __obj.asInstanceOf[SHOWADDDIALOG]
  }
  
  extension [Self <: SHOWADDDIALOG](x: Self) {
    
    inline def setSHOW_ADD_DIALOG(value: showAddDialog): Self = StObject.set(x, "SHOW_ADD_DIALOG", value.asInstanceOf[js.Any])
    
    inline def setSHOW_CONFIGURE_DIALOG(value: showConfigureDialog): Self = StObject.set(x, "SHOW_CONFIGURE_DIALOG", value.asInstanceOf[js.Any])
  }
}
