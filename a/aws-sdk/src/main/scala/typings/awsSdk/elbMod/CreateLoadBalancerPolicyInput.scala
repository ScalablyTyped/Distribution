package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateLoadBalancerPolicyInput extends js.Object {
  /**
    * The name of the load balancer.
    */
  var LoadBalancerName: AccessPointName = js.native
  /**
    * The policy attributes.
    */
  var PolicyAttributes: js.UndefOr[typings.awsSdk.elbMod.PolicyAttributes] = js.native
  /**
    * The name of the load balancer policy to be created. This name must be unique within the set of policies for this load balancer.
    */
  var PolicyName: typings.awsSdk.elbMod.PolicyName = js.native
  /**
    * The name of the base policy type. To get the list of policy types, use DescribeLoadBalancerPolicyTypes.
    */
  var PolicyTypeName: typings.awsSdk.elbMod.PolicyTypeName = js.native
}

object CreateLoadBalancerPolicyInput {
  @scala.inline
  def apply(LoadBalancerName: AccessPointName, PolicyName: PolicyName, PolicyTypeName: PolicyTypeName): CreateLoadBalancerPolicyInput = {
    val __obj = js.Dynamic.literal(LoadBalancerName = LoadBalancerName.asInstanceOf[js.Any], PolicyName = PolicyName.asInstanceOf[js.Any], PolicyTypeName = PolicyTypeName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateLoadBalancerPolicyInput]
  }
  @scala.inline
  implicit class CreateLoadBalancerPolicyInputOps[Self <: CreateLoadBalancerPolicyInput] (val x: Self) extends AnyVal {
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
    def setPolicyName(value: PolicyName): Self = this.set("PolicyName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicyTypeName(value: PolicyTypeName): Self = this.set("PolicyTypeName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPolicyAttributesVarargs(value: PolicyAttribute*): Self = this.set("PolicyAttributes", js.Array(value :_*))
    @scala.inline
    def setPolicyAttributes(value: PolicyAttributes): Self = this.set("PolicyAttributes", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyAttributes: Self = this.set("PolicyAttributes", js.undefined)
  }
  
}

