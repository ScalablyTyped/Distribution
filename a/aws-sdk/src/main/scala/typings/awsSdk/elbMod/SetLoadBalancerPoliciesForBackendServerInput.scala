package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SetLoadBalancerPoliciesForBackendServerInput extends js.Object {
  /**
    * The port number associated with the EC2 instance.
    */
  var InstancePort: EndPointPort = js.native
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
  /**
    * The names of the policies. If the list is empty, then all current polices are removed from the EC2 instance.
    */
  var PolicyNames: typings.awsSdk.elbMod.PolicyNames = js.native
}

object SetLoadBalancerPoliciesForBackendServerInput {
  @scala.inline
  def apply(InstancePort: EndPointPort, LoadBalancerName: AccessPointName, PolicyNames: PolicyNames): SetLoadBalancerPoliciesForBackendServerInput = {
    val __obj = js.Dynamic.literal(InstancePort = InstancePort.asInstanceOf[js.Any], LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], PolicyNames = PolicyNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetLoadBalancerPoliciesForBackendServerInput]
  }
  @scala.inline
  implicit class SetLoadBalancerPoliciesForBackendServerInputOps[Self <: SetLoadBalancerPoliciesForBackendServerInput] (val x: Self) extends AnyVal {
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
    def setInstancePort(value: EndPointPort): Self = this.set("InstancePort", value.asInstanceOf[js.Any])
    @scala.inline
    def setLoadBalancerName(value: AccessPointName): Self = this.set("LoadBalancerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicyNamesVarargs(value: PolicyName*): Self = this.set("PolicyNames", js.Array(value :_*))
    @scala.inline
    def setPolicyNames(value: PolicyNames): Self = this.set("PolicyNames", value.asInstanceOf[js.Any])
  }
  
}

