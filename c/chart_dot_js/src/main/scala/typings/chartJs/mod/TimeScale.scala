package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TimeScale extends ChartScales {
  var displayFormats: js.UndefOr[TimeDisplayFormat] = js.undefined
  var isoWeekday: js.UndefOr[Boolean] = js.undefined
  var max: js.UndefOr[String] = js.undefined
  var min: js.UndefOr[String] = js.undefined
  var minUnit: js.UndefOr[TimeUnit] = js.undefined
  var parser: js.UndefOr[String | (js.Function1[/* arg */ js.Any, _])] = js.undefined
  var round: js.UndefOr[TimeUnit] = js.undefined
  var stepSize: js.UndefOr[Double] = js.undefined
  var tooltipFormat: js.UndefOr[String] = js.undefined
  var unit: js.UndefOr[TimeUnit] = js.undefined
  var unitStepSize: js.UndefOr[Double] = js.undefined
}

object TimeScale {
  @scala.inline
  def apply(
    display: js.UndefOr[Boolean] = js.undefined,
    displayFormats: TimeDisplayFormat = null,
    gridLines: GridLineOptions = null,
    isoWeekday: js.UndefOr[Boolean] = js.undefined,
    max: String = null,
    min: String = null,
    minUnit: TimeUnit = null,
    parser: String | (js.Function1[/* arg */ js.Any, _]) = null,
    position: PositionType | String = null,
    round: TimeUnit = null,
    scaleLabel: ScaleTitleOptions = null,
    stepSize: Int | Double = null,
    ticks: TickOptions = null,
    tooltipFormat: String = null,
    `type`: ScaleType | String = null,
    unit: TimeUnit = null,
    unitStepSize: Int | Double = null,
    xAxes: js.Array[ChartXAxe] = null,
    yAxes: js.Array[ChartYAxe] = null
  ): TimeScale = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display.asInstanceOf[js.Any])
    if (displayFormats != null) __obj.updateDynamic("displayFormats")(displayFormats.asInstanceOf[js.Any])
    if (gridLines != null) __obj.updateDynamic("gridLines")(gridLines.asInstanceOf[js.Any])
    if (!js.isUndefined(isoWeekday)) __obj.updateDynamic("isoWeekday")(isoWeekday.asInstanceOf[js.Any])
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (minUnit != null) __obj.updateDynamic("minUnit")(minUnit.asInstanceOf[js.Any])
    if (parser != null) __obj.updateDynamic("parser")(parser.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (round != null) __obj.updateDynamic("round")(round.asInstanceOf[js.Any])
    if (scaleLabel != null) __obj.updateDynamic("scaleLabel")(scaleLabel.asInstanceOf[js.Any])
    if (stepSize != null) __obj.updateDynamic("stepSize")(stepSize.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (tooltipFormat != null) __obj.updateDynamic("tooltipFormat")(tooltipFormat.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (unit != null) __obj.updateDynamic("unit")(unit.asInstanceOf[js.Any])
    if (unitStepSize != null) __obj.updateDynamic("unitStepSize")(unitStepSize.asInstanceOf[js.Any])
    if (xAxes != null) __obj.updateDynamic("xAxes")(xAxes.asInstanceOf[js.Any])
    if (yAxes != null) __obj.updateDynamic("yAxes")(yAxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeScale]
  }
}

