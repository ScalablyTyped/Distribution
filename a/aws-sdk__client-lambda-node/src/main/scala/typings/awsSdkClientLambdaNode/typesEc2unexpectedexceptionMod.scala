package typings.awsSdkClientLambdaNode

import typings.awsSdkClientLambdaNode.typesInvokeExceptionsUnionMod.InvokeExceptionsUnion
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
    
    inline def apply(): EC2UnexpectedException = {
      val __obj = js.Dynamic.literal(name = "EC2UnexpectedException")
      __obj.asInstanceOf[EC2UnexpectedException]
    }
    
    extension [Self <: EC2UnexpectedException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.EC2UnexpectedException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
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
    
    inline def apply(): EC2UnexpectedExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EC2UnexpectedExceptionDetails]
    }
    
    extension [Self <: EC2UnexpectedExceptionDetails](x: Self) {
      
      inline def setEC2ErrorCode(value: String): Self = StObject.set(x, "EC2ErrorCode", value.asInstanceOf[js.Any])
      
      inline def setEC2ErrorCodeUndefined: Self = StObject.set(x, "EC2ErrorCode", js.undefined)
      
      inline def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "Message", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    }
  }
}
