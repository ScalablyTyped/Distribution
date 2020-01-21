package typings.awsSdk.elbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLoadBalancerPolicyTypesInput extends js.Object {
  /**
    * The names of the policy types. If no names are specified, describes all policy types defined by Elastic Load Balancing.
    */
  var PolicyTypeNames: js.UndefOr[typings.awsSdk.elbMod.PolicyTypeNames] = js.native
}

object DescribeLoadBalancerPolicyTypesInput {
  @scala.inline
  def apply(PolicyTypeNames: PolicyTypeNames = null): DescribeLoadBalancerPolicyTypesInput = {
    val __obj = js.Dynamic.literal()
    if (PolicyTypeNames != null) __obj.updateDynamic("PolicyTypeNames")(PolicyTypeNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLoadBalancerPolicyTypesInput]
  }
}

