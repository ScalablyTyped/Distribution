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
}

