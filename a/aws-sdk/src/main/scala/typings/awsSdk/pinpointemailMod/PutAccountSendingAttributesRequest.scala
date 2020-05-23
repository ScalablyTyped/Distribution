package typings.awsSdk.pinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutAccountSendingAttributesRequest extends js.Object {
  /**
    * Enables or disables your account's ability to send email. Set to true to enable email sending, or set to false to disable email sending.  If AWS paused your account's ability to send email, you can't use this operation to resume your account's ability to send email. 
    */
  var SendingEnabled: js.UndefOr[Enabled] = js.native
}

object PutAccountSendingAttributesRequest {
  @scala.inline
  def apply(SendingEnabled: js.UndefOr[Enabled] = js.undefined): PutAccountSendingAttributesRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(SendingEnabled)) __obj.updateDynamic("SendingEnabled")(SendingEnabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutAccountSendingAttributesRequest]
  }
}

