package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.createSamplingRuleExceptionsUnionMod.CreateSamplingRuleExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuleLimitExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_RuleLimitExceededExceptionDetails> * / any */ @js.native
  trait RuleLimitExceededException extends CreateSamplingRuleExceptionsUnion {
    
    var name: typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.RuleLimitExceededException = js.native
  }
  object RuleLimitExceededException {
    
    @scala.inline
    def apply(name: typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.RuleLimitExceededException): RuleLimitExceededException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleLimitExceededException]
    }
    
    @scala.inline
    implicit class RuleLimitExceededExceptionMutableBuilder[Self <: RuleLimitExceededException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.RuleLimitExceededException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RuleLimitExceededExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var Message: js.UndefOr[String] = js.native
  }
  object RuleLimitExceededExceptionDetails {
    
    @scala.inline
    def apply(): RuleLimitExceededExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleLimitExceededExceptionDetails]
    }
    
    @scala.inline
    implicit class RuleLimitExceededExceptionDetailsMutableBuilder[Self <: RuleLimitExceededExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    }
  }
}
