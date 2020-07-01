package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutCommentReactionInput extends js.Object {
  /**
    * The ID of the comment to which you want to add or update a reaction.
    */
  var commentId: CommentId = js.native
  /**
    * The emoji reaction you want to add or update. To remove a reaction, provide a value of blank or null. You can also provide the value of none. For information about emoji reaction values supported in AWS CodeCommit, see the AWS CodeCommit User Guide.
    */
  var reactionValue: ReactionValue = js.native
}

object PutCommentReactionInput {
  @scala.inline
  def apply(commentId: CommentId, reactionValue: ReactionValue): PutCommentReactionInput = {
    val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any], reactionValue = reactionValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutCommentReactionInput]
  }
}

