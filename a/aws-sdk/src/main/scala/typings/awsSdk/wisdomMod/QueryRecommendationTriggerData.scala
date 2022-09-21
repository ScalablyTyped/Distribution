package typings.awsSdk.wisdomMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryRecommendationTriggerData extends StObject {
  
  /**
    * The text associated with the recommendation trigger.
    */
  var text: js.UndefOr[QueryText] = js.undefined
}
object QueryRecommendationTriggerData {
  
  inline def apply(): QueryRecommendationTriggerData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryRecommendationTriggerData]
  }
  
  extension [Self <: QueryRecommendationTriggerData](x: Self) {
    
    inline def setText(value: QueryText): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
  }
}
