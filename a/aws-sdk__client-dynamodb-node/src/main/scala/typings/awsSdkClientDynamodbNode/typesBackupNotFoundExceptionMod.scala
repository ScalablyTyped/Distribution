package typings.awsSdkClientDynamodbNode

import typings.awsSdkClientDynamodbNode.deleteBackupExceptionsUnionMod.DeleteBackupExceptionsUnion
import typings.awsSdkClientDynamodbNode.describeBackupExceptionsUnionMod.DescribeBackupExceptionsUnion
import typings.awsSdkClientDynamodbNode.restoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesBackupNotFoundExceptionMod {
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify __ServiceException__<_BackupNotFoundExceptionDetails> * / any */ trait BackupNotFoundException
    extends StObject
       with DeleteBackupExceptionsUnion
       with DescribeBackupExceptionsUnion
       with RestoreTableFromBackupExceptionsUnion {
    
    var name: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.BackupNotFoundException
  }
  object BackupNotFoundException {
    
    @scala.inline
    def apply(): BackupNotFoundException = {
      val __obj = js.Dynamic.literal(name = "BackupNotFoundException")
      __obj.asInstanceOf[BackupNotFoundException]
    }
    
    @scala.inline
    implicit class BackupNotFoundExceptionMutableBuilder[Self <: BackupNotFoundException] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.BackupNotFoundException): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait BackupNotFoundExceptionDetails extends StObject {
    
    /**
      * _ErrorMessage shape
      */
    var message: js.UndefOr[String] = js.undefined
  }
  object BackupNotFoundExceptionDetails {
    
    @scala.inline
    def apply(): BackupNotFoundExceptionDetails = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BackupNotFoundExceptionDetails]
    }
    
    @scala.inline
    implicit class BackupNotFoundExceptionDetailsMutableBuilder[Self <: BackupNotFoundExceptionDetails] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
    }
  }
}
