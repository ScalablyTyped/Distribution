package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.failed_
import typings.chromeApps.chromeAppsStrings.rejected_
import typings.chromeApps.chromeAppsStrings.succeeded_
import typings.chromeApps.chromeAppsStrings.unhandled_
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FAILED extends StObject {
  
  var FAILED: failed_ = js.native
  
  var REJECTED: rejected_ = js.native
  
  var SUCCEEDED: succeeded_ = js.native
  
  var UNHANDLED: unhandled_ = js.native
}
object FAILED {
  
  @scala.inline
  def apply(FAILED: failed_, REJECTED: rejected_, SUCCEEDED: succeeded_, UNHANDLED: unhandled_): FAILED = {
    val __obj = js.Dynamic.literal(FAILED = FAILED.asInstanceOf[js.Any], REJECTED = REJECTED.asInstanceOf[js.Any], SUCCEEDED = SUCCEEDED.asInstanceOf[js.Any], UNHANDLED = UNHANDLED.asInstanceOf[js.Any])
    __obj.asInstanceOf[FAILED]
  }
  
  @scala.inline
  implicit class FAILEDMutableBuilder[Self <: FAILED] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFAILED(value: failed_): Self = StObject.set(x, "FAILED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREJECTED(value: rejected_): Self = StObject.set(x, "REJECTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSUCCEEDED(value: succeeded_): Self = StObject.set(x, "SUCCEEDED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNHANDLED(value: unhandled_): Self = StObject.set(x, "UNHANDLED", value.asInstanceOf[js.Any])
  }
}
