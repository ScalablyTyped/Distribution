package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoadBalancerRequest extends js.Object {
  /**
    * The name of the load balancer.
    */
  var loadBalancerName: ResourceName = js.native
}

object GetLoadBalancerRequest {
  @scala.inline
  def apply(loadBalancerName: ResourceName): GetLoadBalancerRequest = {
    val __obj = js.Dynamic.literal(loadBalancerName = loadBalancerName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetLoadBalancerRequest]
  }
}

