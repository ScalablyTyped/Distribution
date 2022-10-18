package typings.awsSdkClientDynamodbNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRestoreTableToPointInTimeExceptionsUnionMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.awsSdkClientDynamodbNode.typesTableAlreadyExistsExceptionMod.TableAlreadyExistsException
    - typings.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod.TableNotFoundException
    - typings.awsSdkClientDynamodbNode.typesTableInUseExceptionMod.TableInUseException
    - typings.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException
    - typings.awsSdkClientDynamodbNode.typesInvalidRestoreTimeExceptionMod.InvalidRestoreTimeException
    - typings.awsSdkClientDynamodbNode.typesPointInTimeRecoveryUnavailableExceptionMod.PointInTimeRecoveryUnavailableException
    - typings.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError
  */
  trait RestoreTableToPointInTimeExceptionsUnion extends StObject
  object RestoreTableToPointInTimeExceptionsUnion {
    
    inline def InternalServerError(): typings.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError = {
      val __obj = js.Dynamic.literal(name = "InternalServerError")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesInternalServerErrorMod.InternalServerError]
    }
    
    inline def InvalidRestoreTimeException(): typings.awsSdkClientDynamodbNode.typesInvalidRestoreTimeExceptionMod.InvalidRestoreTimeException = {
      val __obj = js.Dynamic.literal(name = "InvalidRestoreTimeException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesInvalidRestoreTimeExceptionMod.InvalidRestoreTimeException]
    }
    
    inline def LimitExceededException(): typings.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException = {
      val __obj = js.Dynamic.literal(name = "LimitExceededException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesLimitExceededExceptionMod.LimitExceededException]
    }
    
    inline def PointInTimeRecoveryUnavailableException(): typings.awsSdkClientDynamodbNode.typesPointInTimeRecoveryUnavailableExceptionMod.PointInTimeRecoveryUnavailableException = {
      val __obj = js.Dynamic.literal(name = "PointInTimeRecoveryUnavailableException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesPointInTimeRecoveryUnavailableExceptionMod.PointInTimeRecoveryUnavailableException]
    }
    
    inline def TableAlreadyExistsException(): typings.awsSdkClientDynamodbNode.typesTableAlreadyExistsExceptionMod.TableAlreadyExistsException = {
      val __obj = js.Dynamic.literal(name = "TableAlreadyExistsException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesTableAlreadyExistsExceptionMod.TableAlreadyExistsException]
    }
    
    inline def TableInUseException(): typings.awsSdkClientDynamodbNode.typesTableInUseExceptionMod.TableInUseException = {
      val __obj = js.Dynamic.literal(name = "TableInUseException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesTableInUseExceptionMod.TableInUseException]
    }
    
    inline def TableNotFoundException(): typings.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod.TableNotFoundException = {
      val __obj = js.Dynamic.literal(name = "TableNotFoundException")
      __obj.asInstanceOf[typings.awsSdkClientDynamodbNode.typesTableNotFoundExceptionMod.TableNotFoundException]
    }
  }
}
