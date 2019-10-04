package typings.chartDotJs.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialLinearScale extends js.Object {
  var angleLines: js.UndefOr[AngleLineOptions] = js.undefined
  var animate: js.UndefOr[Boolean] = js.undefined
  var display: js.UndefOr[Boolean] = js.undefined
  var gridLines: js.UndefOr[GridLineOptions] = js.undefined
  var pointLabels: js.UndefOr[PointLabelOptions] = js.undefined
  var position: js.UndefOr[PositionType] = js.undefined
  var ticks: js.UndefOr[LinearTickOptions] = js.undefined
}

object RadialLinearScale {
  @scala.inline
  def apply(
    angleLines: AngleLineOptions = null,
    animate: js.UndefOr[Boolean] = js.undefined,
    display: js.UndefOr[Boolean] = js.undefined,
    gridLines: GridLineOptions = null,
    pointLabels: PointLabelOptions = null,
    position: PositionType = null,
    ticks: LinearTickOptions = null
  ): RadialLinearScale = {
    val __obj = js.Dynamic.literal()
    if (angleLines != null) __obj.updateDynamic("angleLines")(angleLines)
    if (!js.isUndefined(animate)) __obj.updateDynamic("animate")(animate)
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display)
    if (gridLines != null) __obj.updateDynamic("gridLines")(gridLines)
    if (pointLabels != null) __obj.updateDynamic("pointLabels")(pointLabels)
    if (position != null) __obj.updateDynamic("position")(position)
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    __obj.asInstanceOf[RadialLinearScale]
  }
}

