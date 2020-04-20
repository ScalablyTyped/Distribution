package typings.awsSdk.quicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDashboardPublishedVersionRequest extends js.Object {
  /**
    * The ID of the AWS account that contains the dashboard that you're updating.
    */
  var AwsAccountId: typings.awsSdk.quicksightMod.AwsAccountId = js.native
  /**
    * The ID for the dashboard.
    */
  var DashboardId: RestrictiveResourceId = js.native
  /**
    * The version number of the dashboard.
    */
  var VersionNumber: typings.awsSdk.quicksightMod.VersionNumber = js.native
}

object UpdateDashboardPublishedVersionRequest {
  @scala.inline
  def apply(AwsAccountId: AwsAccountId, DashboardId: RestrictiveResourceId, VersionNumber: VersionNumber): UpdateDashboardPublishedVersionRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any], DashboardId = DashboardId.asInstanceOf[js.Any], VersionNumber = VersionNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDashboardPublishedVersionRequest]
  }
}

