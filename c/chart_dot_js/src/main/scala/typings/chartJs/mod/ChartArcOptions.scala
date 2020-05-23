package typings.chartJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartArcOptions extends js.Object {
  var backgroundColor: js.UndefOr[ChartColor] = js.undefined
  var borderColor: js.UndefOr[ChartColor] = js.undefined
  var borderWidth: js.UndefOr[Double] = js.undefined
}

object ChartArcOptions {
  @scala.inline
  def apply(
    backgroundColor: ChartColor = null,
    borderColor: ChartColor = null,
    borderWidth: js.UndefOr[Double] = js.undefined
  ): ChartArcOptions = {
    val __obj = js.Dynamic.literal()
    if (backgroundColor != null) __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    if (borderColor != null) __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    if (!js.isUndefined(borderWidth)) __obj.updateDynamic("borderWidth")(borderWidth.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartArcOptions]
  }
}

