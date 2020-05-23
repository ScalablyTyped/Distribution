package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearScale extends ChartScales {
  @JSName("ticks")
  var ticks_LinearScale: js.UndefOr[LinearTickOptions] = js.undefined
}

object LinearScale {
  @scala.inline
  def apply(
    display: js.UndefOr[Boolean] = js.undefined,
    gridLines: GridLineOptions = null,
    position: PositionType | String = null,
    scaleLabel: ScaleTitleOptions = null,
    ticks: LinearTickOptions = null,
    `type`: ScaleType | String = null,
    xAxes: js.Array[ChartXAxe] = null,
    yAxes: js.Array[ChartYAxe] = null
  ): LinearScale = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(display)) __obj.updateDynamic("display")(display.get.asInstanceOf[js.Any])
    if (gridLines != null) __obj.updateDynamic("gridLines")(gridLines.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (scaleLabel != null) __obj.updateDynamic("scaleLabel")(scaleLabel.asInstanceOf[js.Any])
    if (ticks != null) __obj.updateDynamic("ticks")(ticks.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (xAxes != null) __obj.updateDynamic("xAxes")(xAxes.asInstanceOf[js.Any])
    if (yAxes != null) __obj.updateDynamic("yAxes")(yAxes.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearScale]
  }
}

