package typings.awsSdk.organizationsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePolicyResponse extends js.Object {
  /**
    * A structure that contains details about the specified policy.
    */
  var Policy: js.UndefOr[typings.awsSdk.organizationsMod.Policy] = js.native
}

object DescribePolicyResponse {
  @scala.inline
  def apply(Policy: Policy = null): DescribePolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (Policy != null) __obj.updateDynamic("Policy")(Policy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePolicyResponse]
  }
}

