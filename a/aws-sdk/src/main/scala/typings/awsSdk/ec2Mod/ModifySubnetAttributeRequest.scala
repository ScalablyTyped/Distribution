package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ModifySubnetAttributeRequest extends StObject {
  
  /**
    * Specify true to indicate that network interfaces created in the specified subnet should be assigned an IPv6 address. This includes a network interface that's created when launching an instance into the subnet (the instance therefore receives an IPv6 address).  If you enable the IPv6 addressing feature for your subnet, your network interface or instance only receives an IPv6 address if it's created using version 2016-11-15 or later of the Amazon EC2 API.
    */
  var AssignIpv6AddressOnCreation: js.UndefOr[AttributeBooleanValue] = js.undefined
  
  /**
    * The customer-owned IPv4 address pool associated with the subnet. You must set this value when you specify true for MapCustomerOwnedIpOnLaunch.
    */
  var CustomerOwnedIpv4Pool: js.UndefOr[CoipPoolId] = js.undefined
  
  /**
    *  Specify true to indicate that local network interfaces at the current position should be disabled. 
    */
  var DisableLniAtDeviceIndex: js.UndefOr[AttributeBooleanValue] = js.undefined
  
  /**
    * Indicates whether DNS queries made to the Amazon-provided DNS Resolver in this subnet should return synthetic IPv6 addresses for IPv4-only destinations.
    */
  var EnableDns64: js.UndefOr[AttributeBooleanValue] = js.undefined
  
  /**
    *  Indicates the device position for local network interfaces in this subnet. For example, 1 indicates local network interfaces in this subnet are the secondary network interface (eth1). A local network interface cannot be the primary network interface (eth0). 
    */
  var EnableLniAtDeviceIndex: js.UndefOr[Integer] = js.undefined
  
  /**
    * Indicates whether to respond to DNS queries for instance hostnames with DNS AAAA records.
    */
  var EnableResourceNameDnsAAAARecordOnLaunch: js.UndefOr[AttributeBooleanValue] = js.undefined
  
  /**
    * Indicates whether to respond to DNS queries for instance hostnames with DNS A records.
    */
  var EnableResourceNameDnsARecordOnLaunch: js.UndefOr[AttributeBooleanValue] = js.undefined
  
  /**
    * Specify true to indicate that network interfaces attached to instances created in the specified subnet should be assigned a customer-owned IPv4 address. When this value is true, you must specify the customer-owned IP pool using CustomerOwnedIpv4Pool.
    */
  var MapCustomerOwnedIpOnLaunch: js.UndefOr[AttributeBooleanValue] = js.undefined
  
  /**
    * Specify true to indicate that network interfaces attached to instances created in the specified subnet should be assigned a public IPv4 address.
    */
  var MapPublicIpOnLaunch: js.UndefOr[AttributeBooleanValue] = js.undefined
  
  /**
    * The type of hostname to assign to instances in the subnet at launch. For IPv4-only and dual-stack (IPv4 and IPv6) subnets, an instance DNS name can be based on the instance IPv4 address (ip-name) or the instance ID (resource-name). For IPv6 only subnets, an instance DNS name must be based on the instance ID (resource-name).
    */
  var PrivateDnsHostnameTypeOnLaunch: js.UndefOr[HostnameType] = js.undefined
  
  /**
    * The ID of the subnet.
    */
  var SubnetId: typings.awsSdk.ec2Mod.SubnetId
}
object ModifySubnetAttributeRequest {
  
  inline def apply(SubnetId: SubnetId): ModifySubnetAttributeRequest = {
    val __obj = js.Dynamic.literal(SubnetId = SubnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifySubnetAttributeRequest]
  }
  
  extension [Self <: ModifySubnetAttributeRequest](x: Self) {
    
    inline def setAssignIpv6AddressOnCreation(value: AttributeBooleanValue): Self = StObject.set(x, "AssignIpv6AddressOnCreation", value.asInstanceOf[js.Any])
    
    inline def setAssignIpv6AddressOnCreationUndefined: Self = StObject.set(x, "AssignIpv6AddressOnCreation", js.undefined)
    
    inline def setCustomerOwnedIpv4Pool(value: CoipPoolId): Self = StObject.set(x, "CustomerOwnedIpv4Pool", value.asInstanceOf[js.Any])
    
    inline def setCustomerOwnedIpv4PoolUndefined: Self = StObject.set(x, "CustomerOwnedIpv4Pool", js.undefined)
    
    inline def setDisableLniAtDeviceIndex(value: AttributeBooleanValue): Self = StObject.set(x, "DisableLniAtDeviceIndex", value.asInstanceOf[js.Any])
    
    inline def setDisableLniAtDeviceIndexUndefined: Self = StObject.set(x, "DisableLniAtDeviceIndex", js.undefined)
    
    inline def setEnableDns64(value: AttributeBooleanValue): Self = StObject.set(x, "EnableDns64", value.asInstanceOf[js.Any])
    
    inline def setEnableDns64Undefined: Self = StObject.set(x, "EnableDns64", js.undefined)
    
    inline def setEnableLniAtDeviceIndex(value: Integer): Self = StObject.set(x, "EnableLniAtDeviceIndex", value.asInstanceOf[js.Any])
    
    inline def setEnableLniAtDeviceIndexUndefined: Self = StObject.set(x, "EnableLniAtDeviceIndex", js.undefined)
    
    inline def setEnableResourceNameDnsAAAARecordOnLaunch(value: AttributeBooleanValue): Self = StObject.set(x, "EnableResourceNameDnsAAAARecordOnLaunch", value.asInstanceOf[js.Any])
    
    inline def setEnableResourceNameDnsAAAARecordOnLaunchUndefined: Self = StObject.set(x, "EnableResourceNameDnsAAAARecordOnLaunch", js.undefined)
    
    inline def setEnableResourceNameDnsARecordOnLaunch(value: AttributeBooleanValue): Self = StObject.set(x, "EnableResourceNameDnsARecordOnLaunch", value.asInstanceOf[js.Any])
    
    inline def setEnableResourceNameDnsARecordOnLaunchUndefined: Self = StObject.set(x, "EnableResourceNameDnsARecordOnLaunch", js.undefined)
    
    inline def setMapCustomerOwnedIpOnLaunch(value: AttributeBooleanValue): Self = StObject.set(x, "MapCustomerOwnedIpOnLaunch", value.asInstanceOf[js.Any])
    
    inline def setMapCustomerOwnedIpOnLaunchUndefined: Self = StObject.set(x, "MapCustomerOwnedIpOnLaunch", js.undefined)
    
    inline def setMapPublicIpOnLaunch(value: AttributeBooleanValue): Self = StObject.set(x, "MapPublicIpOnLaunch", value.asInstanceOf[js.Any])
    
    inline def setMapPublicIpOnLaunchUndefined: Self = StObject.set(x, "MapPublicIpOnLaunch", js.undefined)
    
    inline def setPrivateDnsHostnameTypeOnLaunch(value: HostnameType): Self = StObject.set(x, "PrivateDnsHostnameTypeOnLaunch", value.asInstanceOf[js.Any])
    
    inline def setPrivateDnsHostnameTypeOnLaunchUndefined: Self = StObject.set(x, "PrivateDnsHostnameTypeOnLaunch", js.undefined)
    
    inline def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
  }
}
