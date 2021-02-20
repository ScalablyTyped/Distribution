package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRequestTooLargeExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_RequestTooLargeExceptionDetails> * / any */ @js.native
  trait RequestTooLargeException extends InvokeExceptionsUnion {
    
    var name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.RequestTooLargeException = js.native
  }
  object RequestTooLargeException {
    
    @scala.inline
    def apply(name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.RequestTooLargeException): RequestTooLargeException = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RequestTooLargeException]
    }
    
    @scala.inline
    implicit class RequestTooLargeExceptionMutableBuilder[Self <: RequestTooLargeException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.RequestTooLargeException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RequestTooLargeExceptionDetails extends StObject {
    
    /**
      * _String shape
      */
    var Type: js.UndefOr[String] = js.native
    
    /**
      * _String shape
      */
    var message: js.UndefOr[String] = js.native
  }
  object RequestTooLargeExceptionDetails {
    
    @scala.inline
    def apply(): RequestTooLargeExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestTooLargeExceptionDetails]
    }
    
    @scala.inline
    implicit class RequestTooLargeExceptionDetailsMutableBuilder[Self <: RequestTooLargeExceptionDetails] (val x: Self) extends AnyVal {
      
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
