package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StorageEventInit
  extends StObject
     with EventInit {
  
  var key: js.UndefOr[java.lang.String | Null] = js.undefined
  
  var newValue: js.UndefOr[java.lang.String | Null] = js.undefined
  
  var oldValue: js.UndefOr[java.lang.String | Null] = js.undefined
  
  var storageArea: js.UndefOr[Storage | Null] = js.undefined
  
  var url: js.UndefOr[java.lang.String] = js.undefined
}
object StorageEventInit {
  
  inline def apply(): StorageEventInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StorageEventInit]
  }
  
  extension [Self <: StorageEventInit](x: Self) {
    
    inline def setKey(value: java.lang.String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyNull: Self = StObject.set(x, "key", null)
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setNewValue(value: java.lang.String): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueNull: Self = StObject.set(x, "newValue", null)
    
    inline def setNewValueUndefined: Self = StObject.set(x, "newValue", js.undefined)
    
    inline def setOldValue(value: java.lang.String): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueNull: Self = StObject.set(x, "oldValue", null)
    
    inline def setOldValueUndefined: Self = StObject.set(x, "oldValue", js.undefined)
    
    inline def setStorageArea(value: Storage): Self = StObject.set(x, "storageArea", value.asInstanceOf[js.Any])
    
    inline def setStorageAreaNull: Self = StObject.set(x, "storageArea", null)
    
    inline def setStorageAreaUndefined: Self = StObject.set(x, "storageArea", js.undefined)
    
    inline def setUrl(value: java.lang.String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
