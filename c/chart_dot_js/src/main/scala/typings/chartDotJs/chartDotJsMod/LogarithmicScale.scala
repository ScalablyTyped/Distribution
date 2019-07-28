package typings.chartDotJs.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogarithmicScale extends ChartScales {
  @JSName("ticks")
  var ticks_LogarithmicScale: js.UndefOr[LogarithmicTickOptions] = js.undefined
}

object LogarithmicScale {
  @scala.inline
  def apply(
    display: js.UndefOr[Boolean] = js.undefined,
    gridLines: GridLineOptions = null,
    position: PositionType | String = null,
    scaleLabel: ScaleTitleOptions = null,
    ticks: LogarithmicTickOptions = null,
    `type`: ScaleType | String = null,
    xAxes: js.Array[ChartXAxe] = null,
    yAxes: js.Array[ChartYAxe] = null
  ): LogarithmicScale = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display)
    if (gridLines != null) __obj.updateDynamic("gridLines")(gridLines)
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (scaleLabel != null) __obj.updateDynamic("scaleLabel")(scaleLabel)
    if (ticks != null) __obj.updateDynamic("ticks")(ticks)
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (xAxes != null) __obj.updateDynamic("xAxes")(xAxes)
    if (yAxes != null) __obj.updateDynamic("yAxes")(yAxes)
    __obj.asInstanceOf[LogarithmicScale]
  }
}

