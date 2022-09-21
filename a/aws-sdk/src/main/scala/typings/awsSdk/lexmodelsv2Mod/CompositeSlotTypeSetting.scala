package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CompositeSlotTypeSetting extends StObject {
  
  /**
    * Subslots in the composite slot.
    */
  var subSlots: js.UndefOr[SubSlotTypeList] = js.undefined
}
object CompositeSlotTypeSetting {
  
  inline def apply(): CompositeSlotTypeSetting = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CompositeSlotTypeSetting]
  }
  
  extension [Self <: CompositeSlotTypeSetting](x: Self) {
    
    inline def setSubSlots(value: SubSlotTypeList): Self = StObject.set(x, "subSlots", value.asInstanceOf[js.Any])
    
    inline def setSubSlotsUndefined: Self = StObject.set(x, "subSlots", js.undefined)
    
    inline def setSubSlotsVarargs(value: SubSlotTypeComposition*): Self = StObject.set(x, "subSlots", js.Array(value*))
  }
}
