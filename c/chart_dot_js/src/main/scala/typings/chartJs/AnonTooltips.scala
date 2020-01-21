package typings.chartJs

import typings.chartJs.mod.ChartTooltipOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonTooltips extends js.Object {
  var tooltips: ChartTooltipOptions
}

object AnonTooltips {
  @scala.inline
  def apply(tooltips: ChartTooltipOptions): AnonTooltips = {
    val __obj = js.Dynamic.literal(tooltips = tooltips.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonTooltips]
  }
}

