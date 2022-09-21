package typings.awsSdk.iottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchPutPropertyError extends StObject {
  
  /**
    * An object that contains information about errors returned by the BatchPutProperty action.
    */
  var entry: PropertyValueEntry
  
  /**
    * The error code.
    */
  var errorCode: String
  
  /**
    * The error message.
    */
  var errorMessage: String
}
object BatchPutPropertyError {
  
  inline def apply(entry: PropertyValueEntry, errorCode: String, errorMessage: String): BatchPutPropertyError = {
    val __obj = js.Dynamic.literal(entry = entry.asInstanceOf[js.Any], errorCode = errorCode.asInstanceOf[js.Any], errorMessage = errorMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchPutPropertyError]
  }
  
  extension [Self <: BatchPutPropertyError](x: Self) {
    
    inline def setEntry(value: PropertyValueEntry): Self = StObject.set(x, "entry", value.asInstanceOf[js.Any])
    
    inline def setErrorCode(value: String): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
    
    inline def setErrorMessage(value: String): Self = StObject.set(x, "errorMessage", value.asInstanceOf[js.Any])
  }
}
