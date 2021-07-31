package typings.awsSdkClientDynamodbBrowser

import typings.awsSdkClientDynamodbBrowser.restoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTableAlreadyExistsExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_TableAlreadyExistsExceptionDetails> * / any */ trait TableAlreadyExistsException
    extends StObject
       with RestoreTableFromBackupExceptionsUnion
       with RestoreTableToPointInTimeExceptionsUnion {
    
    var name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.TableAlreadyExistsException
  }
  object TableAlreadyExistsException {
    
    @scala.inline
    def apply(): TableAlreadyExistsException = {
      val __obj = js.Dynamic.literal(name = "TableAlreadyExistsException")
      __obj.asInstanceOf[TableAlreadyExistsException]
    }
    
    @scala.inline
    implicit class TableAlreadyExistsExceptionMutableBuilder[Self <: TableAlreadyExistsException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(
        value: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.TableAlreadyExistsException
      ): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait TableAlreadyExistsExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object TableAlreadyExistsExceptionDetails {
    
    @scala.inline
    def apply(): TableAlreadyExistsExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableAlreadyExistsExceptionDetails]
    }
    
    @scala.inline
    implicit class TableAlreadyExistsExceptionDetailsMutableBuilder[Self <: TableAlreadyExistsExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
