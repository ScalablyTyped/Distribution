package typings.atAwsDashSdkClientDashDynamodbDashNode.typesLimitExceededExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesCreateBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesCreateGlobalTableExceptionsUnionMod.CreateGlobalTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesCreateTableExceptionsUnionMod.CreateTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDeleteBackupExceptionsUnionMod.DeleteBackupExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesDeleteTableExceptionsUnionMod.DeleteTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesRestoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesRestoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesTagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUntagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateGlobalTableSettingsExceptionsUnionMod.UpdateGlobalTableSettingsExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateTableExceptionsUnionMod.UpdateTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateTimeToLiveExceptionsUnionMod.UpdateTimeToLiveExceptionsUnion
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
  var name_LimitExceededException: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.LimitExceededException
}

object LimitExceededException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _LimitExceededExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.LimitExceededException,
    stack: String = null
  ): LimitExceededException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[LimitExceededException]
  }
}

