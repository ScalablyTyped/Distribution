package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateNetworkInterfaceRequest extends js.Object {
  
  /**
    * A description for the network interface.
    */
  var Description: js.UndefOr[String] = js.native
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  
  /**
    * The IDs of one or more security groups.
    */
  var Groups: js.UndefOr[SecurityGroupIdStringList] = js.native
  
  /**
    * Indicates the type of network interface. To create an Elastic Fabric Adapter (EFA), specify efa. For more information, see  Elastic Fabric Adapter in the Amazon Elastic Compute Cloud User Guide.
    */
  var InterfaceType: js.UndefOr[NetworkInterfaceCreationType] = js.native
  
  /**
    * The number of IPv6 addresses to assign to a network interface. Amazon EC2 automatically selects the IPv6 addresses from the subnet range. You can't use this option if specifying specific IPv6 addresses. If your subnet has the AssignIpv6AddressOnCreation attribute set to true, you can specify 0 to override this setting.
    */
  var Ipv6AddressCount: js.UndefOr[Integer] = js.native
  
  /**
    * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. You can't use this option if you're specifying a number of IPv6 addresses.
    */
  var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList] = js.native
  
  /**
    * The primary private IPv4 address of the network interface. If you don't specify an IPv4 address, Amazon EC2 selects one for you from the subnet's IPv4 CIDR range. If you specify an IP address, you cannot indicate any IP addresses specified in privateIpAddresses as primary (only one IP address can be designated as primary).
    */
  var PrivateIpAddress: js.UndefOr[String] = js.native
  
  /**
    * One or more private IPv4 addresses.
    */
  var PrivateIpAddresses: js.UndefOr[PrivateIpAddressSpecificationList] = js.native
  
  /**
    * The number of secondary private IPv4 addresses to assign to a network interface. When you specify a number of secondary IPv4 addresses, Amazon EC2 selects these IP addresses within the subnet's IPv4 CIDR range. You can't specify this option and specify more than one private IP address using privateIpAddresses. The number of IP addresses you can assign to a network interface varies by instance type. For more information, see IP Addresses Per ENI Per Instance Type in the Amazon Virtual Private Cloud User Guide.
    */
  var SecondaryPrivateIpAddressCount: js.UndefOr[Integer] = js.native
  
  /**
    * The ID of the subnet to associate with the network interface.
    */
  var SubnetId: typings.awsSdk.ec2Mod.SubnetId = js.native
  
  /**
    * The tags to apply to the new network interface.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.native
}
object CreateNetworkInterfaceRequest {
  
  @scala.inline
  def apply(SubnetId: SubnetId): CreateNetworkInterfaceRequest = {
    val __obj = js.Dynamic.literal(SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkInterfaceRequest]
  }
  
  @scala.inline
  implicit class CreateNetworkInterfaceRequestOps[Self <: CreateNetworkInterfaceRequest] (val x: Self) extends AnyVal {
    
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
    def setSubnetId(value: SubnetId): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: String): Self = this.set("Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = this.set("DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDryRun: Self = this.set("DryRun", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: SecurityGroupId*): Self = this.set("Groups", js.Array(value :_*))
    
    @scala.inline
    def setGroups(value: SecurityGroupIdStringList): Self = this.set("Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGroups: Self = this.set("Groups", js.undefined)
    
    @scala.inline
    def setInterfaceType(value: NetworkInterfaceCreationType): Self = this.set("InterfaceType", value.asInstanceOf[js.Any])
    
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
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = this.set("TagSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = this.set("TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTagSpecifications: Self = this.set("TagSpecifications", js.undefined)
  }
}
