package typings.atAwsDashSdkClientDashDynamodbDashNode.typesPointInTimeRecoveryUnavailableExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesRestoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointInTimeRecoveryUnavailableException
  extends ServiceException[_PointInTimeRecoveryUnavailableExceptionDetails]
     with RestoreTableToPointInTimeExceptionsUnion {
  @JSName("name")
  var name_PointInTimeRecoveryUnavailableException: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.PointInTimeRecoveryUnavailableException
}

object PointInTimeRecoveryUnavailableException {
  @scala.inline
  def apply(
    details: _PointInTimeRecoveryUnavailableExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.PointInTimeRecoveryUnavailableException,
    stack: String = null
  ): PointInTimeRecoveryUnavailableException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[PointInTimeRecoveryUnavailableException]
  }
}

