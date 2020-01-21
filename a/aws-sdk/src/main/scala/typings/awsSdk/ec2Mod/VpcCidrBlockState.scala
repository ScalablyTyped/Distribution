package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcCidrBlockState extends js.Object {
  /**
    * The state of the CIDR block.
    */
  var State: js.UndefOr[VpcCidrBlockStateCode] = js.native
  /**
    * A message about the status of the CIDR block, if applicable.
    */
  var StatusMessage: js.UndefOr[String] = js.native
}

object VpcCidrBlockState {
  @scala.inline
  def apply(State: VpcCidrBlockStateCode = null, StatusMessage: String = null): VpcCidrBlockState = {
    val __obj = js.Dynamic.literal()
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StatusMessage != null) __obj.updateDynamic("StatusMessage")(StatusMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcCidrBlockState]
  }
}

