package typings.baseui.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputRef extends StObject {
  
  var inputRef: `258`
  
  var value: String
}
object InputRef {
  
  inline def apply(inputRef: `258`, value: String): InputRef = {
    val __obj = js.Dynamic.literal(inputRef = inputRef.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputRef]
  }
  
  extension [Self <: InputRef](x: Self) {
    
    inline def setInputRef(value: `258`): Self = StObject.set(x, "inputRef", value.asInstanceOf[js.Any])
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
