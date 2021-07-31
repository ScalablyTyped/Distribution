package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEc2throttledexceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_EC2ThrottledExceptionDetails> * / any */ trait EC2ThrottledException
    extends StObject
       with InvokeExceptionsUnion {
    
    var name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2ThrottledException
  }
  object EC2ThrottledException {
    
    @scala.inline
    def apply(): EC2ThrottledException = {
      val __obj = js.Dynamic.literal(name = "EC2ThrottledException")
      __obj.asInstanceOf[EC2ThrottledException]
    }
    
    @scala.inline
    implicit class EC2ThrottledExceptionMutableBuilder[Self <: EC2ThrottledException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2ThrottledException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait EC2ThrottledExceptionDetails extends StObject {
    
    /**
      * _String shape
      */
    var Message: js.UndefOr[String] = js.undefined
    
    /**
      * _String shape
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  object EC2ThrottledExceptionDetails {
    
    @scala.inline
    def apply(): EC2ThrottledExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EC2ThrottledExceptionDetails]
    }
    
    @scala.inline
    implicit class EC2ThrottledExceptionDetailsMutableBuilder[Self <: EC2ThrottledExceptionDetails] (val x: Self) extends AnyVal {
      
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
