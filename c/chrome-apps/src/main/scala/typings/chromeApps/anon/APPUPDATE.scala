package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.app_update_
import typings.chromeApps.chromeAppsStrings.os_update_
import typings.chromeApps.chromeAppsStrings.periodic_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APPUPDATE extends StObject {
  
  var APP_UPDATE: app_update_ = js.native
  
  var OS_UPDATE: os_update_ = js.native
  
  var PERIODIC: periodic_ = js.native
}
object APPUPDATE {
  
  @scala.inline
  def apply(APP_UPDATE: app_update_, OS_UPDATE: os_update_, PERIODIC: periodic_): APPUPDATE = {
    val __obj = js.Dynamic.literal(APP_UPDATE = APP_UPDATE.asInstanceOf[js.Any], OS_UPDATE = OS_UPDATE.asInstanceOf[js.Any], PERIODIC = PERIODIC.asInstanceOf[js.Any])
    __obj.asInstanceOf[APPUPDATE]
  }
  
  @scala.inline
  implicit class APPUPDATEMutableBuilder[Self <: APPUPDATE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAPP_UPDATE(value: app_update_): Self = StObject.set(x, "APP_UPDATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOS_UPDATE(value: os_update_): Self = StObject.set(x, "OS_UPDATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPERIODIC(value: periodic_): Self = StObject.set(x, "PERIODIC", value.asInstanceOf[js.Any])
  }
}
