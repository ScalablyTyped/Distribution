package typings.atAwsDashSdkClientDashSqsDashNode.typesBatchRequestTooLongMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesSendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchRequestTooLong
  extends ServiceException[_BatchRequestTooLongDetails]
     with SendMessageBatchExceptionsUnion {
  @JSName("name")
  var name_BatchRequestTooLong: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.BatchRequestTooLong = js.native
}

