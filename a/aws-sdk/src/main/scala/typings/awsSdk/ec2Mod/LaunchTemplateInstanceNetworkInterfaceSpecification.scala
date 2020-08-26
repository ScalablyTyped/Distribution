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
  def apply(): LaunchTemplateInstanceNetworkInterfaceSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateInstanceNetworkInterfaceSpecification]
  }
  @scala.inline
  implicit class LaunchTemplateInstanceNetworkInterfaceSpecificationOps[Self <: LaunchTemplateInstanceNetworkInterfaceSpecification] (val x: Self) extends AnyVal {
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
    def setGroupsVarargs(value: String*): Self = this.set("Groups", js.Array(value :_*))
    @scala.inline
    def setGroups(value: GroupIdStringList): Self = this.set("Groups", value.asInstanceOf[js.Any])
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
    def setNetworkInterfaceId(value: NetworkInterfaceId): Self = this.set("NetworkInterfaceId", value.asInstanceOf[js.Any])
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
    def setSubnetId(value: SubnetId): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
  }
  
}

