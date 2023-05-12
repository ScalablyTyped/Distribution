package typings.canvasjs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartViewportBounds extends StObject {
  
  var viewportMaximum: Double | Null
  
  var viewportMinimum: Double | Null
}
object ChartViewportBounds {
  
  inline def apply(): ChartViewportBounds = {
    val __obj = js.Dynamic.literal(viewportMaximum = null, viewportMinimum = null)
    __obj.asInstanceOf[ChartViewportBounds]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartViewportBounds] (val x: Self) extends AnyVal {
    
    inline def setViewportMaximum(value: Double): Self = StObject.set(x, "viewportMaximum", value.asInstanceOf[js.Any])
    
    inline def setViewportMaximumNull: Self = StObject.set(x, "viewportMaximum", null)
    
    inline def setViewportMinimum(value: Double): Self = StObject.set(x, "viewportMinimum", value.asInstanceOf[js.Any])
    
    inline def setViewportMinimumNull: Self = StObject.set(x, "viewportMinimum", null)
  }
}
