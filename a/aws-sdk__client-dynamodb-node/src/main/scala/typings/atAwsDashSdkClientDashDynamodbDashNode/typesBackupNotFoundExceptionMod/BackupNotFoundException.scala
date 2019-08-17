package typings.atAwsDashSdkClientDashDynamodbDashNode.typesBackupNotFoundExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDeleteBackupExceptionsUnionMod.DeleteBackupExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDescribeBackupExceptionsUnionMod.DescribeBackupExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesRestoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupNotFoundException
  extends ServiceException[_BackupNotFoundExceptionDetails]
     with DeleteBackupExceptionsUnion
     with DescribeBackupExceptionsUnion
     with RestoreTableFromBackupExceptionsUnion {
  @JSName("name")
  var name_BackupNotFoundException: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.BackupNotFoundException
}

object BackupNotFoundException {
  @scala.inline
  def apply(
    details: _BackupNotFoundExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.BackupNotFoundException,
    stack: String = null
  ): BackupNotFoundException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[BackupNotFoundException]
  }
}

