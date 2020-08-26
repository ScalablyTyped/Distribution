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
    * The IPv4 network range for the subnet, in CIDR notation. For example, 10.0.0.0/24. We modify the specified CIDR block to its canonical form; for example, if you specify 100.68.0.18/18, we modify it to 100.68.0.0/18.
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
    * The tags to assign to the subnet.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: typings.awsSdk.ec2Mod.VpcId = js.native
}

object CreateSubnetRequest {
  @scala.inline
  def apply(CidrBlock: String, VpcId: VpcId): CreateSubnetRequest = {
    val __obj = js.Dynamic.literal(CidrBlock = CidrBlock.asInstanceOf[js.Any], VpcId = VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSubnetRequest]
  }
  @scala.inline
  implicit class CreateSubnetRequestOps[Self <: CreateSubnetRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCidrBlock(value: String): Self = this.set("CidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcId(value: VpcId): Self = this.set("VpcId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailabilityZone(value: String): Self = this.set("AvailabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("AvailabilityZone", js.undefined)
    @scala.inline
    def setAvailabilityZoneId(value: String): Self = this.set("AvailabilityZoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZoneId: Self = this.set("AvailabilityZoneId", js.undefined)
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    @scala.inline
    def setIpv6CidrBlock(value: String): Self = this.set("Ipv6CidrBlock", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6CidrBlock: Self = this.set("Ipv6CidrBlock", js.undefined)
    @scala.inline
    def setOutpostArn(value: String): Self = this.set("OutpostArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutpostArn: Self = this.set("OutpostArn", js.undefined)
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = this.set("TagSpecifications", js.Array(value :_*))
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
  }
  
}

