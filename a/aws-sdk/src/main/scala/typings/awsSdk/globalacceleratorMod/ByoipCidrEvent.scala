package typings.awsSdk.globalacceleratorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ByoipCidrEvent extends js.Object {
  /**
    * A string that contains an Event message describing changes that you make in the status of an IP address range that you bring to AWS Global Accelerator through bring your own IP address (BYOIP).
    */
  var Message: js.UndefOr[GenericString] = js.native
  /**
    * A timestamp when you make a status change for an IP address range that you bring to AWS Global Accelerator through bring your own IP address (BYOIP).
    */
  var Timestamp: js.UndefOr[typings.awsSdk.globalacceleratorMod.Timestamp] = js.native
}

object ByoipCidrEvent {
  @scala.inline
  def apply(Message: GenericString = null, Timestamp: Timestamp = null): ByoipCidrEvent = {
    val __obj = js.Dynamic.literal()
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Timestamp != null) __obj.updateDynamic("Timestamp")(Timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[ByoipCidrEvent]
  }
}

