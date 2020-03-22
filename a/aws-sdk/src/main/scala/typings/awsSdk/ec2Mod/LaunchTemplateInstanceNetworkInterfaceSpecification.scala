package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateInstanceNetworkInterfaceSpecification extends js.Object {
  /**
    * Indicates whether to associate a public IPv4 address with eth0 for a new network interface.
    */
  var AssociatePublicIpAddress: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether the network interface is deleted when the instance is terminated.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.native
  /**
    * A description for the network interface.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The device index for the network interface attachment.
    */
  var DeviceIndex: js.UndefOr[Integer] = js.native
  /**
    * The IDs of one or more security groups.
    */
  var Groups: js.UndefOr[GroupIdStringList] = js.native
  /**
    * The type of network interface.
    */
  var InterfaceType: js.UndefOr[String] = js.native
  /**
    * The number of IPv6 addresses for the network interface.
    */
  var Ipv6AddressCount: js.UndefOr[Integer] = js.native
  /**
    * The IPv6 addresses for the network interface.
    */
  var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[typings.awsSdk.ec2Mod.NetworkInterfaceId] = js.native
  /**
    * The primary private IPv4 address of the network interface.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
  /**
    * One or more private IPv4 addresses.
    */
  var PrivateIpAddresses: js.UndefOr[PrivateIpAddressSpecificationList] = js.native
  /**
    * The number of secondary private IPv4 addresses for the network interface.
    */
  var SecondaryPrivateIpAddressCount: js.UndefOr[Integer] = js.native
  /**
    * The ID of the subnet for the network interface.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.ec2Mod.SubnetId] = js.native
}

object LaunchTemplateInstanceNetworkInterfaceSpecification {
  @scala.inline
  def apply(
    AssociatePublicIpAddress: js.UndefOr[scala.Boolean] = js.undefined,
    DeleteOnTermination: js.UndefOr[scala.Boolean] = js.undefined,
    Description: String = null,
    DeviceIndex: Int | scala.Double = null,
    Groups: GroupIdStringList = null,
    InterfaceType: String = null,
    Ipv6AddressCount: Int | scala.Double = null,
    Ipv6Addresses: InstanceIpv6AddressList = null,
    NetworkInterfaceId: NetworkInterfaceId = null,
    PrivateIpAddress: String = null,
    PrivateIpAddresses: PrivateIpAddressSpecificationList = null,
    SecondaryPrivateIpAddressCount: Int | scala.Double = null,
    SubnetId: SubnetId = null
  ): LaunchTemplateInstanceNetworkInterfaceSpecification = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AssociatePublicIpAddress)) __obj.updateDynamic("AssociatePublicIpAddress")(AssociatePublicIpAddress.asInstanceOf[js.Any])
    if (!js.isUndefined(DeleteOnTermination)) __obj.updateDynamic("DeleteOnTermination")(DeleteOnTermination.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (DeviceIndex != null) __obj.updateDynamic("DeviceIndex")(DeviceIndex.asInstanceOf[js.Any])
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (InterfaceType != null) __obj.updateDynamic("InterfaceType")(InterfaceType.asInstanceOf[js.Any])
    if (Ipv6AddressCount != null) __obj.updateDynamic("Ipv6AddressCount")(Ipv6AddressCount.asInstanceOf[js.Any])
    if (Ipv6Addresses != null) __obj.updateDynamic("Ipv6Addresses")(Ipv6Addresses.asInstanceOf[js.Any])
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId.asInstanceOf[js.Any])
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress.asInstanceOf[js.Any])
    if (PrivateIpAddresses != null) __obj.updateDynamic("PrivateIpAddresses")(PrivateIpAddresses.asInstanceOf[js.Any])
    if (SecondaryPrivateIpAddressCount != null) __obj.updateDynamic("SecondaryPrivateIpAddressCount")(SecondaryPrivateIpAddressCount.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateInstanceNetworkInterfaceSpecification]
  }
}

