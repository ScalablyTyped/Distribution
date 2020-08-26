package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QueueInsertItemsRequest extends js.Object {
  var customData: js.Object = js.native
  var insertBefore: Double = js.native
  var items: js.Array[QueueItem] = js.native
}

object QueueInsertItemsRequest {
  @scala.inline
  def apply(customData: js.Object, insertBefore: Double, items: js.Array[QueueItem]): QueueInsertItemsRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], insertBefore = insertBefore.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueInsertItemsRequest]
  }
  @scala.inline
  implicit class QueueInsertItemsRequestOps[Self <: QueueInsertItemsRequest] (val x: Self) extends AnyVal {
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
    def setInsertBefore(value: Double): Self = this.set("insertBefore", value.asInstanceOf[js.Any])
    @scala.inline
    def setItemsVarargs(value: QueueItem*): Self = this.set("items", js.Array(value :_*))
    @scala.inline
    def setItems(value: js.Array[QueueItem]): Self = this.set("items", value.asInstanceOf[js.Any])
  }
  
}

