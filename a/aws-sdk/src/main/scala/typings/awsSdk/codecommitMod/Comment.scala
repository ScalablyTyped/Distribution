package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Comment extends StObject {
  
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
  implicit class CommentMutableBuilder[Self <: Comment] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorArn(value: Arn): Self = StObject.set(x, "authorArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorArnUndefined: Self = StObject.set(x, "authorArn", js.undefined)
    
    @scala.inline
    def setCallerReactions(value: CallerReactions): Self = StObject.set(x, "callerReactions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCallerReactionsUndefined: Self = StObject.set(x, "callerReactions", js.undefined)
    
    @scala.inline
    def setCallerReactionsVarargs(value: ReactionValue*): Self = StObject.set(x, "callerReactions", js.Array(value :_*))
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    @scala.inline
    def setCommentId(value: CommentId): Self = StObject.set(x, "commentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentIdUndefined: Self = StObject.set(x, "commentId", js.undefined)
    
    @scala.inline
    def setContent(value: Content): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    @scala.inline
    def setCreationDate(value: CreationDate): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setDeleted(value: IsCommentDeleted): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    @scala.inline
    def setInReplyTo(value: CommentId): Self = StObject.set(x, "inReplyTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInReplyToUndefined: Self = StObject.set(x, "inReplyTo", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: LastModifiedDate): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    @scala.inline
    def setReactionCounts(value: ReactionCountsMap): Self = StObject.set(x, "reactionCounts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReactionCountsUndefined: Self = StObject.set(x, "reactionCounts", js.undefined)
  }
}
