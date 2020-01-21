package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachLoadBalancerToSubnetsInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
  /**
    * The IDs of the subnets to add. You can add only one subnet per Availability Zone.
    */
  var Subnets: typings.awsSdk.elbMod.Subnets = js.native
}

object AttachLoadBalancerToSubnetsInput {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, Subnets: Subnets): AttachLoadBalancerToSubnetsInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], Subnets = Subnets.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AttachLoadBalancerToSubnetsInput]
  }
}

