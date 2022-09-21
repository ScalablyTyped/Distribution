package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActiveItemId extends StObject {
  
  var activeItemId: String
  
  var activePredicate: Any
  
  var items: js.Array[Any]
  
  var mapItem: Any
}
object ActiveItemId {
  
  inline def apply(activeItemId: String, activePredicate: Any, items: js.Array[Any], mapItem: Any): ActiveItemId = {
    val __obj = js.Dynamic.literal(activeItemId = activeItemId.asInstanceOf[js.Any], activePredicate = activePredicate.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], mapItem = mapItem.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveItemId]
  }
  
  extension [Self <: ActiveItemId](x: Self) {
    
    inline def setActiveItemId(value: String): Self = StObject.set(x, "activeItemId", value.asInstanceOf[js.Any])
    
    inline def setActivePredicate(value: Any): Self = StObject.set(x, "activePredicate", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[Any]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: Any*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setMapItem(value: Any): Self = StObject.set(x, "mapItem", value.asInstanceOf[js.Any])
  }
}
