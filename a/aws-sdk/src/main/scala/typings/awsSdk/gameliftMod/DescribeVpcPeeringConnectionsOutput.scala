package typings.awsSdk.gameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVpcPeeringConnectionsOutput extends js.Object {
  /**
    * A collection of VPC peering connection records that match the request.
    */
  var VpcPeeringConnections: js.UndefOr[VpcPeeringConnectionList] = js.native
}

object DescribeVpcPeeringConnectionsOutput {
  @scala.inline
  def apply(VpcPeeringConnections: VpcPeeringConnectionList = null): DescribeVpcPeeringConnectionsOutput = {
    val __obj = js.Dynamic.literal()
    if (VpcPeeringConnections != null) __obj.updateDynamic("VpcPeeringConnections")(VpcPeeringConnections.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVpcPeeringConnectionsOutput]
  }
}

