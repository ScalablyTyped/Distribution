package typings.awsSdk.inspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait State extends StObject {
  
  /**
    * The error code explaining why the account failed to enable Amazon Inspector.
    */
  var errorCode: ErrorCode
  
  /**
    * The error message received when the account failed to enable Amazon Inspector.
    */
  var errorMessage: NonEmptyString
  
  /**
    * The status of Amazon Inspector for the account.
    */
  var status: Status
}
object State {
  
  inline def apply(errorCode: ErrorCode, errorMessage: NonEmptyString, status: Status): State = {
    val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[State]
  }
  
  extension [Self <: State](x: Self) {
    
    inline def setErrorCode(value: ErrorCode): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: NonEmptyString): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
