package typings.chartDotJs.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialLinearScale extends LinearScale {
  var angleLines: js.UndefOr[AngleLineOptions] = js.undefined
  var lineArc: js.UndefOr[Boolean] = js.undefined
  var pointLabels: js.UndefOr[PointLabelOptions] = js.undefined
}

object RadialLinearScale {
  @scala.inline
  def apply(
    angleLines: AngleLineOptions = null,
    display: js.UndefOr[Boolean] = js.undefined,
    gridLines: GridLineOptions = null,
    lineArc: js.UndefOr[Boolean] = js.undefined,
    pointLabels: PointLabelOptions = null,
    position: PositionType | String = null,
    scaleLabel: ScaleTitleOptions = null,
    ticks: TickOptions = null,
    `type`: ScaleType | String = null,
    xAxes: js.Array[ChartXAxe] = null,
    yAxes: js.Array[ChartYAxe] = null
  ): RadialLinearScale = {
    val __obj = js.Dynamic.literal()
    if (angleLines != null) __obj.updateDynamic("angleLines")(angleLines)
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display)
    if (gridLines != null) __obj.updateDynamic("gridLines")(gridLines)
    if (!js.isUndefined(lineArc)) __obj.updateDynamic("lineArc")(lineArc)
    if (pointLabels != null) __obj.updateDynamic("pointLabels")(pointLabels)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (scaleLabel != null) __obj.updateDynamic("scaleLabel")(scaleLabel)
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (xAxes != null) __obj.updateDynamic("xAxes")(xAxes)
    if (yAxes != null) __obj.updateDynamic("yAxes")(yAxes)
    __obj.asInstanceOf[RadialLinearScale]
  }
}

