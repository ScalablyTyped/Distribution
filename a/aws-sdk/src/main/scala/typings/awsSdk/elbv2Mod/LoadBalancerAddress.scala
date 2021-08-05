package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LoadBalancerAddress extends StObject {
  
  /**
    * [Network Load Balancers] The allocation ID of the Elastic IP address for an internal-facing load balancer.
    */
  var AllocationId: js.UndefOr[typings.awsSdk.elbv2Mod.AllocationId] = js.undefined
  
  /**
    * [Network Load Balancers] The IPv6 address.
    */
  var IPv6Address: js.UndefOr[typings.awsSdk.elbv2Mod.IPv6Address] = js.undefined
  
  /**
    * The static IP address.
    */
  var IpAddress: js.UndefOr[typings.awsSdk.elbv2Mod.IpAddress] = js.undefined
  
  /**
    * [Network Load Balancers] The private IPv4 address for an internal load balancer.
    */
  var PrivateIPv4Address: js.UndefOr[typings.awsSdk.elbv2Mod.PrivateIPv4Address] = js.undefined
}
object LoadBalancerAddress {
  
  inline def apply(): LoadBalancerAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerAddress]
  }
  
  extension [Self <: LoadBalancerAddress](x: Self) {
    
    inline def setAllocationId(value: AllocationId): Self = StObject.set(x, "AllocationId", value.asInstanceOf[js.Any])
    
    inline def setAllocationIdUndefined: Self = StObject.set(x, "AllocationId", js.undefined)
    
    inline def setIPv6Address(value: IPv6Address): Self = StObject.set(x, "IPv6Address", value.asInstanceOf[js.Any])
    
    inline def setIPv6AddressUndefined: Self = StObject.set(x, "IPv6Address", js.undefined)
    
    inline def setIpAddress(value: IpAddress): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    inline def setPrivateIPv4Address(value: PrivateIPv4Address): Self = StObject.set(x, "PrivateIPv4Address", value.asInstanceOf[js.Any])
    
    inline def setPrivateIPv4AddressUndefined: Self = StObject.set(x, "PrivateIPv4Address", js.undefined)
  }
}
