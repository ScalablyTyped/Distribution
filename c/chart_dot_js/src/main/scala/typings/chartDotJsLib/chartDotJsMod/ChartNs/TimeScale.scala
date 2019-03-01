package typings
package chartDotJsLib.chartDotJsMod.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeScale extends ChartScales {
  var displayFormats: js.UndefOr[TimeDisplayFormat] = js.undefined
  var isoWeekday: js.UndefOr[scala.Boolean] = js.undefined
  var max: js.UndefOr[java.lang.String] = js.undefined
  var min: js.UndefOr[java.lang.String] = js.undefined
  var minUnit: js.UndefOr[TimeUnit] = js.undefined
  var parser: js.UndefOr[java.lang.String | (js.Function1[/* arg */ js.Any, _])] = js.undefined
  var round: js.UndefOr[TimeUnit] = js.undefined
  var stepSize: js.UndefOr[scala.Double] = js.undefined
  var tooltipFormat: js.UndefOr[java.lang.String] = js.undefined
  var unit: js.UndefOr[TimeUnit] = js.undefined
  var unitStepSize: js.UndefOr[scala.Double] = js.undefined
}

object TimeScale {
  @scala.inline
  def apply(
    display: js.UndefOr[scala.Boolean] = js.undefined,
    displayFormats: TimeDisplayFormat = null,
    gridLines: GridLineOptions = null,
    isoWeekday: js.UndefOr[scala.Boolean] = js.undefined,
    max: java.lang.String = null,
    min: java.lang.String = null,
    minUnit: TimeUnit = null,
    parser: java.lang.String | (js.Function1[/* arg */ js.Any, _]) = null,
    position: PositionType | java.lang.String = null,
    round: TimeUnit = null,
    scaleLabel: ScaleTitleOptions = null,
    stepSize: scala.Int | scala.Double = null,
    ticks: TickOptions = null,
    tooltipFormat: java.lang.String = null,
    `type`: ScaleType | java.lang.String = null,
    unit: TimeUnit = null,
    unitStepSize: scala.Int | scala.Double = null,
    xAxes: js.Array[ChartXAxe] = null,
    yAxes: js.Array[ChartYAxe] = null
  ): TimeScale = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display)
    if (displayFormats != null) __obj.updateDynamic("displayFormats")(displayFormats)
    if (gridLines != null) __obj.updateDynamic("gridLines")(gridLines)
    if (!js.isUndefined(isoWeekday)) __obj.updateDynamic("isoWeekday")(isoWeekday)
    if (max != null) __obj.updateDynamic("max")(max)
    if (min != null) __obj.updateDynamic("min")(min)
    if (minUnit != null) __obj.updateDynamic("minUnit")(minUnit)
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round)
    if (scaleLabel != null) __obj.updateDynamic("scaleLabel")(scaleLabel)
    if (stepSize != null) __obj.updateDynamic("stepSize")(stepSize.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit)
    if (unitStepSize != null) __obj.updateDynamic("unitStepSize")(unitStepSize.asInstanceOf[js.Any])
    if (xAxes != null) __obj.updateDynamic("xAxes")(xAxes)
    if (yAxes != null) __obj.updateDynamic("yAxes")(yAxes)
    __obj.asInstanceOf[TimeScale]
  }
}

