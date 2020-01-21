package typings.backlogJs.mod.Option.Project

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostStarParams extends js.Object {
  var commentId: js.UndefOr[Double] = js.undefined
  var issueId: js.UndefOr[Double] = js.undefined
  var pullRequestCommentId: js.UndefOr[Double] = js.undefined
  var pullRequestId: js.UndefOr[Double] = js.undefined
  var wikiId: js.UndefOr[Double] = js.undefined
}

object PostStarParams {
  @scala.inline
  def apply(
    commentId: Int | Double = null,
    issueId: Int | Double = null,
    pullRequestCommentId: Int | Double = null,
    pullRequestId: Int | Double = null,
    wikiId: Int | Double = null
  ): PostStarParams = {
    val __obj = js.Dynamic.literal()
    if (commentId != null) __obj.updateDynamic("commentId")(commentId.asInstanceOf[js.Any])
    if (issueId != null) __obj.updateDynamic("issueId")(issueId.asInstanceOf[js.Any])
    if (pullRequestCommentId != null) __obj.updateDynamic("pullRequestCommentId")(pullRequestCommentId.asInstanceOf[js.Any])
    if (pullRequestId != null) __obj.updateDynamic("pullRequestId")(pullRequestId.asInstanceOf[js.Any])
    if (wikiId != null) __obj.updateDynamic("wikiId")(wikiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostStarParams]
  }
}

