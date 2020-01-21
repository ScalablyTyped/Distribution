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
  def apply(FadeOut: Int | Double = null, Layer: Int | Double = null): StaticImageDeactivateScheduleActionSettings = {
    val __obj = js.Dynamic.literal()
    if (FadeOut != null) __obj.updateDynamic("FadeOut")(FadeOut.asInstanceOf[js.Any])
    if (Layer != null) __obj.updateDynamic("Layer")(Layer.asInstanceOf[js.Any])
    __obj.asInstanceOf[StaticImageDeactivateScheduleActionSettings]
  }
}

