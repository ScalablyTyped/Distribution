package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcPeeringConnectionVpcInfo extends js.Object {
  /**
    * The IPv4 CIDR block for the VPC.
    */
  var CidrBlock: js.UndefOr[String] = js.native
  /**
    * Information about the IPv4 CIDR blocks for the VPC.
    */
  var CidrBlockSet: js.UndefOr[typings.awsSdk.ec2Mod.CidrBlockSet] = js.native
  /**
    * The IPv6 CIDR block for the VPC.
    */
  var Ipv6CidrBlockSet: js.UndefOr[typings.awsSdk.ec2Mod.Ipv6CidrBlockSet] = js.native
  /**
    * The AWS account ID of the VPC owner.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * Information about the VPC peering connection options for the accepter or requester VPC.
    */
  var PeeringOptions: js.UndefOr[VpcPeeringConnectionOptionsDescription] = js.native
  /**
    * The Region in which the VPC is located.
    */
  var Region: js.UndefOr[String] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object VpcPeeringConnectionVpcInfo {
  @scala.inline
  def apply(
    CidrBlock: String = null,
    CidrBlockSet: CidrBlockSet = null,
    Ipv6CidrBlockSet: Ipv6CidrBlockSet = null,
    OwnerId: String = null,
    PeeringOptions: VpcPeeringConnectionOptionsDescription = null,
    Region: String = null,
    VpcId: String = null
  ): VpcPeeringConnectionVpcInfo = {
    val __obj = js.Dynamic.literal()
    if (CidrBlock != null) __obj.updateDynamic("CidrBlock")(CidrBlock.asInstanceOf[js.Any])
    if (CidrBlockSet != null) __obj.updateDynamic("CidrBlockSet")(CidrBlockSet.asInstanceOf[js.Any])
    if (Ipv6CidrBlockSet != null) __obj.updateDynamic("Ipv6CidrBlockSet")(Ipv6CidrBlockSet.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (PeeringOptions != null) __obj.updateDynamic("PeeringOptions")(PeeringOptions.asInstanceOf[js.Any])
    if (Region != null) __obj.updateDynamic("Region")(Region.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[VpcPeeringConnectionVpcInfo]
  }
}

