package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchReadException extends StObject {
  
  /**
    * An exception message that is associated with the failure.
    */
  var Message: js.UndefOr[ExceptionMessage] = js.undefined
  
  /**
    * A type of exception, such as InvalidArnException.
    */
  var Type: js.UndefOr[BatchReadExceptionType] = js.undefined
}
object BatchReadException {
  
  inline def apply(): BatchReadException = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchReadException]
  }
  
  extension [Self <: BatchReadException](x: Self) {
    
    inline def setMessage(value: ExceptionMessage): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
    
    inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    
    inline def setType(value: BatchReadExceptionType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
  }
}
