package typings.atAwsDashSdkClientDashDynamodbDashNode.typesTableInUseExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesCreateBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesRestoreTableFromBackupExceptionsUnionMod.RestoreTableFromBackupExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesRestoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableInUseException
  extends ServiceException[_TableInUseExceptionDetails]
     with CreateBackupExceptionsUnion
     with RestoreTableFromBackupExceptionsUnion
     with RestoreTableToPointInTimeExceptionsUnion {
  @JSName("name")
  var name_TableInUseException: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.TableInUseException
}

object TableInUseException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _TableInUseExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.TableInUseException,
    stack: String = null
  ): TableInUseException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableInUseException]
  }
}

