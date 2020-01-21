package typings.awsSdk.sqsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiveMessageResult extends js.Object {
  /**
    * A list of messages.
    */
  var Messages: js.UndefOr[MessageList] = js.native
}

object ReceiveMessageResult {
  @scala.inline
  def apply(Messages: MessageList = null): ReceiveMessageResult = {
    val __obj = js.Dynamic.literal()
    if (Messages != null) __obj.updateDynamic("Messages")(Messages.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiveMessageResult]
  }
}

