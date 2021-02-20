package typings.chartist.mod

import typings.chartist.chartistStrings.accumulate
import typings.chartist.chartistStrings.overlap
import org.scalablytyped.runtime.StObject
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
  implicit class IBarChartOptionsMutableBuilder[Self <: IBarChartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisX(value: IBarChartAxis): Self = StObject.set(x, "axisX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisXUndefined: Self = StObject.set(x, "axisX", js.undefined)
    
    @scala.inline
    def setAxisY(value: IBarChartAxis): Self = StObject.set(x, "axisY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisYUndefined: Self = StObject.set(x, "axisY", js.undefined)
    
    @scala.inline
    def setChartPadding(value: IChartPadding): Self = StObject.set(x, "chartPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartPaddingUndefined: Self = StObject.set(x, "chartPadding", js.undefined)
    
    @scala.inline
    def setClassNames(value: IBarChartClasses): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    @scala.inline
    def setDistributeSeries(value: Boolean): Self = StObject.set(x, "distributeSeries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDistributeSeriesUndefined: Self = StObject.set(x, "distributeSeries", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
    
    @scala.inline
    def setHorizontalBars(value: Boolean): Self = StObject.set(x, "horizontalBars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHorizontalBarsUndefined: Self = StObject.set(x, "horizontalBars", js.undefined)
    
    @scala.inline
    def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    @scala.inline
    def setOnlyInteger(value: Boolean): Self = StObject.set(x, "onlyInteger", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnlyIntegerUndefined: Self = StObject.set(x, "onlyInteger", js.undefined)
    
    @scala.inline
    def setSeriesBarDistance(value: Double): Self = StObject.set(x, "seriesBarDistance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeriesBarDistanceUndefined: Self = StObject.set(x, "seriesBarDistance", js.undefined)
    
    @scala.inline
    def setStackBars(value: Boolean): Self = StObject.set(x, "stackBars", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackBarsUndefined: Self = StObject.set(x, "stackBars", js.undefined)
    
    @scala.inline
    def setStackMode(value: overlap | accumulate): Self = StObject.set(x, "stackMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStackModeUndefined: Self = StObject.set(x, "stackMode", js.undefined)
    
    @scala.inline
    def setTicks(value: js.Array[String | Double]): Self = StObject.set(x, "ticks", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTicksUndefined: Self = StObject.set(x, "ticks", js.undefined)
    
    @scala.inline
    def setTicksVarargs(value: (String | Double)*): Self = StObject.set(x, "ticks", js.Array(value :_*))
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
