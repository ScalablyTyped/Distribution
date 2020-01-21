package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApnsVoipChannelRequest extends js.Object {
  var APNSVoipChannelRequest: typings.awsSdk.pinpointMod.APNSVoipChannelRequest = js.native
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
}

object UpdateApnsVoipChannelRequest {
  @scala.inline
  def apply(APNSVoipChannelRequest: APNSVoipChannelRequest, ApplicationId: string): UpdateApnsVoipChannelRequest = {
    val __obj = js.Dynamic.literal(APNSVoipChannelRequest = APNSVoipChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateApnsVoipChannelRequest]
  }
}

