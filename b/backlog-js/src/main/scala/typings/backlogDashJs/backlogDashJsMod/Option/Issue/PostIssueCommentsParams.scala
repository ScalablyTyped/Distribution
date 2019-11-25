package typings.backlogDashJs.backlogDashJsMod.Option.Issue

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PostIssueCommentsParams extends js.Object {
  var attachmentId: js.UndefOr[js.Array[Double]] = js.undefined
  var content: String
  var notifiedUserId: js.UndefOr[js.Array[Double]] = js.undefined
}

object PostIssueCommentsParams {
  @scala.inline
  def apply(content: String, attachmentId: js.Array[Double] = null, notifiedUserId: js.Array[Double] = null): PostIssueCommentsParams = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    if (attachmentId != null) __obj.updateDynamic("attachmentId")(attachmentId.asInstanceOf[js.Any])
    if (notifiedUserId != null) __obj.updateDynamic("notifiedUserId")(notifiedUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostIssueCommentsParams]
  }
}

