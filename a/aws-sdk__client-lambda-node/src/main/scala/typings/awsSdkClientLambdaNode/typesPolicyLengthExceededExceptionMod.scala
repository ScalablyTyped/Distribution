package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.typesAddPermissionExceptionsUnionMod.AddPermissionExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPolicyLengthExceededExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_PolicyLengthExceededExceptionDetails> * / any */ trait PolicyLengthExceededException
    extends StObject
       with AddPermissionExceptionsUnion {
    
    var name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.PolicyLengthExceededException
  }
  object PolicyLengthExceededException {
    
    inline def apply(): PolicyLengthExceededException = {
      val __obj = js.Dynamic.literal(name = "PolicyLengthExceededException")
      __obj.asInstanceOf[PolicyLengthExceededException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PolicyLengthExceededException] (val x: Self) extends AnyVal {
      
      inline def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.PolicyLengthExceededException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait PolicyLengthExceededExceptionDetails extends StObject {
    
    /**
      * _String shape
      */
    var Type: js.UndefOr[String] = js.undefined
    
    /**
      * _String shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object PolicyLengthExceededExceptionDetails {
    
    inline def apply(): PolicyLengthExceededExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PolicyLengthExceededExceptionDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PolicyLengthExceededExceptionDetails] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
}
