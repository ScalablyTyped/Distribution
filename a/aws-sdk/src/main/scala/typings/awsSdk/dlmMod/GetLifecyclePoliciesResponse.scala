package typings.awsSdk.dlmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetLifecyclePoliciesResponse extends js.Object {
  /**
    * Summary information about the lifecycle policies.
    */
  var Policies: js.UndefOr[LifecyclePolicySummaryList] = js.native
}

object GetLifecyclePoliciesResponse {
  @scala.inline
  def apply(Policies: LifecyclePolicySummaryList = null): GetLifecyclePoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (Policies != null) __obj.updateDynamic("Policies")(Policies.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetLifecyclePoliciesResponse]
  }
}

