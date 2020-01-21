package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetachLoadBalancerFromSubnetsOutput extends js.Object {
  /**
    * The IDs of the remaining subnets for the load balancer.
    */
  var Subnets: js.UndefOr[typings.awsSdk.elbMod.Subnets] = js.native
}

object DetachLoadBalancerFromSubnetsOutput {
  @scala.inline
  def apply(Subnets: Subnets = null): DetachLoadBalancerFromSubnetsOutput = {
    val __obj = js.Dynamic.literal()
    if (Subnets != null) __obj.updateDynamic("Subnets")(Subnets.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetachLoadBalancerFromSubnetsOutput]
  }
}

