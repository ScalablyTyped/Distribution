package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelSpotFleetRequestsResponse extends js.Object {
  /**
    * Information about the Spot Fleet requests that are successfully canceled.
    */
  var SuccessfulFleetRequests: js.UndefOr[CancelSpotFleetRequestsSuccessSet] = js.native
  /**
    * Information about the Spot Fleet requests that are not successfully canceled.
    */
  var UnsuccessfulFleetRequests: js.UndefOr[CancelSpotFleetRequestsErrorSet] = js.native
}

object CancelSpotFleetRequestsResponse {
  @scala.inline
  def apply(
    SuccessfulFleetRequests: CancelSpotFleetRequestsSuccessSet = null,
    UnsuccessfulFleetRequests: CancelSpotFleetRequestsErrorSet = null
  ): CancelSpotFleetRequestsResponse = {
    val __obj = js.Dynamic.literal()
    if (SuccessfulFleetRequests != null) __obj.updateDynamic("SuccessfulFleetRequests")(SuccessfulFleetRequests.asInstanceOf[js.Any])
    if (UnsuccessfulFleetRequests != null) __obj.updateDynamic("UnsuccessfulFleetRequests")(UnsuccessfulFleetRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelSpotFleetRequestsResponse]
  }
}

