package typings.awsSdk.comprehendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DetectTargetedSentimentResponse extends StObject {
  
  /**
    * Targeted sentiment analysis for each of the entities identified in the input text.
    */
  var Entities: js.UndefOr[ListOfTargetedSentimentEntities] = js.undefined
}
object DetectTargetedSentimentResponse {
  
  inline def apply(): DetectTargetedSentimentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DetectTargetedSentimentResponse]
  }
  
  extension [Self <: DetectTargetedSentimentResponse](x: Self) {
    
    inline def setEntities(value: ListOfTargetedSentimentEntities): Self = StObject.set(x, "Entities", value.asInstanceOf[js.Any])
    
    inline def setEntitiesUndefined: Self = StObject.set(x, "Entities", js.undefined)
    
    inline def setEntitiesVarargs(value: TargetedSentimentEntity*): Self = StObject.set(x, "Entities", js.Array(value*))
  }
}
