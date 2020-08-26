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
  @scala.inline
  implicit class UpdateDashboardPublishedVersionRequestOps[Self <: UpdateDashboardPublishedVersionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAwsAccountId(value: AwsAccountId): Self = this.set("AwsAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDashboardId(value: RestrictiveResourceId): Self = this.set("DashboardId", value.asInstanceOf[js.Any])
    @scala.inline
    def setVersionNumber(value: VersionNumber): Self = this.set("VersionNumber", value.asInstanceOf[js.Any])
  }
  
}

