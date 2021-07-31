package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEc2unexpectedexceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_EC2UnexpectedExceptionDetails> * / any */ trait EC2UnexpectedException
    extends StObject
       with InvokeExceptionsUnion {
    
    var name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2UnexpectedException
  }
  object EC2UnexpectedException {
    
    @scala.inline
    def apply(): EC2UnexpectedException = {
      val __obj = js.Dynamic.literal(name = "EC2UnexpectedException")
      __obj.asInstanceOf[EC2UnexpectedException]
    }
    
    @scala.inline
    implicit class EC2UnexpectedExceptionMutableBuilder[Self <: EC2UnexpectedException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2UnexpectedException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait EC2UnexpectedExceptionDetails extends StObject {
    
    /**
      * _String shape
      */
    var EC2ErrorCode: js.UndefOr[String] = js.undefined
    
    /**
      * _String shape
      */
    var Message: js.UndefOr[String] = js.undefined
    
    /**
      * _String shape
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  object EC2UnexpectedExceptionDetails {
    
    @scala.inline
    def apply(): EC2UnexpectedExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EC2UnexpectedExceptionDetails]
    }
    
    @scala.inline
    implicit class EC2UnexpectedExceptionDetailsMutableBuilder[Self <: EC2UnexpectedExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEC2ErrorCode(value: String): Self = StObject.set(x, "EC2ErrorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEC2ErrorCodeUndefined: Self = StObject.set(x, "EC2ErrorCode", js.undefined)
      
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
