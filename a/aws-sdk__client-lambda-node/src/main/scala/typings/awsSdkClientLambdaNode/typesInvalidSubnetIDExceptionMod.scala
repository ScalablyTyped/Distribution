package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidSubnetIDExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidSubnetIDExceptionDetails> * / any */ trait InvalidSubnetIDException
    extends StObject
       with InvokeExceptionsUnion {
    
    var name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidSubnetIDException
  }
  object InvalidSubnetIDException {
    
    @scala.inline
    def apply(): InvalidSubnetIDException = {
      val __obj = js.Dynamic.literal(name = "InvalidSubnetIDException")
      __obj.asInstanceOf[InvalidSubnetIDException]
    }
    
    @scala.inline
    implicit class InvalidSubnetIDExceptionMutableBuilder[Self <: InvalidSubnetIDException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidSubnetIDException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidSubnetIDExceptionDetails extends StObject {
    
    /**
      * _String shape
      */
    var Message: js.UndefOr[String] = js.undefined
    
    /**
      * _String shape
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  object InvalidSubnetIDExceptionDetails {
    
    @scala.inline
    def apply(): InvalidSubnetIDExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidSubnetIDExceptionDetails]
    }
    
    @scala.inline
    implicit class InvalidSubnetIDExceptionDetailsMutableBuilder[Self <: InvalidSubnetIDExceptionDetails] (val x: Self) extends AnyVal {
      
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
