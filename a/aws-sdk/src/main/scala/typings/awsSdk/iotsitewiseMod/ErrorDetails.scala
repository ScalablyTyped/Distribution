package typings.awsSdk.iotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ErrorDetails extends StObject {
  
  /**
    * The error code.
    */
  var code: ErrorCode
  
  /**
    * The error message.
    */
  var message: ErrorMessage
}
object ErrorDetails {
  
  inline def apply(code: ErrorCode, message: ErrorMessage): ErrorDetails = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ErrorDetails]
  }
  
  extension [Self <: ErrorDetails](x: Self) {
    
    inline def setCode(value: ErrorCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: ErrorMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
