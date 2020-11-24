package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.authentication_required_
import typings.chromeApps.chromeAppsStrings.disabled__
import typings.chromeApps.chromeAppsStrings.initializing_
import typings.chromeApps.chromeAppsStrings.running_
import typings.chromeApps.chromeAppsStrings.temporary_unavailable_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AUTHENTICATIONREQUIRED extends js.Object {
  
  var AUTHENTICATION_REQUIRED: authentication_required_ = js.native
  
  var DISABLED: disabled__ = js.native
  
  var INITIALIZING: initializing_ = js.native
  
  var RUNNING: running_ = js.native
  
  var TEMPORARY_UNAVAILABLE: temporary_unavailable_ = js.native
}
object AUTHENTICATIONREQUIRED {
  
  @scala.inline
  def apply(
    AUTHENTICATION_REQUIRED: authentication_required_,
    DISABLED: disabled__,
    INITIALIZING: initializing_,
    RUNNING: running_,
    TEMPORARY_UNAVAILABLE: temporary_unavailable_
  ): AUTHENTICATIONREQUIRED = {
    val __obj = js.Dynamic.literal(AUTHENTICATION_REQUIRED = AUTHENTICATION_REQUIRED.asInstanceOf[js.Any], DISABLED = DISABLED.asInstanceOf[js.Any], INITIALIZING = INITIALIZING.asInstanceOf[js.Any], RUNNING = RUNNING.asInstanceOf[js.Any], TEMPORARY_UNAVAILABLE = TEMPORARY_UNAVAILABLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[AUTHENTICATIONREQUIRED]
  }
  
  @scala.inline
  implicit class AUTHENTICATIONREQUIREDOps[Self <: AUTHENTICATIONREQUIRED] (val x: Self) extends AnyVal {
    
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
    def setAUTHENTICATION_REQUIRED(value: authentication_required_): Self = this.set("AUTHENTICATION_REQUIRED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDISABLED(value: disabled__): Self = this.set("DISABLED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINITIALIZING(value: initializing_): Self = this.set("INITIALIZING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRUNNING(value: running_): Self = this.set("RUNNING", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTEMPORARY_UNAVAILABLE(value: temporary_unavailable_): Self = this.set("TEMPORARY_UNAVAILABLE", value.asInstanceOf[js.Any])
  }
}
