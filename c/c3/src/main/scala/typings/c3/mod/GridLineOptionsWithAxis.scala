package typings.c3.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GridLineOptionsWithAxis
  extends StObject
     with GridLineOptions {
  
  var axis: js.UndefOr[AxisName] = js.undefined
}
object GridLineOptionsWithAxis {
  
  @scala.inline
  def apply(value: String | Double | Date): GridLineOptionsWithAxis = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridLineOptionsWithAxis]
  }
  
  @scala.inline
  implicit class GridLineOptionsWithAxisMutableBuilder[Self <: GridLineOptionsWithAxis] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxis(value: AxisName): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
  }
}
