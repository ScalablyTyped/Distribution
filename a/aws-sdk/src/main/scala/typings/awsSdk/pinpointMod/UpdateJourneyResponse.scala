package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateJourneyResponse extends js.Object {
  
  var JourneyResponse: typings.awsSdk.pinpointMod.JourneyResponse = js.native
}
object UpdateJourneyResponse {
  
  @scala.inline
  def apply(JourneyResponse: JourneyResponse): UpdateJourneyResponse = {
    val __obj = js.Dynamic.literal(JourneyResponse = JourneyResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJourneyResponse]
  }
  
  @scala.inline
  implicit class UpdateJourneyResponseOps[Self <: UpdateJourneyResponse] (val x: Self) extends AnyVal {
    
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
    def setJourneyResponse(value: JourneyResponse): Self = this.set("JourneyResponse", value.asInstanceOf[js.Any])
  }
}
