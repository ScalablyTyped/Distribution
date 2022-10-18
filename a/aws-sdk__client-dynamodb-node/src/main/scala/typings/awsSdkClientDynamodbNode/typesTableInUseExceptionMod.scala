package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.typesCreateBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typings.awsSdkClientDynamodbNode.typesRestoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typings.awsSdkClientDynamodbNode.typesRestoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTableInUseExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_TableInUseExceptionDetails> * / any */ trait TableInUseException
    extends StObject
       with CreateBackupExceptionsUnion
       with RestoreTableFromBackupExceptionsUnion
       with RestoreTableToPointInTimeExceptionsUnion {
    
    var name: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.TableInUseException
  }
  object TableInUseException {
    
    inline def apply(): TableInUseException = {
      val __obj = js.Dynamic.literal(name = "TableInUseException")
      __obj.asInstanceOf[TableInUseException]
    }
    
    extension [Self <: TableInUseException](x: Self) {
      
      inline def setName(value: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.TableInUseException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableInUseExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object TableInUseExceptionDetails {
    
    inline def apply(): TableInUseExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableInUseExceptionDetails]
    }
    
    extension [Self <: TableInUseExceptionDetails](x: Self) {
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
