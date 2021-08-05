package typings.awsSdk.codegurureviewerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationFeedbackSummary extends StObject {
  
  /**
    *  List for storing reactions. Reactions are utf-8 text code for emojis. 
    */
  var Reactions: js.UndefOr[typings.awsSdk.codegurureviewerMod.Reactions] = js.undefined
  
  /**
    *  The recommendation ID that can be used to track the provided recommendations. Later on it can be used to collect the feedback. 
    */
  var RecommendationId: js.UndefOr[typings.awsSdk.codegurureviewerMod.RecommendationId] = js.undefined
  
  /**
    *  The ID of the user that gave the feedback.   The UserId is an IAM principal that can be specified as an AWS account ID or an Amazon Resource Name (ARN). For more information, see  Specifying a Principal in the AWS Identity and Access Management User Guide. 
    */
  var UserId: js.UndefOr[typings.awsSdk.codegurureviewerMod.UserId] = js.undefined
}
object RecommendationFeedbackSummary {
  
  inline def apply(): RecommendationFeedbackSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationFeedbackSummary]
  }
  
  extension [Self <: RecommendationFeedbackSummary](x: Self) {
    
    inline def setReactions(value: Reactions): Self = StObject.set(x, "Reactions", value.asInstanceOf[js.Any])
    
    inline def setReactionsUndefined: Self = StObject.set(x, "Reactions", js.undefined)
    
    inline def setReactionsVarargs(value: Reaction*): Self = StObject.set(x, "Reactions", js.Array(value :_*))
    
    inline def setRecommendationId(value: RecommendationId): Self = StObject.set(x, "RecommendationId", value.asInstanceOf[js.Any])
    
    inline def setRecommendationIdUndefined: Self = StObject.set(x, "RecommendationId", js.undefined)
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
