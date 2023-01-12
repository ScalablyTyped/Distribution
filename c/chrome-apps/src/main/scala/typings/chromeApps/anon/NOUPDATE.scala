package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.no_update_
import typings.chromeApps.chromeAppsStrings.throttled_
import typings.chromeApps.chromeAppsStrings.update_available_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NOUPDATE extends StObject {
  
  var NO_UPDATE: no_update_
  
  var THROTTLED: throttled_
  
  var UPDATE_AVAILABLE: update_available_
}
object NOUPDATE {
  
  inline def apply(): NOUPDATE = {
    val __obj = js.Dynamic.literal(NO_UPDATE = "no_update", THROTTLED = "throttled", UPDATE_AVAILABLE = "update_available")
    __obj.asInstanceOf[NOUPDATE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NOUPDATE] (val x: Self) extends AnyVal {
    
    inline def setNO_UPDATE(value: no_update_): Self = StObject.set(x, "NO_UPDATE", value.asInstanceOf[js.Any])
    
    inline def setTHROTTLED(value: throttled_): Self = StObject.set(x, "THROTTLED", value.asInstanceOf[js.Any])
    
    inline def setUPDATE_AVAILABLE(value: update_available_): Self = StObject.set(x, "UPDATE_AVAILABLE", value.asInstanceOf[js.Any])
  }
}
