package typings.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object publishVersionExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
    - typings.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
    - typings.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
    - typings.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
    - typings.awsSdkClientLambdaNode.typesCodeStorageExceededExceptionMod.CodeStorageExceededException
    - typings.awsSdkClientLambdaNode.typesPreconditionFailedExceptionMod.PreconditionFailedException
  */
  trait PublishVersionExceptionsUnion extends StObject
  object PublishVersionExceptionsUnion {
    
    @scala.inline
    def CodeStorageExceededException(name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.CodeStorageExceededException): typings.awsSdkClientLambdaNode.typesCodeStorageExceededExceptionMod.CodeStorageExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesCodeStorageExceededExceptionMod.CodeStorageExceededException]
    }
    
    @scala.inline
    def InvalidParameterValueException(name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidParameterValueException): typings.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException]
    }
    
    @scala.inline
    def PreconditionFailedException(name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.PreconditionFailedException): typings.awsSdkClientLambdaNode.typesPreconditionFailedExceptionMod.PreconditionFailedException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesPreconditionFailedExceptionMod.PreconditionFailedException]
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
    
    @scala.inline
    def TooManyRequestsException(name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.TooManyRequestsException): typings.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException]
    }
  }
}
