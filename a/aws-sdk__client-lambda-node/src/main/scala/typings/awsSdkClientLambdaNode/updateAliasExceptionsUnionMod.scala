package typings.awsSdkClientLambdaNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object updateAliasExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException
    - typings.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
    - typings.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
    - typings.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException
    - typings.awsSdkClientLambdaNode.typesPreconditionFailedExceptionMod.PreconditionFailedException
  */
  trait UpdateAliasExceptionsUnion extends StObject
  object UpdateAliasExceptionsUnion {
    
    @scala.inline
    def InvalidParameterValueException(): typings.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException = {
      val __obj = js.Dynamic.literal(name = "InvalidParameterValueException")
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException]
    }
    
    @scala.inline
    def PreconditionFailedException(): typings.awsSdkClientLambdaNode.typesPreconditionFailedExceptionMod.PreconditionFailedException = {
      val __obj = js.Dynamic.literal(name = "PreconditionFailedException")
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesPreconditionFailedExceptionMod.PreconditionFailedException]
    }
    
    @scala.inline
    def ResourceNotFoundException(): typings.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = "ResourceNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException]
    }
    
    @scala.inline
    def ServiceException(): typings.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException = {
      val __obj = js.Dynamic.literal(name = "ServiceException")
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesServiceExceptionMod.ServiceException]
    }
    
    @scala.inline
    def TooManyRequestsException(): typings.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException = {
      val __obj = js.Dynamic.literal(name = "TooManyRequestsException")
      __obj.asInstanceOf[typings.awsSdkClientLambdaNode.typesTooManyRequestsExceptionMod.TooManyRequestsException]
    }
  }
}
