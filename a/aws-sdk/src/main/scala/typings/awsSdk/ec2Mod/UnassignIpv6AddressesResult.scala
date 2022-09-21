package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnassignIpv6AddressesResult extends StObject {
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.undefined
  
  /**
    * The IPv6 addresses that have been unassigned from the network interface.
    */
  var UnassignedIpv6Addresses: js.UndefOr[Ipv6AddressList] = js.undefined
  
  /**
    * The IPv4 prefixes that have been unassigned from the network interface.
    */
  var UnassignedIpv6Prefixes: js.UndefOr[IpPrefixList] = js.undefined
}
object UnassignIpv6AddressesResult {
  
  inline def apply(): UnassignIpv6AddressesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnassignIpv6AddressesResult]
  }
  
  extension [Self <: UnassignIpv6AddressesResult](x: Self) {
    
    inline def setNetworkInterfaceId(value: String): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    inline def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    inline def setUnassignedIpv6Addresses(value: Ipv6AddressList): Self = StObject.set(x, "UnassignedIpv6Addresses", value.asInstanceOf[js.Any])
    
    inline def setUnassignedIpv6AddressesUndefined: Self = StObject.set(x, "UnassignedIpv6Addresses", js.undefined)
    
    inline def setUnassignedIpv6AddressesVarargs(value: String*): Self = StObject.set(x, "UnassignedIpv6Addresses", js.Array(value*))
    
    inline def setUnassignedIpv6Prefixes(value: IpPrefixList): Self = StObject.set(x, "UnassignedIpv6Prefixes", value.asInstanceOf[js.Any])
    
    inline def setUnassignedIpv6PrefixesUndefined: Self = StObject.set(x, "UnassignedIpv6Prefixes", js.undefined)
    
    inline def setUnassignedIpv6PrefixesVarargs(value: String*): Self = StObject.set(x, "UnassignedIpv6Prefixes", js.Array(value*))
  }
}
