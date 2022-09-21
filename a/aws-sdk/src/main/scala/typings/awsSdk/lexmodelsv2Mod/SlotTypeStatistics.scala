package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotTypeStatistics extends StObject {
  
  /**
    * The number of recommended slot types associated with the bot recommendation.
    */
  var discoveredSlotTypeCount: js.UndefOr[Count] = js.undefined
}
object SlotTypeStatistics {
  
  inline def apply(): SlotTypeStatistics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotTypeStatistics]
  }
  
  extension [Self <: SlotTypeStatistics](x: Self) {
    
    inline def setDiscoveredSlotTypeCount(value: Count): Self = StObject.set(x, "discoveredSlotTypeCount", value.asInstanceOf[js.Any])
    
    inline def setDiscoveredSlotTypeCountUndefined: Self = StObject.set(x, "discoveredSlotTypeCount", js.undefined)
  }
}
