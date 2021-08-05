package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesInvalidRestoreTimeExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_InvalidRestoreTimeExceptionDetails> * / any */ trait InvalidRestoreTimeException
    extends StObject
       with RestoreTableToPointInTimeExceptionsUnion {
    
    var name: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.InvalidRestoreTimeException
  }
  object InvalidRestoreTimeException {
    
    inline def apply(): InvalidRestoreTimeException = {
      val __obj = js.Dynamic.literal(name = "InvalidRestoreTimeException")
      __obj.asInstanceOf[InvalidRestoreTimeException]
    }
    
    extension [Self <: InvalidRestoreTimeException](x: Self) {
      
      inline def setName(
        value: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.InvalidRestoreTimeException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait InvalidRestoreTimeExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object InvalidRestoreTimeExceptionDetails {
    
    inline def apply(): InvalidRestoreTimeExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvalidRestoreTimeExceptionDetails]
    }
    
    extension [Self <: InvalidRestoreTimeExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
