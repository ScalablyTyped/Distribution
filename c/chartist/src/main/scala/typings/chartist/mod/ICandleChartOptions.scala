package typings.chartist.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  implicit class ICandleChartOptionsOps[Self <: ICandleChartOptions] (val x: Self) extends AnyVal {
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
    def setAxisX(value: ICandleChartAxis): Self = this.set("axisX", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisX: Self = this.set("axisX", js.undefined)
    @scala.inline
    def setAxisY(value: ICandleChartAxis): Self = this.set("axisY", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAxisY: Self = this.set("axisY", js.undefined)
    @scala.inline
    def setCandleWickWidth(value: Double | String): Self = this.set("candleWickWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCandleWickWidth: Self = this.set("candleWickWidth", js.undefined)
    @scala.inline
    def setCandleWidth(value: Double | String): Self = this.set("candleWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCandleWidth: Self = this.set("candleWidth", js.undefined)
    @scala.inline
    def setChartPadding(value: IChartPadding | Double): Self = this.set("chartPadding", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChartPadding: Self = this.set("chartPadding", js.undefined)
    @scala.inline
    def setClassNames(value: ICandleChartClasses): Self = this.set("classNames", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassNames: Self = this.set("classNames", js.undefined)
    @scala.inline
    def setFullWidth(value: Boolean | String): Self = this.set("fullWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFullWidth: Self = this.set("fullWidth", js.undefined)
    @scala.inline
    def setHeight(value: Double | String): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    @scala.inline
    def setHight(value: Double | String): Self = this.set("hight", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHight: Self = this.set("hight", js.undefined)
    @scala.inline
    def setLow(value: Double | String): Self = this.set("low", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLow: Self = this.set("low", js.undefined)
    @scala.inline
    def setUseOneThirdAsCandleWickWidth(value: Boolean | String): Self = this.set("useOneThirdAsCandleWickWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseOneThirdAsCandleWickWidth: Self = this.set("useOneThirdAsCandleWickWidth", js.undefined)
    @scala.inline
    def setUseStepLengthAsCandleWidth(value: Boolean | String): Self = this.set("useStepLengthAsCandleWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseStepLengthAsCandleWidth: Self = this.set("useStepLengthAsCandleWidth", js.undefined)
    @scala.inline
    def setWidth(value: Double | String): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWidth: Self = this.set("width", js.undefined)
  }
  
}

