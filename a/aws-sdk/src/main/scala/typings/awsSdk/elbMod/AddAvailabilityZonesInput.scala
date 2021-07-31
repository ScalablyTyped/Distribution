package typings.awsSdk.elbMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddAvailabilityZonesInput extends StObject {
  
  /**
    * The Availability Zones. These must be in the same region as the load balancer.
    */
  var AvailabilityZones: typings.awsSdk.elbMod.AvailabilityZones
  
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName
}
object AddAvailabilityZonesInput {
  
  @scala.inline
  def apply(AvailabilityZones: AvailabilityZones, LoadBalancerName: AccessPointName): AddAvailabilityZonesInput = {
    val __obj = js.Dynamic.literal(AvailabilityZones = AvailabilityZones.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddAvailabilityZonesInput]
  }
  
  @scala.inline
  implicit class AddAvailabilityZonesInputMutableBuilder[Self <: AddAvailabilityZonesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZones(value: AvailabilityZones): Self = StObject.set(x, "AvailabilityZones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZonesVarargs(value: AvailabilityZone*): Self = StObject.set(x, "AvailabilityZones", js.Array(value :_*))
    
    @scala.inline
    def setLoadBalancerName(value: AccessPointName): Self = StObject.set(x, "LoadBalancerName", value.asInstanceOf[js.Any])
  }
}
