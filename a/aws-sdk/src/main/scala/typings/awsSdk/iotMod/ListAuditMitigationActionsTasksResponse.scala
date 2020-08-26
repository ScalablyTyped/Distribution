package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAuditMitigationActionsTasksResponse extends js.Object {
  /**
    * The token for the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The collection of audit mitigation tasks that matched the filter criteria.
    */
  var tasks: js.UndefOr[AuditMitigationActionsTaskMetadataList] = js.native
}

object ListAuditMitigationActionsTasksResponse {
  @scala.inline
  def apply(): ListAuditMitigationActionsTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAuditMitigationActionsTasksResponse]
  }
  @scala.inline
  implicit class ListAuditMitigationActionsTasksResponseOps[Self <: ListAuditMitigationActionsTasksResponse] (val x: Self) extends AnyVal {
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
    def setNextToken(value: NextToken): Self = this.set("nextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("nextToken", js.undefined)
    @scala.inline
    def setTasksVarargs(value: AuditMitigationActionsTaskMetadata*): Self = this.set("tasks", js.Array(value :_*))
    @scala.inline
    def setTasks(value: AuditMitigationActionsTaskMetadataList): Self = this.set("tasks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTasks: Self = this.set("tasks", js.undefined)
  }
  
}

