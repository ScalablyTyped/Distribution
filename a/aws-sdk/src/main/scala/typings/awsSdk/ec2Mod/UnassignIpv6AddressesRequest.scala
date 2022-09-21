package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnassignIpv6AddressesRequest extends StObject {
  
  /**
    * The IPv6 addresses to unassign from the network interface.
    */
  var Ipv6Addresses: js.UndefOr[Ipv6AddressList] = js.undefined
  
  /**
    * One or more IPv6 prefixes to unassign from the network interface.
    */
  var Ipv6Prefixes: js.UndefOr[IpPrefixList] = js.undefined
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typings.awsSdk.ec2Mod.NetworkInterfaceId
}
object UnassignIpv6AddressesRequest {
  
  inline def apply(NetworkInterfaceId: NetworkInterfaceId): UnassignIpv6AddressesRequest = {
    val __obj = js.Dynamic.literal(NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnassignIpv6AddressesRequest]
  }
  
  extension [Self <: UnassignIpv6AddressesRequest](x: Self) {
    
    inline def setIpv6Addresses(value: Ipv6AddressList): Self = StObject.set(x, "Ipv6Addresses", value.asInstanceOf[js.Any])
    
    inline def setIpv6AddressesUndefined: Self = StObject.set(x, "Ipv6Addresses", js.undefined)
    
    inline def setIpv6AddressesVarargs(value: String*): Self = StObject.set(x, "Ipv6Addresses", js.Array(value*))
    
    inline def setIpv6Prefixes(value: IpPrefixList): Self = StObject.set(x, "Ipv6Prefixes", value.asInstanceOf[js.Any])
    
    inline def setIpv6PrefixesUndefined: Self = StObject.set(x, "Ipv6Prefixes", js.undefined)
    
    inline def setIpv6PrefixesVarargs(value: String*): Self = StObject.set(x, "Ipv6Prefixes", js.Array(value*))
    
    inline def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
  }
}
