package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLoadBalancerOutput extends js.Object {
  /**
    * Information about the load balancer.
    */
  var LoadBalancers: js.UndefOr[typings.awsSdk.elbv2Mod.LoadBalancers] = js.native
}

object CreateLoadBalancerOutput {
  @scala.inline
  def apply(LoadBalancers: LoadBalancers = null): CreateLoadBalancerOutput = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancers != null) __obj.updateDynamic("LoadBalancers")(LoadBalancers.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoadBalancerOutput]
  }
}

