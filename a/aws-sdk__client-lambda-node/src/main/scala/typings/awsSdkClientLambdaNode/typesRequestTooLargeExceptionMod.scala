package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRequestTooLargeExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_RequestTooLargeExceptionDetails> * / any */ trait RequestTooLargeException
    extends StObject
       with InvokeExceptionsUnion {
    
    var name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.RequestTooLargeException
  }
  object RequestTooLargeException {
    
    inline def apply(): RequestTooLargeException = {
      val __obj = js.Dynamic.literal(name = "RequestTooLargeException")
      __obj.asInstanceOf[RequestTooLargeException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestTooLargeException] (val x: Self) extends AnyVal {
      
      inline def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.RequestTooLargeException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait RequestTooLargeExceptionDetails extends StObject {
    
    /**
      * _String shape
      */
    var Type: js.UndefOr[String] = js.undefined
    
    /**
      * _String shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object RequestTooLargeExceptionDetails {
    
    inline def apply(): RequestTooLargeExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestTooLargeExceptionDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestTooLargeExceptionDetails] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
}
