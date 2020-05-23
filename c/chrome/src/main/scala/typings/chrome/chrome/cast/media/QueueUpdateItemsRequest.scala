package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueUpdateItemsRequest extends js.Object {
  var customData: js.Object
  var item: js.Array[QueueItem]
}

object QueueUpdateItemsRequest {
  @scala.inline
  def apply(customData: js.Object, item: js.Array[QueueItem]): QueueUpdateItemsRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueUpdateItemsRequest]
  }
}

