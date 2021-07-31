package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEc2accessdeniedexceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_EC2AccessDeniedExceptionDetails> * / any */ trait EC2AccessDeniedException
    extends StObject
       with InvokeExceptionsUnion {
    
    var name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2AccessDeniedException
  }
  object EC2AccessDeniedException {
    
    @scala.inline
    def apply(): EC2AccessDeniedException = {
      val __obj = js.Dynamic.literal(name = "EC2AccessDeniedException")
      __obj.asInstanceOf[EC2AccessDeniedException]
    }
    
    @scala.inline
    implicit class EC2AccessDeniedExceptionMutableBuilder[Self <: EC2AccessDeniedException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2AccessDeniedException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait EC2AccessDeniedExceptionDetails extends StObject {
    
    /**
      * _String shape
      */
    var Message: js.UndefOr[String] = js.undefined
    
    /**
      * _String shape
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  object EC2AccessDeniedExceptionDetails {
    
    @scala.inline
    def apply(): EC2AccessDeniedExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EC2AccessDeniedExceptionDetails]
    }
    
    @scala.inline
    implicit class EC2AccessDeniedExceptionDetailsMutableBuilder[Self <: EC2AccessDeniedExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
}
