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
  def apply(): SccDestinationSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SccDestinationSettings]
  }
  @scala.inline
  implicit class SccDestinationSettingsOps[Self <: SccDestinationSettings] (val x: Self) extends AnyVal {
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
    def setFramerate(value: SccDestinationFramerate): Self = this.set("Framerate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFramerate: Self = this.set("Framerate", js.undefined)
  }
  
}

