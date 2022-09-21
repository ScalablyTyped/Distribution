package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignPrivateIpAddressesRequest extends StObject {
  
  /**
    * Indicates whether to allow an IP address that is already assigned to another network interface or instance to be reassigned to the specified network interface.
    */
  var AllowReassignment: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The number of IPv4 prefixes that Amazon Web Services automatically assigns to the network interface. You cannot use this option if you use the Ipv4 Prefixes option.
    */
  var Ipv4PrefixCount: js.UndefOr[Integer] = js.undefined
  
  /**
    * One or more IPv4 prefixes assigned to the network interface. You cannot use this option if you use the Ipv4PrefixCount option.
    */
  var Ipv4Prefixes: js.UndefOr[IpPrefixList] = js.undefined
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typings.awsSdk.ec2Mod.NetworkInterfaceId
  
  /**
    * One or more IP addresses to be assigned as a secondary private IP address to the network interface. You can't specify this parameter when also specifying a number of secondary IP addresses. If you don't specify an IP address, Amazon EC2 automatically selects an IP address within the subnet range.
    */
  var PrivateIpAddresses: js.UndefOr[PrivateIpAddressStringList] = js.undefined
  
  /**
    * The number of secondary IP addresses to assign to the network interface. You can't specify this parameter when also specifying private IP addresses.
    */
  var SecondaryPrivateIpAddressCount: js.UndefOr[Integer] = js.undefined
}
object AssignPrivateIpAddressesRequest {
  
  inline def apply(NetworkInterfaceId: NetworkInterfaceId): AssignPrivateIpAddressesRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssignPrivateIpAddressesRequest]
  }
  
  extension [Self <: AssignPrivateIpAddressesRequest](x: Self) {
    
    inline def setAllowReassignment(value: Boolean): Self = StObject.set(x, "AllowReassignment", value.asInstanceOf[js.Any])
    
    inline def setAllowReassignmentUndefined: Self = StObject.set(x, "AllowReassignment", js.undefined)
    
    inline def setIpv4PrefixCount(value: Integer): Self = StObject.set(x, "Ipv4PrefixCount", value.asInstanceOf[js.Any])
    
    inline def setIpv4PrefixCountUndefined: Self = StObject.set(x, "Ipv4PrefixCount", js.undefined)
    
    inline def setIpv4Prefixes(value: IpPrefixList): Self = StObject.set(x, "Ipv4Prefixes", value.asInstanceOf[js.Any])
    
    inline def setIpv4PrefixesUndefined: Self = StObject.set(x, "Ipv4Prefixes", js.undefined)
    
    inline def setIpv4PrefixesVarargs(value: String*): Self = StObject.set(x, "Ipv4Prefixes", js.Array(value*))
    
    inline def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddresses(value: PrivateIpAddressStringList): Self = StObject.set(x, "PrivateIpAddresses", value.asInstanceOf[js.Any])
    
    inline def setPrivateIpAddressesUndefined: Self = StObject.set(x, "PrivateIpAddresses", js.undefined)
    
    inline def setPrivateIpAddressesVarargs(value: String*): Self = StObject.set(x, "PrivateIpAddresses", js.Array(value*))
    
    inline def setSecondaryPrivateIpAddressCount(value: Integer): Self = StObject.set(x, "SecondaryPrivateIpAddressCount", value.asInstanceOf[js.Any])
    
    inline def setSecondaryPrivateIpAddressCountUndefined: Self = StObject.set(x, "SecondaryPrivateIpAddressCount", js.undefined)
  }
}
