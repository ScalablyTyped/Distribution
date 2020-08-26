package typings.carbonComponents.tooltipSimpleMod

import typings.carbonComponents.anon.Visible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ @js.native
trait TooltipSimple extends js.Object {
  var tooltipFadeOut: js.Any = js.native
  def allowTooltipVisibility(hasVisible: Visible): Unit = js.native
  def getTooltipTriggerButton(): js.Any = js.native
}

object TooltipSimple {
  @scala.inline
  def apply(
    allowTooltipVisibility: Visible => Unit,
    getTooltipTriggerButton: () => js.Any,
    tooltipFadeOut: js.Any
  ): TooltipSimple = {
    val __obj = js.Dynamic.literal(allowTooltipVisibility = js.Any.fromFunction1(allowTooltipVisibility), getTooltipTriggerButton = js.Any.fromFunction0(getTooltipTriggerButton), tooltipFadeOut = tooltipFadeOut.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooltipSimple]
  }
  @scala.inline
  implicit class TooltipSimpleOps[Self <: TooltipSimple] (val x: Self) extends AnyVal {
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
    def setAllowTooltipVisibility(value: Visible => Unit): Self = this.set("allowTooltipVisibility", js.Any.fromFunction1(value))
    @scala.inline
    def setGetTooltipTriggerButton(value: () => js.Any): Self = this.set("getTooltipTriggerButton", js.Any.fromFunction0(value))
    @scala.inline
    def setTooltipFadeOut(value: js.Any): Self = this.set("tooltipFadeOut", value.asInstanceOf[js.Any])
  }
  
}

