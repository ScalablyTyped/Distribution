package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UnassignIpv6AddressesRequest extends StObject {
  
  /**
    * The IPv6 addresses to unassign from the network interface.
    */
  var Ipv6Addresses: Ipv6AddressList
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: typings.awsSdk.ec2Mod.NetworkInterfaceId
}
object UnassignIpv6AddressesRequest {
  
  @scala.inline
  def apply(Ipv6Addresses: Ipv6AddressList, NetworkInterfaceId: NetworkInterfaceId): UnassignIpv6AddressesRequest = {
    val __obj = js.Dynamic.literal(Ipv6Addresses = Ipv6Addresses.asInstanceOf[js.Any], NetworkInterfaceId = NetworkInterfaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnassignIpv6AddressesRequest]
  }
  
  @scala.inline
  implicit class UnassignIpv6AddressesRequestMutableBuilder[Self <: UnassignIpv6AddressesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpv6Addresses(value: Ipv6AddressList): Self = StObject.set(x, "Ipv6Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpv6AddressesVarargs(value: String*): Self = StObject.set(x, "Ipv6Addresses", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaceId(value: NetworkInterfaceId): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
  }
}
