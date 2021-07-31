package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueInsertItemsRequest extends StObject {
  
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
  
  @scala.inline
  implicit class QueueInsertItemsRequestMutableBuilder[Self <: QueueInsertItemsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInsertBefore(value: Double): Self = StObject.set(x, "insertBefore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[QueueItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: QueueItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
