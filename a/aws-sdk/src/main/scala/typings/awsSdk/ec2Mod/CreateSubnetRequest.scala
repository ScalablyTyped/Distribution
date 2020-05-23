package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateSubnetRequest extends js.Object {
  /**
    * The Availability Zone or Local Zone for the subnet. Default: AWS selects one for you. If you create more than one subnet in your VPC, we do not necessarily select a different zone for each subnet. To create a subnet in a Local Zone, set this value to the Local Zone ID, for example us-west-2-lax-1a. For information about the Regions that support Local Zones, see Available Regions in the Amazon Elastic Compute Cloud User Guide. To create a subnet in an Outpost, set this value to the Availability Zone for the Outpost and specify the Outpost ARN.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The AZ ID or the Local Zone ID of the subnet.
    */
  var AvailabilityZoneId: js.UndefOr[String] = js.native
  /**
    * The IPv4 network range for the subnet, in CIDR notation. For example, 10.0.0.0/24.
    */
  var CidrBlock: String = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The IPv6 network range for the subnet, in CIDR notation. The subnet size must use a /64 prefix length.
    */
  var Ipv6CidrBlock: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Outpost. If you specify an Outpost ARN, you must also specify the Availability Zone of the Outpost subnet.
    */
  var OutpostArn: js.UndefOr[String] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: typings.awsSdk.ec2Mod.VpcId = js.native
}

object CreateSubnetRequest {
  @scala.inline
  def apply(
    CidrBlock: String,
    VpcId: VpcId,
    AvailabilityZone: String = null,
    AvailabilityZoneId: String = null,
    DryRun: js.UndefOr[Boolean] = js.undefined,
    Ipv6CidrBlock: String = null,
    OutpostArn: String = null
  ): CreateSubnetRequest = {
    val __obj = js.Dynamic.literal(CidrBlock = CidrBlock.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (AvailabilityZoneId != null) __obj.updateDynamic("AvailabilityZoneId")(AvailabilityZoneId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.get.asInstanceOf[js.Any])
    if (Ipv6CidrBlock != null) __obj.updateDynamic("Ipv6CidrBlock")(Ipv6CidrBlock.asInstanceOf[js.Any])
    if (OutpostArn != null) __obj.updateDynamic("OutpostArn")(OutpostArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSubnetRequest]
  }
}

