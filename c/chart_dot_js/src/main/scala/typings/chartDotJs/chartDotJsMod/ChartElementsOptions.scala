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
    if (arc != null) __obj.updateDynamic("arc")(arc.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    if (point != null) __obj.updateDynamic("point")(point.asInstanceOf[js.Any])
    if (rectangle != null) __obj.updateDynamic("rectangle")(rectangle.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartElementsOptions]
  }
}

