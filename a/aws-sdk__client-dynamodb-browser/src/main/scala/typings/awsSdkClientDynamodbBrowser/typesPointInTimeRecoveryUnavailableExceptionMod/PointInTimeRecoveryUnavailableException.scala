package typings.awsSdkClientDynamodbBrowser.typesPointInTimeRecoveryUnavailableExceptionMod

import typings.awsSdkClientDynamodbBrowser.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointInTimeRecoveryUnavailableException
  extends ServiceException[PointInTimeRecoveryUnavailableExceptionDetails]
     with RestoreTableToPointInTimeExceptionsUnion {
  @JSName("name")
  var name_PointInTimeRecoveryUnavailableException: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.PointInTimeRecoveryUnavailableException
}

object PointInTimeRecoveryUnavailableException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: PointInTimeRecoveryUnavailableExceptionDetails,
    message: String,
    name: typings.awsSdkClientDynamodbBrowser.awsSdkClientDynamodbBrowserStrings.PointInTimeRecoveryUnavailableException,
    stack: String = null
  ): PointInTimeRecoveryUnavailableException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointInTimeRecoveryUnavailableException]
  }
}

