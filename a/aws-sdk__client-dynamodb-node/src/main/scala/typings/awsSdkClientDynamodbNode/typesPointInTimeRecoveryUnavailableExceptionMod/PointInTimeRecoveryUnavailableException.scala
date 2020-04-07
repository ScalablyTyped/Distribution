package typings.awsSdkClientDynamodbNode.typesPointInTimeRecoveryUnavailableExceptionMod

import typings.awsSdkClientDynamodbNode.restoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointInTimeRecoveryUnavailableException
  extends ServiceException[PointInTimeRecoveryUnavailableExceptionDetails]
     with RestoreTableToPointInTimeExceptionsUnion {
  @JSName("name")
  var name_PointInTimeRecoveryUnavailableException: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.PointInTimeRecoveryUnavailableException
}

object PointInTimeRecoveryUnavailableException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: PointInTimeRecoveryUnavailableExceptionDetails,
    message: String,
    name: typings.awsSdkClientDynamodbNode.awsSdkClientDynamodbNodeStrings.PointInTimeRecoveryUnavailableException,
    stack: String = null
  ): PointInTimeRecoveryUnavailableException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointInTimeRecoveryUnavailableException]
  }
}

