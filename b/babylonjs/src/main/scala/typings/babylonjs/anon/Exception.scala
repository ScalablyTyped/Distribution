package typings.babylonjs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Exception extends StObject {
  
  var exception: js.UndefOr[Any] = js.undefined
  
  var message: js.UndefOr[String] = js.undefined
}
object Exception {
  
  inline def apply(): Exception = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Exception]
  }
  
  extension [Self <: Exception](x: Self) {
    
    inline def setException(value: Any): Self = StObject.set(x, "exception", value.asInstanceOf[js.Any])
    
    inline def setExceptionUndefined: Self = StObject.set(x, "exception", js.undefined)
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
  }
}
