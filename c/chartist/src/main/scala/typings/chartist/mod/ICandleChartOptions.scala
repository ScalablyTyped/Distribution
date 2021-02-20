package typings.chartist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICandleChartOptions extends IChartOptions {
  
  /**
    * Options for X-Axis
    */
  var axisX: js.UndefOr[ICandleChartAxis] = js.native
  
  /**
    * Options for Y-Axis
    */
  var axisY: js.UndefOr[ICandleChartAxis] = js.native
  
  /**
    * Width of candle wick in pixel (IMO is 1 px best minimum value)
    */
  var candleWickWidth: js.UndefOr[Double | String] = js.native
  
  /**
    * Width of candle body in pixel (IMO is 2 px best minimum value)
    */
  var candleWidth: js.UndefOr[Double | String] = js.native
  
  /**
    * Padding of the chart drawing area to the container element and labels as a number or padding object {top: 5, right: 5, bottom: 5, left: 5}
    */
  var chartPadding: js.UndefOr[IChartPadding | Double] = js.native
  
  /**
    * Override the class names that get used to generate the SVG structure of the chart
    */
  var classNames: js.UndefOr[ICandleChartClasses] = js.native
  
  /**
    * When set to true, the last grid line on the x-axis is not drawn and the chart elements will expand to the full available width of the chart. For the last label to be drawncorrectly you might need to add chart padding or offset the last label with a draw event handler.
    */
  var fullWidth: js.UndefOr[Boolean | String] = js.native
  
  /**
    * Specify a fixed height for the chart as a string (i.e. '100px' or '50%')
    */
  var height: js.UndefOr[Double | String] = js.native
  
  /**
    * Overriding the natural high of the chart allows you to zoom in or limit the charts highest displayed value
    */
  var hight: js.UndefOr[Double | String] = js.native
  
  /**
    * Overriding the natural low of the chart allows you to zoom in or limit the charts lowest displayed value
    */
  var low: js.UndefOr[Double | String] = js.native
  
  /**
    * Use 1/3 of candle body width as width for the candle wick, otherwise the candleWickWidth is being used.
    */
  var useOneThirdAsCandleWickWidth: js.UndefOr[Boolean | String] = js.native
  
  /**
    * Use calculated x-axis step length, depending on the number of quotes to display, as candle width. Otherwise the candleWidth is being used.
    */
  var useStepLengthAsCandleWidth: js.UndefOr[Boolean | String] = js.native
  
  /**
    * Specify a fixed width for the chart as a string (i.e. '100px' or '50%')
    */
  var width: js.UndefOr[Double | String] = js.native
}
object ICandleChartOptions {
  
  @scala.inline
  def apply(): ICandleChartOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ICandleChartOptions]
  }
  
  @scala.inline
  implicit class ICandleChartOptionsMutableBuilder[Self <: ICandleChartOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAxisX(value: ICandleChartAxis): Self = StObject.set(x, "axisX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisXUndefined: Self = StObject.set(x, "axisX", js.undefined)
    
    @scala.inline
    def setAxisY(value: ICandleChartAxis): Self = StObject.set(x, "axisY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAxisYUndefined: Self = StObject.set(x, "axisY", js.undefined)
    
    @scala.inline
    def setCandleWickWidth(value: Double | String): Self = StObject.set(x, "candleWickWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandleWickWidthUndefined: Self = StObject.set(x, "candleWickWidth", js.undefined)
    
    @scala.inline
    def setCandleWidth(value: Double | String): Self = StObject.set(x, "candleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCandleWidthUndefined: Self = StObject.set(x, "candleWidth", js.undefined)
    
    @scala.inline
    def setChartPadding(value: IChartPadding | Double): Self = StObject.set(x, "chartPadding", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChartPaddingUndefined: Self = StObject.set(x, "chartPadding", js.undefined)
    
    @scala.inline
    def setClassNames(value: ICandleChartClasses): Self = StObject.set(x, "classNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNamesUndefined: Self = StObject.set(x, "classNames", js.undefined)
    
    @scala.inline
    def setFullWidth(value: Boolean | String): Self = StObject.set(x, "fullWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFullWidthUndefined: Self = StObject.set(x, "fullWidth", js.undefined)
    
    @scala.inline
    def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setHight(value: Double | String): Self = StObject.set(x, "hight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHightUndefined: Self = StObject.set(x, "hight", js.undefined)
    
    @scala.inline
    def setLow(value: Double | String): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
    
    @scala.inline
    def setUseOneThirdAsCandleWickWidth(value: Boolean | String): Self = StObject.set(x, "useOneThirdAsCandleWickWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseOneThirdAsCandleWickWidthUndefined: Self = StObject.set(x, "useOneThirdAsCandleWickWidth", js.undefined)
    
    @scala.inline
    def setUseStepLengthAsCandleWidth(value: Boolean | String): Self = StObject.set(x, "useStepLengthAsCandleWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUseStepLengthAsCandleWidthUndefined: Self = StObject.set(x, "useStepLengthAsCandleWidth", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
