package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesCreateSamplingRuleExceptionsUnionMod.CreateSamplingRuleExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRuleLimitExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_RuleLimitExceededExceptionDetails> * / any */ trait RuleLimitExceededException
    extends StObject
       with CreateSamplingRuleExceptionsUnion {
    
    var name: typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.RuleLimitExceededException
  }
  object RuleLimitExceededException {
    
    inline def apply(): RuleLimitExceededException = {
      val __obj = js.Dynamic.literal(name = "RuleLimitExceededException")
      __obj.asInstanceOf[RuleLimitExceededException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuleLimitExceededException] (val x: Self) extends AnyVal {
      
      inline def setName(value: typings.awsSdkClientXrayNode.awsSdkClientXrayNodeStrings.RuleLimitExceededException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait RuleLimitExceededExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var Message: js.UndefOr[String] = js.undefined
  }
  object RuleLimitExceededExceptionDetails {
    
    inline def apply(): RuleLimitExceededExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleLimitExceededExceptionDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RuleLimitExceededExceptionDetails] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
    }
  }
}
