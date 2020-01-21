package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendEmailResponse extends js.Object {
  /**
    * The unique message identifier returned from the SendEmail action. 
    */
  var MessageId: typings.awsSdk.sesMod.MessageId = js.native
}

object SendEmailResponse {
  @scala.inline
  def apply(MessageId: MessageId): SendEmailResponse = {
    val __obj = js.Dynamic.literal(MessageId = MessageId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SendEmailResponse]
  }
}

