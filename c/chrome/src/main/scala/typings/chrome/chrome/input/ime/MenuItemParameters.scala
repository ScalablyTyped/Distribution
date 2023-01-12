package typings.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuItemParameters extends StObject {
  
  var engineId: String
  
  var items: js.Array[js.Object]
}
object MenuItemParameters {
  
  inline def apply(engineId: String, items: js.Array[js.Object]): MenuItemParameters = {
    val __obj = js.Dynamic.literal(engineId = engineId.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuItemParameters]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MenuItemParameters] (val x: Self) extends AnyVal {
    
    inline def setEngineId(value: String): Self = StObject.set(x, "engineId", value.asInstanceOf[js.Any])
    
    inline def setItems(value: js.Array[js.Object]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: js.Object*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
