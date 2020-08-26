package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCommentInput extends js.Object {
  /**
    * The system-generated ID of the comment you want to update. To get this ID, use GetCommentsForComparedCommit or GetCommentsForPullRequest.
    */
  var commentId: CommentId = js.native
  /**
    * The updated content to replace the existing content of the comment.
    */
  var content: Content = js.native
}

object UpdateCommentInput {
  @scala.inline
  def apply(commentId: CommentId, content: Content): UpdateCommentInput = {
    val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCommentInput]
  }
  @scala.inline
  implicit class UpdateCommentInputOps[Self <: UpdateCommentInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommentId(value: CommentId): Self = this.set("commentId", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: Content): Self = this.set("content", value.asInstanceOf[js.Any])
  }
  
}

