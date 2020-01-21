package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcPeeringConnectionStatus extends js.Object {
  /**
    * Code indicating the status of a VPC peering connection.
    */
  var Code: js.UndefOr[NonZeroAndMaxString] = js.native
  /**
    * Additional messaging associated with the connection status. 
    */
  var Message: js.UndefOr[NonZeroAndMaxString] = js.native
}

object VpcPeeringConnectionStatus {
  @scala.inline
  def apply(Code: NonZeroAndMaxString = null, Message: NonZeroAndMaxString = null): VpcPeeringConnectionStatus = {
    val __obj = js.Dynamic.literal()
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcPeeringConnectionStatus]
  }
}

