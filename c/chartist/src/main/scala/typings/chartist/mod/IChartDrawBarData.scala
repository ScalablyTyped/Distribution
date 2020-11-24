package typings.chartist.mod

import typings.chartist.anon.Y
import typings.chartist.chartistStrings.bar
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
  implicit class IChartDrawBarDataOps[Self <: IChartDrawBarData] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAxisX(value: IChartAxis): Self = this.set("axisX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisY(value: IChartAxis): Self = this.set("axisY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartRect(value: IChartRect): Self = this.set("chartRect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElement(value: IChartistSvg): Self = this.set("element", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGroup(value: IChartistSvg): Self = this.set("group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMeta(value: js.Any): Self = this.set("meta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesVarargs(value: Double*): Self = this.set("series", js.Array(value :_*))
    
    @scala.inline
    def setSeries(value: js.Array[Double]): Self = this.set("series", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesIndex(value: Double): Self = this.set("seriesIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: bar): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Y): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX1(value: Double): Self = this.set("x1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setX2(value: Double): Self = this.set("x2", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY1(value: Double): Self = this.set("y1", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setY2(value: Double): Self = this.set("y2", value.asInstanceOf[js.Any])
  }
}
