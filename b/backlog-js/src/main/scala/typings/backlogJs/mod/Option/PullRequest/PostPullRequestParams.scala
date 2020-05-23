package typings.backlogJs.mod.Option.PullRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostPullRequestParams extends js.Object {
  var assigneeId: js.UndefOr[Double] = js.undefined
  var attachmentId: js.UndefOr[js.Array[Double]] = js.undefined
  var base: String
  var branch: String
  var description: String
  var issueId: js.UndefOr[Double] = js.undefined
  var notifiedUserId: js.UndefOr[js.Array[Double]] = js.undefined
  var summary: String
}

object PostPullRequestParams {
  @scala.inline
  def apply(
    base: String,
    branch: String,
    description: String,
    summary: String,
    assigneeId: js.UndefOr[Double] = js.undefined,
    attachmentId: js.Array[Double] = null,
    issueId: js.UndefOr[Double] = js.undefined,
    notifiedUserId: js.Array[Double] = null
  ): PostPullRequestParams = {
    val __obj = js.Dynamic.literal(base = base.asInstanceOf[js.Any], branch = branch.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    if (!js.isUndefined(assigneeId)) __obj.updateDynamic("assigneeId")(assigneeId.get.asInstanceOf[js.Any])
    if (attachmentId != null) __obj.updateDynamic("attachmentId")(attachmentId.asInstanceOf[js.Any])
    if (!js.isUndefined(issueId)) __obj.updateDynamic("issueId")(issueId.get.asInstanceOf[js.Any])
    if (notifiedUserId != null) __obj.updateDynamic("notifiedUserId")(notifiedUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostPullRequestParams]
  }
}

