package typings.chartist.mod

import org.scalablytyped.runtime.StringDictionary
import typings.chartist.anon.AreaBase
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
  var series: js.UndefOr[StringDictionary[AreaBase]] = js.undefined
  var showArea: js.UndefOr[Boolean] = js.undefined
  var showLine: js.UndefOr[Boolean] = js.undefined
  var showPoint: js.UndefOr[Boolean] = js.undefined
  var ticks: js.UndefOr[js.Array[String | Double]] = js.undefined
  var width: js.UndefOr[Double | String] = js.undefined
}

object ILineChartOptions {
  @scala.inline
  def apply(
    areaBase: js.UndefOr[Double] = js.undefined,
    axisX: IChartistStepAxis | IChartistFixedScaleAxis | IChartistAutoScaleAxis = null,
    axisY: IChartistStepAxis | IChartistFixedScaleAxis | IChartistAutoScaleAxis = null,
    chartPadding: IChartPadding = null,
    classNames: ILineChartClasses = null,
    fullWidth: js.UndefOr[Boolean] = js.undefined,
    height: Double | String = null,
    high: js.UndefOr[Double] = js.undefined,
    lineSmooth: js.Function | Boolean = null,
    low: js.UndefOr[Double] = js.undefined,
    plugins: js.Array[_] = null,
    reverseData: js.UndefOr[Boolean] = js.undefined,
    series: StringDictionary[AreaBase] = null,
    showArea: js.UndefOr[Boolean] = js.undefined,
    showLine: js.UndefOr[Boolean] = js.undefined,
    showPoint: js.UndefOr[Boolean] = js.undefined,
    ticks: js.Array[String | Double] = null,
    width: Double | String = null
  ): ILineChartOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(areaBase)) __obj.updateDynamic("areaBase")(areaBase.get.asInstanceOf[js.Any])
    if (axisX != null) __obj.updateDynamic("axisX")(axisX.asInstanceOf[js.Any])
    if (axisY != null) __obj.updateDynamic("axisY")(axisY.asInstanceOf[js.Any])
    if (chartPadding != null) __obj.updateDynamic("chartPadding")(chartPadding.asInstanceOf[js.Any])
    if (classNames != null) __obj.updateDynamic("classNames")(classNames.asInstanceOf[js.Any])
    if (!js.isUndefined(fullWidth)) __obj.updateDynamic("fullWidth")(fullWidth.get.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (!js.isUndefined(high)) __obj.updateDynamic("high")(high.get.asInstanceOf[js.Any])
    if (lineSmooth != null) __obj.updateDynamic("lineSmooth")(lineSmooth.asInstanceOf[js.Any])
    if (!js.isUndefined(low)) __obj.updateDynamic("low")(low.get.asInstanceOf[js.Any])
    if (plugins != null) __obj.updateDynamic("plugins")(plugins.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseData)) __obj.updateDynamic("reverseData")(reverseData.get.asInstanceOf[js.Any])
    if (series != null) __obj.updateDynamic("series")(series.asInstanceOf[js.Any])
    if (!js.isUndefined(showArea)) __obj.updateDynamic("showArea")(showArea.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showLine)) __obj.updateDynamic("showLine")(showLine.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showPoint)) __obj.updateDynamic("showPoint")(showPoint.get.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[ILineChartOptions]
  }
}

