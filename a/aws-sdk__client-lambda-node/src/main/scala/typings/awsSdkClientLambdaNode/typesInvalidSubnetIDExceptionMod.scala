package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
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
    
    inline def apply(): InvalidSubnetIDException = {
      val __obj = js.Dynamic.literal(name = "InvalidSubnetIDException")
      __obj.asInstanceOf[InvalidSubnetIDException]
    }
    
    extension [Self <: InvalidSubnetIDException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.InvalidSubnetIDException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
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
    
    inline def apply(): InvalidSubnetIDExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidSubnetIDExceptionDetails]
    }
    
    extension [Self <: InvalidSubnetIDExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
}
