package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoveAvailabilityZonesInput extends js.Object {
  /**
    * The Availability Zones.
    */
  var AvailabilityZones: typings.awsSdk.elbMod.AvailabilityZones = js.native
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
}

object RemoveAvailabilityZonesInput {
  @scala.inline
  def apply(AvailabilityZones: AvailabilityZones, LoadBalancerName: AccessPointName): RemoveAvailabilityZonesInput = {
    val __obj = js.Dynamic.literal(AvailabilityZones = AvailabilityZones.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RemoveAvailabilityZonesInput]
  }
}

