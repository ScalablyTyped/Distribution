package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationData extends StObject {
  
  /**
    * The recommended document.
    */
  var document: Document
  
  /**
    * The identifier of the recommendation.
    */
  var recommendationId: String
  
  /**
    * The relevance level of the recommendation.
    */
  var relevanceLevel: js.UndefOr[RelevanceLevel] = js.undefined
  
  /**
    * The relevance score of the recommendation.
    */
  var relevanceScore: js.UndefOr[RelevanceScore] = js.undefined
  
  /**
    * The type of recommendation.
    */
  var `type`: js.UndefOr[RecommendationType] = js.undefined
}
object RecommendationData {
  
  inline def apply(document: Document, recommendationId: String): RecommendationData = {
    val __obj = js.Dynamic.literal(document = document.asInstanceOf[js.Any], recommendationId = recommendationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendationData]
  }
  
  extension [Self <: RecommendationData](x: Self) {
    
    inline def setDocument(value: Document): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setRecommendationId(value: String): Self = StObject.set(x, "recommendationId", value.asInstanceOf[js.Any])
    
    inline def setRelevanceLevel(value: RelevanceLevel): Self = StObject.set(x, "relevanceLevel", value.asInstanceOf[js.Any])
    
    inline def setRelevanceLevelUndefined: Self = StObject.set(x, "relevanceLevel", js.undefined)
    
    inline def setRelevanceScore(value: RelevanceScore): Self = StObject.set(x, "relevanceScore", value.asInstanceOf[js.Any])
    
    inline def setRelevanceScoreUndefined: Self = StObject.set(x, "relevanceScore", js.undefined)
    
    inline def setType(value: RecommendationType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
