package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestFileError
  extends StObject
     with RuntimeError {
  
  var request: WebRequest
}
object RequestFileError {
  
  inline def apply(errorCode: ErrorCodesType, message: String, name: String, request: WebRequest): RequestFileError = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestFileError]
  }
  
  extension [Self <: RequestFileError](x: Self) {
    
    inline def setRequest(value: WebRequest): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
  }
}
