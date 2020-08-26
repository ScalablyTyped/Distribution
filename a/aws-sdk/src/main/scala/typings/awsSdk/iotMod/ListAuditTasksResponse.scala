package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAuditTasksResponse extends js.Object {
  /**
    * A token that can be used to retrieve the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.native
  /**
    * The audits that were performed during the specified time period.
    */
  var tasks: js.UndefOr[AuditTaskMetadataList] = js.native
}

object ListAuditTasksResponse {
  @scala.inline
  def apply(): ListAuditTasksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAuditTasksResponse]
  }
  @scala.inline
  implicit class ListAuditTasksResponseOps[Self <: ListAuditTasksResponse] (val x: Self) extends AnyVal {
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
    def setTasksVarargs(value: AuditTaskMetadata*): Self = this.set("tasks", js.Array(value :_*))
    @scala.inline
    def setTasks(value: AuditTaskMetadataList): Self = this.set("tasks", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTasks: Self = this.set("tasks", js.undefined)
  }
  
}

