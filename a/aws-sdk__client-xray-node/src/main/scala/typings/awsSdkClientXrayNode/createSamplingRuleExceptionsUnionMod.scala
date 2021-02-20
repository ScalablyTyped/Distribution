package typings.awsSdkClientXrayNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createSamplingRuleExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException
    - typings.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException
    - typings.awsSdkClientXrayNode.typesRuleLimitExceededExceptionMod.RuleLimitExceededException
  */
  trait CreateSamplingRuleExceptionsUnion extends StObject
  object CreateSamplingRuleExceptionsUnion {
    
    @scala.inline
    def InvalidRequestException(name: typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.InvalidRequestException): typings.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesInvalidRequestExceptionMod.InvalidRequestException]
    }
    
    @scala.inline
    def RuleLimitExceededException(name: typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.RuleLimitExceededException): typings.awsSdkClientXrayNode.typesRuleLimitExceededExceptionMod.RuleLimitExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesRuleLimitExceededExceptionMod.RuleLimitExceededException]
    }
    
    @scala.inline
    def ThrottledException(name: typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.ThrottledException): typings.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.awsSdkClientXrayNode.typesThrottledExceptionMod.ThrottledException]
    }
  }
}
