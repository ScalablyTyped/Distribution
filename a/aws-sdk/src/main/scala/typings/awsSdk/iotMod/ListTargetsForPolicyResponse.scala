package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListTargetsForPolicyResponse extends js.Object {
  /**
    * A marker used to get the next set of results.
    */
  var nextMarker: js.UndefOr[Marker] = js.native
  /**
    * The policy targets.
    */
  var targets: js.UndefOr[PolicyTargets] = js.native
}

object ListTargetsForPolicyResponse {
  @scala.inline
  def apply(nextMarker: Marker = null, targets: PolicyTargets = null): ListTargetsForPolicyResponse = {
    val __obj = js.Dynamic.literal()
    if (nextMarker != null) __obj.updateDynamic("nextMarker")(nextMarker.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListTargetsForPolicyResponse]
  }
}

