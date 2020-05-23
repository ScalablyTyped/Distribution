package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTargetsForPolicyRequest extends js.Object {
  /**
    * A marker used to get the next set of results.
    */
  var marker: js.UndefOr[Marker] = js.native
  /**
    * The maximum number of results to return at one time.
    */
  var pageSize: js.UndefOr[PageSize] = js.native
  /**
    * The policy name.
    */
  var policyName: PolicyName = js.native
}

object ListTargetsForPolicyRequest {
  @scala.inline
  def apply(policyName: PolicyName, marker: Marker = null, pageSize: js.UndefOr[PageSize] = js.undefined): ListTargetsForPolicyRequest = {
    val __obj = js.Dynamic.literal(policyName = policyName.asInstanceOf[js.Any])
    if (marker != null) __obj.updateDynamic("marker")(marker.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTargetsForPolicyRequest]
  }
}

