package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateNetworkInterfaceRequest extends StObject {
  
  /**
    * A description for the network interface.
    */
  var Description: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The IDs of one or more security groups.
    */
  var Groups: js.UndefOr[SecurityGroupIdStringList] = js.undefined
  
  /**
    * Indicates the type of network interface. To create an Elastic Fabric Adapter (EFA), specify efa. For more information, see  Elastic Fabric Adapter in the Amazon Elastic Compute Cloud User Guide.
    */
  var InterfaceType: js.UndefOr[NetworkInterfaceCreationType] = js.undefined
  
  /**
    * The number of IPv6 addresses to assign to a network interface. Amazon EC2 automatically selects the IPv6 addresses from the subnet range. You can't use this option if specifying specific IPv6 addresses. If your subnet has the AssignIpv6AddressOnCreation attribute set to true, you can specify 0 to override this setting.
    */
  var Ipv6AddressCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * One or more specific IPv6 addresses from the IPv6 CIDR block range of your subnet. You can't use this option if you're specifying a number of IPv6 addresses.
    */
  var Ipv6Addresses: js.UndefOr[InstanceIpv6AddressList] = js.undefined
  
  /**
    * The primary private IPv4 address of the network interface. If you don't specify an IPv4 address, Amazon EC2 selects one for you from the subnet's IPv4 CIDR range. If you specify an IP address, you cannot indicate any IP addresses specified in privateIpAddresses as primary (only one IP address can be designated as primary).
    */
  var PrivateIpAddress: js.UndefOr[String] = js.undefined
  
  /**
    * One or more private IPv4 addresses.
    */
  var PrivateIpAddresses: js.UndefOr[PrivateIpAddressSpecificationList] = js.undefined
  
  /**
    * The number of secondary private IPv4 addresses to assign to a network interface. When you specify a number of secondary IPv4 addresses, Amazon EC2 selects these IP addresses within the subnet's IPv4 CIDR range. You can't specify this option and specify more than one private IP address using privateIpAddresses. The number of IP addresses you can assign to a network interface varies by instance type. For more information, see IP Addresses Per ENI Per Instance Type in the Amazon Virtual Private Cloud User Guide.
    */
  var SecondaryPrivateIpAddressCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * The ID of the subnet to associate with the network interface.
    */
  var SubnetId: typings.awsSdk.ec2Mod.SubnetId
  
  /**
    * The tags to apply to the new network interface.
    */
  var TagSpecifications: js.UndefOr[TagSpecificationList] = js.undefined
}
object CreateNetworkInterfaceRequest {
  
  @scala.inline
  def apply(SubnetId: SubnetId): CreateNetworkInterfaceRequest = {
    val __obj = js.Dynamic.literal(SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateNetworkInterfaceRequest]
  }
  
  @scala.inline
  implicit class CreateNetworkInterfaceRequestMutableBuilder[Self <: CreateNetworkInterfaceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    @scala.inline
    def setGroups(value: SecurityGroupIdStringList): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "Groups", js.Array(value :_*))
    
    @scala.inline
    def setInterfaceType(value: NetworkInterfaceCreationType): Self = StObject.set(x, "InterfaceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterfaceTypeUndefined: Self = StObject.set(x, "InterfaceType", js.undefined)
    
    @scala.inline
    def setIpv6AddressCount(value: Integer): Self = StObject.set(x, "Ipv6AddressCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6AddressCountUndefined: Self = StObject.set(x, "Ipv6AddressCount", js.undefined)
    
    @scala.inline
    def setIpv6Addresses(value: InstanceIpv6AddressList): Self = StObject.set(x, "Ipv6Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6AddressesUndefined: Self = StObject.set(x, "Ipv6Addresses", js.undefined)
    
    @scala.inline
    def setIpv6AddressesVarargs(value: InstanceIpv6Address*): Self = StObject.set(x, "Ipv6Addresses", js.Array(value :_*))
    
    @scala.inline
    def setPrivateIpAddress(value: String): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
    
    @scala.inline
    def setPrivateIpAddresses(value: PrivateIpAddressSpecificationList): Self = StObject.set(x, "PrivateIpAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddressesUndefined: Self = StObject.set(x, "PrivateIpAddresses", js.undefined)
    
    @scala.inline
    def setPrivateIpAddressesVarargs(value: PrivateIpAddressSpecification*): Self = StObject.set(x, "PrivateIpAddresses", js.Array(value :_*))
    
    @scala.inline
    def setSecondaryPrivateIpAddressCount(value: Integer): Self = StObject.set(x, "SecondaryPrivateIpAddressCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryPrivateIpAddressCountUndefined: Self = StObject.set(x, "SecondaryPrivateIpAddressCount", js.undefined)
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecifications(value: TagSpecificationList): Self = StObject.set(x, "TagSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagSpecificationsUndefined: Self = StObject.set(x, "TagSpecifications", js.undefined)
    
    @scala.inline
    def setTagSpecificationsVarargs(value: TagSpecification*): Self = StObject.set(x, "TagSpecifications", js.Array(value :_*))
  }
}
