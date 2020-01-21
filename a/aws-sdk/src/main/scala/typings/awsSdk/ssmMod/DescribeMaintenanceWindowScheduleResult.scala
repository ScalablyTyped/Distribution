package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMaintenanceWindowScheduleResult extends js.Object {
  /**
    * The token for the next set of items to return. (You use this token in the next call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * Information about maintenance window executions scheduled for the specified time range.
    */
  var ScheduledWindowExecutions: js.UndefOr[ScheduledWindowExecutionList] = js.native
}

object DescribeMaintenanceWindowScheduleResult {
  @scala.inline
  def apply(NextToken: NextToken = null, ScheduledWindowExecutions: ScheduledWindowExecutionList = null): DescribeMaintenanceWindowScheduleResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (ScheduledWindowExecutions != null) __obj.updateDynamic("ScheduledWindowExecutions")(ScheduledWindowExecutions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMaintenanceWindowScheduleResult]
  }
}

