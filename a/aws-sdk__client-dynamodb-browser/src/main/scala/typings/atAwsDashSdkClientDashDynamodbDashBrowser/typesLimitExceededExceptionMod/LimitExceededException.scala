package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesLimitExceededExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesCreateBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesCreateGlobalTableExceptionsUnionMod.CreateGlobalTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesCreateTableExceptionsUnionMod.CreateTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDeleteBackupExceptionsUnionMod.DeleteBackupExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDeleteTableExceptionsUnionMod.DeleteTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesRestoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesRestoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesTagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUntagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUpdateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUpdateTableExceptionsUnionMod.UpdateTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUpdateTimeToLiveExceptionsUnionMod.UpdateTimeToLiveExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LimitExceededException
  extends ServiceException[_LimitExceededExceptionDetails]
     with CreateBackupExceptionsUnion
     with CreateGlobalTableExceptionsUnion
     with CreateTableExceptionsUnion
     with DeleteBackupExceptionsUnion
     with DeleteTableExceptionsUnion
     with RestoreTableFromBackupExceptionsUnion
     with RestoreTableToPointInTimeExceptionsUnion
     with TagResourceExceptionsUnion
     with UntagResourceExceptionsUnion
     with UpdateGlobalTableSettingsExceptionsUnion
     with UpdateTableExceptionsUnion
     with UpdateTimeToLiveExceptionsUnion {
  @JSName("name")
  var name_LimitExceededException: typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.LimitExceededException
}

object LimitExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _LimitExceededExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.LimitExceededException,
    stack: String = null
  ): LimitExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitExceededException]
  }
}

