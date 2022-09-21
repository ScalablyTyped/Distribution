package typings.awsSdk.mwaaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateError extends StObject {
  
  /**
    * The error code that corresponds to the error with the last update.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.mwaaMod.ErrorCode] = js.undefined
  
  /**
    * The error message that corresponds to the error code.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.mwaaMod.ErrorMessage] = js.undefined
}
object UpdateError {
  
  inline def apply(): UpdateError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateError]
  }
  
  extension [Self <: UpdateError](x: Self) {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
    
    inline def setErrorMessage(value: ErrorMessage): Self = StObject.set(x, "ErrorMessage", value.asInstanceOf[js.Any])
    
    inline def setErrorMessageUndefined: Self = StObject.set(x, "ErrorMessage", js.undefined)
  }
}
