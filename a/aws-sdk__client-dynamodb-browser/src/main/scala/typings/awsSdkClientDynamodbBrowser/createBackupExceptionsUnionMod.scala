package typings.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createBackupExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientDynamodbBrowser.typesTableNotFoundExceptionMod.TableNotFoundException
    - typings.awsSdkClientDynamodbBrowser.typesTableInUseExceptionMod.TableInUseException
    - typings.awsSdkClientDynamodbBrowser.typesContinuousBackupsUnavailableExceptionMod.ContinuousBackupsUnavailableException
    - typings.awsSdkClientDynamodbBrowser.typesBackupInUseExceptionMod.BackupInUseException
    - typings.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException
    - typings.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
  */
  trait CreateBackupExceptionsUnion extends StObject
  object CreateBackupExceptionsUnion {
    
    @scala.inline
    def BackupInUseException(): typings.awsSdkClientDynamodbBrowser.typesBackupInUseExceptionMod.BackupInUseException = {
      val __obj = js.Dynamic.literal(name = "BackupInUseException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesBackupInUseExceptionMod.BackupInUseException]
    }
    
    @scala.inline
    def ContinuousBackupsUnavailableException(): typings.awsSdkClientDynamodbBrowser.typesContinuousBackupsUnavailableExceptionMod.ContinuousBackupsUnavailableException = {
      val __obj = js.Dynamic.literal(name = "ContinuousBackupsUnavailableException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesContinuousBackupsUnavailableExceptionMod.ContinuousBackupsUnavailableException]
    }
    
    @scala.inline
    def InternalServerError(): typings.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError = {
      val __obj = js.Dynamic.literal(name = "InternalServerError")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError]
    }
    
    @scala.inline
    def LimitExceededException(): typings.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = "LimitExceededException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    @scala.inline
    def TableInUseException(): typings.awsSdkClientDynamodbBrowser.typesTableInUseExceptionMod.TableInUseException = {
      val __obj = js.Dynamic.literal(name = "TableInUseException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesTableInUseExceptionMod.TableInUseException]
    }
    
    @scala.inline
    def TableNotFoundException(): typings.awsSdkClientDynamodbBrowser.typesTableNotFoundExceptionMod.TableNotFoundException = {
      val __obj = js.Dynamic.literal(name = "TableNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesTableNotFoundExceptionMod.TableNotFoundException]
    }
  }
}
