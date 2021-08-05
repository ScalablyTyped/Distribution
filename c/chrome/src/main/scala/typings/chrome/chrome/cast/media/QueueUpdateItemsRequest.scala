package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueUpdateItemsRequest extends StObject {
  
  var customData: js.Object
  
  var item: js.Array[QueueItem]
}
object QueueUpdateItemsRequest {
  
  inline def apply(customData: js.Object, item: js.Array[QueueItem]): QueueUpdateItemsRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], item = item.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueUpdateItemsRequest]
  }
  
  extension [Self <: QueueUpdateItemsRequest](x: Self) {
    
    inline def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    inline def setItem(value: js.Array[QueueItem]): Self = StObject.set(x, "item", value.asInstanceOf[js.Any])
    
    inline def setItemVarargs(value: QueueItem*): Self = StObject.set(x, "item", js.Array(value :_*))
  }
}
