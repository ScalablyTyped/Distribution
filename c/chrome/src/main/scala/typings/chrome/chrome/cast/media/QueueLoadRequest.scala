package typings.chrome.chrome.cast.media

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueLoadRequest extends js.Object {
  
  var customData: js.Object = js.native
  
  var items: js.Array[QueueItem] = js.native
  
  var repeatMode: RepeatMode = js.native
  
  var startIndex: Double = js.native
}
object QueueLoadRequest {
  
  @scala.inline
  def apply(customData: js.Object, items: js.Array[QueueItem], repeatMode: RepeatMode, startIndex: Double): QueueLoadRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], repeatMode = repeatMode.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueLoadRequest]
  }
  
  @scala.inline
  implicit class QueueLoadRequestOps[Self <: QueueLoadRequest] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: QueueItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[QueueItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepeatMode(value: RepeatMode): Self = this.set("repeatMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartIndex(value: Double): Self = this.set("startIndex", value.asInstanceOf[js.Any])
  }
}
