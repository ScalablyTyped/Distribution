package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InstanceNetworkInterfaceSpecification extends js.Object {
  /**
    * Indicates whether to assign a public IPv4 address to an instance you launch in a VPC. The public IP address can only be assigned to a network interface for eth0, and can only be assigned to a new network interface, not an existing one. You cannot specify more than one network interface in the request. If launching into a default subnet, the default value is true.
    */
  var AssociatePublicIpAddress: js.UndefOr[Boolean] = js.native
  /**
    * If set to true, the interface is deleted when the instance is terminated. You can specify true only if creating a new network interface when launching an instance.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.native
  /**
    * The description of the network interface. Applies only if creating a network interface when launching an instance.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The position of the network interface in the attachment order. A primary network interface has a device index of 0. If you specify a network interface when launching an instance, you must specify the device index.
    */
  var DeviceIndex: js.UndefOr[Integer] = js.native
  /**
    * The IDs of the security groups for the network interface. Applies only if creating a network interface when launching an instance.
    */
  var Groups: js.UndefOr[SecurityGroupIdStringList] = js.native
  /**
    * The type of network interface. To create an Elastic Fabric Adapter (EFA), specify efa. For more information, see Elastic Fabric Adapter in the Amazon Elastic Compute Cloud User Guide. If you are not creating an EFA, specify interface or omit this parameter. Valid values: interface | efa 
    */
  var InterfaceType: js.UndefOr[String] = js.native
  /**
    * A number of IPv6 addresses to assign to the network interface. Amazon EC2 chooses the IPv6 addresses from the range of the subnet. You cannot specify this option and the option to assign specific IPv6 addresses in the same request. You can specify this option if you've specified a minimum number of instances to launch.
    */
  var Ipv6AddressCount: js.UndefOr[Integer] = js.native
  /**
    * One or more IPv6 addresses to assign to the network interface. You cannot specify this option and the option to assign a number of IPv6 addresses in the same request. You cannot specify this option if you've specified a minimum number of instances to launch.
    */
  var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList] = js.native
  /**
    * The ID of the network interface. If you are creating a Spot Fleet, omit this parameter because you can’t specify a network interface ID in a launch specification.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.native
  /**
    * The private IPv4 address of the network interface. Applies only if creating a network interface when launching an instance. You cannot specify this option if you're launching more than one instance in a RunInstances request.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
  /**
    * One or more private IPv4 addresses to assign to the network interface. Only one private IPv4 address can be designated as primary. You cannot specify this option if you're launching more than one instance in a RunInstances request.
    */
  var PrivateIpAddresses: js.UndefOr[PrivateIpAddressSpecificationList] = js.native
  /**
    * The number of secondary private IPv4 addresses. You can't specify this option and specify more than one private IP address using the private IP addresses option. You cannot specify this option if you're launching more than one instance in a RunInstances request.
    */
  var SecondaryPrivateIpAddressCount: js.UndefOr[Integer] = js.native
  /**
    * The ID of the subnet associated with the network interface. Applies only if creating a network interface when launching an instance.
    */
  var SubnetId: js.UndefOr[String] = js.native
}

object InstanceNetworkInterfaceSpecification {
  @scala.inline
  def apply(
    AssociatePublicIpAddress: js.UndefOr[Boolean] = js.undefined,
    DeleteOnTermination: js.UndefOr[Boolean] = js.undefined,
    Description: String = null,
    DeviceIndex: js.UndefOr[Integer] = js.undefined,
    Groups: SecurityGroupIdStringList = null,
    InterfaceType: String = null,
    Ipv6AddressCount: js.UndefOr[Integer] = js.undefined,
    Ipv6Addresses: InstanceIpv6AddressList = null,
    NetworkInterfaceId: String = null,
    PrivateIpAddress: String = null,
    PrivateIpAddresses: PrivateIpAddressSpecificationList = null,
    SecondaryPrivateIpAddressCount: js.UndefOr[Integer] = js.undefined,
    SubnetId: String = null
  ): InstanceNetworkInterfaceSpecification = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(AssociatePublicIpAddress)) __obj.updateDynamic("AssociatePublicIpAddress")(AssociatePublicIpAddress.get.asInstanceOf[js.Any])
    if (!js.isUndefined(DeleteOnTermination)) __obj.updateDynamic("DeleteOnTermination")(DeleteOnTermination.get.asInstanceOf[js.Any])
    if (Description != null) __obj.updateDynamic("Description")(Description.asInstanceOf[js.Any])
    if (!js.isUndefined(DeviceIndex)) __obj.updateDynamic("DeviceIndex")(DeviceIndex.get.asInstanceOf[js.Any])
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (InterfaceType != null) __obj.updateDynamic("InterfaceType")(InterfaceType.asInstanceOf[js.Any])
    if (!js.isUndefined(Ipv6AddressCount)) __obj.updateDynamic("Ipv6AddressCount")(Ipv6AddressCount.get.asInstanceOf[js.Any])
    if (Ipv6Addresses != null) __obj.updateDynamic("Ipv6Addresses")(Ipv6Addresses.asInstanceOf[js.Any])
    if (NetworkInterfaceId != null) __obj.updateDynamic("NetworkInterfaceId")(NetworkInterfaceId.asInstanceOf[js.Any])
    if (PrivateIpAddress != null) __obj.updateDynamic("PrivateIpAddress")(PrivateIpAddress.asInstanceOf[js.Any])
    if (PrivateIpAddresses != null) __obj.updateDynamic("PrivateIpAddresses")(PrivateIpAddresses.asInstanceOf[js.Any])
    if (!js.isUndefined(SecondaryPrivateIpAddressCount)) __obj.updateDynamic("SecondaryPrivateIpAddressCount")(SecondaryPrivateIpAddressCount.get.asInstanceOf[js.Any])
    if (SubnetId != null) __obj.updateDynamic("SubnetId")(SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstanceNetworkInterfaceSpecification]
  }
}

