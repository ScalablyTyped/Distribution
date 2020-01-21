package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCapacityReservationUsageRequest extends js.Object {
  /**
    * The ID of the Capacity Reservation.
    */
  var CapacityReservationId: typings.awsSdk.ec2Mod.CapacityReservationId = js.native
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of results to return for the request in a single page. The remaining results can be seen by sending another request with the returned nextToken value. Valid range: Minimum value of 1. Maximum value of 1000.
    */
  var MaxResults: js.UndefOr[GetCapacityReservationUsageRequestMaxResults] = js.native
  /**
    * The token to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object GetCapacityReservationUsageRequest {
  @scala.inline
  def apply(
    CapacityReservationId: CapacityReservationId,
    DryRun: js.UndefOr[scala.Boolean] = js.undefined,
    MaxResults: Int | scala.Double = null,
    NextToken: String = null
  ): GetCapacityReservationUsageRequest = {
    val __obj = js.Dynamic.literal(CapacityReservationId = CapacityReservationId.asInstanceOf[js.Any])
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCapacityReservationUsageRequest]
  }
}

