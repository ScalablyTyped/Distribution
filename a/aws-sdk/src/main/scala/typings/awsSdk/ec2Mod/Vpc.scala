package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Vpc extends js.Object {
  /**
    * The primary IPv4 CIDR block for the VPC.
    */
  var CidrBlock: js.UndefOr[String] = js.native
  /**
    * Information about the IPv4 CIDR blocks associated with the VPC.
    */
  var CidrBlockAssociationSet: js.UndefOr[VpcCidrBlockAssociationSet] = js.native
  /**
    * The ID of the set of DHCP options you've associated with the VPC (or default if the default options are associated with the VPC).
    */
  var DhcpOptionsId: js.UndefOr[String] = js.native
  /**
    * The allowed tenancy of instances launched into the VPC.
    */
  var InstanceTenancy: js.UndefOr[Tenancy] = js.native
  /**
    * Information about the IPv6 CIDR blocks associated with the VPC.
    */
  var Ipv6CidrBlockAssociationSet: js.UndefOr[VpcIpv6CidrBlockAssociationSet] = js.native
  /**
    * Indicates whether the VPC is the default VPC.
    */
  var IsDefault: js.UndefOr[Boolean] = js.native
  /**
    * The ID of the AWS account that owns the VPC.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The current state of the VPC.
    */
  var State: js.UndefOr[VpcState] = js.native
  /**
    * Any tags assigned to the VPC.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object Vpc {
  @scala.inline
  def apply(
    CidrBlock: String = null,
    CidrBlockAssociationSet: VpcCidrBlockAssociationSet = null,
    DhcpOptionsId: String = null,
    InstanceTenancy: Tenancy = null,
    Ipv6CidrBlockAssociationSet: VpcIpv6CidrBlockAssociationSet = null,
    IsDefault: js.UndefOr[Boolean] = js.undefined,
    OwnerId: String = null,
    State: VpcState = null,
    Tags: TagList = null,
    VpcId: String = null
  ): Vpc = {
    val __obj = js.Dynamic.literal()
    if (CidrBlock != null) __obj.updateDynamic("CidrBlock")(CidrBlock.asInstanceOf[js.Any])
    if (CidrBlockAssociationSet != null) __obj.updateDynamic("CidrBlockAssociationSet")(CidrBlockAssociationSet.asInstanceOf[js.Any])
    if (DhcpOptionsId != null) __obj.updateDynamic("DhcpOptionsId")(DhcpOptionsId.asInstanceOf[js.Any])
    if (InstanceTenancy != null) __obj.updateDynamic("InstanceTenancy")(InstanceTenancy.asInstanceOf[js.Any])
    if (Ipv6CidrBlockAssociationSet != null) __obj.updateDynamic("Ipv6CidrBlockAssociationSet")(Ipv6CidrBlockAssociationSet.asInstanceOf[js.Any])
    if (!js.isUndefined(IsDefault)) __obj.updateDynamic("IsDefault")(IsDefault.get.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vpc]
  }
}

