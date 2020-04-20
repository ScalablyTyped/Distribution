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
}

