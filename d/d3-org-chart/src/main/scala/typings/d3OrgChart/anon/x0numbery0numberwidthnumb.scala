package typings.d3OrgChart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined {  x0 :number,   y0 :number,   width :number,   height :number} & std.Partial<d3-org-chart.d3-org-chart.Point> */
trait x0numbery0numberwidthnumb extends StObject {
  
  var height: Double
  
  var width: Double
  
  var x: js.UndefOr[Double] = js.undefined
  
  var x0: Double
  
  var y: js.UndefOr[Double] = js.undefined
  
  var y0: Double
}
object x0numbery0numberwidthnumb {
  
  inline def apply(height: Double, width: Double, x0: Double, y0: Double): x0numbery0numberwidthnumb = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], x0 = x0.asInstanceOf[js.Any], y0 = y0.asInstanceOf[js.Any])
    __obj.asInstanceOf[x0numbery0numberwidthnumb]
  }
  
  extension [Self <: x0numbery0numberwidthnumb](x: Self) {
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
    
    inline def setX0(value: Double): Self = StObject.set(x, "x0", value.asInstanceOf[js.Any])
    
    inline def setXUndefined: Self = StObject.set(x, "x", js.undefined)
    
    inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    
    inline def setY0(value: Double): Self = StObject.set(x, "y0", value.asInstanceOf[js.Any])
    
    inline def setYUndefined: Self = StObject.set(x, "y", js.undefined)
  }
}
