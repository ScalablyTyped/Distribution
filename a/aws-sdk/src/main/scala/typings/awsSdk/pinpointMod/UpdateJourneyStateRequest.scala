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
}

