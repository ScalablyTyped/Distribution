package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDashboardResponse extends js.Object {
  /**
    * Information about the dashboard.
    */
  var Dashboard: js.UndefOr[typings.awsSdk.quicksightMod.Dashboard] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of this request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object DescribeDashboardResponse {
  @scala.inline
  def apply(Dashboard: Dashboard = null, RequestId: String = null, Status: Int | scala.Double = null): DescribeDashboardResponse = {
    val __obj = js.Dynamic.literal()
    if (Dashboard != null) __obj.updateDynamic("Dashboard")(Dashboard.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDashboardResponse]
  }
}

