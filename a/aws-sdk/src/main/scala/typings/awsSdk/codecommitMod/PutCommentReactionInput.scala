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
  @scala.inline
  implicit class PutCommentReactionInputOps[Self <: PutCommentReactionInput] (val x: Self) extends AnyVal {
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
    def setReactionValue(value: ReactionValue): Self = this.set("reactionValue", value.asInstanceOf[js.Any])
  }
  
}

