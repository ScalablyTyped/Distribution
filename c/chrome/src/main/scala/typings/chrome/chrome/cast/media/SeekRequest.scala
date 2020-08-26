package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SeekRequest extends js.Object {
  var currentTime: Double = js.native
  var customData: js.Object = js.native
  var resumeState: ResumeState = js.native
}

object SeekRequest {
  @scala.inline
  def apply(currentTime: Double, customData: js.Object, resumeState: ResumeState): SeekRequest = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any], resumeState = resumeState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeekRequest]
  }
  @scala.inline
  implicit class SeekRequestOps[Self <: SeekRequest] (val x: Self) extends AnyVal {
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
    def setCurrentTime(value: Double): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomData(value: js.Object): Self = this.set("customData", value.asInstanceOf[js.Any])
    @scala.inline
    def setResumeState(value: ResumeState): Self = this.set("resumeState", value.asInstanceOf[js.Any])
  }
  
}

