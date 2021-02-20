package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.connected__
import typings.chromeApps.chromeAppsStrings.disconnected__
import typings.chromeApps.chromeAppsStrings.error_
import typings.chromeApps.chromeAppsStrings.linkChanged
import typings.chromeApps.chromeAppsStrings.linkDown
import typings.chromeApps.chromeAppsStrings.linkUp
import typings.chromeApps.chromeAppsStrings.resume_
import typings.chromeApps.chromeAppsStrings.suspend_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DISCONNECTED extends StObject {
  
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
  implicit class DISCONNECTEDMutableBuilder[Self <: DISCONNECTED] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCONNECTED(value: connected__): Self = StObject.set(x, "CONNECTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDISCONNECTED(value: disconnected__): Self = StObject.set(x, "DISCONNECTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setERROR(value: error_): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLINK_CHANGED(value: linkChanged): Self = StObject.set(x, "LINK_CHANGED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLINK_DOWN(value: linkDown): Self = StObject.set(x, "LINK_DOWN", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLINK_UP(value: linkUp): Self = StObject.set(x, "LINK_UP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRESUME(value: resume_): Self = StObject.set(x, "RESUME", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSUSPEND(value: suspend_): Self = StObject.set(x, "SUSPEND", value.asInstanceOf[js.Any])
  }
}
