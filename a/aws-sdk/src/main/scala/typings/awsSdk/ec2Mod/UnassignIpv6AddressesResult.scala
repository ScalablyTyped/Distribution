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
}
object UnassignIpv6AddressesResult {
  
  @scala.inline
  def apply(): UnassignIpv6AddressesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UnassignIpv6AddressesResult]
  }
  
  @scala.inline
  implicit class UnassignIpv6AddressesResultMutableBuilder[Self <: UnassignIpv6AddressesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
    
    @scala.inline
    def setUnassignedIpv6Addresses(value: Ipv6AddressList): Self = StObject.set(x, "UnassignedIpv6Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnassignedIpv6AddressesUndefined: Self = StObject.set(x, "UnassignedIpv6Addresses", js.undefined)
    
    @scala.inline
    def setUnassignedIpv6AddressesVarargs(value: String*): Self = StObject.set(x, "UnassignedIpv6Addresses", js.Array(value :_*))
  }
}
