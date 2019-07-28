package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UiTooltipInitConfig extends js.Object {
  var preventAnimation: Boolean
  var tooltipClass: String
}

object UiTooltipInitConfig {
  @scala.inline
  def apply(preventAnimation: Boolean, tooltipClass: String): UiTooltipInitConfig = {
    val __obj = js.Dynamic.literal(preventAnimation = preventAnimation, tooltipClass = tooltipClass)
  
    __obj.asInstanceOf[UiTooltipInitConfig]
  }
}

