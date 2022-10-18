package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationTrigger extends StObject {
  
  /**
    * A union type containing information related to the trigger.
    */
  var data: RecommendationTriggerData
  
  /**
    * The identifier of the recommendation trigger.
    */
  var id: Uuid
  
  /**
    * The identifiers of the recommendations.
    */
  var recommendationIds: RecommendationIdList
  
  /**
    * The source of the recommendation trigger.   ISSUE_DETECTION: The corresponding recommendations were triggered by a Contact Lens issue.   RULE_EVALUATION: The corresponding recommendations were triggered by a Contact Lens rule.  
    */
  var source: RecommendationSourceType
  
  /**
    * The type of recommendation trigger.
    */
  var `type`: RecommendationTriggerType
}
object RecommendationTrigger {
  
  inline def apply(
    data: RecommendationTriggerData,
    id: Uuid,
    recommendationIds: RecommendationIdList,
    source: RecommendationSourceType,
    `type`: RecommendationTriggerType
  ): RecommendationTrigger = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], recommendationIds = recommendationIds.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RecommendationTrigger]
  }
  
  extension [Self <: RecommendationTrigger](x: Self) {
    
    inline def setData(value: RecommendationTriggerData): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setRecommendationIds(value: RecommendationIdList): Self = StObject.set(x, "recommendationIds", value.asInstanceOf[js.Any])
    
    inline def setRecommendationIdsVarargs(value: String*): Self = StObject.set(x, "recommendationIds", js.Array(value*))
    
    inline def setSource(value: RecommendationSourceType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setType(value: RecommendationTriggerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
