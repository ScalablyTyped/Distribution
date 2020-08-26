package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAuditMitigationActionsTasksRequest extends js.Object {
  /**
    * Specify this filter to limit results to tasks that were applied to results for a specific audit.
    */
  var auditTaskId: js.UndefOr[AuditTaskId] = js.native
  /**
    * Specify this filter to limit results to tasks that were completed or canceled on or before a specific date and time.
    */
  var endTime: Timestamp = js.native
  /**
    * Specify this filter to limit results to tasks that were applied to a specific audit finding.
    */
  var findingId: js.UndefOr[FindingId] = js.native
  /**
    * The maximum number of results to return at one time. The default is 25.
    */
  var maxResults: js.UndefOr[MaxResults] = js.native
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * Specify this filter to limit results to tasks that began on or after a specific date and time.
    */
  var startTime: Timestamp = js.native
  /**
    * Specify this filter to limit results to tasks that are in a specific state.
    */
  var taskStatus: js.UndefOr[AuditMitigationActionsTaskStatus] = js.native
}

object ListAuditMitigationActionsTasksRequest {
  @scala.inline
  def apply(endTime: Timestamp, startTime: Timestamp): ListAuditMitigationActionsTasksRequest = {
    val __obj = js.Dynamic.literal(endTime = endTime.asInstanceOf[js.Any], startTime = startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAuditMitigationActionsTasksRequest]
  }
  @scala.inline
  implicit class ListAuditMitigationActionsTasksRequestOps[Self <: ListAuditMitigationActionsTasksRequest] (val x: Self) extends AnyVal {
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
    def setEndTime(value: Timestamp): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuditTaskId(value: AuditTaskId): Self = this.set("auditTaskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuditTaskId: Self = this.set("auditTaskId", js.undefined)
    @scala.inline
    def setFindingId(value: FindingId): Self = this.set("findingId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFindingId: Self = this.set("findingId", js.undefined)
    @scala.inline
    def setMaxResults(value: MaxResults): Self = this.set("maxResults", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxResults: Self = this.set("maxResults", js.undefined)
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setTaskStatus(value: AuditMitigationActionsTaskStatus): Self = this.set("taskStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskStatus: Self = this.set("taskStatus", js.undefined)
  }
  
}

