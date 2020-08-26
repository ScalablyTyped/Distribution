package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLoadBalancerPoliciesOutput extends js.Object {
  /**
    * Information about the policies.
    */
  var PolicyDescriptions: js.UndefOr[typings.awsSdk.elbMod.PolicyDescriptions] = js.native
}

object DescribeLoadBalancerPoliciesOutput {
  @scala.inline
  def apply(): DescribeLoadBalancerPoliciesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancerPoliciesOutput]
  }
  @scala.inline
  implicit class DescribeLoadBalancerPoliciesOutputOps[Self <: DescribeLoadBalancerPoliciesOutput] (val x: Self) extends AnyVal {
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
    def setPolicyDescriptionsVarargs(value: PolicyDescription*): Self = this.set("PolicyDescriptions", js.Array(value :_*))
    @scala.inline
    def setPolicyDescriptions(value: PolicyDescriptions): Self = this.set("PolicyDescriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyDescriptions: Self = this.set("PolicyDescriptions", js.undefined)
  }
  
}

