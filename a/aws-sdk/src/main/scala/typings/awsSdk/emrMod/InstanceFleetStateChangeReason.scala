package typings.awsSdk.emrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceFleetStateChangeReason extends js.Object {
  /**
    * A code corresponding to the reason the state change occurred.
    */
  var Code: js.UndefOr[InstanceFleetStateChangeReasonCode] = js.native
  /**
    * An explanatory message.
    */
  var Message: js.UndefOr[String] = js.native
}

object InstanceFleetStateChangeReason {
  @scala.inline
  def apply(Code: InstanceFleetStateChangeReasonCode = null, Message: String = null): InstanceFleetStateChangeReason = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceFleetStateChangeReason]
  }
}

