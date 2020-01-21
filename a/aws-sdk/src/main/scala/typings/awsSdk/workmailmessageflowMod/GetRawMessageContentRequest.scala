package typings.awsSdk.workmailmessageflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRawMessageContentRequest extends js.Object {
  /**
    * The identifier of the email message to retrieve.
    */
  var messageId: messageIdType = js.native
}

object GetRawMessageContentRequest {
  @scala.inline
  def apply(messageId: messageIdType): GetRawMessageContentRequest = {
    val __obj = js.Dynamic.literal(messageId = messageId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetRawMessageContentRequest]
  }
}

