package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.failure_
import typings.chromeApps.chromeAppsStrings.in_use_
import typings.chromeApps.chromeAppsStrings.no_such_device_
import typings.chromeApps.chromeAppsStrings.success_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FAILURE extends StObject {
  
  var FAILURE: failure_
  
  var IN_USE: in_use_
  
  var NO_SUCH_DEVICE: no_such_device_
  
  var SUCCESS: success_
}
object FAILURE {
  
  inline def apply(): FAILURE = {
    val __obj = js.Dynamic.literal(FAILURE = "failure", IN_USE = "in_use", NO_SUCH_DEVICE = "no_such_device", SUCCESS = "success")
    __obj.asInstanceOf[FAILURE]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FAILURE] (val x: Self) extends AnyVal {
    
    inline def setFAILURE(value: failure_): Self = StObject.set(x, "FAILURE", value.asInstanceOf[js.Any])
    
    inline def setIN_USE(value: in_use_): Self = StObject.set(x, "IN_USE", value.asInstanceOf[js.Any])
    
    inline def setNO_SUCH_DEVICE(value: no_such_device_): Self = StObject.set(x, "NO_SUCH_DEVICE", value.asInstanceOf[js.Any])
    
    inline def setSUCCESS(value: success_): Self = StObject.set(x, "SUCCESS", value.asInstanceOf[js.Any])
  }
}
