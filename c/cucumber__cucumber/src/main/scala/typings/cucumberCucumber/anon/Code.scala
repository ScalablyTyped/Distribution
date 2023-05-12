package typings.cucumberCucumber.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Code extends StObject {
  
  var code: js.Function
  
  var wrapperOptions: Any
}
object Code {
  
  inline def apply(code: js.Function, wrapperOptions: Any): Code = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], wrapperOptions = wrapperOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Code]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
    
    inline def setCode(value: js.Function): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setWrapperOptions(value: Any): Self = StObject.set(x, "wrapperOptions", value.asInstanceOf[js.Any])
  }
}
