package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProfilerSessionStoppedParams extends js.Object {
  
  var ownerUri: String = js.native
  
  var sessionId: Double = js.native
}
object ProfilerSessionStoppedParams {
  
  @scala.inline
  def apply(ownerUri: String, sessionId: Double): ProfilerSessionStoppedParams = {
    val __obj = js.Dynamic.literal(ownerUri = ownerUri.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProfilerSessionStoppedParams]
  }
  
  @scala.inline
  implicit class ProfilerSessionStoppedParamsOps[Self <: ProfilerSessionStoppedParams] (val x: Self) extends AnyVal {
    
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
    def setOwnerUri(value: String): Self = this.set("ownerUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionId(value: Double): Self = this.set("sessionId", value.asInstanceOf[js.Any])
  }
}
