package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.createBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typings.awsSdkClientDynamodbNode.restoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typings.awsSdkClientDynamodbNode.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
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
    
    @scala.inline
    def apply(): TableInUseException = {
      val __obj = js.Dynamic.literal(name = "TableInUseException")
      __obj.asInstanceOf[TableInUseException]
    }
    
    @scala.inline
    implicit class TableInUseExceptionMutableBuilder[Self <: TableInUseException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.TableInUseException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableInUseExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object TableInUseExceptionDetails {
    
    @scala.inline
    def apply(): TableInUseExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableInUseExceptionDetails]
    }
    
    @scala.inline
    implicit class TableInUseExceptionDetailsMutableBuilder[Self <: TableInUseExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
