package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLoadBalancerPolicyInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
  /**
    * The name of the policy.
    */
  var PolicyName: typings.awsSdk.elbMod.PolicyName = js.native
}

object DeleteLoadBalancerPolicyInput {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, PolicyName: PolicyName): DeleteLoadBalancerPolicyInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteLoadBalancerPolicyInput]
  }
}

