package typings.awsSdk.workmailmessageflowMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRawMessageContentResponse extends js.Object {
  /**
    * The raw content of the email message, in MIME format.
    */
  var messageContent: messageContentBlob = js.native
}

object GetRawMessageContentResponse {
  @scala.inline
  def apply(messageContent: messageContentBlob): GetRawMessageContentResponse = {
    val __obj = js.Dynamic.literal(messageContent = messageContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRawMessageContentResponse]
  }
}

