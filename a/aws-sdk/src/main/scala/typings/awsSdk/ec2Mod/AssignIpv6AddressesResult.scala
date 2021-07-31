package typings.awsSdk.ec2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssignIpv6AddressesResult extends StObject {
  
  /**
    * The IPv6 addresses assigned to the network interface.
    */
  var AssignedIpv6Addresses: js.UndefOr[Ipv6AddressList] = js.undefined
  
  /**
    * The ID of the network interface.
    */
  var NetworkInterfaceId: js.UndefOr[String] = js.undefined
}
object AssignIpv6AddressesResult {
  
  @scala.inline
  def apply(): AssignIpv6AddressesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssignIpv6AddressesResult]
  }
  
  @scala.inline
  implicit class AssignIpv6AddressesResultMutableBuilder[Self <: AssignIpv6AddressesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAssignedIpv6Addresses(value: Ipv6AddressList): Self = StObject.set(x, "AssignedIpv6Addresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssignedIpv6AddressesUndefined: Self = StObject.set(x, "AssignedIpv6Addresses", js.undefined)
    
    @scala.inline
    def setAssignedIpv6AddressesVarargs(value: String*): Self = StObject.set(x, "AssignedIpv6Addresses", js.Array(value :_*))
    
    @scala.inline
    def setNetworkInterfaceId(value: String): Self = StObject.set(x, "NetworkInterfaceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNetworkInterfaceIdUndefined: Self = StObject.set(x, "NetworkInterfaceId", js.undefined)
  }
}
