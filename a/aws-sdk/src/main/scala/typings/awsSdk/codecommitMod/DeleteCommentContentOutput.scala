package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCommentContentOutput extends js.Object {
  /**
    * Information about the comment you just deleted.
    */
  var comment: js.UndefOr[Comment] = js.native
}

object DeleteCommentContentOutput {
  @scala.inline
  def apply(comment: Comment = null): DeleteCommentContentOutput = {
    val __obj = js.Dynamic.literal()
    if (comment != null) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCommentContentOutput]
  }
}

