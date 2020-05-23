package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiverDisplayStatus extends js.Object {
  var appImages: js.Array[Image]
  var statusText: String
}

object ReceiverDisplayStatus {
  @scala.inline
  def apply(appImages: js.Array[Image], statusText: String): ReceiverDisplayStatus = {
    val __obj = js.Dynamic.literal(appImages = appImages.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiverDisplayStatus]
  }
}

