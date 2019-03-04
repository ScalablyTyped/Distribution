package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UiTooltipInitConfig extends js.Object {
  var preventAnimation: scala.Boolean
  var tooltipClass: java.lang.String
}

object UiTooltipInitConfig {
  @scala.inline
  def apply(preventAnimation: scala.Boolean, tooltipClass: java.lang.String): UiTooltipInitConfig = {
    val __obj = js.Dynamic.literal(preventAnimation = preventAnimation, tooltipClass = tooltipClass)
  
    __obj.asInstanceOf[UiTooltipInitConfig]
  }
}

