package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CrossZoneLoadBalancing extends js.Object {
  /**
    * Specifies whether cross-zone load balancing is enabled for the load balancer.
    */
  var Enabled: CrossZoneLoadBalancingEnabled = js.native
}

object CrossZoneLoadBalancing {
  @scala.inline
  def apply(Enabled: CrossZoneLoadBalancingEnabled): CrossZoneLoadBalancing = {
    val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[CrossZoneLoadBalancing]
  }
}

