package typings.carbonComponents.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ClassAnimating extends js.Object {
  var classAnimating: String = js.native
  var classFadeIn: String = js.native
  var classFadeOut: String = js.native
  var classShowFeedback: String = js.native
  var feedbackTooltip: String = js.native
  var selectorInit: String = js.native
  var timeoutValue: Double = js.native
}

object ClassAnimating {
  @scala.inline
  def apply(
    classAnimating: String,
    classFadeIn: String,
    classFadeOut: String,
    classShowFeedback: String,
    feedbackTooltip: String,
    selectorInit: String,
    timeoutValue: Double
  ): ClassAnimating = {
    val __obj = js.Dynamic.literal(classAnimating = classAnimating.asInstanceOf[js.Any], classFadeIn = classFadeIn.asInstanceOf[js.Any], classFadeOut = classFadeOut.asInstanceOf[js.Any], classShowFeedback = classShowFeedback.asInstanceOf[js.Any], feedbackTooltip = feedbackTooltip.asInstanceOf[js.Any], selectorInit = selectorInit.asInstanceOf[js.Any], timeoutValue = timeoutValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClassAnimating]
  }
  @scala.inline
  implicit class ClassAnimatingOps[Self <: ClassAnimating] (val x: Self) extends AnyVal {
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
    def setClassAnimating(value: String): Self = this.set("classAnimating", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassFadeIn(value: String): Self = this.set("classFadeIn", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassFadeOut(value: String): Self = this.set("classFadeOut", value.asInstanceOf[js.Any])
    @scala.inline
    def setClassShowFeedback(value: String): Self = this.set("classShowFeedback", value.asInstanceOf[js.Any])
    @scala.inline
    def setFeedbackTooltip(value: String): Self = this.set("feedbackTooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectorInit(value: String): Self = this.set("selectorInit", value.asInstanceOf[js.Any])
    @scala.inline
    def setTimeoutValue(value: Double): Self = this.set("timeoutValue", value.asInstanceOf[js.Any])
  }
  
}

