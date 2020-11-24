package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueReorderItemsRequest extends js.Object {
  
  var customData: js.Object = js.native
  
  var insertBefore: Double = js.native
  
  var itemIds: js.Array[Double] = js.native
}
object QueueReorderItemsRequest {
  
  @scala.inline
  def apply(customData: js.Object, insertBefore: Double, itemIds: js.Array[Double]): QueueReorderItemsRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], insertBefore = insertBefore.asInstanceOf[js.Any], itemIds = itemIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueReorderItemsRequest]
  }
  
  @scala.inline
  implicit class QueueReorderItemsRequestOps[Self <: QueueReorderItemsRequest] (val x: Self) extends AnyVal {
    
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
    def setItemIdsVarargs(value: Double*): Self = this.set("itemIds", js.Array(value :_*))
    
    @scala.inline
    def setItemIds(value: js.Array[Double]): Self = this.set("itemIds", value.asInstanceOf[js.Any])
  }
}
