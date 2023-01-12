package typings.backlogJs.distTypesOptionMod.Project

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostCustomFieldWithDateParams
  extends StObject
     with PostCustomFieldParams {
  
  var initialDate: js.UndefOr[String] = js.undefined
  
  var initialShift: js.UndefOr[Double] = js.undefined
  
  var initialValueType: js.UndefOr[Double] = js.undefined
  
  var max: js.UndefOr[String] = js.undefined
  
  var min: js.UndefOr[String] = js.undefined
}
object PostCustomFieldWithDateParams {
  
  inline def apply(name: String, typeId: FieldType): PostCustomFieldWithDateParams = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], typeId = typeId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PostCustomFieldWithDateParams]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PostCustomFieldWithDateParams] (val x: Self) extends AnyVal {
    
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
