package typings.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object invokeAsyncExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
    - typings.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
    - typings.awsSdkClientLambdaNode.typesInvalidRequestContentExceptionMod.InvalidRequestContentException
    - typings.awsSdkClientLambdaNode.typesInvalidRuntimeExceptionMod.InvalidRuntimeException
  */
  trait InvokeAsyncExceptionsUnion extends StObject
  object InvokeAsyncExceptionsUnion {
    
    @scala.inline
    def InvalidRequestContentException(name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidRequestContentException): typings.awsSdkClientLambdaNode.typesInvalidRequestContentExceptionMod.InvalidRequestContentException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesInvalidRequestContentExceptionMod.InvalidRequestContentException]
    }
    
    @scala.inline
    def InvalidRuntimeException(name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidRuntimeException): typings.awsSdkClientLambdaNode.typesInvalidRuntimeExceptionMod.InvalidRuntimeException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesInvalidRuntimeExceptionMod.InvalidRuntimeException]
    }
    
    @scala.inline
    def ResourceNotFoundException(name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ResourceNotFoundException): typings.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException]
    }
    
    @scala.inline
    def ServiceException(name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ServiceException): typings.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException]
    }
  }
}
