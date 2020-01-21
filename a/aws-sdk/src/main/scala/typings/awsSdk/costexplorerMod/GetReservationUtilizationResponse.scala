package typings.awsSdk.costexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetReservationUtilizationResponse extends js.Object {
  /**
    * The token for the next set of retrievable results. AWS provides the token when the response from a previous call has more results than the maximum page size.
    */
  var NextPageToken: js.UndefOr[typings.awsSdk.costexplorerMod.NextPageToken] = js.native
  /**
    * The total amount of time that you used your RIs.
    */
  var Total: js.UndefOr[ReservationAggregates] = js.native
  /**
    * The amount of time that you used your RIs.
    */
  var UtilizationsByTime: typings.awsSdk.costexplorerMod.UtilizationsByTime = js.native
}

object GetReservationUtilizationResponse {
  @scala.inline
  def apply(
    UtilizationsByTime: UtilizationsByTime,
    NextPageToken: NextPageToken = null,
    Total: ReservationAggregates = null
  ): GetReservationUtilizationResponse = {
    val __obj = js.Dynamic.literal(UtilizationsByTime = UtilizationsByTime.asInstanceOf[js.Any])
    if (NextPageToken != null) __obj.updateDynamic("NextPageToken")(NextPageToken.asInstanceOf[js.Any])
    if (Total != null) __obj.updateDynamic("Total")(Total.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetReservationUtilizationResponse]
  }
}

