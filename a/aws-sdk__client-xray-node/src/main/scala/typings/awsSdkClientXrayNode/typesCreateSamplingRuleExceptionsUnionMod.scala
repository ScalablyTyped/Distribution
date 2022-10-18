package typings.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesCreateSamplingRuleExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
    - typings.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
    - typings.awsSdkClientXrayNode.typesRuleLimitExceededExceptionMod.RuleLimitExceededException
  */
  trait CreateSamplingRuleExceptionsUnion extends StObject
  object CreateSamplingRuleExceptionsUnion {
    
    inline def InvalidRequestException(): typings.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException = {
      val __obj = js.Dynamic.literal(name = "InvalidRequestException")
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException]
    }
    
    inline def RuleLimitExceededException(): typings.awsSdkClientXrayNode.typesRuleLimitExceededExceptionMod.RuleLimitExceededException = {
      val __obj = js.Dynamic.literal(name = "RuleLimitExceededException")
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesRuleLimitExceededExceptionMod.RuleLimitExceededException]
    }
    
    inline def ThrottledException(): typings.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException = {
      val __obj = js.Dynamic.literal(name = "ThrottledException")
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException]
    }
  }
}
