package typings.chartJs.mod

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
    val __obj = js.Dynamic.literal(backgroundColor = backgroundColor.asInstanceOf[js.Any], borderColor = borderColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartTooltipLabelColor]
  }
}

