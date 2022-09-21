package typings.backlogJs.optionMod.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PatchCustomFieldWithDateParams
  extends StObject
     with PatchCustomFieldParams {
  
  var initialDate: js.UndefOr[String] = js.undefined
  
  var initialShift: js.UndefOr[Double] = js.undefined
  
  var initialValueType: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[String] = js.undefined
  
  var min: js.UndefOr[String] = js.undefined
}
object PatchCustomFieldWithDateParams {
  
  inline def apply(): PatchCustomFieldWithDateParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PatchCustomFieldWithDateParams]
  }
  
  extension [Self <: PatchCustomFieldWithDateParams](x: Self) {
    
    inline def setInitialDate(value: String): Self = StObject.set(x, "initialDate", value.asInstanceOf[js.Any])
    
    inline def setInitialDateUndefined: Self = StObject.set(x, "initialDate", js.undefined)
    
    inline def setInitialShift(value: Double): Self = StObject.set(x, "initialShift", value.asInstanceOf[js.Any])
    
    inline def setInitialShiftUndefined: Self = StObject.set(x, "initialShift", js.undefined)
    
    inline def setInitialValueType(value: Double): Self = StObject.set(x, "initialValueType", value.asInstanceOf[js.Any])
    
    inline def setInitialValueTypeUndefined: Self = StObject.set(x, "initialValueType", js.undefined)
    
    inline def setMax(value: String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
    
    inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
    
    inline def setMin(value: String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
    
    inline def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
  }
}
