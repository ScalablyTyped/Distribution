package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PauseRequest extends js.Object {
  var customData: js.Object
}

object PauseRequest {
  @scala.inline
  def apply(customData: js.Object): PauseRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PauseRequest]
  }
}

