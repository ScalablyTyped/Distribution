package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputRef extends StObject {
  
  var inputRef: `255`
  
  var value: String
}
object InputRef {
  
  inline def apply(inputRef: `255`, value: String): InputRef = {
    val __obj = js.Dynamic.literal(inputRef = inputRef.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputRef]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputRef] (val x: Self) extends AnyVal {
    
    inline def setInputRef(value: `255`): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
