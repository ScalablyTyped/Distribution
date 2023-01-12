package typings.chartJs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineControllerChartOptions extends StObject {
  
  /**
    * If false, the lines between points are not drawn.
    * @default true
    */
  var showLine: Boolean
  
  /**
    * If true, lines will be drawn between points with no or null data. If false, points with NaN data will create a break in the line. Can also be a number specifying the maximum gap length to span. The unit of the value depends on the scale used.
    * @default false
    */
  var spanGaps: Boolean | Double
}
object LineControllerChartOptions {
  
  inline def apply(showLine: Boolean, spanGaps: Boolean | Double): LineControllerChartOptions = {
    val __obj = js.Dynamic.literal(showLine = showLine.asInstanceOf[js.Any], spanGaps = spanGaps.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineControllerChartOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineControllerChartOptions] (val x: Self) extends AnyVal {
    
    inline def setShowLine(value: Boolean): Self = StObject.set(x, "showLine", value.asInstanceOf[js.Any])
    
    inline def setSpanGaps(value: Boolean | Double): Self = StObject.set(x, "spanGaps", value.asInstanceOf[js.Any])
  }
}
