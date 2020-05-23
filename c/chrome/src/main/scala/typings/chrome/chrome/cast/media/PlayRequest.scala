package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PlayRequest extends js.Object {
  var customData: js.Object
}

object PlayRequest {
  @scala.inline
  def apply(customData: js.Object): PlayRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlayRequest]
  }
}

