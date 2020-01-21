package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAutomationStepExecutionsRequest extends js.Object {
  /**
    * The Automation execution ID for which you want step execution descriptions.
    */
  var AutomationExecutionId: typings.awsSdk.ssmMod.AutomationExecutionId = js.native
  /**
    * One or more filters to limit the number of step executions returned by the request.
    */
  var Filters: js.UndefOr[StepExecutionFilterList] = js.native
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.ssmMod.MaxResults] = js.native
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  /**
    * A boolean that indicates whether to list step executions in reverse order by start time. The default value is false.
    */
  var ReverseOrder: js.UndefOr[Boolean] = js.native
}

object DescribeAutomationStepExecutionsRequest {
  @scala.inline
  def apply(
    AutomationExecutionId: AutomationExecutionId,
    Filters: StepExecutionFilterList = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    ReverseOrder: js.UndefOr[scala.Boolean] = js.undefined
  ): DescribeAutomationStepExecutionsRequest = {
    val __obj = js.Dynamic.literal(AutomationExecutionId = AutomationExecutionId.asInstanceOf[js.Any])
    if (Filters != null) __obj.updateDynamic("Filters")(Filters.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (!js.isUndefined(ReverseOrder)) __obj.updateDynamic("ReverseOrder")(ReverseOrder.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAutomationStepExecutionsRequest]
  }
}

