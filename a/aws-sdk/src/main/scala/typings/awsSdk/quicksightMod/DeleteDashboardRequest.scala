package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteDashboardRequest extends js.Object {
  /**
    * The ID of the AWS account that contains the dashboard that you're deleting.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The ID for the dashboard.
    */
  var DashboardId: RestrictiveResourceId = js.native
  /**
    * The version number of the dashboard. If the version number property is provided, only the specified version of the dashboard is deleted.
    */
  var VersionNumber: js.UndefOr[typings.awsSdk.quicksightMod.VersionNumber] = js.native
}

object DeleteDashboardRequest {
  @scala.inline
  def apply(
    AwsAccountId: AwsAccountId,
    DashboardId: RestrictiveResourceId,
    VersionNumber: Int | scala.Double = null
  ): DeleteDashboardRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DashboardId = DashboardId.asInstanceOf[js.Any])
    if (VersionNumber != null) __obj.updateDynamic("VersionNumber")(VersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteDashboardRequest]
  }
}

