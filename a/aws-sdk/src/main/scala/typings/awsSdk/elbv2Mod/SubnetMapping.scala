package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SubnetMapping extends StObject {
  
  /**
    * [Network Load Balancers] The allocation ID of the Elastic IP address for an internet-facing load balancer.
    */
  var AllocationId: js.UndefOr[typings.awsSdk.elbv2Mod.AllocationId] = js.native
  
  /**
    * [Network Load Balancers] The IPv6 address.
    */
  var IPv6Address: js.UndefOr[typings.awsSdk.elbv2Mod.IPv6Address] = js.native
  
  /**
    * [Network Load Balancers] The private IPv4 address for an internal load balancer.
    */
  var PrivateIPv4Address: js.UndefOr[typings.awsSdk.elbv2Mod.PrivateIPv4Address] = js.native
  
  /**
    * The ID of the subnet.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.elbv2Mod.SubnetId] = js.native
}
object SubnetMapping {
  
  @scala.inline
  def apply(): SubnetMapping = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubnetMapping]
  }
  
  @scala.inline
  implicit class SubnetMappingMutableBuilder[Self <: SubnetMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAllocationId(value: AllocationId): Self = StObject.set(x, "AllocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAllocationIdUndefined: Self = StObject.set(x, "AllocationId", js.undefined)
    
    @scala.inline
    def setIPv6Address(value: IPv6Address): Self = StObject.set(x, "IPv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPv6AddressUndefined: Self = StObject.set(x, "IPv6Address", js.undefined)
    
    @scala.inline
    def setPrivateIPv4Address(value: PrivateIPv4Address): Self = StObject.set(x, "PrivateIPv4Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrivateIPv4AddressUndefined: Self = StObject.set(x, "PrivateIPv4Address", js.undefined)
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
  }
}
