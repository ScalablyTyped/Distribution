package typings.backlogJs.mod.Option.Issue

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchIssueParams
  extends /* customField_ */ StringDictionary[js.Any] {
  
  var actualHours: js.UndefOr[Double] = js.native
  
  var assigneeId: js.UndefOr[Double] = js.native
  
  var attachmentId: js.UndefOr[js.Array[Double]] = js.native
  
  var categoryId: js.UndefOr[js.Array[Double]] = js.native
  
  var comment: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var dueDate: js.UndefOr[String] = js.native
  
  var estimatedHours: js.UndefOr[Double] = js.native
  
  var issueTypeId: js.UndefOr[Double] = js.native
  
  var milestoneId: js.UndefOr[js.Array[Double]] = js.native
  
  var notifiedUserId: js.UndefOr[js.Array[Double]] = js.native
  
  var parentIssueId: js.UndefOr[Double] = js.native
  
  var priorityId: js.UndefOr[Double] = js.native
  
  var resolutionId: js.UndefOr[Double] = js.native
  
  var startDate: js.UndefOr[String] = js.native
  
  var statusId: js.UndefOr[Double] = js.native
  
  var summary: js.UndefOr[String] = js.native
  
  var versionId: js.UndefOr[js.Array[Double]] = js.native
}
object PatchIssueParams {
  
  @scala.inline
  def apply(): PatchIssueParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchIssueParams]
  }
  
  @scala.inline
  implicit class PatchIssueParamsOps[Self <: PatchIssueParams] (val x: Self) extends AnyVal {
    
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
    def setActualHours(value: Double): Self = this.set("actualHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActualHours: Self = this.set("actualHours", js.undefined)
    
    @scala.inline
    def setAssigneeId(value: Double): Self = this.set("assigneeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssigneeId: Self = this.set("assigneeId", js.undefined)
    
    @scala.inline
    def setAttachmentIdVarargs(value: Double*): Self = this.set("attachmentId", js.Array(value :_*))
    
    @scala.inline
    def setAttachmentId(value: js.Array[Double]): Self = this.set("attachmentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAttachmentId: Self = this.set("attachmentId", js.undefined)
    
    @scala.inline
    def setCategoryIdVarargs(value: Double*): Self = this.set("categoryId", js.Array(value :_*))
    
    @scala.inline
    def setCategoryId(value: js.Array[Double]): Self = this.set("categoryId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCategoryId: Self = this.set("categoryId", js.undefined)
    
    @scala.inline
    def setComment(value: String): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDueDate(value: String): Self = this.set("dueDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDueDate: Self = this.set("dueDate", js.undefined)
    
    @scala.inline
    def setEstimatedHours(value: Double): Self = this.set("estimatedHours", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEstimatedHours: Self = this.set("estimatedHours", js.undefined)
    
    @scala.inline
    def setIssueTypeId(value: Double): Self = this.set("issueTypeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssueTypeId: Self = this.set("issueTypeId", js.undefined)
    
    @scala.inline
    def setMilestoneIdVarargs(value: Double*): Self = this.set("milestoneId", js.Array(value :_*))
    
    @scala.inline
    def setMilestoneId(value: js.Array[Double]): Self = this.set("milestoneId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMilestoneId: Self = this.set("milestoneId", js.undefined)
    
    @scala.inline
    def setNotifiedUserIdVarargs(value: Double*): Self = this.set("notifiedUserId", js.Array(value :_*))
    
    @scala.inline
    def setNotifiedUserId(value: js.Array[Double]): Self = this.set("notifiedUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifiedUserId: Self = this.set("notifiedUserId", js.undefined)
    
    @scala.inline
    def setParentIssueId(value: Double): Self = this.set("parentIssueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentIssueId: Self = this.set("parentIssueId", js.undefined)
    
    @scala.inline
    def setPriorityId(value: Double): Self = this.set("priorityId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriorityId: Self = this.set("priorityId", js.undefined)
    
    @scala.inline
    def setResolutionId(value: Double): Self = this.set("resolutionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResolutionId: Self = this.set("resolutionId", js.undefined)
    
    @scala.inline
    def setStartDate(value: String): Self = this.set("startDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
    
    @scala.inline
    def setStatusId(value: Double): Self = this.set("statusId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusId: Self = this.set("statusId", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
    
    @scala.inline
    def setVersionIdVarargs(value: Double*): Self = this.set("versionId", js.Array(value :_*))
    
    @scala.inline
    def setVersionId(value: js.Array[Double]): Self = this.set("versionId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersionId: Self = this.set("versionId", js.undefined)
  }
}
