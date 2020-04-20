package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateApnsSandboxChannelRequest extends js.Object {
  var APNSSandboxChannelRequest: typings.awsSdk.pinpointMod.APNSSandboxChannelRequest = js.native
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
}

object UpdateApnsSandboxChannelRequest {
  @scala.inline
  def apply(APNSSandboxChannelRequest: APNSSandboxChannelRequest, ApplicationId: string): UpdateApnsSandboxChannelRequest = {
    val __obj = js.Dynamic.literal(APNSSandboxChannelRequest = APNSSandboxChannelRequest.asInstanceOf[js.Any], ApplicationId = ApplicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApnsSandboxChannelRequest]
  }
}

