package typings.awsSdk.cloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MessageData extends js.Object {
  /**
    * The error code or status code associated with the message.
    */
  var Code: js.UndefOr[MessageDataCode] = js.native
  /**
    * The message text.
    */
  var Value: js.UndefOr[MessageDataValue] = js.native
}

object MessageData {
  @scala.inline
  def apply(Code: MessageDataCode = null, Value: MessageDataValue = null): MessageData = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Value != null) __obj.updateDynamic("Value")(Value.asInstanceOf[js.Any])
    __obj.asInstanceOf[MessageData]
  }
}

