package typings.typescriptNn5FuAjk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RTCErrorEventInit
  extends StObject
     with EventInit {
  
  var error: RTCError
}
object RTCErrorEventInit {
  
  inline def apply(error: RTCError): RTCErrorEventInit = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[RTCErrorEventInit]
  }
  
  extension [Self <: RTCErrorEventInit](x: Self) {
    
    inline def setError(value: RTCError): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
  }
}
