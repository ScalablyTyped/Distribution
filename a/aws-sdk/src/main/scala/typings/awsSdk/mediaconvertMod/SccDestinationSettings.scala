package typings.awsSdk.mediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SccDestinationSettings extends js.Object {
  /**
    * Set Framerate (SccDestinationFramerate) to make sure that the captions and the video are synchronized in the output. Specify a frame rate that matches the frame rate of the associated video. If the video frame rate is 29.97, choose 29.97 dropframe (FRAMERATE_29_97_DROPFRAME) only if the video has video_insertion=true and drop_frame_timecode=true; otherwise, choose 29.97 non-dropframe (FRAMERATE_29_97_NON_DROPFRAME).
    */
  var Framerate: js.UndefOr[SccDestinationFramerate] = js.native
}

object SccDestinationSettings {
  @scala.inline
  def apply(Framerate: SccDestinationFramerate = null): SccDestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (Framerate != null) __obj.updateDynamic("Framerate")(Framerate.asInstanceOf[js.Any])
    __obj.asInstanceOf[SccDestinationSettings]
  }
}

