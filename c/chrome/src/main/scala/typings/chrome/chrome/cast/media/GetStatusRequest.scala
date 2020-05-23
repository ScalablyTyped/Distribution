package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStatusRequest extends js.Object {
  var customData: js.Object
}

object GetStatusRequest {
  @scala.inline
  def apply(customData: js.Object): GetStatusRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetStatusRequest]
  }
}

