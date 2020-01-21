package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AvailBlanking extends js.Object {
  /**
    * Blanking image to be used. Leave empty for solid black. Only bmp and png images are supported.
    */
  var AvailBlankingImage: js.UndefOr[InputLocation] = js.native
  /**
    * When set to enabled, causes video, audio and captions to be blanked when insertion metadata is added.
    */
  var State: js.UndefOr[AvailBlankingState] = js.native
}

object AvailBlanking {
  @scala.inline
  def apply(AvailBlankingImage: InputLocation = null, State: AvailBlankingState = null): AvailBlanking = {
    val __obj = js.Dynamic.literal()
    if (AvailBlankingImage != null) __obj.updateDynamic("AvailBlankingImage")(AvailBlankingImage.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[AvailBlanking]
  }
}

