package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotValueOverride extends StObject {
  
  /**
    * When the shape value is List, it indicates that the values field contains a list of slot values. When the value is Scalar, it indicates that the value field contains a single value.
    */
  var shape: js.UndefOr[SlotShape] = js.undefined
  
  /**
    * The current value of the slot.
    */
  var value: js.UndefOr[SlotValue] = js.undefined
  
  /**
    * A list of one or more values that the user provided for the slot. For example, for a slot that elicits pizza toppings, the values might be "pepperoni" and "pineapple."
    */
  var values: js.UndefOr[SlotValues] = js.undefined
}
object SlotValueOverride {
  
  inline def apply(): SlotValueOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlotValueOverride]
  }
  
  extension [Self <: SlotValueOverride](x: Self) {
    
    inline def setShape(value: SlotShape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
    
    inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
    
    inline def setValue(value: SlotValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    inline def setValues(value: SlotValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    
    inline def setValuesVarargs(value: SlotValueOverride*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
