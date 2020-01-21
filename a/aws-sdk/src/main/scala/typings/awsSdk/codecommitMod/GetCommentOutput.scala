package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCommentOutput extends js.Object {
  /**
    * The contents of the comment.
    */
  var comment: js.UndefOr[Comment] = js.native
}

object GetCommentOutput {
  @scala.inline
  def apply(comment: Comment = null): GetCommentOutput = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommentOutput]
  }
}

