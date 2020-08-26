package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoSelectorSettings extends js.Object {
  var VideoSelectorPid: js.UndefOr[typings.awsSdk.medialiveMod.VideoSelectorPid] = js.native
  var VideoSelectorProgramId: js.UndefOr[typings.awsSdk.medialiveMod.VideoSelectorProgramId] = js.native
}

object VideoSelectorSettings {
  @scala.inline
  def apply(): VideoSelectorSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSelectorSettings]
  }
  @scala.inline
  implicit class VideoSelectorSettingsOps[Self <: VideoSelectorSettings] (val x: Self) extends AnyVal {
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
    def setVideoSelectorPid(value: VideoSelectorPid): Self = this.set("VideoSelectorPid", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoSelectorPid: Self = this.set("VideoSelectorPid", js.undefined)
    @scala.inline
    def setVideoSelectorProgramId(value: VideoSelectorProgramId): Self = this.set("VideoSelectorProgramId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVideoSelectorProgramId: Self = this.set("VideoSelectorProgramId", js.undefined)
  }
  
}

