package typings.awsSdkClientGlacierNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object addTagsToVaultExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
    - typings.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException
    - typings.awsSdkClientGlacierNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException
    - typings.awsSdkClientGlacierNode.typesLimitExceededExceptionMod.LimitExceededException
    - typings.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException
  */
  trait AddTagsToVaultExceptionsUnion extends StObject
  object AddTagsToVaultExceptionsUnion {
    
    @scala.inline
    def InvalidParameterValueException(): typings.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException = {
      val __obj = js.Dynamic.literal(name = "InvalidParameterValueException")
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException]
    }
    
    @scala.inline
    def LimitExceededException(): typings.awsSdkClientGlacierNode.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = "LimitExceededException")
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    @scala.inline
    def MissingParameterValueException(): typings.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException = {
      val __obj = js.Dynamic.literal(name = "MissingParameterValueException")
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException]
    }
    
    @scala.inline
    def ResourceNotFoundException(): typings.awsSdkClientGlacierNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = "ResourceNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException]
    }
    
    @scala.inline
    def ServiceUnavailableException(): typings.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException = {
      val __obj = js.Dynamic.literal(name = "ServiceUnavailableException")
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException]
    }
  }
}
