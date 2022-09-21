package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecommendationsRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the CodeReview object. 
    */
  var CodeReviewArn: Arn
  
  /**
    * The maximum number of results that are returned per call. The default is 100.
    */
  var MaxResults: js.UndefOr[ListRecommendationsMaxResults] = js.undefined
  
  /**
    * Pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.codegurureviewerMod.NextToken] = js.undefined
}
object ListRecommendationsRequest {
  
  inline def apply(CodeReviewArn: Arn): ListRecommendationsRequest = {
    val __obj = js.Dynamic.literal(CodeReviewArn = CodeReviewArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRecommendationsRequest]
  }
  
  extension [Self <: ListRecommendationsRequest](x: Self) {
    
    inline def setCodeReviewArn(value: Arn): Self = StObject.set(x, "CodeReviewArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: ListRecommendationsMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
