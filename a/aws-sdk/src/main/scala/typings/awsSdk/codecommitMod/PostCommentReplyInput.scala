package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PostCommentReplyInput extends StObject {
  
  /**
    * A unique, client-generated idempotency token that, when provided in a request, ensures the request cannot be repeated with a changed parameter. If a request is received with the same parameters and a token is included, the request returns information about the initial request that used that token.
    */
  var clientRequestToken: js.UndefOr[ClientRequestToken] = js.native
  
  /**
    * The contents of your reply to a comment.
    */
  var content: Content = js.native
  
  /**
    * The system-generated ID of the comment to which you want to reply. To get this ID, use GetCommentsForComparedCommit or GetCommentsForPullRequest.
    */
  var inReplyTo: CommentId = js.native
}
object PostCommentReplyInput {
  
  @scala.inline
  def apply(content: Content, inReplyTo: CommentId): PostCommentReplyInput = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any], inReplyTo = inReplyTo.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCommentReplyInput]
  }
  
  @scala.inline
  implicit class PostCommentReplyInputMutableBuilder[Self <: PostCommentReplyInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "clientRequestToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientRequestTokenUndefined: Self = StObject.set(x, "clientRequestToken", js.undefined)
    
    @scala.inline
    def setContent(value: Content): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInReplyTo(value: CommentId): Self = StObject.set(x, "inReplyTo", value.asInstanceOf[js.Any])
  }
}
