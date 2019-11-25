package typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesPointInTimeRecoveryUnavailableExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashBrowser.typesRestoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointInTimeRecoveryUnavailableException
  extends ServiceException[_PointInTimeRecoveryUnavailableExceptionDetails]
     with RestoreTableToPointInTimeExceptionsUnion {
  @JSName("name")
  var name_PointInTimeRecoveryUnavailableException: typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.PointInTimeRecoveryUnavailableException
}

object PointInTimeRecoveryUnavailableException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _PointInTimeRecoveryUnavailableExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashDynamodbDashBrowser.atAwsDashSdkClientDashDynamodbDashBrowserStrings.PointInTimeRecoveryUnavailableException,
    stack: String = null
  ): PointInTimeRecoveryUnavailableException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointInTimeRecoveryUnavailableException]
  }
}

