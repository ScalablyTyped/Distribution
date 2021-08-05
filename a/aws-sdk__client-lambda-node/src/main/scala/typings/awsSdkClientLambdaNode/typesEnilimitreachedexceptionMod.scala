package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.invokeExceptionsUnionMod.InvokeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesEnilimitreachedexceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_ENILimitReachedExceptionDetails> * / any */ trait ENILimitReachedException
    extends StObject
       with InvokeExceptionsUnion {
    
    var name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ENILimitReachedException
  }
  object ENILimitReachedException {
    
    inline def apply(): ENILimitReachedException = {
      val __obj = js.Dynamic.literal(name = "ENILimitReachedException")
      __obj.asInstanceOf[ENILimitReachedException]
    }
    
    extension [Self <: ENILimitReachedException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ENILimitReachedException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait ENILimitReachedExceptionDetails extends StObject {
    
    /**
      * _String shape
      */
    var Message: js.UndefOr[String] = js.undefined
    
    /**
      * _String shape
      */
    var Type: js.UndefOr[String] = js.undefined
  }
  object ENILimitReachedExceptionDetails {
    
    inline def apply(): ENILimitReachedExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ENILimitReachedExceptionDetails]
    }
    
    extension [Self <: ENILimitReachedExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
}
