package typings.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRestoreTableFromBackupExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientDynamodbNode.typesTableAlreadyExistsExceptionMod.TableAlreadyExistsException
    - typings.awsSdkClientDynamodbNode.typesTableInUseExceptionMod.TableInUseException
    - typings.awsSdkClientDynamodbNode.typesBackupNotFoundExceptionMod.BackupNotFoundException
    - typings.awsSdkClientDynamodbNode.typesBackupInUseExceptionMod.BackupInUseException
    - typings.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException
    - typings.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
  */
  trait RestoreTableFromBackupExceptionsUnion extends StObject
  object RestoreTableFromBackupExceptionsUnion {
    
    inline def BackupInUseException(): typings.awsSdkClientDynamodbNode.typesBackupInUseExceptionMod.BackupInUseException = {
      val __obj = js.Dynamic.literal(name = "BackupInUseException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesBackupInUseExceptionMod.BackupInUseException]
    }
    
    inline def BackupNotFoundException(): typings.awsSdkClientDynamodbNode.typesBackupNotFoundExceptionMod.BackupNotFoundException = {
      val __obj = js.Dynamic.literal(name = "BackupNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesBackupNotFoundExceptionMod.BackupNotFoundException]
    }
    
    inline def InternalServerError(): typings.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError = {
      val __obj = js.Dynamic.literal(name = "InternalServerError")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError]
    }
    
    inline def LimitExceededException(): typings.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = "LimitExceededException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    inline def TableAlreadyExistsException(): typings.awsSdkClientDynamodbNode.typesTableAlreadyExistsExceptionMod.TableAlreadyExistsException = {
      val __obj = js.Dynamic.literal(name = "TableAlreadyExistsException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesTableAlreadyExistsExceptionMod.TableAlreadyExistsException]
    }
    
    inline def TableInUseException(): typings.awsSdkClientDynamodbNode.typesTableInUseExceptionMod.TableInUseException = {
      val __obj = js.Dynamic.literal(name = "TableInUseException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesTableInUseExceptionMod.TableInUseException]
    }
  }
}
