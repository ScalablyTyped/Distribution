package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetCommentInput extends js.Object {
  /**
    * The unique, system-generated ID of the comment. To get this ID, use GetCommentsForComparedCommit or GetCommentsForPullRequest.
    */
  var commentId: CommentId = js.native
}

object GetCommentInput {
  @scala.inline
  def apply(commentId: CommentId): GetCommentInput = {
    val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommentInput]
  }
  @scala.inline
  implicit class GetCommentInputOps[Self <: GetCommentInput] (val x: Self) extends AnyVal {
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
  }
  
}

