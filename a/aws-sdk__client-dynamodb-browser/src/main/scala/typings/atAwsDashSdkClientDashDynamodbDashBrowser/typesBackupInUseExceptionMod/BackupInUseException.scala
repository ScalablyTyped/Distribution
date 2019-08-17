package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesBackupInUseExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesCreateBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDeleteBackupExceptionsUnionMod.DeleteBackupExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesRestoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupInUseException
  extends ServiceException[_BackupInUseExceptionDetails]
     with CreateBackupExceptionsUnion
     with DeleteBackupExceptionsUnion
     with RestoreTableFromBackupExceptionsUnion {
  @JSName("name")
  var name_BackupInUseException: typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.BackupInUseException
}

object BackupInUseException {
  @scala.inline
  def apply(
    details: _BackupInUseExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.BackupInUseException,
    stack: String = null
  ): BackupInUseException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[BackupInUseException]
  }
}

