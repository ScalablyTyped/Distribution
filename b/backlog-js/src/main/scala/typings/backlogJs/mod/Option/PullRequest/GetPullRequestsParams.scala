package typings.backlogJs.mod.Option.PullRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPullRequestsParams extends js.Object {
  
  var assigneeId: js.UndefOr[js.Array[Double]] = js.native
  
  var count: js.UndefOr[Double] = js.native
  
  var createdUserId: js.UndefOr[js.Array[Double]] = js.native
  
  var issueId: js.UndefOr[js.Array[Double]] = js.native
  
  var offset: js.UndefOr[Double] = js.native
  
  var statusId: js.UndefOr[js.Array[Double]] = js.native
}
object GetPullRequestsParams {
  
  @scala.inline
  def apply(): GetPullRequestsParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetPullRequestsParams]
  }
  
  @scala.inline
  implicit class GetPullRequestsParamsOps[Self <: GetPullRequestsParams] (val x: Self) extends AnyVal {
    
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
    def setAssigneeIdVarargs(value: Double*): Self = this.set("assigneeId", js.Array(value :_*))
    
    @scala.inline
    def setAssigneeId(value: js.Array[Double]): Self = this.set("assigneeId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssigneeId: Self = this.set("assigneeId", js.undefined)
    
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCount: Self = this.set("count", js.undefined)
    
    @scala.inline
    def setCreatedUserIdVarargs(value: Double*): Self = this.set("createdUserId", js.Array(value :_*))
    
    @scala.inline
    def setCreatedUserId(value: js.Array[Double]): Self = this.set("createdUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCreatedUserId: Self = this.set("createdUserId", js.undefined)
    
    @scala.inline
    def setIssueIdVarargs(value: Double*): Self = this.set("issueId", js.Array(value :_*))
    
    @scala.inline
    def setIssueId(value: js.Array[Double]): Self = this.set("issueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIssueId: Self = this.set("issueId", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setStatusIdVarargs(value: Double*): Self = this.set("statusId", js.Array(value :_*))
    
    @scala.inline
    def setStatusId(value: js.Array[Double]): Self = this.set("statusId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusId: Self = this.set("statusId", js.undefined)
  }
}
