package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CoreNetworkPolicyError extends StObject {
  
  /**
    * The error code associated with a core network policy error.
    */
  var ErrorCode: ServerSideString
  
  /**
    * The message associated with a core network policy error code.
    */
  var Message: ServerSideString
  
  /**
    * The JSON path where the error was discovered in the policy document.
    */
  var Path: js.UndefOr[ServerSideString] = js.undefined
}
object CoreNetworkPolicyError {
  
  inline def apply(ErrorCode: ServerSideString, Message: ServerSideString): CoreNetworkPolicyError = {
    val __obj = js.Dynamic.literal(ErrorCode = ErrorCode.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[CoreNetworkPolicyError]
  }
  
  extension [Self <: CoreNetworkPolicyError](x: Self) {
    
    inline def setErrorCode(value: ServerSideString): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: ServerSideString): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setPath(value: ServerSideString): Self = StObject.set(x, "Path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "Path", js.undefined)
  }
}
