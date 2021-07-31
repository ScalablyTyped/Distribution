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
    
    @scala.inline
    def apply(): EnvironmentError = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EnvironmentError]
    }
    
    @scala.inline
    implicit class EnvironmentErrorMutableBuilder[Self <: EnvironmentError] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorCode(value: String): Self = StObject.set(x, "ErrorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorCodeUndefined: Self = StObject.set(x, "ErrorCode", js.undefined)
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    }
  }
  
  type UnmarshalledEnvironmentError = EnvironmentError
}
