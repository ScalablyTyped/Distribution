package typings.awsSdkClientDynamodbBrowser

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object restoreTableToPointInTimeExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientDynamodbBrowser.typesTableAlreadyExistsExceptionMod.TableAlreadyExistsException
    - typings.awsSdkClientDynamodbBrowser.typesTableNotFoundExceptionMod.TableNotFoundException
    - typings.awsSdkClientDynamodbBrowser.typesTableInUseExceptionMod.TableInUseException
    - typings.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException
    - typings.awsSdkClientDynamodbBrowser.typesInvalidRestoreTimeExceptionMod.InvalidRestoreTimeException
    - typings.awsSdkClientDynamodbBrowser.typesPointInTimeRecoveryUnavailableExceptionMod.PointInTimeRecoveryUnavailableException
    - typings.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError
  */
  trait RestoreTableToPointInTimeExceptionsUnion extends StObject
  object RestoreTableToPointInTimeExceptionsUnion {
    
    @scala.inline
    def InternalServerError(): typings.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError = {
      val __obj = js.Dynamic.literal(name = "InternalServerError")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesInternalServerErrorMod.InternalServerError]
    }
    
    @scala.inline
    def InvalidRestoreTimeException(): typings.awsSdkClientDynamodbBrowser.typesInvalidRestoreTimeExceptionMod.InvalidRestoreTimeException = {
      val __obj = js.Dynamic.literal(name = "InvalidRestoreTimeException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesInvalidRestoreTimeExceptionMod.InvalidRestoreTimeException]
    }
    
    @scala.inline
    def LimitExceededException(): typings.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = "LimitExceededException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    @scala.inline
    def PointInTimeRecoveryUnavailableException(): typings.awsSdkClientDynamodbBrowser.typesPointInTimeRecoveryUnavailableExceptionMod.PointInTimeRecoveryUnavailableException = {
      val __obj = js.Dynamic.literal(name = "PointInTimeRecoveryUnavailableException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesPointInTimeRecoveryUnavailableExceptionMod.PointInTimeRecoveryUnavailableException]
    }
    
    @scala.inline
    def TableAlreadyExistsException(): typings.awsSdkClientDynamodbBrowser.typesTableAlreadyExistsExceptionMod.TableAlreadyExistsException = {
      val __obj = js.Dynamic.literal(name = "TableAlreadyExistsException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbBrowser.typesTableAlreadyExistsExceptionMod.TableAlreadyExistsException]
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
