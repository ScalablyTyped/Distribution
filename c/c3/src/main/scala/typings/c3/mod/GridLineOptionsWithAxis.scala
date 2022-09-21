package typings.c3.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridLineOptionsWithAxis
  extends StObject
     with GridLineOptions {
  
  var axis: js.UndefOr[AxisName] = js.undefined
}
object GridLineOptionsWithAxis {
  
  inline def apply(value: String | Double | js.Date): GridLineOptionsWithAxis = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLineOptionsWithAxis]
  }
  
  extension [Self <: GridLineOptionsWithAxis](x: Self) {
    
    inline def setAxis(value: AxisName): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
  }
}
