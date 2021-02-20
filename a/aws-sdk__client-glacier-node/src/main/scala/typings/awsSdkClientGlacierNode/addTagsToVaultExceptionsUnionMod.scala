package typings.awsSdkClientGlacierNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    def InvalidParameterValueException(
      name: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.InvalidParameterValueException
    ): typings.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException]
    }
    
    @scala.inline
    def LimitExceededException(name: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.LimitExceededException): typings.awsSdkClientGlacierNode.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    @scala.inline
    def MissingParameterValueException(
      name: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.MissingParameterValueException
    ): typings.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException]
    }
    
    @scala.inline
    def ResourceNotFoundException(name: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ResourceNotFoundException): typings.awsSdkClientGlacierNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesResourceNotFoundExceptionMod.ResourceNotFoundException]
    }
    
    @scala.inline
    def ServiceUnavailableException(name: typings.awsSdkClientGlacierNode.awsSdkClientGlacierNodeStrings.ServiceUnavailableException): typings.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException]
    }
  }
}
