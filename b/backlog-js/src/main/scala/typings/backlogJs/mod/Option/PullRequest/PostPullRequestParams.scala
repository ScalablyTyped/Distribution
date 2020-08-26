package typings.backlogJs.mod.Option.PullRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PostPullRequestParams extends js.Object {
  var assigneeId: js.UndefOr[Double] = js.native
  var attachmentId: js.UndefOr[js.Array[Double]] = js.native
  var base: String = js.native
  var branch: String = js.native
  var description: String = js.native
  var issueId: js.UndefOr[Double] = js.native
  var notifiedUserId: js.UndefOr[js.Array[Double]] = js.native
  var summary: String = js.native
}

object PostPullRequestParams {
  @scala.inline
  def apply(base: String, branch: String, description: String, summary: String): PostPullRequestParams = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostPullRequestParams]
  }
  @scala.inline
  implicit class PostPullRequestParamsOps[Self <: PostPullRequestParams] (val x: Self) extends AnyVal {
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
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setBranch(value: String): Self = this.set("branch", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setSummary(value: String): Self = this.set("summary", value.asInstanceOf[js.Any])
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
    def setIssueId(value: Double): Self = this.set("issueId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssueId: Self = this.set("issueId", js.undefined)
    @scala.inline
    def setNotifiedUserIdVarargs(value: Double*): Self = this.set("notifiedUserId", js.Array(value :_*))
    @scala.inline
    def setNotifiedUserId(value: js.Array[Double]): Self = this.set("notifiedUserId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotifiedUserId: Self = this.set("notifiedUserId", js.undefined)
  }
  
}

