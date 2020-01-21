package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLoadBalancerAttributesOutput extends js.Object {
  /**
    * Information about the load balancer attributes.
    */
  var LoadBalancerAttributes: js.UndefOr[typings.awsSdk.elbMod.LoadBalancerAttributes] = js.native
}

object DescribeLoadBalancerAttributesOutput {
  @scala.inline
  def apply(LoadBalancerAttributes: LoadBalancerAttributes = null): DescribeLoadBalancerAttributesOutput = {
    val __obj = js.Dynamic.literal()
    if (LoadBalancerAttributes != null) __obj.updateDynamic("LoadBalancerAttributes")(LoadBalancerAttributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoadBalancerAttributesOutput]
  }
}

