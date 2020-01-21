package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeMaintenanceWindowExecutionTaskInvocationsResult extends js.Object {
  /**
    * The token to use when requesting the next set of items. If there are no additional items to return, the string is empty.
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * Information about the task invocation results per invocation.
    */
  var WindowExecutionTaskInvocationIdentities: js.UndefOr[MaintenanceWindowExecutionTaskInvocationIdentityList] = js.native
}

object DescribeMaintenanceWindowExecutionTaskInvocationsResult {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    WindowExecutionTaskInvocationIdentities: MaintenanceWindowExecutionTaskInvocationIdentityList = null
  ): DescribeMaintenanceWindowExecutionTaskInvocationsResult = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (WindowExecutionTaskInvocationIdentities != null) __obj.updateDynamic("WindowExecutionTaskInvocationIdentities")(WindowExecutionTaskInvocationIdentities.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeMaintenanceWindowExecutionTaskInvocationsResult]
  }
}

