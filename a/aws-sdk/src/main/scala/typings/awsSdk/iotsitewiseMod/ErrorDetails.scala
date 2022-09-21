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
    *  A list of detailed errors. 
    */
  var details: js.UndefOr[DetailedErrors] = js.undefined
  
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
    
    inline def setDetails(value: DetailedErrors): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
    
    inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
    
    inline def setDetailsVarargs(value: DetailedError*): Self = StObject.set(x, "details", js.Array(value*))
    
    inline def setMessage(value: ErrorMessage): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
