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
  
  @scala.inline
  def apply(): RecommendationSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationSource]
  }
  
  @scala.inline
  implicit class RecommendationSourceMutableBuilder[Self <: RecommendationSource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRecommendationSourceArn(value: RecommendationSourceArn): Self = StObject.set(x, "recommendationSourceArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationSourceArnUndefined: Self = StObject.set(x, "recommendationSourceArn", js.undefined)
    
    @scala.inline
    def setRecommendationSourceType(value: RecommendationSourceType): Self = StObject.set(x, "recommendationSourceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRecommendationSourceTypeUndefined: Self = StObject.set(x, "recommendationSourceType", js.undefined)
  }
}
