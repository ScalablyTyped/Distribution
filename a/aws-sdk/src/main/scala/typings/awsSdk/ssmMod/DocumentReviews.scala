package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentReviews extends StObject {
  
  /**
    * The action to take on a document approval review request.
    */
  var Action: DocumentReviewAction
  
  /**
    * A comment entered by a user in your organization about the document review request.
    */
  var Comment: js.UndefOr[DocumentReviewCommentList] = js.undefined
}
object DocumentReviews {
  
  inline def apply(Action: DocumentReviewAction): DocumentReviews = {
    val __obj = js.Dynamic.literal(Action = Action.asInstanceOf[js.Any])
    __obj.asInstanceOf[DocumentReviews]
  }
  
  extension [Self <: DocumentReviews](x: Self) {
    
    inline def setAction(value: DocumentReviewAction): Self = StObject.set(x, "Action", value.asInstanceOf[js.Any])
    
    inline def setComment(value: DocumentReviewCommentList): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setCommentVarargs(value: DocumentReviewCommentSource*): Self = StObject.set(x, "Comment", js.Array(value*))
  }
}
