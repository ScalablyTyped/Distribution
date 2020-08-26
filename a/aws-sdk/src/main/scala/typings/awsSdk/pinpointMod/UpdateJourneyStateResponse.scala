package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJourneyStateResponse extends js.Object {
  var JourneyResponse: typings.awsSdk.pinpointMod.JourneyResponse = js.native
}

object UpdateJourneyStateResponse {
  @scala.inline
  def apply(JourneyResponse: JourneyResponse): UpdateJourneyStateResponse = {
    val __obj = js.Dynamic.literal(JourneyResponse = JourneyResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJourneyStateResponse]
  }
  @scala.inline
  implicit class UpdateJourneyStateResponseOps[Self <: UpdateJourneyStateResponse] (val x: Self) extends AnyVal {
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

