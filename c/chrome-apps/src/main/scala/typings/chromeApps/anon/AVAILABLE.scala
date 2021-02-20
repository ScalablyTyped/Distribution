package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.available
import typings.chromeApps.chromeAppsStrings.enabled_
import typings.chromeApps.chromeAppsStrings.unknown__
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AVAILABLE extends StObject {
  
  var AVAILABLE: available = js.native
  
  var ENABLED: enabled_ = js.native
  
  var UNKNOWN: unknown__ = js.native
}
object AVAILABLE {
  
  @scala.inline
  def apply(AVAILABLE: available, ENABLED: enabled_, UNKNOWN: unknown__): AVAILABLE = {
    val __obj = js.Dynamic.literal(AVAILABLE = AVAILABLE.asInstanceOf[js.Any], ENABLED = ENABLED.asInstanceOf[js.Any], UNKNOWN = UNKNOWN.asInstanceOf[js.Any])
    __obj.asInstanceOf[AVAILABLE]
  }
  
  @scala.inline
  implicit class AVAILABLEMutableBuilder[Self <: AVAILABLE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAVAILABLE(value: available): Self = StObject.set(x, "AVAILABLE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setENABLED(value: enabled_): Self = StObject.set(x, "ENABLED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNKNOWN(value: unknown__): Self = StObject.set(x, "UNKNOWN", value.asInstanceOf[js.Any])
  }
}
