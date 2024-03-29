package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.typesInvokeAsyncExceptionsUnionMod.InvokeAsyncExceptionsUnion
import typings.awsSdkClientLambdaNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidRuntimeExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidRuntimeExceptionDetails> * / any */ trait InvalidRuntimeException
    extends StObject
       with InvokeAsyncExceptionsUnion
       with InvokeExceptionsUnion {
    
    var name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidRuntimeException
  }
  object InvalidRuntimeException {
    
    inline def apply(): InvalidRuntimeException = {
      val __obj = js.Dynamic.literal(name = "InvalidRuntimeException")
      __obj.asInstanceOf[InvalidRuntimeException]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvalidRuntimeException] (val x: Self) extends AnyVal {
      
      inline def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidRuntimeException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidRuntimeExceptionDetails extends StObject {
    
    /**
      * _String shape
      */
    var Message: js.UndefOr[String] = js.undefined
    
    /**
      * _String shape
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  object InvalidRuntimeExceptionDetails {
    
    inline def apply(): InvalidRuntimeExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidRuntimeExceptionDetails]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InvalidRuntimeExceptionDetails] (val x: Self) extends AnyVal {
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
}
