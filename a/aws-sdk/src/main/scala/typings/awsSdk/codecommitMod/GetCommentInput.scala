package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetCommentInput extends StObject {
  
  /**
    * The unique, system-generated ID of the comment. To get this ID, use GetCommentsForComparedCommit or GetCommentsForPullRequest.
    */
  var commentId: CommentId
}
object GetCommentInput {
  
  inline def apply(commentId: CommentId): GetCommentInput = {
    val __obj = js.Dynamic.literal(commentId = commentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetCommentInput]
  }
  
  extension [Self <: GetCommentInput](x: Self) {
    
    inline def setCommentId(value: CommentId): Self = StObject.set(x, "commentId", value.asInstanceOf[js.Any])
  }
}
