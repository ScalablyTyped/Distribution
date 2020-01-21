package typings.awsSdk.sesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SendBounceResponse extends js.Object {
  /**
    * The message ID of the bounce message.
    */
  var MessageId: js.UndefOr[typings.awsSdk.sesMod.MessageId] = js.native
}

object SendBounceResponse {
  @scala.inline
  def apply(MessageId: MessageId = null): SendBounceResponse = {
    val __obj = js.Dynamic.literal()
    if (MessageId != null) __obj.updateDynamic("MessageId")(MessageId.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendBounceResponse]
  }
}

