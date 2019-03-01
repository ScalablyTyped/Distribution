package typings
package chartDotJsLib.chartDotJsMod.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartXAxe extends CommonAxe {
  var barPercentage: js.UndefOr[scala.Double] = js.undefined
  var categoryPercentage: js.UndefOr[scala.Double] = js.undefined
  var distribution: js.UndefOr[
    chartDotJsLib.chartDotJsLibStrings.linear | chartDotJsLib.chartDotJsLibStrings.series
  ] = js.undefined
}

object ChartXAxe {
  @scala.inline
  def apply(
    afterBuildTicks: js.Function1[/* scale */ js.UndefOr[js.Any], scala.Unit] = null,
    afterCalculateTickRotation: js.Function1[/* scale */ js.UndefOr[js.Any], scala.Unit] = null,
    afterDataLimits: js.Function1[/* scale */ js.UndefOr[js.Any], scala.Unit] = null,
    afterFit: js.Function1[/* scale */ js.UndefOr[js.Any], scala.Unit] = null,
    afterSetDimension: js.Function1[/* scale */ js.UndefOr[js.Any], scala.Unit] = null,
    afterTickToLabelConversion: js.Function1[/* scale */ js.UndefOr[js.Any], scala.Unit] = null,
    afterUpdate: js.Function1[/* scale */ js.UndefOr[js.Any], scala.Unit] = null,
    barPercentage: scala.Int | scala.Double = null,
    barThickness: scala.Double | chartDotJsLib.chartDotJsLibStrings.flex = null,
    beforeBuildTicks: js.Function1[/* scale */ js.UndefOr[js.Any], scala.Unit] = null,
    beforeCalculateTickRotation: js.Function1[/* scale */ js.UndefOr[js.Any], scala.Unit] = null,
    beforeDataLimits: js.Function1[/* scale */ js.UndefOr[js.Any], scala.Unit] = null,
    beforeFit: js.Function1[/* scale */ js.UndefOr[js.Any], scala.Unit] = null,
    beforeSetDimension: js.Function1[/* scale */ js.UndefOr[js.Any], scala.Unit] = null,
    beforeTickToLabelConversion: js.Function1[/* scale */ js.UndefOr[js.Any], scala.Unit] = null,
    beforeUpdate: js.Function1[/* scale */ js.UndefOr[js.Any], scala.Unit] = null,
    bounds: java.lang.String = null,
    categoryPercentage: scala.Int | scala.Double = null,
    display: js.UndefOr[scala.Boolean] = js.undefined,
    distribution: chartDotJsLib.chartDotJsLibStrings.linear | chartDotJsLib.chartDotJsLibStrings.series = null,
    gridLines: GridLineOptions = null,
    id: java.lang.String = null,
    maxBarThickness: scala.Int | scala.Double = null,
    offset: js.UndefOr[scala.Boolean] = js.undefined,
    position: java.lang.String = null,
    scaleLabel: ScaleTitleOptions = null,
    stacked: js.UndefOr[scala.Boolean] = js.undefined,
    ticks: TickOptions = null,
    time: TimeScale = null,
    `type`: ScaleType | java.lang.String = null
  ): ChartXAxe = {
    val __obj = js.Dynamic.literal()
    if (afterBuildTicks != null) __obj.updateDynamic("afterBuildTicks")(afterBuildTicks)
    if (afterCalculateTickRotation != null) __obj.updateDynamic("afterCalculateTickRotation")(afterCalculateTickRotation)
    if (afterDataLimits != null) __obj.updateDynamic("afterDataLimits")(afterDataLimits)
    if (afterFit != null) __obj.updateDynamic("afterFit")(afterFit)
    if (afterSetDimension != null) __obj.updateDynamic("afterSetDimension")(afterSetDimension)
    if (afterTickToLabelConversion != null) __obj.updateDynamic("afterTickToLabelConversion")(afterTickToLabelConversion)
    if (afterUpdate != null) __obj.updateDynamic("afterUpdate")(afterUpdate)
    if (barPercentage != null) __obj.updateDynamic("barPercentage")(barPercentage.asInstanceOf[js.Any])
    if (barThickness != null) __obj.updateDynamic("barThickness")(barThickness.asInstanceOf[js.Any])
    if (beforeBuildTicks != null) __obj.updateDynamic("beforeBuildTicks")(beforeBuildTicks)
    if (beforeCalculateTickRotation != null) __obj.updateDynamic("beforeCalculateTickRotation")(beforeCalculateTickRotation)
    if (beforeDataLimits != null) __obj.updateDynamic("beforeDataLimits")(beforeDataLimits)
    if (beforeFit != null) __obj.updateDynamic("beforeFit")(beforeFit)
    if (beforeSetDimension != null) __obj.updateDynamic("beforeSetDimension")(beforeSetDimension)
    if (beforeTickToLabelConversion != null) __obj.updateDynamic("beforeTickToLabelConversion")(beforeTickToLabelConversion)
    if (beforeUpdate != null) __obj.updateDynamic("beforeUpdate")(beforeUpdate)
    if (bounds != null) __obj.updateDynamic("bounds")(bounds)
    if (categoryPercentage != null) __obj.updateDynamic("categoryPercentage")(categoryPercentage.asInstanceOf[js.Any])
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display)
    if (distribution != null) __obj.updateDynamic("distribution")(distribution.asInstanceOf[js.Any])
    if (gridLines != null) __obj.updateDynamic("gridLines")(gridLines)
    if (id != null) __obj.updateDynamic("id")(id)
    if (maxBarThickness != null) __obj.updateDynamic("maxBarThickness")(maxBarThickness.asInstanceOf[js.Any])
    if (!js.isUndefined(offset)) __obj.updateDynamic("offset")(offset)
    if (position != null) __obj.updateDynamic("position")(position)
    if (scaleLabel != null) __obj.updateDynamic("scaleLabel")(scaleLabel)
    if (!js.isUndefined(stacked)) __obj.updateDynamic("stacked")(stacked)
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    if (time != null) __obj.updateDynamic("time")(time)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartXAxe]
  }
}

