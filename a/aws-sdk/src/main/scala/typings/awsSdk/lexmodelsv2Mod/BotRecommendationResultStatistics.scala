package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BotRecommendationResultStatistics extends StObject {
  
  /**
    * Statistical information about about the intents associated with the bot recommendation results.
    */
  var intents: js.UndefOr[IntentStatistics] = js.undefined
  
  /**
    * Statistical information about the slot types associated with the bot recommendation results.
    */
  var slotTypes: js.UndefOr[SlotTypeStatistics] = js.undefined
}
object BotRecommendationResultStatistics {
  
  inline def apply(): BotRecommendationResultStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BotRecommendationResultStatistics]
  }
  
  extension [Self <: BotRecommendationResultStatistics](x: Self) {
    
    inline def setIntents(value: IntentStatistics): Self = StObject.set(x, "intents", value.asInstanceOf[js.Any])
    
    inline def setIntentsUndefined: Self = StObject.set(x, "intents", js.undefined)
    
    inline def setSlotTypes(value: SlotTypeStatistics): Self = StObject.set(x, "slotTypes", value.asInstanceOf[js.Any])
    
    inline def setSlotTypesUndefined: Self = StObject.set(x, "slotTypes", js.undefined)
  }
}
