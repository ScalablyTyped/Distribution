package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendCustomVerificationEmailResponse extends js.Object {
  /**
    * The unique message identifier returned from the SendCustomVerificationEmail operation.
    */
  var MessageId: js.UndefOr[typings.awsSdk.sesMod.MessageId] = js.native
}

object SendCustomVerificationEmailResponse {
  @scala.inline
  def apply(MessageId: MessageId = null): SendCustomVerificationEmailResponse = {
    val __obj = js.Dynamic.literal()
    if (MessageId != null) __obj.updateDynamic("MessageId")(MessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendCustomVerificationEmailResponse]
  }
}

