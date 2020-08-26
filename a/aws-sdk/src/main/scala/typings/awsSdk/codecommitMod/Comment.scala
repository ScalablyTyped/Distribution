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
  def apply(): Comment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Comment]
  }
  @scala.inline
  implicit class CommentOps[Self <: Comment] (val x: Self) extends AnyVal {
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
    def setAuthorArn(value: Arn): Self = this.set("authorArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorArn: Self = this.set("authorArn", js.undefined)
    @scala.inline
    def setCallerReactionsVarargs(value: ReactionValue*): Self = this.set("callerReactions", js.Array(value :_*))
    @scala.inline
    def setCallerReactions(value: CallerReactions): Self = this.set("callerReactions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCallerReactions: Self = this.set("callerReactions", js.undefined)
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = this.set("clientRequestToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClientRequestToken: Self = this.set("clientRequestToken", js.undefined)
    @scala.inline
    def setCommentId(value: CommentId): Self = this.set("commentId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommentId: Self = this.set("commentId", js.undefined)
    @scala.inline
    def setContent(value: Content): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContent: Self = this.set("content", js.undefined)
    @scala.inline
    def setCreationDate(value: CreationDate): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setDeleted(value: IsCommentDeleted): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeleted: Self = this.set("deleted", js.undefined)
    @scala.inline
    def setInReplyTo(value: CommentId): Self = this.set("inReplyTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInReplyTo: Self = this.set("inReplyTo", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: LastModifiedDate): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("lastModifiedDate", js.undefined)
    @scala.inline
    def setReactionCounts(value: ReactionCountsMap): Self = this.set("reactionCounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReactionCounts: Self = this.set("reactionCounts", js.undefined)
  }
  
}

