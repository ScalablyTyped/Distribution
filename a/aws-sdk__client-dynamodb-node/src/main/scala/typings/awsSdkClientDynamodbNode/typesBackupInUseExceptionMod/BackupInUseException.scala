package typings.awsSdkClientDynamodbNode.typesBackupInUseExceptionMod

import typings.awsSdkClientDynamodbNode.createBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typings.awsSdkClientDynamodbNode.deleteBackupExceptionsUnionMod.DeleteBackupExceptionsUnion
import typings.awsSdkClientDynamodbNode.restoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupInUseException
  extends ServiceException[BackupInUseExceptionDetails]
     with CreateBackupExceptionsUnion
     with DeleteBackupExceptionsUnion
     with RestoreTableFromBackupExceptionsUnion {
  @JSName("name")
  var name_BackupInUseException: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.BackupInUseException
}

object BackupInUseException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: BackupInUseExceptionDetails,
    message: String,
    name: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.BackupInUseException,
    stack: String = null
  ): BackupInUseException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupInUseException]
  }
}

