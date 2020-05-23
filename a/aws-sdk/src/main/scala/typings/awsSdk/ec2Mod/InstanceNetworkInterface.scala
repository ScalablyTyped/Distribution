package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceNetworkInterface extends js.Object {
  /**
    * The association information for an Elastic IPv4 associated with the network interface.
    */
  var Association: js.UndefOr[InstanceNetworkInterfaceAssociation] = js.native
  /**
    * The network interface attachment.
    */
  var Attachment: js.UndefOr[InstanceNetworkInterfaceAttachment] = js.native
  /**
    * The description.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * One or more security groups.
    */
  var Groups: js.UndefOr[GroupIdentifierList] = js.native
  /**
    * Describes the type of network interface. Valid values: interface | efa 
    */
  var InterfaceType: js.UndefOr[String] = js.native
  /**
    * One or more IPv6 addresses associated with the network interface.
    */
  var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList] = js.native
  /**
    * The MAC address.
    */
  var MacAddress: js.UndefOr[String] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  /**
    * The ID of the AWS account that created the network interface.
    */
  var OwnerId: js.UndefOr[String] = js.native
  /**
    * The private DNS name.
    */
  var PrivateDnsName: js.UndefOr[String] = js.native
  /**
    * The IPv4 address of the network interface within the subnet.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
  /**
    * One or more private IPv4 addresses associated with the network interface.
    */
  var PrivateIpAddresses: js.UndefOr[InstancePrivateIpAddressList] = js.native
  /**
    * Indicates whether to validate network traffic to or from this network interface.
    */
  var SourceDestCheck: js.UndefOr[Boolean] = js.native
  /**
    * The status of the network interface.
    */
  var Status: js.UndefOr[NetworkInterfaceStatus] = js.native
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[String] = js.native
  /**
    * The ID of the VPC.
    */
  var VpcId: js.UndefOr[String] = js.native
}

object InstanceNetworkInterface {
  @scala.inline
  def apply(
    Association: InstanceNetworkInterfaceAssociation = null,
    Attachment: InstanceNetworkInterfaceAttachment = null,
    Description: String = null,
    Groups: GroupIdentifierList = null,
    InterfaceType: String = null,
    Ipv6Addresses: InstanceIpv6AddressList = null,
    MacAddress: String = null,
    NetworkInterfaceId: String = null,
    OwnerId: String = null,
    PrivateDnsName: String = null,
    PrivateIpAddress: String = null,
    PrivateIpAddresses: InstancePrivateIpAddressList = null,
    SourceDestCheck: js.UndefOr[Boolean] = js.undefined,
    Status: NetworkInterfaceStatus = null,
    SubnetId: String = null,
    VpcId: String = null
  ): InstanceNetworkInterface = {
    val __obj = js.Dynamic.literal()
    if (Association != null) __obj.updateDynamic("Association")(Association.asInstanceOf[js.Any])
    if (Attachment != null) __obj.updateDynamic("Attachment")(Attachment.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (InterfaceType != null) __obj.updateDynamic("InterfaceType")(InterfaceType.asInstanceOf[js.Any])
    if (Ipv6Addresses != null) __obj.updateDynamic("Ipv6Addresses")(Ipv6Addresses.asInstanceOf[js.Any])
    if (MacAddress != null) __obj.updateDynamic("MacAddress")(MacAddress.asInstanceOf[js.Any])
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId.asInstanceOf[js.Any])
    if (OwnerId != null) __obj.updateDynamic("OwnerId")(OwnerId.asInstanceOf[js.Any])
    if (PrivateDnsName != null) __obj.updateDynamic("PrivateDnsName")(PrivateDnsName.asInstanceOf[js.Any])
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress.asInstanceOf[js.Any])
    if (PrivateIpAddresses != null) __obj.updateDynamic("PrivateIpAddresses")(PrivateIpAddresses.asInstanceOf[js.Any])
    if (!js.isUndefined(SourceDestCheck)) __obj.updateDynamic("SourceDestCheck")(SourceDestCheck.get.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    if (VpcId != null) __obj.updateDynamic("VpcId")(VpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceNetworkInterface]
  }
}

