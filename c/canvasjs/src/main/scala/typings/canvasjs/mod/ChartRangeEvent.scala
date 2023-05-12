package typings.canvasjs.mod

import typings.canvasjs.canvasjsStrings.pan
import typings.canvasjs.canvasjsStrings.rangeChanged
import typings.canvasjs.canvasjsStrings.rangeChanging
import typings.canvasjs.canvasjsStrings.reset
import typings.canvasjs.canvasjsStrings.zoom
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChartRangeEvent extends StObject {
  
  /**
    * Retuned only if axisX is present.
    * Note:
    * - `viewportMinimum` will be null for zoomType "y"
    * - `viewportMaximum` will be null for zoomType "y"
    */
  var axisX: js.UndefOr[js.Array[ChartViewportBounds]] = js.undefined
  
  /**
    * Retuned only if axisX2 is present.
    * Note:
    * - `viewportMinimum` will be null for zoomType "y"
    * - `viewportMaximum` will be null for zoomType "y"
    */
  var axisX2: js.UndefOr[js.Array[ChartViewportBounds]] = js.undefined
  
  /**
    * Retuned only if axisY is present.
    * Note:
    * - `viewportMinimum` will be null for zoomType "x"
    * - `viewportMaximum` will be null for zoomType "x"
    */
  var axisY: js.UndefOr[js.Array[ChartViewportBounds]] = js.undefined
  
  /**
    * Retuned only if axisY2 is present.
    * Note:
    * - `viewportMinimum` will be null for zoomType "x"
    * - `viewportMaximum` will be null for zoomType "x"
    */
  var axisY2: js.UndefOr[js.Array[ChartViewportBounds]] = js.undefined
  
  var chart: Chart
  
  var trigger: zoom | pan | reset
  
  var `type`: rangeChanging | rangeChanged
}
object ChartRangeEvent {
  
  inline def apply(chart: Chart, trigger: zoom | pan | reset, `type`: rangeChanging | rangeChanged): ChartRangeEvent = {
    val __obj = js.Dynamic.literal(chart = chart.asInstanceOf[js.Any], trigger = trigger.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartRangeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ChartRangeEvent] (val x: Self) extends AnyVal {
    
    inline def setAxisX(value: js.Array[ChartViewportBounds]): Self = StObject.set(x, "axisX", value.asInstanceOf[js.Any])
    
    inline def setAxisX2(value: js.Array[ChartViewportBounds]): Self = StObject.set(x, "axisX2", value.asInstanceOf[js.Any])
    
    inline def setAxisX2Undefined: Self = StObject.set(x, "axisX2", js.undefined)
    
    inline def setAxisX2Varargs(value: ChartViewportBounds*): Self = StObject.set(x, "axisX2", js.Array(value*))
    
    inline def setAxisXUndefined: Self = StObject.set(x, "axisX", js.undefined)
    
    inline def setAxisXVarargs(value: ChartViewportBounds*): Self = StObject.set(x, "axisX", js.Array(value*))
    
    inline def setAxisY(value: js.Array[ChartViewportBounds]): Self = StObject.set(x, "axisY", value.asInstanceOf[js.Any])
    
    inline def setAxisY2(value: js.Array[ChartViewportBounds]): Self = StObject.set(x, "axisY2", value.asInstanceOf[js.Any])
    
    inline def setAxisY2Undefined: Self = StObject.set(x, "axisY2", js.undefined)
    
    inline def setAxisY2Varargs(value: ChartViewportBounds*): Self = StObject.set(x, "axisY2", js.Array(value*))
    
    inline def setAxisYUndefined: Self = StObject.set(x, "axisY", js.undefined)
    
    inline def setAxisYVarargs(value: ChartViewportBounds*): Self = StObject.set(x, "axisY", js.Array(value*))
    
    inline def setChart(value: Chart): Self = StObject.set(x, "chart", value.asInstanceOf[js.Any])
    
    inline def setTrigger(value: zoom | pan | reset): Self = StObject.set(x, "trigger", value.asInstanceOf[js.Any])
    
    inline def setType(value: rangeChanging | rangeChanged): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
