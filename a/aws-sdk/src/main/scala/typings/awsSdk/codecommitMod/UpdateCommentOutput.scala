package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCommentOutput extends js.Object {
  /**
    * Information about the updated comment.
    */
  var comment: js.UndefOr[Comment] = js.native
}

object UpdateCommentOutput {
  @scala.inline
  def apply(comment: Comment = null): UpdateCommentOutput = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCommentOutput]
  }
}

