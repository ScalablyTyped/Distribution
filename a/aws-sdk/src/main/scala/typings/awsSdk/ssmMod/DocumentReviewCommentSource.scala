package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DocumentReviewCommentSource extends StObject {
  
  /**
    * The content of a comment entered by a user who requests a review of a new document version, or who reviews the new version.
    */
  var Content: js.UndefOr[DocumentReviewComment] = js.undefined
  
  /**
    * The type of information added to a review request. Currently, only the value Comment is supported.
    */
  var Type: js.UndefOr[DocumentReviewCommentType] = js.undefined
}
object DocumentReviewCommentSource {
  
  inline def apply(): DocumentReviewCommentSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DocumentReviewCommentSource]
  }
  
  extension [Self <: DocumentReviewCommentSource](x: Self) {
    
    inline def setContent(value: DocumentReviewComment): Self = StObject.set(x, "Content", value.asInstanceOf[js.Any])
    
    inline def setContentUndefined: Self = StObject.set(x, "Content", js.undefined)
    
    inline def setType(value: DocumentReviewCommentType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
