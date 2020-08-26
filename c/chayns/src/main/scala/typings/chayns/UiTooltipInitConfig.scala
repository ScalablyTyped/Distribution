package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UiTooltipInitConfig extends js.Object {
  var preventAnimation: Boolean = js.native
  var tooltipClass: String = js.native
}

object UiTooltipInitConfig {
  @scala.inline
  def apply(preventAnimation: Boolean, tooltipClass: String): UiTooltipInitConfig = {
    val __obj = js.Dynamic.literal(preventAnimation = preventAnimation.asInstanceOf[js.Any], tooltipClass = tooltipClass.asInstanceOf[js.Any])
    __obj.asInstanceOf[UiTooltipInitConfig]
  }
  @scala.inline
  implicit class UiTooltipInitConfigOps[Self <: UiTooltipInitConfig] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPreventAnimation(value: Boolean): Self = this.set("preventAnimation", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltipClass(value: String): Self = this.set("tooltipClass", value.asInstanceOf[js.Any])
  }
  
}

