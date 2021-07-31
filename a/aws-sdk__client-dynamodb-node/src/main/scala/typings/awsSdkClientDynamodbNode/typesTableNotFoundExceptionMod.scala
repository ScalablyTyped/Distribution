package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.createBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typings.awsSdkClientDynamodbNode.createGlobalTableExceptionsUnionMod.CreateGlobalTableExceptionsUnion
import typings.awsSdkClientDynamodbNode.describeContinuousBackupsExceptionsUnionMod.DescribeContinuousBackupsExceptionsUnion
import typings.awsSdkClientDynamodbNode.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typings.awsSdkClientDynamodbNode.updateContinuousBackupsExceptionsUnionMod.UpdateContinuousBackupsExceptionsUnion
import typings.awsSdkClientDynamodbNode.updateGlobalTableExceptionsUnionMod.UpdateGlobalTableExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTableNotFoundExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_TableNotFoundExceptionDetails> * / any */ trait TableNotFoundException
    extends StObject
       with CreateBackupExceptionsUnion
       with CreateGlobalTableExceptionsUnion
       with DescribeContinuousBackupsExceptionsUnion
       with RestoreTableToPointInTimeExceptionsUnion
       with UpdateContinuousBackupsExceptionsUnion
       with UpdateGlobalTableExceptionsUnion {
    
    var name: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.TableNotFoundException
  }
  object TableNotFoundException {
    
    @scala.inline
    def apply(): TableNotFoundException = {
      val __obj = js.Dynamic.literal(name = "TableNotFoundException")
      __obj.asInstanceOf[TableNotFoundException]
    }
    
    @scala.inline
    implicit class TableNotFoundExceptionMutableBuilder[Self <: TableNotFoundException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.TableNotFoundException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableNotFoundExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object TableNotFoundExceptionDetails {
    
    @scala.inline
    def apply(): TableNotFoundExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableNotFoundExceptionDetails]
    }
    
    @scala.inline
    implicit class TableNotFoundExceptionDetailsMutableBuilder[Self <: TableNotFoundExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
