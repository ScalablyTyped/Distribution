package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.createBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typings.awsSdkClientDynamodbNode.deleteBackupExceptionsUnionMod.DeleteBackupExceptionsUnion
import typings.awsSdkClientDynamodbNode.restoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBackupInUseExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_BackupInUseExceptionDetails> * / any */ trait BackupInUseException
    extends StObject
       with CreateBackupExceptionsUnion
       with DeleteBackupExceptionsUnion
       with RestoreTableFromBackupExceptionsUnion {
    
    var name: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.BackupInUseException
  }
  object BackupInUseException {
    
    @scala.inline
    def apply(): BackupInUseException = {
      val __obj = js.Dynamic.literal(name = "BackupInUseException")
      __obj.asInstanceOf[BackupInUseException]
    }
    
    @scala.inline
    implicit class BackupInUseExceptionMutableBuilder[Self <: BackupInUseException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.BackupInUseException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait BackupInUseExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object BackupInUseExceptionDetails {
    
    @scala.inline
    def apply(): BackupInUseExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackupInUseExceptionDetails]
    }
    
    @scala.inline
    implicit class BackupInUseExceptionDetailsMutableBuilder[Self <: BackupInUseExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
