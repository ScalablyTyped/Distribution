package typings.chartist.chartistMod

import org.scalablytyped.runtime.StringDictionary
import typings.chartist.Anon_AreaBase
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ILineChartOptions extends IChartOptions {
  var areaBase: js.UndefOr[Double] = js.undefined
  var axisX: js.UndefOr[IChartistStepAxis | IChartistFixedScaleAxis | IChartistAutoScaleAxis] = js.undefined
  var axisY: js.UndefOr[IChartistStepAxis | IChartistFixedScaleAxis | IChartistAutoScaleAxis] = js.undefined
  var chartPadding: js.UndefOr[IChartPadding] = js.undefined
  var classNames: js.UndefOr[ILineChartClasses] = js.undefined
  var fullWidth: js.UndefOr[Boolean] = js.undefined
  var height: js.UndefOr[Double | String] = js.undefined
  var high: js.UndefOr[Double] = js.undefined
  var lineSmooth: js.UndefOr[js.Function | Boolean] = js.undefined
  var low: js.UndefOr[Double] = js.undefined
  var series: js.UndefOr[StringDictionary[Anon_AreaBase]] = js.undefined
  var showArea: js.UndefOr[Boolean] = js.undefined
  var showLine: js.UndefOr[Boolean] = js.undefined
  var showPoint: js.UndefOr[Boolean] = js.undefined
  var ticks: js.UndefOr[js.Array[String | Double]] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object ILineChartOptions {
  @scala.inline
  def apply(
    areaBase: Int | Double = null,
    axisX: IChartistStepAxis | IChartistFixedScaleAxis | IChartistAutoScaleAxis = null,
    axisY: IChartistStepAxis | IChartistFixedScaleAxis | IChartistAutoScaleAxis = null,
    chartPadding: IChartPadding = null,
    classNames: ILineChartClasses = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    high: Int | Double = null,
    lineSmooth: js.Function | Boolean = null,
    low: Int | Double = null,
    plugins: js.Array[_] = null,
    reverseData: js.UndefOr[Boolean] = js.undefined,
    series: StringDictionary[Anon_AreaBase] = null,
    showArea: js.UndefOr[Boolean] = js.undefined,
    showLine: js.UndefOr[Boolean] = js.undefined,
    showPoint: js.UndefOr[Boolean] = js.undefined,
    ticks: js.Array[String | Double] = null,
    width: Double | String = null
  ): ILineChartOptions = {
    val __obj = js.Dynamic.literal()
    if (areaBase != null) __obj.updateDynamic("areaBase")(areaBase.asInstanceOf[js.Any])
    if (axisX != null) __obj.updateDynamic("axisX")(axisX.asInstanceOf[js.Any])
    if (axisY != null) __obj.updateDynamic("axisY")(axisY.asInstanceOf[js.Any])
    if (chartPadding != null) __obj.updateDynamic("chartPadding")(chartPadding)
    if (classNames != null) __obj.updateDynamic("classNames")(classNames)
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (high != null) __obj.updateDynamic("high")(high.asInstanceOf[js.Any])
    if (lineSmooth != null) __obj.updateDynamic("lineSmooth")(lineSmooth.asInstanceOf[js.Any])
    if (low != null) __obj.updateDynamic("low")(low.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins)
    if (!js.isUndefined(reverseData)) __obj.updateDynamic("reverseData")(reverseData)
    if (series != null) __obj.updateDynamic("series")(series)
    if (!js.isUndefined(showArea)) __obj.updateDynamic("showArea")(showArea)
    if (!js.isUndefined(showLine)) __obj.updateDynamic("showLine")(showLine)
    if (!js.isUndefined(showPoint)) __obj.updateDynamic("showPoint")(showPoint)
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILineChartOptions]
  }
}

