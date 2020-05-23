package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopRequest extends js.Object {
  var customData: js.Object
}

object StopRequest {
  @scala.inline
  def apply(customData: js.Object): StopRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopRequest]
  }
}

