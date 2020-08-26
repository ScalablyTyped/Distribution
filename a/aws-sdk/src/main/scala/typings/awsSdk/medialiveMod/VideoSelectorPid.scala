package typings.awsSdk.medialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VideoSelectorPid extends js.Object {
  /**
    * Selects a specific PID from within a video source.
    */
  var Pid: js.UndefOr[integerMin0Max8191] = js.native
}

object VideoSelectorPid {
  @scala.inline
  def apply(): VideoSelectorPid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VideoSelectorPid]
  }
  @scala.inline
  implicit class VideoSelectorPidOps[Self <: VideoSelectorPid] (val x: Self) extends AnyVal {
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
    def setPid(value: integerMin0Max8191): Self = this.set("Pid", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePid: Self = this.set("Pid", js.undefined)
  }
  
}

