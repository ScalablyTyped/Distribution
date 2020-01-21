package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SubnetCidrBlockState extends js.Object {
  /**
    * The state of a CIDR block.
    */
  var State: js.UndefOr[SubnetCidrBlockStateCode] = js.native
  /**
    * A message about the status of the CIDR block, if applicable.
    */
  var StatusMessage: js.UndefOr[String] = js.native
}

object SubnetCidrBlockState {
  @scala.inline
  def apply(State: SubnetCidrBlockStateCode = null, StatusMessage: String = null): SubnetCidrBlockState = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubnetCidrBlockState]
  }
}

