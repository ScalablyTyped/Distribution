package typings.awsSdkClientDynamodbBrowser.typesBackupNotFoundExceptionMod

import typings.awsSdkClientDynamodbBrowser.deleteBackupExceptionsUnionMod.DeleteBackupExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.describeBackupExceptionsUnionMod.DescribeBackupExceptionsUnion
import typings.awsSdkClientDynamodbBrowser.restoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackupNotFoundException
  extends ServiceException[BackupNotFoundExceptionDetails]
     with DeleteBackupExceptionsUnion
     with DescribeBackupExceptionsUnion
     with RestoreTableFromBackupExceptionsUnion {
  @JSName("name")
  var name_BackupNotFoundException: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.BackupNotFoundException
}

object BackupNotFoundException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: BackupNotFoundExceptionDetails,
    message: String,
    name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.BackupNotFoundException,
    stack: String = null
  ): BackupNotFoundException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackupNotFoundException]
  }
}

