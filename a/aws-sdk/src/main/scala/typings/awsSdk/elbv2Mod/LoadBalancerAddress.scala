package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancerAddress extends js.Object {
  
  /**
    * [Network Load Balancers] The allocation ID of the Elastic IP address for an internal-facing load balancer.
    */
  var AllocationId: js.UndefOr[typings.awsSdk.elbv2Mod.AllocationId] = js.native
  
  /**
    * [Network Load Balancers] The IPv6 address.
    */
  var IPv6Address: js.UndefOr[typings.awsSdk.elbv2Mod.IPv6Address] = js.native
  
  /**
    * The static IP address.
    */
  var IpAddress: js.UndefOr[typings.awsSdk.elbv2Mod.IpAddress] = js.native
  
  /**
    * [Network Load Balancers] The private IPv4 address for an internal load balancer.
    */
  var PrivateIPv4Address: js.UndefOr[typings.awsSdk.elbv2Mod.PrivateIPv4Address] = js.native
}
object LoadBalancerAddress {
  
  @scala.inline
  def apply(): LoadBalancerAddress = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadBalancerAddress]
  }
  
  @scala.inline
  implicit class LoadBalancerAddressOps[Self <: LoadBalancerAddress] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAllocationId(value: AllocationId): Self = this.set("AllocationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllocationId: Self = this.set("AllocationId", js.undefined)
    
    @scala.inline
    def setIPv6Address(value: IPv6Address): Self = this.set("IPv6Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIPv6Address: Self = this.set("IPv6Address", js.undefined)
    
    @scala.inline
    def setIpAddress(value: IpAddress): Self = this.set("IpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIpAddress: Self = this.set("IpAddress", js.undefined)
    
    @scala.inline
    def setPrivateIPv4Address(value: PrivateIPv4Address): Self = this.set("PrivateIPv4Address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrivateIPv4Address: Self = this.set("PrivateIPv4Address", js.undefined)
  }
}
