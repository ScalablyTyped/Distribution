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
  @scala.inline
  implicit class SetLoadBalancerPoliciesOfListenerInputOps[Self <: SetLoadBalancerPoliciesOfListenerInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLoadBalancerName(value: AccessPointName): Self = this.set("LoadBalancerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadBalancerPort(value: AccessPointPort): Self = this.set("LoadBalancerPort", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicyNamesVarargs(value: PolicyName*): Self = this.set("PolicyNames", js.Array(value :_*))
    @scala.inline
    def setPolicyNames(value: PolicyNames): Self = this.set("PolicyNames", value.asInstanceOf[js.Any])
  }
  
}

