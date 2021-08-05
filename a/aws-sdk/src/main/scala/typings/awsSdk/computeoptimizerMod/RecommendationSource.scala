package typings.awsSdk.computeoptimizerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationSource extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the recommendation source.
    */
  var recommendationSourceArn: js.UndefOr[RecommendationSourceArn] = js.undefined
  
  /**
    * The resource type of the recommendation source.
    */
  var recommendationSourceType: js.UndefOr[RecommendationSourceType] = js.undefined
}
object RecommendationSource {
  
  inline def apply(): RecommendationSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationSource]
  }
  
  extension [Self <: RecommendationSource](x: Self) {
    
    inline def setRecommendationSourceArn(value: RecommendationSourceArn): Self = StObject.set(x, "recommendationSourceArn", value.asInstanceOf[js.Any])
    
    inline def setRecommendationSourceArnUndefined: Self = StObject.set(x, "recommendationSourceArn", js.undefined)
    
    inline def setRecommendationSourceType(value: RecommendationSourceType): Self = StObject.set(x, "recommendationSourceType", value.asInstanceOf[js.Any])
    
    inline def setRecommendationSourceTypeUndefined: Self = StObject.set(x, "recommendationSourceType", js.undefined)
  }
}
