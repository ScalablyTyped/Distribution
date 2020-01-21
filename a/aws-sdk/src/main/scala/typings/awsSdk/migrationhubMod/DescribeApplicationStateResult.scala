package typings.awsSdk.migrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeApplicationStateResult extends js.Object {
  /**
    * Status of the application - Not Started, In-Progress, Complete.
    */
  var ApplicationStatus: js.UndefOr[typings.awsSdk.migrationhubMod.ApplicationStatus] = js.native
  /**
    * The timestamp when the application status was last updated.
    */
  var LastUpdatedTime: js.UndefOr[UpdateDateTime] = js.native
}

object DescribeApplicationStateResult {
  @scala.inline
  def apply(ApplicationStatus: ApplicationStatus = null, LastUpdatedTime: UpdateDateTime = null): DescribeApplicationStateResult = {
    val __obj = js.Dynamic.literal()
    if (ApplicationStatus != null) __obj.updateDynamic("ApplicationStatus")(ApplicationStatus.asInstanceOf[js.Any])
    if (LastUpdatedTime != null) __obj.updateDynamic("LastUpdatedTime")(LastUpdatedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeApplicationStateResult]
  }
}

