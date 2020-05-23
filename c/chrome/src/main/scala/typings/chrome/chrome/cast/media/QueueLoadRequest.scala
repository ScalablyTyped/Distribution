package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueLoadRequest extends js.Object {
  var customData: js.Object
  var items: js.Array[QueueItem]
  var repeatMode: RepeatMode
  var startIndex: Double
}

object QueueLoadRequest {
  @scala.inline
  def apply(customData: js.Object, items: js.Array[QueueItem], repeatMode: RepeatMode, startIndex: Double): QueueLoadRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], repeatMode = repeatMode.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueLoadRequest]
  }
}

