package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateJourneyStateRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  /**
    * The unique identifier for the journey.
    */
  var JourneyId: string = js.native
  var JourneyStateRequest: typings.awsSdk.pinpointMod.JourneyStateRequest = js.native
}

object UpdateJourneyStateRequest {
  @scala.inline
  def apply(ApplicationId: string, JourneyId: string, JourneyStateRequest: JourneyStateRequest): UpdateJourneyStateRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], JourneyId = JourneyId.asInstanceOf[js.Any], JourneyStateRequest = JourneyStateRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateJourneyStateRequest]
  }
  @scala.inline
  implicit class UpdateJourneyStateRequestOps[Self <: UpdateJourneyStateRequest] (val x: Self) extends AnyVal {
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
    def setApplicationId(value: string): Self = this.set("ApplicationId", value.asInstanceOf[js.Any])
    @scala.inline
    def setJourneyId(value: string): Self = this.set("JourneyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setJourneyStateRequest(value: JourneyStateRequest): Self = this.set("JourneyStateRequest", value.asInstanceOf[js.Any])
  }
  
}

