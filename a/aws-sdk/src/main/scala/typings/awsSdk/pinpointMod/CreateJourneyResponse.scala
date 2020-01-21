package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateJourneyResponse extends js.Object {
  var JourneyResponse: typings.awsSdk.pinpointMod.JourneyResponse = js.native
}

object CreateJourneyResponse {
  @scala.inline
  def apply(JourneyResponse: JourneyResponse): CreateJourneyResponse = {
    val __obj = js.Dynamic.literal(JourneyResponse = JourneyResponse.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CreateJourneyResponse]
  }
}

