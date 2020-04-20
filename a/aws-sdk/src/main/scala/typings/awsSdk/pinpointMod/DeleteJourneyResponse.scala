package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteJourneyResponse extends js.Object {
  var JourneyResponse: typings.awsSdk.pinpointMod.JourneyResponse = js.native
}

object DeleteJourneyResponse {
  @scala.inline
  def apply(JourneyResponse: JourneyResponse): DeleteJourneyResponse = {
    val __obj = js.Dynamic.literal(JourneyResponse = JourneyResponse.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteJourneyResponse]
  }
}

