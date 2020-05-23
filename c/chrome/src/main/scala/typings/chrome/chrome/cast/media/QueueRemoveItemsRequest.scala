package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueRemoveItemsRequest extends js.Object {
  var customData: js.Object
  var itemIds: js.Array[Double]
}

object QueueRemoveItemsRequest {
  @scala.inline
  def apply(customData: js.Object, itemIds: js.Array[Double]): QueueRemoveItemsRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], itemIds = itemIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueRemoveItemsRequest]
  }
}

