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
  def apply(
    reaction: ReactionValueFormats = null,
    reactionUsers: ReactionUsersList = null,
    reactionsFromDeletedUsersCount: js.UndefOr[Count] = js.undefined
  ): ReactionForComment = {
    val __obj = js.Dynamic.literal()
    if (reaction != null) __obj.updateDynamic("reaction")(reaction.asInstanceOf[js.Any])
    if (reactionUsers != null) __obj.updateDynamic("reactionUsers")(reactionUsers.asInstanceOf[js.Any])
    if (!js.isUndefined(reactionsFromDeletedUsersCount)) __obj.updateDynamic("reactionsFromDeletedUsersCount")(reactionsFromDeletedUsersCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactionForComment]
  }
}

