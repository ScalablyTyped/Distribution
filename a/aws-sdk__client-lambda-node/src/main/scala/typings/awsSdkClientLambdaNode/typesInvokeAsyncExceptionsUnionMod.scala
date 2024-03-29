package typings.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvokeAsyncExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
    - typings.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
    - typings.awsSdkClientLambdaNode.typesInvalidRequestContentExceptionMod.InvalidRequestContentException
    - typings.awsSdkClientLambdaNode.typesInvalidRuntimeExceptionMod.InvalidRuntimeException
  */
  trait InvokeAsyncExceptionsUnion extends StObject
  object InvokeAsyncExceptionsUnion {
    
    inline def InvalidRequestContentException(): typings.awsSdkClientLambdaNode.typesInvalidRequestContentExceptionMod.InvalidRequestContentException = {
      val __obj = js.Dynamic.literal(name = "InvalidRequestContentException")
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesInvalidRequestContentExceptionMod.InvalidRequestContentException]
    }
    
    inline def InvalidRuntimeException(): typings.awsSdkClientLambdaNode.typesInvalidRuntimeExceptionMod.InvalidRuntimeException = {
      val __obj = js.Dynamic.literal(name = "InvalidRuntimeException")
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesInvalidRuntimeExceptionMod.InvalidRuntimeException]
    }
    
    inline def ResourceNotFoundException(): typings.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = "ResourceNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException]
    }
    
    inline def ServiceException(): typings.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException = {
      val __obj = js.Dynamic.literal(name = "ServiceException")
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException]
    }
  }
}
