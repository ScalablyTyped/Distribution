package typings.awsSdk.lightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLoadBalancerResult extends js.Object {
  /**
    * An object containing information about your load balancer.
    */
  var loadBalancer: js.UndefOr[LoadBalancer] = js.native
}

object GetLoadBalancerResult {
  @scala.inline
  def apply(loadBalancer: LoadBalancer = null): GetLoadBalancerResult = {
    val __obj = js.Dynamic.literal()
    if (loadBalancer != null) __obj.updateDynamic("loadBalancer")(loadBalancer.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLoadBalancerResult]
  }
}

