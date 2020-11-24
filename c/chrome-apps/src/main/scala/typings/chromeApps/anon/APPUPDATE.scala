package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.app_update_
import typings.chromeApps.chromeAppsStrings.os_update_
import typings.chromeApps.chromeAppsStrings.periodic_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait APPUPDATE extends js.Object {
  
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
  implicit class APPUPDATEOps[Self <: APPUPDATE] (val x: Self) extends AnyVal {
    
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
    def setAPP_UPDATE(value: app_update_): Self = this.set("APP_UPDATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOS_UPDATE(value: os_update_): Self = this.set("OS_UPDATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPERIODIC(value: periodic_): Self = this.set("PERIODIC", value.asInstanceOf[js.Any])
  }
}
