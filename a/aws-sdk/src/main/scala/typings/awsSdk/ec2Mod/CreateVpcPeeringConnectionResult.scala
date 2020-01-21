package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpcPeeringConnectionResult extends js.Object {
  /**
    * Information about the VPC peering connection.
    */
  var VpcPeeringConnection: js.UndefOr[typings.awsSdk.ec2Mod.VpcPeeringConnection] = js.native
}

object CreateVpcPeeringConnectionResult {
  @scala.inline
  def apply(VpcPeeringConnection: VpcPeeringConnection = null): CreateVpcPeeringConnectionResult = {
    val __obj = js.Dynamic.literal()
    if (VpcPeeringConnection != null) __obj.updateDynamic("VpcPeeringConnection")(VpcPeeringConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateVpcPeeringConnectionResult]
  }
}

