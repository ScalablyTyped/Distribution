package typings
package chartDotJsLib.chartDotJsMod.ChartNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartTooltipLabelColor extends js.Object {
  var backgroundColor: ChartColor
  var borderColor: ChartColor
}

object ChartTooltipLabelColor {
  @scala.inline
  def apply(backgroundColor: ChartColor, borderColor: ChartColor): ChartTooltipLabelColor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("backgroundColor")(backgroundColor.asInstanceOf[js.Any])
    __obj.updateDynamic("borderColor")(borderColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTooltipLabelColor]
  }
}

