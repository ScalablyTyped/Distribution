package typings.awsSdk.lexruntimev2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RuntimeHintDetails extends StObject {
  
  /**
    * One or more strings that Amazon Lex V2 should look for in the input to the bot. Each phrase is given preference when deciding on slot values.
    */
  var runtimeHintValues: js.UndefOr[RuntimeHintValuesList] = js.undefined
  
  /**
    * A map of constituent sub slot names inside a composite slot in the intent and the phrases that should be added for each sub slot. Inside each composite slot hints, this structure provides a mechanism to add granular sub slot phrases. Only sub slot hints are supported for composite slots. The intent name, composite slot name and the constituent sub slot names must exist.
    */
  var subSlotHints: js.UndefOr[SlotHintsSlotMap] = js.undefined
}
object RuntimeHintDetails {
  
  inline def apply(): RuntimeHintDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RuntimeHintDetails]
  }
  
  extension [Self <: RuntimeHintDetails](x: Self) {
    
    inline def setRuntimeHintValues(value: RuntimeHintValuesList): Self = StObject.set(x, "runtimeHintValues", value.asInstanceOf[js.Any])
    
    inline def setRuntimeHintValuesUndefined: Self = StObject.set(x, "runtimeHintValues", js.undefined)
    
    inline def setRuntimeHintValuesVarargs(value: RuntimeHintValue*): Self = StObject.set(x, "runtimeHintValues", js.Array(value*))
    
    inline def setSubSlotHints(value: SlotHintsSlotMap): Self = StObject.set(x, "subSlotHints", value.asInstanceOf[js.Any])
    
    inline def setSubSlotHintsUndefined: Self = StObject.set(x, "subSlotHints", js.undefined)
  }
}
