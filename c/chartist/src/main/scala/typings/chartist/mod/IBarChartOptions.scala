package typings.chartist.mod

import typings.chartist.chartistStrings.accumulate
import typings.chartist.chartistStrings.overlap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBarChartOptions extends IChartOptions {
  
  var axisX: js.UndefOr[IBarChartAxis] = js.native
  
  var axisY: js.UndefOr[IBarChartAxis] = js.native
  
  var chartPadding: js.UndefOr[IChartPadding] = js.native
  
  /**
    * Override the class names that are used to generate the SVG structure of the chart
    */
  var classNames: js.UndefOr[IBarChartClasses] = js.native
  
  var distributeSeries: js.UndefOr[Boolean] = js.native
  
  var height: js.UndefOr[Double | String] = js.native
  
  var high: js.UndefOr[Double] = js.native
  
  var horizontalBars: js.UndefOr[Boolean] = js.native
  
  var low: js.UndefOr[Double] = js.native
  
  var onlyInteger: js.UndefOr[Boolean] = js.native
  
  var seriesBarDistance: js.UndefOr[Double] = js.native
  
  /**
    * If set to true this property will cause the series bars to be stacked and form a total for each series point. This will also influence the y-axis and the overall bounds of the chart. In stacked mode the seriesBarDistance property will have no effect.
    */
  var stackBars: js.UndefOr[Boolean] = js.native
  
  var stackMode: js.UndefOr[overlap | accumulate] = js.native
  
  var ticks: js.UndefOr[js.Array[String | Double]] = js.native
  
  var width: js.UndefOr[Double | String] = js.native
}
object IBarChartOptions {
  
  @scala.inline
  def apply(): IBarChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBarChartOptions]
  }
  
  @scala.inline
  implicit class IBarChartOptionsOps[Self <: IBarChartOptions] (val x: Self) extends AnyVal {
    
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
    def setAxisX(value: IBarChartAxis): Self = this.set("axisX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisX: Self = this.set("axisX", js.undefined)
    
    @scala.inline
    def setAxisY(value: IBarChartAxis): Self = this.set("axisY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAxisY: Self = this.set("axisY", js.undefined)
    
    @scala.inline
    def setChartPadding(value: IChartPadding): Self = this.set("chartPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChartPadding: Self = this.set("chartPadding", js.undefined)
    
    @scala.inline
    def setClassNames(value: IBarChartClasses): Self = this.set("classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassNames: Self = this.set("classNames", js.undefined)
    
    @scala.inline
    def setDistributeSeries(value: Boolean): Self = this.set("distributeSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDistributeSeries: Self = this.set("distributeSeries", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setHigh(value: Double): Self = this.set("high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHigh: Self = this.set("high", js.undefined)
    
    @scala.inline
    def setHorizontalBars(value: Boolean): Self = this.set("horizontalBars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHorizontalBars: Self = this.set("horizontalBars", js.undefined)
    
    @scala.inline
    def setLow(value: Double): Self = this.set("low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLow: Self = this.set("low", js.undefined)
    
    @scala.inline
    def setOnlyInteger(value: Boolean): Self = this.set("onlyInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnlyInteger: Self = this.set("onlyInteger", js.undefined)
    
    @scala.inline
    def setSeriesBarDistance(value: Double): Self = this.set("seriesBarDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSeriesBarDistance: Self = this.set("seriesBarDistance", js.undefined)
    
    @scala.inline
    def setStackBars(value: Boolean): Self = this.set("stackBars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackBars: Self = this.set("stackBars", js.undefined)
    
    @scala.inline
    def setStackMode(value: overlap | accumulate): Self = this.set("stackMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStackMode: Self = this.set("stackMode", js.undefined)
    
    @scala.inline
    def setTicksVarargs(value: (String | Double)*): Self = this.set("ticks", js.Array(value :_*))
    
    @scala.inline
    def setTicks(value: js.Array[String | Double]): Self = this.set("ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTicks: Self = this.set("ticks", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
}
