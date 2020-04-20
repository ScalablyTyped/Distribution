package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendUsersMessagesRequest extends js.Object {
  /**
    * The unique identifier for the application. This identifier is displayed as the Project ID on the Amazon Pinpoint console.
    */
  var ApplicationId: string = js.native
  var SendUsersMessageRequest: typings.awsSdk.pinpointMod.SendUsersMessageRequest = js.native
}

object SendUsersMessagesRequest {
  @scala.inline
  def apply(ApplicationId: string, SendUsersMessageRequest: SendUsersMessageRequest): SendUsersMessagesRequest = {
    val __obj = js.Dynamic.literal(ApplicationId = ApplicationId.asInstanceOf[js.Any], SendUsersMessageRequest = SendUsersMessageRequest.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendUsersMessagesRequest]
  }
}

