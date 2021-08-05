package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCodeReviewResponse extends StObject {
  
  var CodeReview: js.UndefOr[typings.awsSdk.codegurureviewerMod.CodeReview] = js.undefined
}
object CreateCodeReviewResponse {
  
  inline def apply(): CreateCodeReviewResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCodeReviewResponse]
  }
  
  extension [Self <: CreateCodeReviewResponse](x: Self) {
    
    inline def setCodeReview(value: CodeReview): Self = StObject.set(x, "CodeReview", value.asInstanceOf[js.Any])
    
    inline def setCodeReviewUndefined: Self = StObject.set(x, "CodeReview", js.undefined)
  }
}
