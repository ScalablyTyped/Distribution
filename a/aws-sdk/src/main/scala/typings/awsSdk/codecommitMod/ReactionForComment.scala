package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactionForComment extends js.Object {
  /**
    * The reaction for a specified comment.
    */
  var reaction: js.UndefOr[ReactionValueFormats] = js.native
  /**
    * The Amazon Resource Names (ARNs) of users who have provided reactions to the comment.
    */
  var reactionUsers: js.UndefOr[ReactionUsersList] = js.native
  /**
    * A numerical count of users who reacted with the specified emoji whose identities have been subsequently deleted from IAM. While these IAM users or roles no longer exist, the reactions might still appear in total reaction counts.
    */
  var reactionsFromDeletedUsersCount: js.UndefOr[Count] = js.native
}

object ReactionForComment {
  @scala.inline
  def apply(): ReactionForComment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactionForComment]
  }
  @scala.inline
  implicit class ReactionForCommentOps[Self <: ReactionForComment] (val x: Self) extends AnyVal {
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
    def setReaction(value: ReactionValueFormats): Self = this.set("reaction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReaction: Self = this.set("reaction", js.undefined)
    @scala.inline
    def setReactionUsersVarargs(value: Arn*): Self = this.set("reactionUsers", js.Array(value :_*))
    @scala.inline
    def setReactionUsers(value: ReactionUsersList): Self = this.set("reactionUsers", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReactionUsers: Self = this.set("reactionUsers", js.undefined)
    @scala.inline
    def setReactionsFromDeletedUsersCount(value: Count): Self = this.set("reactionsFromDeletedUsersCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReactionsFromDeletedUsersCount: Self = this.set("reactionsFromDeletedUsersCount", js.undefined)
  }
  
}

