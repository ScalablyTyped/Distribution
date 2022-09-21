package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Comment extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the person who posted the comment.
    */
  var authorArn: js.UndefOr[Arn] = js.undefined
  
  /**
    * The emoji reactions to a comment, if any, submitted by the user whose credentials are associated with the call to the API.
    */
  var callerReactions: js.UndefOr[CallerReactions] = js.undefined
  
  /**
    * A unique, client-generated idempotency token that, when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request returns information about the initial request that used that token.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  
  /**
    * The system-generated comment ID.
    */
  var commentId: js.UndefOr[CommentId] = js.undefined
  
  /**
    * The content of the comment.
    */
  var content: js.UndefOr[Content] = js.undefined
  
  /**
    * The date and time the comment was created, in timestamp format.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A Boolean value indicating whether the comment has been deleted.
    */
  var deleted: js.UndefOr[IsCommentDeleted] = js.undefined
  
  /**
    * The ID of the comment for which this comment is a reply, if any.
    */
  var inReplyTo: js.UndefOr[CommentId] = js.undefined
  
  /**
    * The date and time the comment was most recently modified, in timestamp format.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * A string to integer map that represents the number of individual users who have responded to a comment with the specified reactions.
    */
  var reactionCounts: js.UndefOr[ReactionCountsMap] = js.undefined
}
object Comment {
  
  inline def apply(): Comment = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Comment]
  }
  
  extension [Self <: Comment](x: Self) {
    
    inline def setAuthorArn(value: Arn): Self = StObject.set(x, "authorArn", value.asInstanceOf[js.Any])
    
    inline def setAuthorArnUndefined: Self = StObject.set(x, "authorArn", js.undefined)
    
    inline def setCallerReactions(value: CallerReactions): Self = StObject.set(x, "callerReactions", value.asInstanceOf[js.Any])
    
    inline def setCallerReactionsUndefined: Self = StObject.set(x, "callerReactions", js.undefined)
    
    inline def setCallerReactionsVarargs(value: ReactionValue*): Self = StObject.set(x, "callerReactions", js.Array(value*))
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    inline def setCommentId(value: CommentId): Self = StObject.set(x, "commentId", value.asInstanceOf[js.Any])
    
    inline def setCommentIdUndefined: Self = StObject.set(x, "commentId", js.undefined)
    
    inline def setContent(value: Content): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setDeleted(value: IsCommentDeleted): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
    
    inline def setDeletedUndefined: Self = StObject.set(x, "deleted", js.undefined)
    
    inline def setInReplyTo(value: CommentId): Self = StObject.set(x, "inReplyTo", value.asInstanceOf[js.Any])
    
    inline def setInReplyToUndefined: Self = StObject.set(x, "inReplyTo", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    inline def setReactionCounts(value: ReactionCountsMap): Self = StObject.set(x, "reactionCounts", value.asInstanceOf[js.Any])
    
    inline def setReactionCountsUndefined: Self = StObject.set(x, "reactionCounts", js.undefined)
  }
}
