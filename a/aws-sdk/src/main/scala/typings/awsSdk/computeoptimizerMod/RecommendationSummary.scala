package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecommendationSummary extends StObject {
  
  /**
    * The AWS account ID of the recommendation summary.
    */
  var accountId: js.UndefOr[AccountId] = js.native
  
  /**
    * The resource type of the recommendation.
    */
  var recommendationResourceType: js.UndefOr[RecommendationSourceType] = js.native
  
  /**
    * An array of objects that describe a recommendation summary.
    */
  var summaries: js.UndefOr[Summaries] = js.native
}
object RecommendationSummary {
  
  @scala.inline
  def apply(): RecommendationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationSummary]
  }
  
  @scala.inline
  implicit class RecommendationSummaryMutableBuilder[Self <: RecommendationSummary] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    @scala.inline
    def setRecommendationResourceType(value: RecommendationSourceType): Self = StObject.set(x, "recommendationResourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationResourceTypeUndefined: Self = StObject.set(x, "recommendationResourceType", js.undefined)
    
    @scala.inline
    def setSummaries(value: Summaries): Self = StObject.set(x, "summaries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummariesUndefined: Self = StObject.set(x, "summaries", js.undefined)
    
    @scala.inline
    def setSummariesVarargs(value: Summary*): Self = StObject.set(x, "summaries", js.Array(value :_*))
  }
}
