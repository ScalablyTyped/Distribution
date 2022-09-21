package typings.chartist.coreTypesMod

import typings.chartist.axesMod.Axis
import typings.chartist.svgMod.Svg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DrawEvent extends StObject {
  
  var axisX: Axis
  
  var axisY: Axis
  
  var chartRect: ChartRect
  
  var element: Svg
  
  var group: Svg
  
  var index: Double
  
  var meta: Meta
  
  var series: FlatSeriesValue[FlatSeriesPrimitiveValue] | Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]
  
  var seriesIndex: Double
  
  var `type`: String
}
object DrawEvent {
  
  inline def apply(
    axisX: Axis,
    axisY: Axis,
    chartRect: ChartRect,
    element: Svg,
    group: Svg,
    index: Double,
    meta: Meta,
    seriesIndex: Double,
    `type`: String
  ): DrawEvent = {
    val __obj = js.Dynamic.literal(axisX = axisX.asInstanceOf[js.Any], axisY = axisY.asInstanceOf[js.Any], chartRect = chartRect.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], seriesIndex = seriesIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawEvent]
  }
  
  extension [Self <: DrawEvent](x: Self) {
    
    inline def setAxisX(value: Axis): Self = StObject.set(x, "axisX", value.asInstanceOf[js.Any])
    
    inline def setAxisY(value: Axis): Self = StObject.set(x, "axisY", value.asInstanceOf[js.Any])
    
    inline def setChartRect(value: ChartRect): Self = StObject.set(x, "chartRect", value.asInstanceOf[js.Any])
    
    inline def setElement(value: Svg): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    inline def setGroup(value: Svg): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    inline def setMeta(value: Meta): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    inline def setSeries(
      value: FlatSeriesValue[FlatSeriesPrimitiveValue] | Series[SeriesPrimitiveValue] | SeriesObject[SeriesPrimitiveValue]
    ): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    inline def setSeriesIndex(value: Double): Self = StObject.set(x, "seriesIndex", value.asInstanceOf[js.Any])
    
    inline def setSeriesNull: Self = StObject.set(x, "series", null)
    
    inline def setSeriesUndefined: Self = StObject.set(x, "series", js.undefined)
    
    inline def setSeriesVarargs(value: SeriesValue[SeriesPrimitiveValue]*): Self = StObject.set(x, "series", js.Array(value*))
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
