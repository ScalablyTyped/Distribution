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
  def apply(): InstanceNetworkInterfaceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceNetworkInterfaceSpecification]
  }
  @scala.inline
  implicit class InstanceNetworkInterfaceSpecificationOps[Self <: InstanceNetworkInterfaceSpecification] (val x: Self) extends AnyVal {
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
    def setAssociatePublicIpAddress(value: Boolean): Self = this.set("AssociatePublicIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssociatePublicIpAddress: Self = this.set("AssociatePublicIpAddress", js.undefined)
    @scala.inline
    def setDeleteOnTermination(value: Boolean): Self = this.set("DeleteOnTermination", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleteOnTermination: Self = this.set("DeleteOnTermination", js.undefined)
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setDeviceIndex(value: Integer): Self = this.set("DeviceIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeviceIndex: Self = this.set("DeviceIndex", js.undefined)
    @scala.inline
    def setGroupsVarargs(value: SecurityGroupId*): Self = this.set("Groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: SecurityGroupIdStringList): Self = this.set("Groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
    @scala.inline
    def setInterfaceType(value: String): Self = this.set("InterfaceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInterfaceType: Self = this.set("InterfaceType", js.undefined)
    @scala.inline
    def setIpv6AddressCount(value: Integer): Self = this.set("Ipv6AddressCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6AddressCount: Self = this.set("Ipv6AddressCount", js.undefined)
    @scala.inline
    def setIpv6AddressesVarargs(value: InstanceIpv6Address*): Self = this.set("Ipv6Addresses", js.Array(value :_*))
    @scala.inline
    def setIpv6Addresses(value: InstanceIpv6AddressList): Self = this.set("Ipv6Addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6Addresses: Self = this.set("Ipv6Addresses", js.undefined)
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkInterfaceId: Self = this.set("NetworkInterfaceId", js.undefined)
    @scala.inline
    def setPrivateIpAddress(value: String): Self = this.set("PrivateIpAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIpAddress: Self = this.set("PrivateIpAddress", js.undefined)
    @scala.inline
    def setPrivateIpAddressesVarargs(value: PrivateIpAddressSpecification*): Self = this.set("PrivateIpAddresses", js.Array(value :_*))
    @scala.inline
    def setPrivateIpAddresses(value: PrivateIpAddressSpecificationList): Self = this.set("PrivateIpAddresses", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIpAddresses: Self = this.set("PrivateIpAddresses", js.undefined)
    @scala.inline
    def setSecondaryPrivateIpAddressCount(value: Integer): Self = this.set("SecondaryPrivateIpAddressCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryPrivateIpAddressCount: Self = this.set("SecondaryPrivateIpAddressCount", js.undefined)
    @scala.inline
    def setSubnetId(value: String): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
  }
  
}

