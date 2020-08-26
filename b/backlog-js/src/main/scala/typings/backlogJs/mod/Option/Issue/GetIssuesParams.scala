package typings.backlogJs.mod.Option.Issue

import org.scalablytyped.runtime.StringDictionary
import typings.backlogJs.mod.Option.Order
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIssuesParams
  extends /* customField_ */ StringDictionary[js.Any] {
  var assigneeId: js.UndefOr[js.Array[Double]] = js.native
  var attachment: js.UndefOr[Boolean] = js.native
  var categoryId: js.UndefOr[js.Array[Double]] = js.native
  var count: js.UndefOr[Double] = js.native
  var createdSince: js.UndefOr[String] = js.native
  var createdUntil: js.UndefOr[String] = js.native
  var createdUserId: js.UndefOr[js.Array[Double]] = js.native
  var dueDateSince: js.UndefOr[String] = js.native
  var dueDateUntil: js.UndefOr[String] = js.native
  var id: js.UndefOr[js.Array[Double]] = js.native
  var issueTypeId: js.UndefOr[js.Array[Double]] = js.native
  var keyword: String = js.native
  var milestoneId: js.UndefOr[js.Array[Double]] = js.native
  var offset: js.UndefOr[Double] = js.native
  var order: js.UndefOr[Order] = js.native
  var parentChild: js.UndefOr[ParentChildType] = js.native
  var parentIssueId: js.UndefOr[js.Array[Double]] = js.native
  var priorityId: js.UndefOr[js.Array[Double]] = js.native
  var projectId: js.UndefOr[js.Array[Double]] = js.native
  var resolutionId: js.UndefOr[js.Array[Double]] = js.native
  var sharedFile: js.UndefOr[Boolean] = js.native
  var sort: js.UndefOr[SortKey] = js.native
  var startDateSince: js.UndefOr[String] = js.native
  var startDateUntil: js.UndefOr[String] = js.native
  var statusId: js.UndefOr[js.Array[Double]] = js.native
  var updatedSince: js.UndefOr[String] = js.native
  var updatedUntil: js.UndefOr[String] = js.native
  var versionId: js.UndefOr[js.Array[Double]] = js.native
}

object GetIssuesParams {
  @scala.inline
  def apply(keyword: String): GetIssuesParams = {
    val __obj = js.Dynamic.literal(keyword = keyword.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIssuesParams]
  }
  @scala.inline
  implicit class GetIssuesParamsOps[Self <: GetIssuesParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setKeyword(value: String): Self = this.set("keyword", value.asInstanceOf[js.Any])
    @scala.inline
    def setAssigneeIdVarargs(value: Double*): Self = this.set("assigneeId", js.Array(value :_*))
    @scala.inline
    def setAssigneeId(value: js.Array[Double]): Self = this.set("assigneeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAssigneeId: Self = this.set("assigneeId", js.undefined)
    @scala.inline
    def setAttachment(value: Boolean): Self = this.set("attachment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAttachment: Self = this.set("attachment", js.undefined)
    @scala.inline
    def setCategoryIdVarargs(value: Double*): Self = this.set("categoryId", js.Array(value :_*))
    @scala.inline
    def setCategoryId(value: js.Array[Double]): Self = this.set("categoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCategoryId: Self = this.set("categoryId", js.undefined)
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    @scala.inline
    def setCreatedSince(value: String): Self = this.set("createdSince", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedSince: Self = this.set("createdSince", js.undefined)
    @scala.inline
    def setCreatedUntil(value: String): Self = this.set("createdUntil", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedUntil: Self = this.set("createdUntil", js.undefined)
    @scala.inline
    def setCreatedUserIdVarargs(value: Double*): Self = this.set("createdUserId", js.Array(value :_*))
    @scala.inline
    def setCreatedUserId(value: js.Array[Double]): Self = this.set("createdUserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedUserId: Self = this.set("createdUserId", js.undefined)
    @scala.inline
    def setDueDateSince(value: String): Self = this.set("dueDateSince", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDueDateSince: Self = this.set("dueDateSince", js.undefined)
    @scala.inline
    def setDueDateUntil(value: String): Self = this.set("dueDateUntil", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDueDateUntil: Self = this.set("dueDateUntil", js.undefined)
    @scala.inline
    def setIdVarargs(value: Double*): Self = this.set("id", js.Array(value :_*))
    @scala.inline
    def setId(value: js.Array[Double]): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setIssueTypeIdVarargs(value: Double*): Self = this.set("issueTypeId", js.Array(value :_*))
    @scala.inline
    def setIssueTypeId(value: js.Array[Double]): Self = this.set("issueTypeId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssueTypeId: Self = this.set("issueTypeId", js.undefined)
    @scala.inline
    def setMilestoneIdVarargs(value: Double*): Self = this.set("milestoneId", js.Array(value :_*))
    @scala.inline
    def setMilestoneId(value: js.Array[Double]): Self = this.set("milestoneId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMilestoneId: Self = this.set("milestoneId", js.undefined)
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOrder(value: Order): Self = this.set("order", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOrder: Self = this.set("order", js.undefined)
    @scala.inline
    def setParentChild(value: ParentChildType): Self = this.set("parentChild", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentChild: Self = this.set("parentChild", js.undefined)
    @scala.inline
    def setParentIssueIdVarargs(value: Double*): Self = this.set("parentIssueId", js.Array(value :_*))
    @scala.inline
    def setParentIssueId(value: js.Array[Double]): Self = this.set("parentIssueId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParentIssueId: Self = this.set("parentIssueId", js.undefined)
    @scala.inline
    def setPriorityIdVarargs(value: Double*): Self = this.set("priorityId", js.Array(value :_*))
    @scala.inline
    def setPriorityId(value: js.Array[Double]): Self = this.set("priorityId", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriorityId: Self = this.set("priorityId", js.undefined)
    @scala.inline
    def setProjectIdVarargs(value: Double*): Self = this.set("projectId", js.Array(value :_*))
    @scala.inline
    def setProjectId(value: js.Array[Double]): Self = this.set("projectId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProjectId: Self = this.set("projectId", js.undefined)
    @scala.inline
    def setResolutionIdVarargs(value: Double*): Self = this.set("resolutionId", js.Array(value :_*))
    @scala.inline
    def setResolutionId(value: js.Array[Double]): Self = this.set("resolutionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolutionId: Self = this.set("resolutionId", js.undefined)
    @scala.inline
    def setSharedFile(value: Boolean): Self = this.set("sharedFile", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSharedFile: Self = this.set("sharedFile", js.undefined)
    @scala.inline
    def setSort(value: SortKey): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
    @scala.inline
    def setStartDateSince(value: String): Self = this.set("startDateSince", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDateSince: Self = this.set("startDateSince", js.undefined)
    @scala.inline
    def setStartDateUntil(value: String): Self = this.set("startDateUntil", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDateUntil: Self = this.set("startDateUntil", js.undefined)
    @scala.inline
    def setStatusIdVarargs(value: Double*): Self = this.set("statusId", js.Array(value :_*))
    @scala.inline
    def setStatusId(value: js.Array[Double]): Self = this.set("statusId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusId: Self = this.set("statusId", js.undefined)
    @scala.inline
    def setUpdatedSince(value: String): Self = this.set("updatedSince", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedSince: Self = this.set("updatedSince", js.undefined)
    @scala.inline
    def setUpdatedUntil(value: String): Self = this.set("updatedUntil", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedUntil: Self = this.set("updatedUntil", js.undefined)
    @scala.inline
    def setVersionIdVarargs(value: Double*): Self = this.set("versionId", js.Array(value :_*))
    @scala.inline
    def setVersionId(value: js.Array[Double]): Self = this.set("versionId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVersionId: Self = this.set("versionId", js.undefined)
  }
  
}

