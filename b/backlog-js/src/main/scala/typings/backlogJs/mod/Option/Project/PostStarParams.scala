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
    commentId: js.UndefOr[Double] = js.undefined,
    issueId: js.UndefOr[Double] = js.undefined,
    pullRequestCommentId: js.UndefOr[Double] = js.undefined,
    pullRequestId: js.UndefOr[Double] = js.undefined,
    wikiId: js.UndefOr[Double] = js.undefined
  ): PostStarParams = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(commentId)) __obj.updateDynamic("commentId")(commentId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(issueId)) __obj.updateDynamic("issueId")(issueId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pullRequestCommentId)) __obj.updateDynamic("pullRequestCommentId")(pullRequestCommentId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pullRequestId)) __obj.updateDynamic("pullRequestId")(pullRequestId.get.asInstanceOf[js.Any])
    if (!js.isUndefined(wikiId)) __obj.updateDynamic("wikiId")(wikiId.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostStarParams]
  }
}

