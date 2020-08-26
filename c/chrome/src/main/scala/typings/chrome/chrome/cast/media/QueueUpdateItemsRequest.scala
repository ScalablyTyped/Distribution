package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueUpdateItemsRequest extends js.Object {
  var customData: js.Object = js.native
  var item: js.Array[QueueItem] = js.native
}

object QueueUpdateItemsRequest {
  @scala.inline
  def apply(customData: js.Object, item: js.Array[QueueItem]): QueueUpdateItemsRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueUpdateItemsRequest]
  }
  @scala.inline
  implicit class QueueUpdateItemsRequestOps[Self <: QueueUpdateItemsRequest] (val x: Self) extends AnyVal {
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
    def setItemVarargs(value: QueueItem*): Self = this.set("item", js.Array(value :_*))
    @scala.inline
    def setItem(value: js.Array[QueueItem]): Self = this.set("item", value.asInstanceOf[js.Any])
  }
  
}

