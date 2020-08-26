package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLoadBalancerPolicyTypesOutput extends js.Object {
  /**
    * Information about the policy types.
    */
  var PolicyTypeDescriptions: js.UndefOr[typings.awsSdk.elbMod.PolicyTypeDescriptions] = js.native
}

object DescribeLoadBalancerPolicyTypesOutput {
  @scala.inline
  def apply(): DescribeLoadBalancerPolicyTypesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLoadBalancerPolicyTypesOutput]
  }
  @scala.inline
  implicit class DescribeLoadBalancerPolicyTypesOutputOps[Self <: DescribeLoadBalancerPolicyTypesOutput] (val x: Self) extends AnyVal {
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
    def setPolicyTypeDescriptionsVarargs(value: PolicyTypeDescription*): Self = this.set("PolicyTypeDescriptions", js.Array(value :_*))
    @scala.inline
    def setPolicyTypeDescriptions(value: PolicyTypeDescriptions): Self = this.set("PolicyTypeDescriptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicyTypeDescriptions: Self = this.set("PolicyTypeDescriptions", js.undefined)
  }
  
}

