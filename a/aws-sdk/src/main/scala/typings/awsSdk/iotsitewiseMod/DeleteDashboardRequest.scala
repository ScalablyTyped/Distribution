package typings.awsSdk.iotsitewiseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDashboardRequest extends js.Object {
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientToken] = js.native
  /**
    * The ID of the dashboard to delete.
    */
  var dashboardId: ID = js.native
}

object DeleteDashboardRequest {
  @scala.inline
  def apply(dashboardId: ID, clientToken: ClientToken = null): DeleteDashboardRequest = {
    val __obj = js.Dynamic.literal(dashboardId = dashboardId.asInstanceOf[js.Any])
    if (clientToken != null) __obj.updateDynamic("clientToken")(clientToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDashboardRequest]
  }
}

