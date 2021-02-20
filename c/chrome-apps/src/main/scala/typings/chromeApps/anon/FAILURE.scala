package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.failure_
import typings.chromeApps.chromeAppsStrings.in_use_
import typings.chromeApps.chromeAppsStrings.no_such_device_
import typings.chromeApps.chromeAppsStrings.success_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FAILURE extends StObject {
  
  var FAILURE: failure_ = js.native
  
  var IN_USE: in_use_ = js.native
  
  var NO_SUCH_DEVICE: no_such_device_ = js.native
  
  var SUCCESS: success_ = js.native
}
object FAILURE {
  
  @scala.inline
  def apply(FAILURE: failure_, IN_USE: in_use_, NO_SUCH_DEVICE: no_such_device_, SUCCESS: success_): FAILURE = {
    val __obj = js.Dynamic.literal(FAILURE = FAILURE.asInstanceOf[js.Any], IN_USE = IN_USE.asInstanceOf[js.Any], NO_SUCH_DEVICE = NO_SUCH_DEVICE.asInstanceOf[js.Any], SUCCESS = SUCCESS.asInstanceOf[js.Any])
    __obj.asInstanceOf[FAILURE]
  }
  
  @scala.inline
  implicit class FAILUREMutableBuilder[Self <: FAILURE] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFAILURE(value: failure_): Self = StObject.set(x, "FAILURE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIN_USE(value: in_use_): Self = StObject.set(x, "IN_USE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNO_SUCH_DEVICE(value: no_such_device_): Self = StObject.set(x, "NO_SUCH_DEVICE", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSUCCESS(value: success_): Self = StObject.set(x, "SUCCESS", value.asInstanceOf[js.Any])
  }
}
