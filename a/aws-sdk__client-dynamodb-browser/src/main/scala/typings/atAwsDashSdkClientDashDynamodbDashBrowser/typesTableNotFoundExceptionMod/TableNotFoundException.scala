package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesTableNotFoundExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesCreateBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesCreateGlobalTableExceptionsUnionMod.CreateGlobalTableExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesDescribeContinuousBackupsExceptionsUnionMod.DescribeContinuousBackupsExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesRestoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUpdateContinuousBackupsExceptionsUnionMod.UpdateContinuousBackupsExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesUpdateGlobalTableExceptionsUnionMod.UpdateGlobalTableExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableNotFoundException
  extends ServiceException[_TableNotFoundExceptionDetails]
     with CreateBackupExceptionsUnion
     with CreateGlobalTableExceptionsUnion
     with DescribeContinuousBackupsExceptionsUnion
     with RestoreTableToPointInTimeExceptionsUnion
     with UpdateContinuousBackupsExceptionsUnion
     with UpdateGlobalTableExceptionsUnion {
  @JSName("name")
  var name_TableNotFoundException: typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.TableNotFoundException
}

object TableNotFoundException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _TableNotFoundExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.TableNotFoundException,
    stack: String = null
  ): TableNotFoundException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableNotFoundException]
  }
}

