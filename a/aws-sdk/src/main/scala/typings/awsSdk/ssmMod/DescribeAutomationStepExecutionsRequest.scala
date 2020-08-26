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
  def apply(AutomationExecutionId: AutomationExecutionId): DescribeAutomationStepExecutionsRequest = {
    val __obj = js.Dynamic.literal(AutomationExecutionId = AutomationExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAutomationStepExecutionsRequest]
  }
  @scala.inline
  implicit class DescribeAutomationStepExecutionsRequestOps[Self <: DescribeAutomationStepExecutionsRequest] (val x: Self) extends AnyVal {
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
    def setAutomationExecutionId(value: AutomationExecutionId): Self = this.set("AutomationExecutionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setFiltersVarargs(value: StepExecutionFilter*): Self = this.set("Filters", js.Array(value :_*))
    @scala.inline
    def setFilters(value: StepExecutionFilterList): Self = this.set("Filters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFilters: Self = this.set("Filters", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("MaxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("MaxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setReverseOrder(value: Boolean): Self = this.set("ReverseOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReverseOrder: Self = this.set("ReverseOrder", js.undefined)
  }
  
}

