package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateEndpointsBatchResponse extends js.Object {
  var MessageBody: typings.awsSdk.pinpointMod.MessageBody = js.native
}

object UpdateEndpointsBatchResponse {
  @scala.inline
  def apply(MessageBody: MessageBody): UpdateEndpointsBatchResponse = {
    val __obj = js.Dynamic.literal(MessageBody = MessageBody.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[UpdateEndpointsBatchResponse]
  }
}

