package typings.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesAddPermissionExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
    - typings.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
    - typings.awsSdkClientLambdaNode.typesResourceConflictExceptionMod.ResourceConflictException
    - typings.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
    - typings.awsSdkClientLambdaNode.typesPolicyLengthExceededExceptionMod.PolicyLengthExceededException
    - typings.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
    - typings.awsSdkClientLambdaNode.typesPreconditionFailedExceptionMod.PreconditionFailedException
  */
  trait AddPermissionExceptionsUnion extends StObject
  object AddPermissionExceptionsUnion {
    
    inline def InvalidParameterValueException(): typings.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException = {
      val __obj = js.Dynamic.literal(name = "InvalidParameterValueException")
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException]
    }
    
    inline def PolicyLengthExceededException(): typings.awsSdkClientLambdaNode.typesPolicyLengthExceededExceptionMod.PolicyLengthExceededException = {
      val __obj = js.Dynamic.literal(name = "PolicyLengthExceededException")
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesPolicyLengthExceededExceptionMod.PolicyLengthExceededException]
    }
    
    inline def PreconditionFailedException(): typings.awsSdkClientLambdaNode.typesPreconditionFailedExceptionMod.PreconditionFailedException = {
      val __obj = js.Dynamic.literal(name = "PreconditionFailedException")
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesPreconditionFailedExceptionMod.PreconditionFailedException]
    }
    
    inline def ResourceConflictException(): typings.awsSdkClientLambdaNode.typesResourceConflictExceptionMod.ResourceConflictException = {
      val __obj = js.Dynamic.literal(name = "ResourceConflictException")
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesResourceConflictExceptionMod.ResourceConflictException]
    }
    
    inline def ResourceNotFoundException(): typings.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = "ResourceNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException]
    }
    
    inline def ServiceException(): typings.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException = {
      val __obj = js.Dynamic.literal(name = "ServiceException")
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException]
    }
    
    inline def TooManyRequestsException(): typings.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException = {
      val __obj = js.Dynamic.literal(name = "TooManyRequestsException")
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException]
    }
  }
}
