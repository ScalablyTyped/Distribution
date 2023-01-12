package typings.d3OrgChart.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CenterX extends StObject {
  
  var centerX: Double
  
  var centerY: Double
  
  var chartHeight: Double
  
  var chartWidth: Double
  
  var root: Double
  
  var rootMargin: Double
  
  var scale: Double
}
object CenterX {
  
  inline def apply(
    centerX: Double,
    centerY: Double,
    chartHeight: Double,
    chartWidth: Double,
    root: Double,
    rootMargin: Double,
    scale: Double
  ): CenterX = {
    val __obj = js.Dynamic.literal(centerX = centerX.asInstanceOf[js.Any], centerY = centerY.asInstanceOf[js.Any], chartHeight = chartHeight.asInstanceOf[js.Any], chartWidth = chartWidth.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], rootMargin = rootMargin.asInstanceOf[js.Any], scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[CenterX]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CenterX] (val x: Self) extends AnyVal {
    
    inline def setCenterX(value: Double): Self = StObject.set(x, "centerX", value.asInstanceOf[js.Any])
    
    inline def setCenterY(value: Double): Self = StObject.set(x, "centerY", value.asInstanceOf[js.Any])
    
    inline def setChartHeight(value: Double): Self = StObject.set(x, "chartHeight", value.asInstanceOf[js.Any])
    
    inline def setChartWidth(value: Double): Self = StObject.set(x, "chartWidth", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: Double): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootMargin(value: Double): Self = StObject.set(x, "rootMargin", value.asInstanceOf[js.Any])
    
    inline def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
  }
}
