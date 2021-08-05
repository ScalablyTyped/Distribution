package typings.datatablesNetButtons.DataTables

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonKey extends StObject {
  
  var altKey: js.UndefOr[Boolean] = js.undefined
  
  var ctrlKey: js.UndefOr[Boolean] = js.undefined
  
  var key: js.UndefOr[String] = js.undefined
  
  var metaKey: js.UndefOr[Boolean] = js.undefined
  
  var shiftKey: js.UndefOr[Boolean] = js.undefined
}
object ButtonKey {
  
  inline def apply(): ButtonKey = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonKey]
  }
  
  extension [Self <: ButtonKey](x: Self) {
    
    inline def setAltKey(value: Boolean): Self = StObject.set(x, "altKey", value.asInstanceOf[js.Any])
    
    inline def setAltKeyUndefined: Self = StObject.set(x, "altKey", js.undefined)
    
    inline def setCtrlKey(value: Boolean): Self = StObject.set(x, "ctrlKey", value.asInstanceOf[js.Any])
    
    inline def setCtrlKeyUndefined: Self = StObject.set(x, "ctrlKey", js.undefined)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setMetaKey(value: Boolean): Self = StObject.set(x, "metaKey", value.asInstanceOf[js.Any])
    
    inline def setMetaKeyUndefined: Self = StObject.set(x, "metaKey", js.undefined)
    
    inline def setShiftKey(value: Boolean): Self = StObject.set(x, "shiftKey", value.asInstanceOf[js.Any])
    
    inline def setShiftKeyUndefined: Self = StObject.set(x, "shiftKey", js.undefined)
  }
}
