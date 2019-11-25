package typings.backlogDashJs.backlogDashJsMod.Option.PullRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPullRequestsParams extends js.Object {
  var assigneeId: js.UndefOr[js.Array[Double]] = js.undefined
  var count: js.UndefOr[Double] = js.undefined
  var createdUserId: js.UndefOr[js.Array[Double]] = js.undefined
  var issueId: js.UndefOr[js.Array[Double]] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var statusId: js.UndefOr[js.Array[Double]] = js.undefined
}

object GetPullRequestsParams {
  @scala.inline
  def apply(
    assigneeId: js.Array[Double] = null,
    count: Int | Double = null,
    createdUserId: js.Array[Double] = null,
    issueId: js.Array[Double] = null,
    offset: Int | Double = null,
    statusId: js.Array[Double] = null
  ): GetPullRequestsParams = {
    val __obj = js.Dynamic.literal()
    if (assigneeId != null) __obj.updateDynamic("assigneeId")(assigneeId.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (createdUserId != null) __obj.updateDynamic("createdUserId")(createdUserId.asInstanceOf[js.Any])
    if (issueId != null) __obj.updateDynamic("issueId")(issueId.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (statusId != null) __obj.updateDynamic("statusId")(statusId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPullRequestsParams]
  }
}

