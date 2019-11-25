package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesBackupNotFoundExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDeleteBackupExceptionsUnionMod.DeleteBackupExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeBackupExceptionsUnionMod.DescribeBackupExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesRestoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupNotFoundException
  extends ServiceException[_BackupNotFoundExceptionDetails]
     with DeleteBackupExceptionsUnion
     with DescribeBackupExceptionsUnion
     with RestoreTableFromBackupExceptionsUnion {
  @JSName("name")
  var name_BackupNotFoundException: typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.BackupNotFoundException
}

object BackupNotFoundException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _BackupNotFoundExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.BackupNotFoundException,
    stack: String = null
  ): BackupNotFoundException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupNotFoundException]
  }
}

