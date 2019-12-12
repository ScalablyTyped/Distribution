package typings.atAwsDashSdkClientDashDynamodbDashNode.typesInvalidRestoreTimeExceptionMod

import typings.atAwsDashSdkClientDashDynamodbDashNode.typesRestoreTableToPointInTimeExceptionsUnionMod.RestoreTableToPointInTimeExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InvalidRestoreTimeException
  extends ServiceException[_InvalidRestoreTimeExceptionDetails]
     with RestoreTableToPointInTimeExceptionsUnion {
  @JSName("name")
  var name_InvalidRestoreTimeException: typings.atAwsDashSdkClientDashDynamodbDashNode.atAwsDashSdkClientDashDynamodbDashNodeStrings.InvalidRestoreTimeException = js.native
}

