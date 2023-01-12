package typings.chartist.distCoreTypesMod

import typings.chartist.distAxesMod.Axis
import typings.chartist.distSvgMod.Svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreatedEvent[TOptions] extends StObject {
  
  var axisX: Axis
  
  var axisY: Axis
  
  var chartRect: ChartRect
  
  var options: TOptions
  
  var svg: Svg
}
object CreatedEvent {
  
  inline def apply[TOptions](axisX: Axis, axisY: Axis, chartRect: ChartRect, options: TOptions, svg: Svg): CreatedEvent[TOptions] = {
    val __obj = js.Dynamic.literal(axisX = axisX.asInstanceOf[js.Any], axisY = axisY.asInstanceOf[js.Any], chartRect = chartRect.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], svg = svg.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreatedEvent[TOptions]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreatedEvent[?], TOptions] (val x: Self & CreatedEvent[TOptions]) extends AnyVal {
    
    inline def setAxisX(value: Axis): Self = StObject.set(x, "axisX", value.asInstanceOf[js.Any])
    
    inline def setAxisY(value: Axis): Self = StObject.set(x, "axisY", value.asInstanceOf[js.Any])
    
    inline def setChartRect(value: ChartRect): Self = StObject.set(x, "chartRect", value.asInstanceOf[js.Any])
    
    inline def setOptions(value: TOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
    
    inline def setSvg(value: Svg): Self = StObject.set(x, "svg", value.asInstanceOf[js.Any])
  }
}
