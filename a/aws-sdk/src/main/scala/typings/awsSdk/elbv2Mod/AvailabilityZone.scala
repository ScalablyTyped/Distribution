package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AvailabilityZone extends StObject {
  
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
  implicit class AvailabilityZoneMutableBuilder[Self <: AvailabilityZone] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLoadBalancerAddresses(value: LoadBalancerAddresses): Self = StObject.set(x, "LoadBalancerAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadBalancerAddressesUndefined: Self = StObject.set(x, "LoadBalancerAddresses", js.undefined)
    
    @scala.inline
    def setLoadBalancerAddressesVarargs(value: LoadBalancerAddress*): Self = StObject.set(x, "LoadBalancerAddresses", js.Array(value :_*))
    
    @scala.inline
    def setOutpostId(value: OutpostId): Self = StObject.set(x, "OutpostId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutpostIdUndefined: Self = StObject.set(x, "OutpostId", js.undefined)
    
    @scala.inline
    def setSubnetId(value: SubnetId): Self = StObject.set(x, "SubnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "SubnetId", js.undefined)
    
    @scala.inline
    def setZoneName(value: ZoneName): Self = StObject.set(x, "ZoneName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZoneNameUndefined: Self = StObject.set(x, "ZoneName", js.undefined)
  }
}
