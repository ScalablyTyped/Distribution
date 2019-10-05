package typings.backlogDashJs.backlogDashJsMod.Option.PullRequest

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostPullRequestCommentsParams extends js.Object {
  var content: String
  var notifiedUserId: js.UndefOr[js.Array[Double]] = js.undefined
}

object PostPullRequestCommentsParams {
  @scala.inline
  def apply(content: String, notifiedUserId: js.Array[Double] = null): PostPullRequestCommentsParams = {
    val __obj = js.Dynamic.literal(content = content)
    if (notifiedUserId != null) __obj.updateDynamic("notifiedUserId")(notifiedUserId)
    __obj.asInstanceOf[PostPullRequestCommentsParams]
  }
}

