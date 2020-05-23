package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Subnet extends js.Object {
  /**
    * Indicates whether a network interface created in this subnet (including a network interface created by RunInstances) receives an IPv6 address.
    */
  var AssignIpv6AddressOnCreation: js.UndefOr[Boolean] = js.native
  /**
    * The Availability Zone of the subnet.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The AZ ID of the subnet.
    */
  var AvailabilityZoneId: js.UndefOr[String] = js.native
  /**
    * The number of unused private IPv4 addresses in the subnet. The IPv4 addresses for any stopped instances are considered unavailable.
    */
  var AvailableIpAddressCount: js.UndefOr[Integer] = js.native
  /**
    * The IPv4 CIDR block assigned to the subnet.
    */
  var CidrBlock: js.UndefOr[String] = js.native
  /**
    * The customer-owned IPv4 address pool associated with the subnet.
    */
  var CustomerOwnedIpv4Pool: js.UndefOr[CoipPoolId] = js.native
  /**
    * Indicates whether this is the default subnet for the Availability Zone.
    */
  var DefaultForAz: js.UndefOr[Boolean] = js.native
  /**
    * Information about the IPv6 CIDR blocks associated with the subnet.
    */
  var Ipv6CidrBlockAssociationSet: js.UndefOr[SubnetIpv6CidrBlockAssociationSet] = js.native
  /**
    * Indicates whether a network interface created in this subnet (including a network interface created by RunInstances) receives a customer-owned IPv4 address.
    */
  var MapCustomerOwnedIpOnLaunch: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether instances launched in this subnet receive a public IPv4 address.
    */
  var MapPublicIpOnLaunch: js.UndefOr[Boolean] = js.native
  /**
    * The Amazon Resource Name (ARN) of the Outpost.
    */
  var OutpostArn: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS account that owns the subnet.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The current state of the subnet.
    */
  var State: js.UndefOr[SubnetState] = js.native
  /**
    * The Amazon Resource Name (ARN) of the subnet.
    */
  var SubnetArn: js.UndefOr[String] = js.native
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.native
  /**
    * Any tags assigned to the subnet.
    */
  var Tags: js.UndefOr[TagList] = js.native
  /**
    * The ID of the VPC the subnet is in.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object Subnet {
  @scala.inline
  def apply(
    AssignIpv6AddressOnCreation: js.UndefOr[Boolean] = js.undefined,
    AvailabilityZone: String = null,
    AvailabilityZoneId: String = null,
    AvailableIpAddressCount: js.UndefOr[Integer] = js.undefined,
    CidrBlock: String = null,
    CustomerOwnedIpv4Pool: CoipPoolId = null,
    DefaultForAz: js.UndefOr[Boolean] = js.undefined,
    Ipv6CidrBlockAssociationSet: SubnetIpv6CidrBlockAssociationSet = null,
    MapCustomerOwnedIpOnLaunch: js.UndefOr[Boolean] = js.undefined,
    MapPublicIpOnLaunch: js.UndefOr[Boolean] = js.undefined,
    OutpostArn: String = null,
    OwnerId: String = null,
    State: SubnetState = null,
    SubnetArn: String = null,
    SubnetId: String = null,
    Tags: TagList = null,
    VpcId: String = null
  ): Subnet = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AssignIpv6AddressOnCreation)) __obj.updateDynamic("AssignIpv6AddressOnCreation")(AssignIpv6AddressOnCreation.get.asInstanceOf[js.Any])
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (AvailabilityZoneId != null) __obj.updateDynamic("AvailabilityZoneId")(AvailabilityZoneId.asInstanceOf[js.Any])
    if (!js.isUndefined(AvailableIpAddressCount)) __obj.updateDynamic("AvailableIpAddressCount")(AvailableIpAddressCount.get.asInstanceOf[js.Any])
    if (CidrBlock != null) __obj.updateDynamic("CidrBlock")(CidrBlock.asInstanceOf[js.Any])
    if (CustomerOwnedIpv4Pool != null) __obj.updateDynamic("CustomerOwnedIpv4Pool")(CustomerOwnedIpv4Pool.asInstanceOf[js.Any])
    if (!js.isUndefined(DefaultForAz)) __obj.updateDynamic("DefaultForAz")(DefaultForAz.get.asInstanceOf[js.Any])
    if (Ipv6CidrBlockAssociationSet != null) __obj.updateDynamic("Ipv6CidrBlockAssociationSet")(Ipv6CidrBlockAssociationSet.asInstanceOf[js.Any])
    if (!js.isUndefined(MapCustomerOwnedIpOnLaunch)) __obj.updateDynamic("MapCustomerOwnedIpOnLaunch")(MapCustomerOwnedIpOnLaunch.get.asInstanceOf[js.Any])
    if (!js.isUndefined(MapPublicIpOnLaunch)) __obj.updateDynamic("MapPublicIpOnLaunch")(MapPublicIpOnLaunch.get.asInstanceOf[js.Any])
    if (OutpostArn != null) __obj.updateDynamic("OutpostArn")(OutpostArn.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (SubnetArn != null) __obj.updateDynamic("SubnetArn")(SubnetArn.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Subnet]
  }
}

