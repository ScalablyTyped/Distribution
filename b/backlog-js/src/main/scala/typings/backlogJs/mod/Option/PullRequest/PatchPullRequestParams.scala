package typings.backlogJs.mod.Option.PullRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PatchPullRequestParams extends js.Object {
  
  var assigneeId: js.UndefOr[Double] = js.native
  
  var comment: js.UndefOr[js.Array[String]] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var issueId: js.UndefOr[Double] = js.native
  
  var notifiedUserId: js.UndefOr[js.Array[Double]] = js.native
  
  var summary: js.UndefOr[String] = js.native
}
object PatchPullRequestParams {
  
  @scala.inline
  def apply(): PatchPullRequestParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchPullRequestParams]
  }
  
  @scala.inline
  implicit class PatchPullRequestParamsOps[Self <: PatchPullRequestParams] (val x: Self) extends AnyVal {
    
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
    def setAssigneeId(value: Double): Self = this.set("assigneeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssigneeId: Self = this.set("assigneeId", js.undefined)
    
    @scala.inline
    def setCommentVarargs(value: String*): Self = this.set("comment", js.Array(value :_*))
    
    @scala.inline
    def setComment(value: js.Array[String]): Self = this.set("comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("comment", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setIssueId(value: Double): Self = this.set("issueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssueId: Self = this.set("issueId", js.undefined)
    
    @scala.inline
    def setNotifiedUserIdVarargs(value: Double*): Self = this.set("notifiedUserId", js.Array(value :_*))
    
    @scala.inline
    def setNotifiedUserId(value: js.Array[Double]): Self = this.set("notifiedUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotifiedUserId: Self = this.set("notifiedUserId", js.undefined)
    
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSummary: Self = this.set("summary", js.undefined)
  }
}
