package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Comment extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the person who posted the comment.
    */
  var authorArn: js.UndefOr[Arn] = js.native
  /**
    * The emoji reactions to a comment, if any, submitted by the user whose credentials are associated with the call to the API.
    */
  var callerReactions: js.UndefOr[CallerReactions] = js.native
  /**
    * A unique, client-generated idempotency token that, when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request returns information about the initial request that used that token.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  /**
    * The system-generated comment ID.
    */
  var commentId: js.UndefOr[CommentId] = js.native
  /**
    * The content of the comment.
    */
  var content: js.UndefOr[Content] = js.native
  /**
    * The date and time the comment was created, in timestamp format.
    */
  var creationDate: js.UndefOr[CreationDate] = js.native
  /**
    * A Boolean value indicating whether the comment has been deleted.
    */
  var deleted: js.UndefOr[IsCommentDeleted] = js.native
  /**
    * The ID of the comment for which this comment is a reply, if any.
    */
  var inReplyTo: js.UndefOr[CommentId] = js.native
  /**
    * The date and time the comment was most recently modified, in timestamp format.
    */
  var lastModifiedDate: js.UndefOr[LastModifiedDate] = js.native
  /**
    * A string to integer map that represents the number of individual users who have responded to a comment with the specified reactions.
    */
  var reactionCounts: js.UndefOr[ReactionCountsMap] = js.native
}

object Comment {
  @scala.inline
  def apply(
    authorArn: Arn = null,
    callerReactions: CallerReactions = null,
    clientRequestToken: ClientRequestToken = null,
    commentId: CommentId = null,
    content: Content = null,
    creationDate: CreationDate = null,
    deleted: js.UndefOr[IsCommentDeleted] = js.undefined,
    inReplyTo: CommentId = null,
    lastModifiedDate: LastModifiedDate = null,
    reactionCounts: ReactionCountsMap = null
  ): Comment = {
    val __obj = js.Dynamic.literal()
    if (authorArn != null) __obj.updateDynamic("authorArn")(authorArn.asInstanceOf[js.Any])
    if (callerReactions != null) __obj.updateDynamic("callerReactions")(callerReactions.asInstanceOf[js.Any])
    if (clientRequestToken != null) __obj.updateDynamic("clientRequestToken")(clientRequestToken.asInstanceOf[js.Any])
    if (commentId != null) __obj.updateDynamic("commentId")(commentId.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (!js.isUndefined(deleted)) __obj.updateDynamic("deleted")(deleted.get.asInstanceOf[js.Any])
    if (inReplyTo != null) __obj.updateDynamic("inReplyTo")(inReplyTo.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    if (reactionCounts != null) __obj.updateDynamic("reactionCounts")(reactionCounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[Comment]
  }
}

