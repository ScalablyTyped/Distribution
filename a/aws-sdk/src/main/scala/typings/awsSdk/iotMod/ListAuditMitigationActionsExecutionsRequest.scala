package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAuditMitigationActionsExecutionsRequest extends js.Object {
  /**
    * Specify this filter to limit results to those with a specific status.
    */
  var actionStatus: js.UndefOr[AuditMitigationActionsExecutionStatus] = js.native
  /**
    * Specify this filter to limit results to those that were applied to a specific audit finding.
    */
  var findingId: FindingId = js.native
  /**
    * The maximum number of results to return at one time. The default is 25.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * Specify this filter to limit results to actions for a specific audit mitigation actions task.
    */
  var taskId: AuditMitigationActionsTaskId = js.native
}

object ListAuditMitigationActionsExecutionsRequest {
  @scala.inline
  def apply(findingId: FindingId, taskId: AuditMitigationActionsTaskId): ListAuditMitigationActionsExecutionsRequest = {
    val __obj = js.Dynamic.literal(findingId = findingId.asInstanceOf[js.Any], taskId = taskId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAuditMitigationActionsExecutionsRequest]
  }
  @scala.inline
  implicit class ListAuditMitigationActionsExecutionsRequestOps[Self <: ListAuditMitigationActionsExecutionsRequest] (val x: Self) extends AnyVal {
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
    def setFindingId(value: FindingId): Self = this.set("findingId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTaskId(value: AuditMitigationActionsTaskId): Self = this.set("taskId", value.asInstanceOf[js.Any])
    @scala.inline
    def setActionStatus(value: AuditMitigationActionsExecutionStatus): Self = this.set("actionStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActionStatus: Self = this.set("actionStatus", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
  }
  
}

