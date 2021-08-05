package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecommendationFeedbackRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the  CodeReview  object. 
    */
  var CodeReviewArn: Arn
  
  /**
    *  The maximum number of results that are returned per call. The default is 100. 
    */
  var MaxResults: js.UndefOr[typings.awsSdk.codegurureviewerMod.MaxResults] = js.undefined
  
  /**
    *  If nextToken is returned, there are more results available. The value of nextToken is a unique pagination token for each page. Make the call again using the returned token to retrieve the next page. Keep all other arguments unchanged. 
    */
  var NextToken: js.UndefOr[typings.awsSdk.codegurureviewerMod.NextToken] = js.undefined
  
  /**
    *  Used to query the recommendation feedback for a given recommendation. 
    */
  var RecommendationIds: js.UndefOr[typings.awsSdk.codegurureviewerMod.RecommendationIds] = js.undefined
  
  /**
    *  An AWS user's account ID or Amazon Resource Name (ARN). Use this ID to query the recommendation feedback for a code review from that user.   The UserId is an IAM principal that can be specified as an AWS account ID or an Amazon Resource Name (ARN). For more information, see  Specifying a Principal in the AWS Identity and Access Management User Guide. 
    */
  var UserIds: js.UndefOr[typings.awsSdk.codegurureviewerMod.UserIds] = js.undefined
}
object ListRecommendationFeedbackRequest {
  
  inline def apply(CodeReviewArn: Arn): ListRecommendationFeedbackRequest = {
    val __obj = js.Dynamic.literal(CodeReviewArn = CodeReviewArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListRecommendationFeedbackRequest]
  }
  
  extension [Self <: ListRecommendationFeedbackRequest](x: Self) {
    
    inline def setCodeReviewArn(value: Arn): Self = StObject.set(x, "CodeReviewArn", value.asInstanceOf[js.Any])
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRecommendationIds(value: RecommendationIds): Self = StObject.set(x, "RecommendationIds", value.asInstanceOf[js.Any])
    
    inline def setRecommendationIdsUndefined: Self = StObject.set(x, "RecommendationIds", js.undefined)
    
    inline def setRecommendationIdsVarargs(value: RecommendationId*): Self = StObject.set(x, "RecommendationIds", js.Array(value :_*))
    
    inline def setUserIds(value: UserIds): Self = StObject.set(x, "UserIds", value.asInstanceOf[js.Any])
    
    inline def setUserIdsUndefined: Self = StObject.set(x, "UserIds", js.undefined)
    
    inline def setUserIdsVarargs(value: UserId*): Self = StObject.set(x, "UserIds", js.Array(value :_*))
  }
}
