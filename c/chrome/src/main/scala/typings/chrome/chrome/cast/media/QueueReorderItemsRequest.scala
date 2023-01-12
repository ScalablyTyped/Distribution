package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueReorderItemsRequest extends StObject {
  
  var customData: js.Object
  
  var insertBefore: Double
  
  var itemIds: js.Array[Double]
}
object QueueReorderItemsRequest {
  
  inline def apply(customData: js.Object, insertBefore: Double, itemIds: js.Array[Double]): QueueReorderItemsRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], insertBefore = insertBefore.asInstanceOf[js.Any], itemIds = itemIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueReorderItemsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueueReorderItemsRequest] (val x: Self) extends AnyVal {
    
    inline def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    inline def setInsertBefore(value: Double): Self = StObject.set(x, "insertBefore", value.asInstanceOf[js.Any])
    
    inline def setItemIds(value: js.Array[Double]): Self = StObject.set(x, "itemIds", value.asInstanceOf[js.Any])
    
    inline def setItemIdsVarargs(value: Double*): Self = StObject.set(x, "itemIds", js.Array(value*))
  }
}
