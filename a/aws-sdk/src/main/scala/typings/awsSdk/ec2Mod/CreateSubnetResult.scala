package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSubnetResult extends js.Object {
  /**
    * Information about the subnet.
    */
  var Subnet: js.UndefOr[typings.awsSdk.ec2Mod.Subnet] = js.native
}

object CreateSubnetResult {
  @scala.inline
  def apply(Subnet: Subnet = null): CreateSubnetResult = {
    val __obj = js.Dynamic.literal()
    if (Subnet != null) __obj.updateDynamic("Subnet")(Subnet.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSubnetResult]
  }
}

