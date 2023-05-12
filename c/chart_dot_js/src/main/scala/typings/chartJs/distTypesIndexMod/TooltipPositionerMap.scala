package typings.chartJs.distTypesIndexMod

import typings.chartJs.chartJsBooleans.`false`
import typings.chartJs.distTypesGeometricMod.Point
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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TooltipPositionerMap] (val x: Self) extends AnyVal {
    
    inline def setAverage(value: TooltipPositionerFunction[ChartType]): Self = StObject.set(x, "average", value.asInstanceOf[js.Any])
    
    inline def setNearest(value: TooltipPositionerFunction[ChartType]): Self = StObject.set(x, "nearest", value.asInstanceOf[js.Any])
  }
}
