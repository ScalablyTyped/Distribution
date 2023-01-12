package typings.ckeditorCkeditor5Engine.anon

import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NewValue extends StObject {
  
  var baseVersion: Double | Null
  
  var key: String
  
  var newValue: String | Boolean | Double | Null
  
  var oldValue: String | Boolean | Double | Null
  
  var range: ReturnType[js.Function0[End]]
}
object NewValue {
  
  inline def apply(key: String, range: ReturnType[js.Function0[End]]): NewValue = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], baseVersion = null, newValue = null, oldValue = null)
    __obj.asInstanceOf[NewValue]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NewValue] (val x: Self) extends AnyVal {
    
    inline def setBaseVersion(value: Double): Self = StObject.set(x, "baseVersion", value.asInstanceOf[js.Any])
    
    inline def setBaseVersionNull: Self = StObject.set(x, "baseVersion", null)
    
    inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setNewValue(value: String | Boolean | Double): Self = StObject.set(x, "newValue", value.asInstanceOf[js.Any])
    
    inline def setNewValueNull: Self = StObject.set(x, "newValue", null)
    
    inline def setOldValue(value: String | Boolean | Double): Self = StObject.set(x, "oldValue", value.asInstanceOf[js.Any])
    
    inline def setOldValueNull: Self = StObject.set(x, "oldValue", null)
    
    inline def setRange(value: ReturnType[js.Function0[End]]): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
  }
}
