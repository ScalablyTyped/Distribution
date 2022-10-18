package typings.awsSdk.clientsWisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RecommendationTriggerData extends StObject {
  
  /**
    * Data associated with the QUERY RecommendationTriggerType.
    */
  var query: js.UndefOr[QueryRecommendationTriggerData] = js.undefined
}
object RecommendationTriggerData {
  
  inline def apply(): RecommendationTriggerData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RecommendationTriggerData]
  }
  
  extension [Self <: RecommendationTriggerData](x: Self) {
    
    inline def setQuery(value: QueryRecommendationTriggerData): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    inline def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
  }
}
