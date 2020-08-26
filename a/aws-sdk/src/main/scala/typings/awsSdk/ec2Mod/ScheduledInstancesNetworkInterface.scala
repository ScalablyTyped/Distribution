package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduledInstancesNetworkInterface extends js.Object {
  /**
    * Indicates whether to assign a public IPv4 address to instances launched in a VPC. The public IPv4 address can only be assigned to a network interface for eth0, and can only be assigned to a new network interface, not an existing one. You cannot specify more than one network interface in the request. If launching into a default subnet, the default value is true.
    */
  var AssociatePublicIpAddress: js.UndefOr[Boolean] = js.native
  /**
    * Indicates whether to delete the interface when the instance is terminated.
    */
  var DeleteOnTermination: js.UndefOr[Boolean] = js.native
  /**
    * The description.
    */
  var Description: js.UndefOr[String] = js.native
  /**
    * The index of the device for the network interface attachment.
    */
  var DeviceIndex: js.UndefOr[Integer] = js.native
  /**
    * The IDs of the security groups.
    */
  var Groups: js.UndefOr[ScheduledInstancesSecurityGroupIdSet] = js.native
  /**
    * The number of IPv6 addresses to assign to the network interface. The IPv6 addresses are automatically selected from the subnet range.
    */
  var Ipv6AddressCount: js.UndefOr[Integer] = js.native
  /**
    * The specific IPv6 addresses from the subnet range.
    */
  var Ipv6Addresses: js.UndefOr[ScheduledInstancesIpv6AddressList] = js.native
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[typings.awsSdk.ec2Mod.NetworkInterfaceId] = js.native
  /**
    * The IPv4 address of the network interface within the subnet.
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
  /**
    * The private IPv4 addresses.
    */
  var PrivateIpAddressConfigs: js.UndefOr[PrivateIpAddressConfigSet] = js.native
  /**
    * The number of secondary private IPv4 addresses.
    */
  var SecondaryPrivateIpAddressCount: js.UndefOr[Integer] = js.native
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.ec2Mod.SubnetId] = js.native
}

object ScheduledInstancesNetworkInterface {
  @scala.inline
  def apply(): ScheduledInstancesNetworkInterface = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledInstancesNetworkInterface]
  }
  @scala.inline
  implicit class ScheduledInstancesNetworkInterfaceOps[Self <: ScheduledInstancesNetworkInterface] (val x: Self) extends AnyVal {
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
    def setGroups(value: ScheduledInstancesSecurityGroupIdSet): Self = this.set("Groups", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
    @scala.inline
    def setIpv6AddressCount(value: Integer): Self = this.set("Ipv6AddressCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIpv6AddressCount: Self = this.set("Ipv6AddressCount", js.undefined)
    @scala.inline
    def setIpv6AddressesVarargs(value: ScheduledInstancesIpv6Address*): Self = this.set("Ipv6Addresses", js.Array(value :_*))
    @scala.inline
    def setIpv6Addresses(value: ScheduledInstancesIpv6AddressList): Self = this.set("Ipv6Addresses", value.asInstanceOf[js.Any])
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
    def setPrivateIpAddressConfigsVarargs(value: ScheduledInstancesPrivateIpAddressConfig*): Self = this.set("PrivateIpAddressConfigs", js.Array(value :_*))
    @scala.inline
    def setPrivateIpAddressConfigs(value: PrivateIpAddressConfigSet): Self = this.set("PrivateIpAddressConfigs", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrivateIpAddressConfigs: Self = this.set("PrivateIpAddressConfigs", js.undefined)
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

