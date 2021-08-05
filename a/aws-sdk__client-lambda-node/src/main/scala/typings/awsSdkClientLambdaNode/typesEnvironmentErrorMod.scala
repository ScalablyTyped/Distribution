package typings.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEnvironmentErrorMod {
  
  trait EnvironmentError extends StObject {
    
    /**
      * <p>The error code.</p>
      */
    var ErrorCode: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The error message.</p>
      */
    var Message: js.UndefOr[String] = js.undefined
  }
  object EnvironmentError {
    
    inline def apply(): EnvironmentError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnvironmentError]
    }
    
    extension [Self <: EnvironmentError](x: Self) {
      
      inline def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    }
  }
  
  type UnmarshalledEnvironmentError = EnvironmentError
}
