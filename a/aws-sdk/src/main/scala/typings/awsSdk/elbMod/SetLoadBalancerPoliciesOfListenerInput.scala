package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetLoadBalancerPoliciesOfListenerInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
  /**
    * The external port of the load balancer.
    */
  var LoadBalancerPort: AccessPointPort = js.native
  /**
    * The names of the policies. This list must include all policies to be enabled. If you omit a policy that is currently enabled, it is disabled. If the list is empty, all current policies are disabled.
    */
  var PolicyNames: typings.awsSdk.elbMod.PolicyNames = js.native
}

object SetLoadBalancerPoliciesOfListenerInput {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, LoadBalancerPort: AccessPointPort, PolicyNames: PolicyNames): SetLoadBalancerPoliciesOfListenerInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], LoadBalancerPort = LoadBalancerPort.asInstanceOf[js.Any], PolicyNames = PolicyNames.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SetLoadBalancerPoliciesOfListenerInput]
  }
}

