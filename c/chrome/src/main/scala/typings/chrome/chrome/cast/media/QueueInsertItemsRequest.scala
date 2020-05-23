package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueInsertItemsRequest extends js.Object {
  var customData: js.Object
  var insertBefore: Double
  var items: js.Array[QueueItem]
}

object QueueInsertItemsRequest {
  @scala.inline
  def apply(customData: js.Object, insertBefore: Double, items: js.Array[QueueItem]): QueueInsertItemsRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], insertBefore = insertBefore.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueInsertItemsRequest]
  }
}

