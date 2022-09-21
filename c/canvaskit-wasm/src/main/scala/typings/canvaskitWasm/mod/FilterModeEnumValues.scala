package typings.canvaskitWasm.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterModeEnumValues
  extends StObject
     with EmbindEnum {
  
  var Linear: FilterMode
  
  var Nearest: FilterMode
}
object FilterModeEnumValues {
  
  inline def apply(Linear: FilterMode, Nearest: FilterMode, values: js.Array[Double]): FilterModeEnumValues = {
    val __obj = js.Dynamic.literal(Linear = Linear.asInstanceOf[js.Any], Nearest = Nearest.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterModeEnumValues]
  }
  
  extension [Self <: FilterModeEnumValues](x: Self) {
    
    inline def setLinear(value: FilterMode): Self = StObject.set(x, "Linear", value.asInstanceOf[js.Any])
    
    inline def setNearest(value: FilterMode): Self = StObject.set(x, "Nearest", value.asInstanceOf[js.Any])
  }
}
