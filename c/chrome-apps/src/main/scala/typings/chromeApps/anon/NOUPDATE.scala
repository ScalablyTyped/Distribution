package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.no_update_
import typings.chromeApps.chromeAppsStrings.throttled_
import typings.chromeApps.chromeAppsStrings.update_available_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NOUPDATE extends StObject {
  
  var NO_UPDATE: no_update_ = js.native
  
  var THROTTLED: throttled_ = js.native
  
  var UPDATE_AVAILABLE: update_available_ = js.native
}
object NOUPDATE {
  
  @scala.inline
  def apply(NO_UPDATE: no_update_, THROTTLED: throttled_, UPDATE_AVAILABLE: update_available_): NOUPDATE = {
    val __obj = js.Dynamic.literal(NO_UPDATE = NO_UPDATE.asInstanceOf[js.Any], THROTTLED = THROTTLED.asInstanceOf[js.Any], UPDATE_AVAILABLE = UPDATE_AVAILABLE.asInstanceOf[js.Any])
    __obj.asInstanceOf[NOUPDATE]
  }
  
  @scala.inline
  implicit class NOUPDATEMutableBuilder[Self <: NOUPDATE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNO_UPDATE(value: no_update_): Self = StObject.set(x, "NO_UPDATE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTHROTTLED(value: throttled_): Self = StObject.set(x, "THROTTLED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUPDATE_AVAILABLE(value: update_available_): Self = StObject.set(x, "UPDATE_AVAILABLE", value.asInstanceOf[js.Any])
  }
}
