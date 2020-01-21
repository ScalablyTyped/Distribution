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
  def apply(PolicyTypeDescriptions: PolicyTypeDescriptions = null): DescribeLoadBalancerPolicyTypesOutput = {
    val __obj = js.Dynamic.literal()
    if (PolicyTypeDescriptions != null) __obj.updateDynamic("PolicyTypeDescriptions")(PolicyTypeDescriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoadBalancerPolicyTypesOutput]
  }
}

