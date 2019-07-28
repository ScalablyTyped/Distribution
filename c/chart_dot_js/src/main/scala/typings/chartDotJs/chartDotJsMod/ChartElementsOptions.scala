package typings.chartDotJs.chartDotJsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartElementsOptions extends js.Object {
  var arc: js.UndefOr[ChartArcOptions] = js.undefined
  var line: js.UndefOr[ChartLineOptions] = js.undefined
  var point: js.UndefOr[ChartPointOptions] = js.undefined
  var rectangle: js.UndefOr[ChartRectangleOptions] = js.undefined
}

object ChartElementsOptions {
  @scala.inline
  def apply(
    arc: ChartArcOptions = null,
    line: ChartLineOptions = null,
    point: ChartPointOptions = null,
    rectangle: ChartRectangleOptions = null
  ): ChartElementsOptions = {
    val __obj = js.Dynamic.literal()
    if (arc != null) __obj.updateDynamic("arc")(arc)
    if (line != null) __obj.updateDynamic("line")(line)
    if (point != null) __obj.updateDynamic("point")(point)
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle)
    __obj.asInstanceOf[ChartElementsOptions]
  }
}

