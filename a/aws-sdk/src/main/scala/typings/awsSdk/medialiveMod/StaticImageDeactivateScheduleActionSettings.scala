package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StaticImageDeactivateScheduleActionSettings extends js.Object {
  /**
    * The time in milliseconds for the image to fade out. Default is 0 (no fade-out).
    */
  var FadeOut: js.UndefOr[integerMin0] = js.native
  /**
    * The image overlay layer to deactivate, 0 to 7. Default is 0.
    */
  var Layer: js.UndefOr[integerMin0Max7] = js.native
}

object StaticImageDeactivateScheduleActionSettings {
  @scala.inline
  def apply(): StaticImageDeactivateScheduleActionSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StaticImageDeactivateScheduleActionSettings]
  }
  @scala.inline
  implicit class StaticImageDeactivateScheduleActionSettingsOps[Self <: StaticImageDeactivateScheduleActionSettings] (val x: Self) extends AnyVal {
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
    def setFadeOut(value: integerMin0): Self = this.set("FadeOut", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFadeOut: Self = this.set("FadeOut", js.undefined)
    @scala.inline
    def setLayer(value: integerMin0Max7): Self = this.set("Layer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLayer: Self = this.set("Layer", js.undefined)
  }
  
}

