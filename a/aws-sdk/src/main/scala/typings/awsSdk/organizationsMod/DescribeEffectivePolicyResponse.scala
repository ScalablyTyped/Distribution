package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeEffectivePolicyResponse extends js.Object {
  /**
    * The contents of the effective policy.
    */
  var EffectivePolicy: js.UndefOr[typings.awsSdk.organizationsMod.EffectivePolicy] = js.native
}

object DescribeEffectivePolicyResponse {
  @scala.inline
  def apply(EffectivePolicy: EffectivePolicy = null): DescribeEffectivePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (EffectivePolicy != null) __obj.updateDynamic("EffectivePolicy")(EffectivePolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeEffectivePolicyResponse]
  }
}

