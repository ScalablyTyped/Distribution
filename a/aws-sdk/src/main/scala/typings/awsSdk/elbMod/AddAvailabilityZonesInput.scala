package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddAvailabilityZonesInput extends js.Object {
  /**
    * The Availability Zones. These must be in the same region as the load balancer.
    */
  var AvailabilityZones: typings.awsSdk.elbMod.AvailabilityZones = js.native
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
}

object AddAvailabilityZonesInput {
  @scala.inline
  def apply(AvailabilityZones: AvailabilityZones, LoadBalancerName: AccessPointName): AddAvailabilityZonesInput = {
    val __obj = js.Dynamic.literal(AvailabilityZones = AvailabilityZones.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AddAvailabilityZonesInput]
  }
}

