package typings.awsSdk.workdocsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateCommentResponse extends js.Object {
  /**
    * The comment that has been created.
    */
  var Comment: js.UndefOr[typings.awsSdk.workdocsMod.Comment] = js.native
}

object CreateCommentResponse {
  @scala.inline
  def apply(Comment: Comment = null): CreateCommentResponse = {
    val __obj = js.Dynamic.literal()
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCommentResponse]
  }
}

