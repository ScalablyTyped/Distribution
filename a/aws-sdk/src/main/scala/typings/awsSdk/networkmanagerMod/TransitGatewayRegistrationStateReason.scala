package typings.awsSdk.networkmanagerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransitGatewayRegistrationStateReason extends js.Object {
  /**
    * The code for the state reason.
    */
  var Code: js.UndefOr[TransitGatewayRegistrationState] = js.native
  /**
    * The message for the state reason.
    */
  var Message: js.UndefOr[String] = js.native
}

object TransitGatewayRegistrationStateReason {
  @scala.inline
  def apply(Code: TransitGatewayRegistrationState = null, Message: String = null): TransitGatewayRegistrationStateReason = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransitGatewayRegistrationStateReason]
  }
}

