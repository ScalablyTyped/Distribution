package typings.awsSdk.resiliencehubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRecommendationTemplatesResponse extends StObject {
  
  /**
    * The token for the next set of results, or null if there are no more results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * The recommendation templates for the Resilience Hub applications.
    */
  var recommendationTemplates: js.UndefOr[RecommendationTemplateList] = js.undefined
}
object ListRecommendationTemplatesResponse {
  
  inline def apply(): ListRecommendationTemplatesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRecommendationTemplatesResponse]
  }
  
  extension [Self <: ListRecommendationTemplatesResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setRecommendationTemplates(value: RecommendationTemplateList): Self = StObject.set(x, "recommendationTemplates", value.asInstanceOf[js.Any])
    
    inline def setRecommendationTemplatesUndefined: Self = StObject.set(x, "recommendationTemplates", js.undefined)
    
    inline def setRecommendationTemplatesVarargs(value: RecommendationTemplate*): Self = StObject.set(x, "recommendationTemplates", js.Array(value*))
  }
}
