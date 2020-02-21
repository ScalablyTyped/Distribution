package typings.awsSdk.kafkaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StateInfo extends js.Object {
  var Code: js.UndefOr[string] = js.native
  var Message: js.UndefOr[string] = js.native
}

object StateInfo {
  @scala.inline
  def apply(Code: string = null, Message: string = null): StateInfo = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[StateInfo]
  }
}

