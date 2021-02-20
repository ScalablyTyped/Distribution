package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledInstancesNetworkInterface extends StObject {
  
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
  implicit class ScheduledInstancesNetworkInterfaceMutableBuilder[Self <: ScheduledInstancesNetworkInterface] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssociatePublicIpAddress(value: Boolean): Self = StObject.set(x, "AssociatePublicIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociatePublicIpAddressUndefined: Self = StObject.set(x, "AssociatePublicIpAddress", js.undefined)
    
    @scala.inline
    def setDeleteOnTermination(value: Boolean): Self = StObject.set(x, "DeleteOnTermination", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeleteOnTerminationUndefined: Self = StObject.set(x, "DeleteOnTermination", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    @scala.inline
    def setDeviceIndex(value: Integer): Self = StObject.set(x, "DeviceIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceIndexUndefined: Self = StObject.set(x, "DeviceIndex", js.undefined)
    
    @scala.inline
    def setGroups(value: ScheduledInstancesSecurityGroupIdSet): Self = StObject.set(x, "Groups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroupsUndefined: Self = StObject.set(x, "Groups", js.undefined)
    
    @scala.inline
    def setGroupsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "Groups", js.Array(value :_*))
    
    @scala.inline
    def setIpv6AddressCount(value: Integer): Self = StObject.set(x, "Ipv6AddressCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6AddressCountUndefined: Self = StObject.set(x, "Ipv6AddressCount", js.undefined)
    
    @scala.inline
    def setIpv6Addresses(value: ScheduledInstancesIpv6AddressList): Self = StObject.set(x, "Ipv6Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6AddressesUndefined: Self = StObject.set(x, "Ipv6Addresses", js.undefined)
    
    @scala.inline
    def setIpv6AddressesVarargs(value: ScheduledInstancesIpv6Address*): Self = StObject.set(x, "Ipv6Addresses", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    @scala.inline
    def setPrivateIpAddress(value: String): Self = StObject.set(x, "PrivateIpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddressConfigs(value: PrivateIpAddressConfigSet): Self = StObject.set(x, "PrivateIpAddressConfigs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIpAddressConfigsUndefined: Self = StObject.set(x, "PrivateIpAddressConfigs", js.undefined)
    
    @scala.inline
    def setPrivateIpAddressConfigsVarargs(value: ScheduledInstancesPrivateIpAddressConfig*): Self = StObject.set(x, "PrivateIpAddressConfigs", js.Array(value :_*))
    
    @scala.inline
    def setPrivateIpAddressUndefined: Self = StObject.set(x, "PrivateIpAddress", js.undefined)
    
    @scala.inline
    def setSecondaryPrivateIpAddressCount(value: Integer): Self = StObject.set(x, "SecondaryPrivateIpAddressCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecondaryPrivateIpAddressCountUndefined: Self = StObject.set(x, "SecondaryPrivateIpAddressCount", js.undefined)
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
  }
}
