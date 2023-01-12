package typings.ckeditorCkeditor5Engine.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ValueBoolean extends StObject {
  
  var key: String | js.RegExp
  
  var value: Boolean
}
object ValueBoolean {
  
  inline def apply(key: String | js.RegExp, value: Boolean): ValueBoolean = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValueBoolean]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ValueBoolean] (val x: Self) extends AnyVal {
    
    inline def setKey(value: String | js.RegExp): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Boolean): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
