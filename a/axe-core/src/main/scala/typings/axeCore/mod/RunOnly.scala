package typings.axeCore.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RunOnly extends StObject {
  
  var `type`: RunOnlyType
  
  var values: js.Array[String | TagValue]
}
object RunOnly {
  
  inline def apply(`type`: RunOnlyType, values: js.Array[String | TagValue]): RunOnly = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunOnly]
  }
  
  extension [Self <: RunOnly](x: Self) {
    
    inline def setType(value: RunOnlyType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setValues(value: js.Array[String | TagValue]): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
    
    inline def setValuesVarargs(value: (String | TagValue)*): Self = StObject.set(x, "values", js.Array(value*))
  }
}
