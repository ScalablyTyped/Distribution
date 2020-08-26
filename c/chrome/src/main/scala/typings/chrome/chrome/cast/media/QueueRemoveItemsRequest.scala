package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueRemoveItemsRequest extends js.Object {
  var customData: js.Object = js.native
  var itemIds: js.Array[Double] = js.native
}

object QueueRemoveItemsRequest {
  @scala.inline
  def apply(customData: js.Object, itemIds: js.Array[Double]): QueueRemoveItemsRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], itemIds = itemIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueRemoveItemsRequest]
  }
  @scala.inline
  implicit class QueueRemoveItemsRequestOps[Self <: QueueRemoveItemsRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCustomData(value: js.Object): Self = this.set("customData", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemIdsVarargs(value: Double*): Self = this.set("itemIds", js.Array(value :_*))
    @scala.inline
    def setItemIds(value: js.Array[Double]): Self = this.set("itemIds", value.asInstanceOf[js.Any])
  }
  
}

