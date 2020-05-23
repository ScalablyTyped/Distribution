package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SeekRequest extends js.Object {
  var currentTime: Double
  var customData: js.Object
  var resumeState: ResumeState
}

object SeekRequest {
  @scala.inline
  def apply(currentTime: Double, customData: js.Object, resumeState: ResumeState): SeekRequest = {
    val __obj = js.Dynamic.literal(currentTime = currentTime.asInstanceOf[js.Any], customData = customData.asInstanceOf[js.Any], resumeState = resumeState.asInstanceOf[js.Any])
    __obj.asInstanceOf[SeekRequest]
  }
}

