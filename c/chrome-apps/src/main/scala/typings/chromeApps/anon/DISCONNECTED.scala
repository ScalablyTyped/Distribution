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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DISCONNECTED extends StObject {
  
  var CONNECTED: connected__
  
  var DISCONNECTED: disconnected__
  
  var ERROR: error_
  
  var LINK_CHANGED: linkChanged
  
  var LINK_DOWN: linkDown
  
  var LINK_UP: linkUp
  
  var RESUME: resume_
  
  var SUSPEND: suspend_
}
object DISCONNECTED {
  
  inline def apply(): DISCONNECTED = {
    val __obj = js.Dynamic.literal(CONNECTED = "connected", DISCONNECTED = "disconnected", ERROR = "error", LINK_CHANGED = "linkChanged", LINK_DOWN = "linkDown", LINK_UP = "linkUp", RESUME = "resume", SUSPEND = "suspend")
    __obj.asInstanceOf[DISCONNECTED]
  }
  
  extension [Self <: DISCONNECTED](x: Self) {
    
    inline def setCONNECTED(value: connected__): Self = StObject.set(x, "CONNECTED", value.asInstanceOf[js.Any])
    
    inline def setDISCONNECTED(value: disconnected__): Self = StObject.set(x, "DISCONNECTED", value.asInstanceOf[js.Any])
    
    inline def setERROR(value: error_): Self = StObject.set(x, "ERROR", value.asInstanceOf[js.Any])
    
    inline def setLINK_CHANGED(value: linkChanged): Self = StObject.set(x, "LINK_CHANGED", value.asInstanceOf[js.Any])
    
    inline def setLINK_DOWN(value: linkDown): Self = StObject.set(x, "LINK_DOWN", value.asInstanceOf[js.Any])
    
    inline def setLINK_UP(value: linkUp): Self = StObject.set(x, "LINK_UP", value.asInstanceOf[js.Any])
    
    inline def setRESUME(value: resume_): Self = StObject.set(x, "RESUME", value.asInstanceOf[js.Any])
    
    inline def setSUSPEND(value: suspend_): Self = StObject.set(x, "SUSPEND", value.asInstanceOf[js.Any])
  }
}
