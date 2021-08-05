package typings.awsSdkClientGlacierNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createVaultExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException
    - typings.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException
    - typings.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException
    - typings.awsSdkClientGlacierNode.typesLimitExceededExceptionMod.LimitExceededException
  */
  trait CreateVaultExceptionsUnion extends StObject
  object CreateVaultExceptionsUnion {
    
    inline def InvalidParameterValueException(): typings.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException = {
      val __obj = js.Dynamic.literal(name = "InvalidParameterValueException")
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesInvalidParameterValueExceptionMod.InvalidParameterValueException]
    }
    
    inline def LimitExceededException(): typings.awsSdkClientGlacierNode.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = "LimitExceededException")
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    inline def MissingParameterValueException(): typings.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException = {
      val __obj = js.Dynamic.literal(name = "MissingParameterValueException")
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesMissingParameterValueExceptionMod.MissingParameterValueException]
    }
    
    inline def ServiceUnavailableException(): typings.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException = {
      val __obj = js.Dynamic.literal(name = "ServiceUnavailableException")
      __obj.asInstanceOf[typings.awsSdkClientGlacierNode.typesServiceUnavailableExceptionMod.ServiceUnavailableException]
    }
  }
}
