package typings.chartJs.mod

import typings.chartJs.chartJsBooleans.`false`
import typings.chartJs.geometricMod.Point
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TooltipPositionerMap extends StObject {
  
  def average(items: js.Array[ActiveElement], eventPosition: Point): TooltipPosition | `false`
  @JSName("average")
  var average_Original: TooltipPositionerFunction[ChartType]
  
  def nearest(items: js.Array[ActiveElement], eventPosition: Point): TooltipPosition | `false`
  @JSName("nearest")
  var nearest_Original: TooltipPositionerFunction[ChartType]
}
object TooltipPositionerMap {
  
  inline def apply(average: TooltipPositionerFunction[ChartType], nearest: TooltipPositionerFunction[ChartType]): TooltipPositionerMap = {
    val __obj = js.Dynamic.literal(average = average.asInstanceOf[js.Any], nearest = nearest.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipPositionerMap]
  }
  
  extension [Self <: TooltipPositionerMap](x: Self) {
    
    inline def setAverage(value: TooltipPositionerFunction[ChartType]): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    inline def setNearest(value: TooltipPositionerFunction[ChartType]): Self = StObject.set(x, "nearest", value.asInstanceOf[js.Any])
  }
}
