package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDashboardRequest extends js.Object {
  /**
    * The ID of the dashboard.
    */
  var dashboardId: ID = js.native
}

object DescribeDashboardRequest {
  @scala.inline
  def apply(dashboardId: ID): DescribeDashboardRequest = {
    val __obj = js.Dynamic.literal(dashboardId = dashboardId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeDashboardRequest]
  }
}

