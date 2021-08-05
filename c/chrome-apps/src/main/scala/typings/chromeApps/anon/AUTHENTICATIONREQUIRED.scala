package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.authentication_required_
import typings.chromeApps.chromeAppsStrings.disabled__
import typings.chromeApps.chromeAppsStrings.initializing_
import typings.chromeApps.chromeAppsStrings.running_
import typings.chromeApps.chromeAppsStrings.temporary_unavailable_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AUTHENTICATIONREQUIRED extends StObject {
  
  var AUTHENTICATION_REQUIRED: authentication_required_
  
  var DISABLED: disabled__
  
  var INITIALIZING: initializing_
  
  var RUNNING: running_
  
  var TEMPORARY_UNAVAILABLE: temporary_unavailable_
}
object AUTHENTICATIONREQUIRED {
  
  inline def apply(): AUTHENTICATIONREQUIRED = {
    val __obj = js.Dynamic.literal(AUTHENTICATION_REQUIRED = "authentication_required", DISABLED = "disabled", INITIALIZING = "initializing", RUNNING = "running", TEMPORARY_UNAVAILABLE = "temporary_unavailable")
    __obj.asInstanceOf[AUTHENTICATIONREQUIRED]
  }
  
  extension [Self <: AUTHENTICATIONREQUIRED](x: Self) {
    
    inline def setAUTHENTICATION_REQUIRED(value: authentication_required_): Self = StObject.set(x, "AUTHENTICATION_REQUIRED", value.asInstanceOf[js.Any])
    
    inline def setDISABLED(value: disabled__): Self = StObject.set(x, "DISABLED", value.asInstanceOf[js.Any])
    
    inline def setINITIALIZING(value: initializing_): Self = StObject.set(x, "INITIALIZING", value.asInstanceOf[js.Any])
    
    inline def setRUNNING(value: running_): Self = StObject.set(x, "RUNNING", value.asInstanceOf[js.Any])
    
    inline def setTEMPORARY_UNAVAILABLE(value: temporary_unavailable_): Self = StObject.set(x, "TEMPORARY_UNAVAILABLE", value.asInstanceOf[js.Any])
  }
}
