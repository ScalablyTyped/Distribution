package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.chrome_update_
import typings.chromeApps.chromeAppsStrings.install_
import typings.chromeApps.chromeAppsStrings.shared_module_update_
import typings.chromeApps.chromeAppsStrings.update_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CHROMEUPDATE extends StObject {
  
  var CHROME_UPDATE: chrome_update_
  
  var INSTALL: install_
  
  var SHARED_MODULE_UPDATE: shared_module_update_
  
  var UPDATE: update_
}
object CHROMEUPDATE {
  
  @scala.inline
  def apply(): CHROMEUPDATE = {
    val __obj = js.Dynamic.literal(CHROME_UPDATE = "chrome_update", INSTALL = "install", SHARED_MODULE_UPDATE = "shared_module_update", UPDATE = "update")
    __obj.asInstanceOf[CHROMEUPDATE]
  }
  
  @scala.inline
  implicit class CHROMEUPDATEMutableBuilder[Self <: CHROMEUPDATE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCHROME_UPDATE(value: chrome_update_): Self = StObject.set(x, "CHROME_UPDATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINSTALL(value: install_): Self = StObject.set(x, "INSTALL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSHARED_MODULE_UPDATE(value: shared_module_update_): Self = StObject.set(x, "SHARED_MODULE_UPDATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUPDATE(value: update_): Self = StObject.set(x, "UPDATE", value.asInstanceOf[js.Any])
  }
}
