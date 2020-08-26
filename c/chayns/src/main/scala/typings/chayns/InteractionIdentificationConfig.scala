package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.startInteractionIdentification()
@js.native
trait InteractionIdentificationConfig extends js.Object {
  var backgroundColor: js.UndefOr[String] = js.native
  var callback: js.Any = js.native
  var delay: js.UndefOr[Double] = js.native
  var duration: Double = js.native
  var foregroundColor: String = js.native
  var resetOnInteraction: js.UndefOr[Boolean] = js.native
}

object InteractionIdentificationConfig {
  @scala.inline
  def apply(callback: js.Any, duration: Double, foregroundColor: String): InteractionIdentificationConfig = {
    val __obj = js.Dynamic.literal(callback = callback.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], foregroundColor = foregroundColor.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractionIdentificationConfig]
  }
  @scala.inline
  implicit class InteractionIdentificationConfigOps[Self <: InteractionIdentificationConfig] (val x: Self) extends AnyVal {
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
    def setCallback(value: js.Any): Self = this.set("callback", value.asInstanceOf[js.Any])
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    @scala.inline
    def setForegroundColor(value: String): Self = this.set("foregroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    @scala.inline
    def setResetOnInteraction(value: Boolean): Self = this.set("resetOnInteraction", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResetOnInteraction: Self = this.set("resetOnInteraction", js.undefined)
  }
  
}

