package typings.awsSdk.lexmodelsv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlotFilter extends StObject {
  
  /**
    * The name of the field to use for filtering.
    */
  var name: SlotFilterName
  
  /**
    * The operator to use for the filter. Specify EQ when the ListSlots operation should return only aliases that equal the specified value. Specify CO when the ListSlots operation should return aliases that contain the specified value.
    */
  var operator: SlotFilterOperator
  
  /**
    * The value to use to filter the response.
    */
  var values: FilterValues
}
object SlotFilter {
  
  inline def apply(name: SlotFilterName, operator: SlotFilterOperator, values: FilterValues): SlotFilter = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], operator = operator.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotFilter]
  }
  
  extension [Self <: SlotFilter](x: Self) {
    
    inline def setName(value: SlotFilterName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOperator(value: SlotFilterOperator): Self = StObject.set(x, "operator", value.asInstanceOf[js.Any])
    
    inline def setValues(value: FilterValues): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: FilterValue*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
