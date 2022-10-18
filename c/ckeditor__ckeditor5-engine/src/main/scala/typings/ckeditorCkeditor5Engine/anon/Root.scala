package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Root extends StObject {
  
  var baseVersion: Double | Null
  
  var key: String
  
  var newValue: Any
  
  var oldValue: Any
  
  var root: String
}
object Root {
  
  inline def apply(key: String, newValue: Any, oldValue: Any, root: String): Root = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], newValue = newValue.asInstanceOf[js.Any], oldValue = oldValue.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], baseVersion = null)
    __obj.asInstanceOf[Root]
  }
  
  extension [Self <: Root](x: Self) {
    
    inline def setBaseVersion(value: Double): Self = StObject.set(x, "baseVersion", value.asInstanceOf[js.Any])
    
    inline def setBaseVersionNull: Self = StObject.set(x, "baseVersion", null)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: Any): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setOldValue(value: Any): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
  }
}
