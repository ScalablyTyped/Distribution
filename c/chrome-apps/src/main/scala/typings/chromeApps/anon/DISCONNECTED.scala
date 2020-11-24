package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.connected__
import typings.chromeApps.chromeAppsStrings.disconnected__
import typings.chromeApps.chromeAppsStrings.error_
import typings.chromeApps.chromeAppsStrings.linkChanged
import typings.chromeApps.chromeAppsStrings.linkDown
import typings.chromeApps.chromeAppsStrings.linkUp
import typings.chromeApps.chromeAppsStrings.resume_
import typings.chromeApps.chromeAppsStrings.suspend_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DISCONNECTED extends js.Object {
  
  var CONNECTED: connected__ = js.native
  
  var DISCONNECTED: disconnected__ = js.native
  
  var ERROR: error_ = js.native
  
  var LINK_CHANGED: linkChanged = js.native
  
  var LINK_DOWN: linkDown = js.native
  
  var LINK_UP: linkUp = js.native
  
  var RESUME: resume_ = js.native
  
  var SUSPEND: suspend_ = js.native
}
object DISCONNECTED {
  
  @scala.inline
  def apply(
    CONNECTED: connected__,
    DISCONNECTED: disconnected__,
    ERROR: error_,
    LINK_CHANGED: linkChanged,
    LINK_DOWN: linkDown,
    LINK_UP: linkUp,
    RESUME: resume_,
    SUSPEND: suspend_
  ): DISCONNECTED = {
    val __obj = js.Dynamic.literal(CONNECTED = CONNECTED.asInstanceOf[js.Any], DISCONNECTED = DISCONNECTED.asInstanceOf[js.Any], ERROR = ERROR.asInstanceOf[js.Any], LINK_CHANGED = LINK_CHANGED.asInstanceOf[js.Any], LINK_DOWN = LINK_DOWN.asInstanceOf[js.Any], LINK_UP = LINK_UP.asInstanceOf[js.Any], RESUME = RESUME.asInstanceOf[js.Any], SUSPEND = SUSPEND.asInstanceOf[js.Any])
    __obj.asInstanceOf[DISCONNECTED]
  }
  
  @scala.inline
  implicit class DISCONNECTEDOps[Self <: DISCONNECTED] (val x: Self) extends AnyVal {
    
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
    def setCONNECTED(value: connected__): Self = this.set("CONNECTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDISCONNECTED(value: disconnected__): Self = this.set("DISCONNECTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERROR(value: error_): Self = this.set("ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLINK_CHANGED(value: linkChanged): Self = this.set("LINK_CHANGED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLINK_DOWN(value: linkDown): Self = this.set("LINK_DOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLINK_UP(value: linkUp): Self = this.set("LINK_UP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRESUME(value: resume_): Self = this.set("RESUME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSUSPEND(value: suspend_): Self = this.set("SUSPEND", value.asInstanceOf[js.Any])
  }
}
