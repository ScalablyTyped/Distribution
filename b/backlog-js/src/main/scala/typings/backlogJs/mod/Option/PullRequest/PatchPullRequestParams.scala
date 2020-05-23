package typings.backlogJs.mod.Option.PullRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatchPullRequestParams extends js.Object {
  var assigneeId: js.UndefOr[Double] = js.undefined
  var comment: js.UndefOr[js.Array[String]] = js.undefined
  var description: js.UndefOr[String] = js.undefined
  var issueId: js.UndefOr[Double] = js.undefined
  var notifiedUserId: js.UndefOr[js.Array[Double]] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
}

object PatchPullRequestParams {
  @scala.inline
  def apply(
    assigneeId: js.UndefOr[Double] = js.undefined,
    comment: js.Array[String] = null,
    description: String = null,
    issueId: js.UndefOr[Double] = js.undefined,
    notifiedUserId: js.Array[Double] = null,
    summary: String = null
  ): PatchPullRequestParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(assigneeId)) __obj.updateDynamic("assigneeId")(assigneeId.get.asInstanceOf[js.Any])
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(issueId)) __obj.updateDynamic("issueId")(issueId.get.asInstanceOf[js.Any])
    if (notifiedUserId != null) __obj.updateDynamic("notifiedUserId")(notifiedUserId.asInstanceOf[js.Any])
    if (summary != null) __obj.updateDynamic("summary")(summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatchPullRequestParams]
  }
}

