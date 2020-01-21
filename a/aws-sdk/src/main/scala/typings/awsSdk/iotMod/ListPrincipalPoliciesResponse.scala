package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListPrincipalPoliciesResponse extends js.Object {
  /**
    * The marker for the next set of results, or null if there are no additional results.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
  /**
    * The policies.
    */
  var policies: js.UndefOr[Policies] = js.native
}

object ListPrincipalPoliciesResponse {
  @scala.inline
  def apply(nextMarker: Marker = null, policies: Policies = null): ListPrincipalPoliciesResponse = {
    val __obj = js.Dynamic.literal()
    if (nextMarker != null) __obj.updateDynamic("nextMarker")(nextMarker.asInstanceOf[js.Any])
    if (policies != null) __obj.updateDynamic("policies")(policies.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListPrincipalPoliciesResponse]
  }
}

