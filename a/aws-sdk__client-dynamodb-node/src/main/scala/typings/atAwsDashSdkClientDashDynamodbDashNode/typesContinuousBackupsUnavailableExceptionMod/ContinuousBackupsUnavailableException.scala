package typings.atAwsDashSdkClientDashDynamodbDashNode.typesContinuousBackupsUnavailableExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesCreateBackupExceptionsUnionMod.CreateBackupExceptionsUnion
import typings.atAwsDashSdkClientDashDynamodbDashNode.typesUpdateContinuousBackupsExceptionsUnionMod.UpdateContinuousBackupsExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContinuousBackupsUnavailableException
  extends ServiceException[_ContinuousBackupsUnavailableExceptionDetails]
     with CreateBackupExceptionsUnion
     with UpdateContinuousBackupsExceptionsUnion {
  @JSName("name")
  var name_ContinuousBackupsUnavailableException: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.ContinuousBackupsUnavailableException
}

object ContinuousBackupsUnavailableException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _ContinuousBackupsUnavailableExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.ContinuousBackupsUnavailableException,
    stack: String = null
  ): ContinuousBackupsUnavailableException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContinuousBackupsUnavailableException]
  }
}

