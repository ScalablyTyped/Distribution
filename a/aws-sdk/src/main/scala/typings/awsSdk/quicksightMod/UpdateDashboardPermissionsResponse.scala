package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDashboardPermissionsResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the dashboard.
    */
  var DashboardArn: js.UndefOr[Arn] = js.native
  /**
    * The ID for the dashboard.
    */
  var DashboardId: js.UndefOr[RestrictiveResourceId] = js.native
  /**
    * Information about the permissions on the dashboard.
    */
  var Permissions: js.UndefOr[ResourcePermissionList] = js.native
  /**
    * The AWS request ID for this operation.
    */
  var RequestId: js.UndefOr[String] = js.native
  /**
    * The HTTP status of the request.
    */
  var Status: js.UndefOr[StatusCode] = js.native
}

object UpdateDashboardPermissionsResponse {
  @scala.inline
  def apply(
    DashboardArn: Arn = null,
    DashboardId: RestrictiveResourceId = null,
    Permissions: ResourcePermissionList = null,
    RequestId: String = null,
    Status: js.UndefOr[StatusCode] = js.undefined
  ): UpdateDashboardPermissionsResponse = {
    val __obj = js.Dynamic.literal()
    if (DashboardArn != null) __obj.updateDynamic("DashboardArn")(DashboardArn.asInstanceOf[js.Any])
    if (DashboardId != null) __obj.updateDynamic("DashboardId")(DashboardId.asInstanceOf[js.Any])
    if (Permissions != null) __obj.updateDynamic("Permissions")(Permissions.asInstanceOf[js.Any])
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId.asInstanceOf[js.Any])
    if (!js.isUndefined(Status)) __obj.updateDynamic("Status")(Status.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDashboardPermissionsResponse]
  }
}

