package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMaintenanceWindowsForTargetResult extends js.Object {
  /**
    * The token for the next set of items to return. (You use this token in the next call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * Information about the maintenance window targets and tasks an instance is associated with.
    */
  var WindowIdentities: js.UndefOr[MaintenanceWindowsForTargetList] = js.native
}

object DescribeMaintenanceWindowsForTargetResult {
  @scala.inline
  def apply(NextToken: NextToken = null, WindowIdentities: MaintenanceWindowsForTargetList = null): DescribeMaintenanceWindowsForTargetResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (WindowIdentities != null) __obj.updateDynamic("WindowIdentities")(WindowIdentities.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMaintenanceWindowsForTargetResult]
  }
}

