package typings.chromeApps.anon

import typings.chromeApps.chromeAppsStrings.failed_
import typings.chromeApps.chromeAppsStrings.rejected_
import typings.chromeApps.chromeAppsStrings.succeeded_
import typings.chromeApps.chromeAppsStrings.unhandled_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FAILED extends js.Object {
  
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
  implicit class FAILEDOps[Self <: FAILED] (val x: Self) extends AnyVal {
    
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
    def setFAILED(value: failed_): Self = this.set("FAILED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setREJECTED(value: rejected_): Self = this.set("REJECTED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSUCCEEDED(value: succeeded_): Self = this.set("SUCCEEDED", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUNHANDLED(value: unhandled_): Self = this.set("UNHANDLED", value.asInstanceOf[js.Any])
  }
}
