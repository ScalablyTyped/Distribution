package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvailabilityZone extends js.Object {
  
  /**
    * [Network Load Balancers] If you need static IP addresses for your load balancer, you can specify one Elastic IP address per Availability Zone when you create an internal-facing load balancer. For internal load balancers, you can specify a private IP address from the IPv4 range of the subnet.
    */
  var LoadBalancerAddresses: js.UndefOr[typings.awsSdk.elbv2Mod.LoadBalancerAddresses] = js.native
  
  /**
    * [Application Load Balancers on Outposts] The ID of the Outpost.
    */
  var OutpostId: js.UndefOr[typings.awsSdk.elbv2Mod.OutpostId] = js.native
  
  /**
    * The ID of the subnet. You can specify one subnet per Availability Zone.
    */
  var SubnetId: js.UndefOr[typings.awsSdk.elbv2Mod.SubnetId] = js.native
  
  /**
    * The name of the Availability Zone.
    */
  var ZoneName: js.UndefOr[typings.awsSdk.elbv2Mod.ZoneName] = js.native
}
object AvailabilityZone {
  
  @scala.inline
  def apply(): AvailabilityZone = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AvailabilityZone]
  }
  
  @scala.inline
  implicit class AvailabilityZoneOps[Self <: AvailabilityZone] (val x: Self) extends AnyVal {
    
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
    def setLoadBalancerAddressesVarargs(value: LoadBalancerAddress*): Self = this.set("LoadBalancerAddresses", js.Array(value :_*))
    
    @scala.inline
    def setLoadBalancerAddresses(value: LoadBalancerAddresses): Self = this.set("LoadBalancerAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoadBalancerAddresses: Self = this.set("LoadBalancerAddresses", js.undefined)
    
    @scala.inline
    def setOutpostId(value: OutpostId): Self = this.set("OutpostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOutpostId: Self = this.set("OutpostId", js.undefined)
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = this.set("SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubnetId: Self = this.set("SubnetId", js.undefined)
    
    @scala.inline
    def setZoneName(value: ZoneName): Self = this.set("ZoneName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteZoneName: Self = this.set("ZoneName", js.undefined)
  }
}
