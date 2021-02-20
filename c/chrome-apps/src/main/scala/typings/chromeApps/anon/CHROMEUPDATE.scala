package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.chrome_update_
import typings.chromeApps.chromeAppsStrings.install_
import typings.chromeApps.chromeAppsStrings.shared_module_update_
import typings.chromeApps.chromeAppsStrings.update_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CHROMEUPDATE extends StObject {
  
  var CHROME_UPDATE: chrome_update_ = js.native
  
  var INSTALL: install_ = js.native
  
  var SHARED_MODULE_UPDATE: shared_module_update_ = js.native
  
  var UPDATE: update_ = js.native
}
object CHROMEUPDATE {
  
  @scala.inline
  def apply(
    CHROME_UPDATE: chrome_update_,
    INSTALL: install_,
    SHARED_MODULE_UPDATE: shared_module_update_,
    UPDATE: update_
  ): CHROMEUPDATE = {
    val __obj = js.Dynamic.literal(CHROME_UPDATE = CHROME_UPDATE.asInstanceOf[js.Any], INSTALL = INSTALL.asInstanceOf[js.Any], SHARED_MODULE_UPDATE = SHARED_MODULE_UPDATE.asInstanceOf[js.Any], UPDATE = UPDATE.asInstanceOf[js.Any])
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
