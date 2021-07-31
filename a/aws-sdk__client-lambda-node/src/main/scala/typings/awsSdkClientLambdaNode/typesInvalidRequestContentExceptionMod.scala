package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.invokeAsyncExceptionsUnionMod.InvokeAsyncExceptionsUnion
import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidRequestContentExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidRequestContentExceptionDetails> * / any */ trait InvalidRequestContentException
    extends StObject
       with InvokeAsyncExceptionsUnion
       with InvokeExceptionsUnion {
    
    var name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidRequestContentException
  }
  object InvalidRequestContentException {
    
    @scala.inline
    def apply(): InvalidRequestContentException = {
      val __obj = js.Dynamic.literal(name = "InvalidRequestContentException")
      __obj.asInstanceOf[InvalidRequestContentException]
    }
    
    @scala.inline
    implicit class InvalidRequestContentExceptionMutableBuilder[Self <: InvalidRequestContentException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidRequestContentException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidRequestContentExceptionDetails extends StObject {
    
    /**
      * <p>The exception type.</p>
      */
    var Type: js.UndefOr[String] = js.undefined
    
    /**
      * <p>The exception message.</p>
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object InvalidRequestContentExceptionDetails {
    
    @scala.inline
    def apply(): InvalidRequestContentExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidRequestContentExceptionDetails]
    }
    
    @scala.inline
    implicit class InvalidRequestContentExceptionDetailsMutableBuilder[Self <: InvalidRequestContentExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
}
