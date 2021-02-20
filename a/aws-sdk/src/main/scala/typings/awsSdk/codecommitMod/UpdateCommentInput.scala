package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateCommentInput extends StObject {
  
  /**
    * The system-generated ID of the comment you want to update. To get this ID, use GetCommentsForComparedCommit or GetCommentsForPullRequest.
    */
  var commentId: CommentId = js.native
  
  /**
    * The updated content to replace the existing content of the comment.
    */
  var content: Content = js.native
}
object UpdateCommentInput {
  
  @scala.inline
  def apply(commentId: CommentId, content: Content): UpdateCommentInput = {
    val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCommentInput]
  }
  
  @scala.inline
  implicit class UpdateCommentInputMutableBuilder[Self <: UpdateCommentInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommentId(value: CommentId): Self = StObject.set(x, "commentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContent(value: Content): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
  }
}
