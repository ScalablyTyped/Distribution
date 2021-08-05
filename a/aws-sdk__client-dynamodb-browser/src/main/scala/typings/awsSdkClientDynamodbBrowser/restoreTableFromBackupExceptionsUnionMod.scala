package typings.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restoreTableFromBackupExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientDynamodbBrowser.typesTableAlreadyExistsExceptionMod.TableAlreadyExistsException
    - typings.awsSdkClientDynamodbBrowser.typesTableInUseExceptionMod.TableInUseException
    - typings.awsSdkClientDynamodbBrowser.typesBackupNotFoundExceptionMod.BackupNotFoundException
    - typings.awsSdkClientDynamodbBrowser.typesBackupInUseExceptionMod.BackupInUseException
    - typings.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException
    - typings.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
  */
  trait RestoreTableFromBackupExceptionsUnion extends StObject
  object RestoreTableFromBackupExceptionsUnion {
    
    inline def BackupInUseException(): typings.awsSdkClientDynamodbBrowser.typesBackupInUseExceptionMod.BackupInUseException = {
      val __obj = js.Dynamic.literal(name = "BackupInUseException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesBackupInUseExceptionMod.BackupInUseException]
    }
    
    inline def BackupNotFoundException(): typings.awsSdkClientDynamodbBrowser.typesBackupNotFoundExceptionMod.BackupNotFoundException = {
      val __obj = js.Dynamic.literal(name = "BackupNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesBackupNotFoundExceptionMod.BackupNotFoundException]
    }
    
    inline def InternalServerError(): typings.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError = {
      val __obj = js.Dynamic.literal(name = "InternalServerError")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError]
    }
    
    inline def LimitExceededException(): typings.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = "LimitExceededException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    inline def TableAlreadyExistsException(): typings.awsSdkClientDynamodbBrowser.typesTableAlreadyExistsExceptionMod.TableAlreadyExistsException = {
      val __obj = js.Dynamic.literal(name = "TableAlreadyExistsException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesTableAlreadyExistsExceptionMod.TableAlreadyExistsException]
    }
    
    inline def TableInUseException(): typings.awsSdkClientDynamodbBrowser.typesTableInUseExceptionMod.TableInUseException = {
      val __obj = js.Dynamic.literal(name = "TableInUseException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesTableInUseExceptionMod.TableInUseException]
    }
  }
}
