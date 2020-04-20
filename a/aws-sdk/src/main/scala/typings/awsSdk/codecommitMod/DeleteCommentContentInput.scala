package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteCommentContentInput extends js.Object {
  /**
    * The unique, system-generated ID of the comment. To get this ID, use GetCommentsForComparedCommit or GetCommentsForPullRequest.
    */
  var commentId: CommentId = js.native
}

object DeleteCommentContentInput {
  @scala.inline
  def apply(commentId: CommentId): DeleteCommentContentInput = {
    val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteCommentContentInput]
  }
}

