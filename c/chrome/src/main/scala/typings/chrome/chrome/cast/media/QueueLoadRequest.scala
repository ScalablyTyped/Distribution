package typings.chrome.chrome.cast.media

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueueLoadRequest extends StObject {
  
  var customData: js.Object
  
  var items: js.Array[QueueItem]
  
  var repeatMode: RepeatMode
  
  var startIndex: Double
}
object QueueLoadRequest {
  
  inline def apply(customData: js.Object, items: js.Array[QueueItem], repeatMode: RepeatMode, startIndex: Double): QueueLoadRequest = {
    val __obj = js.Dynamic.literal(customData = customData.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], repeatMode = repeatMode.asInstanceOf[js.Any], startIndex = startIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueueLoadRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueueLoadRequest] (val x: Self) extends AnyVal {
    
    inline def setCustomData(value: js.Object): Self = StObject.set(x, "customData", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[QueueItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: QueueItem*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setRepeatMode(value: RepeatMode): Self = StObject.set(x, "repeatMode", value.asInstanceOf[js.Any])
    
    inline def setStartIndex(value: Double): Self = StObject.set(x, "startIndex", value.asInstanceOf[js.Any])
  }
}
