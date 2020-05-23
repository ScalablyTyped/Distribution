package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueReorderItemsRequest extends js.Object {
  var customData: js.Object
  var insertBefore: Double
  var itemIds: js.Array[Double]
}

object QueueReorderItemsRequest {
  @scala.inline
  def apply(customData: js.Object, insertBefore: Double, itemIds: js.Array[Double]): QueueReorderItemsRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], insertBefore = insertBefore.asInstanceOf[js.Any], itemIds = itemIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueReorderItemsRequest]
  }
}

