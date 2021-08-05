package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationSummary extends StObject {
  
  /**
    * The AWS account ID of the recommendation summary.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * The resource type of the recommendation.
    */
  var recommendationResourceType: js.UndefOr[RecommendationSourceType] = js.undefined
  
  /**
    * An array of objects that describe a recommendation summary.
    */
  var summaries: js.UndefOr[Summaries] = js.undefined
}
object RecommendationSummary {
  
  inline def apply(): RecommendationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationSummary]
  }
  
  extension [Self <: RecommendationSummary](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setRecommendationResourceType(value: RecommendationSourceType): Self = StObject.set(x, "recommendationResourceType", value.asInstanceOf[js.Any])
    
    inline def setRecommendationResourceTypeUndefined: Self = StObject.set(x, "recommendationResourceType", js.undefined)
    
    inline def setSummaries(value: Summaries): Self = StObject.set(x, "summaries", value.asInstanceOf[js.Any])
    
    inline def setSummariesUndefined: Self = StObject.set(x, "summaries", js.undefined)
    
    inline def setSummariesVarargs(value: Summary*): Self = StObject.set(x, "summaries", js.Array(value :_*))
  }
}
