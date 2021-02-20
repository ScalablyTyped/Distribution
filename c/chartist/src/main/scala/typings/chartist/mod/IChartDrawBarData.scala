package typings.chartist.mod

import typings.chartist.anon.Y
import typings.chartist.chartistStrings.bar
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChartDrawBarData extends ChartDrawData {
  
  var axisX: IChartAxis = js.native
  
  var axisY: IChartAxis = js.native
  
  var chartRect: IChartRect = js.native
  
  var element: IChartistSvg = js.native
  
  var group: IChartistSvg = js.native
  
  var index: Double = js.native
  
  var meta: js.Any = js.native
  
  var series: js.Array[Double] = js.native
  
  var seriesIndex: Double = js.native
  
  var `type`: bar = js.native
  
  var value: Y = js.native
  
  var x1: Double = js.native
  
  var x2: Double = js.native
  
  var y1: Double = js.native
  
  var y2: Double = js.native
}
object IChartDrawBarData {
  
  @scala.inline
  def apply(
    axisX: IChartAxis,
    axisY: IChartAxis,
    chartRect: IChartRect,
    element: IChartistSvg,
    group: IChartistSvg,
    index: Double,
    meta: js.Any,
    series: js.Array[Double],
    seriesIndex: Double,
    `type`: bar,
    value: Y,
    x1: Double,
    x2: Double,
    y1: Double,
    y2: Double
  ): IChartDrawBarData = {
    val __obj = js.Dynamic.literal(axisX = axisX.asInstanceOf[js.Any], axisY = axisY.asInstanceOf[js.Any], chartRect = chartRect.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], group = group.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], meta = meta.asInstanceOf[js.Any], series = series.asInstanceOf[js.Any], seriesIndex = seriesIndex.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IChartDrawBarData]
  }
  
  @scala.inline
  implicit class IChartDrawBarDataMutableBuilder[Self <: IChartDrawBarData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisX(value: IChartAxis): Self = StObject.set(x, "axisX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisY(value: IChartAxis): Self = StObject.set(x, "axisY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartRect(value: IChartRect): Self = StObject.set(x, "chartRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: IChartistSvg): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: IChartistSvg): Self = StObject.set(x, "group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: js.Any): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeries(value: js.Array[Double]): Self = StObject.set(x, "series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesIndex(value: Double): Self = StObject.set(x, "seriesIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesVarargs(value: Double*): Self = StObject.set(x, "series", js.Array(value :_*))
    
    @scala.inline
    def setType(value: bar): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Y): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1(value: Double): Self = StObject.set(x, "x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2(value: Double): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1(value: Double): Self = StObject.set(x, "y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: Double): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
  }
}
