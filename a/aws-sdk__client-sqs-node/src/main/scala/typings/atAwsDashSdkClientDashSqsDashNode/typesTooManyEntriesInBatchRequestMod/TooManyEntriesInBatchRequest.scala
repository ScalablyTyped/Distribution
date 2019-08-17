package typings.atAwsDashSdkClientDashSqsDashNode.typesTooManyEntriesInBatchRequestMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesChangeMessageVisibilityBatchExceptionsUnionMod.ChangeMessageVisibilityBatchExceptionsUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesDeleteMessageBatchExceptionsUnionMod.DeleteMessageBatchExceptionsUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesSendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooManyEntriesInBatchRequest
  extends ServiceException[_TooManyEntriesInBatchRequestDetails]
     with ChangeMessageVisibilityBatchExceptionsUnion
     with DeleteMessageBatchExceptionsUnion
     with SendMessageBatchExceptionsUnion {
  @JSName("name")
  var name_TooManyEntriesInBatchRequest: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.TooManyEntriesInBatchRequest
}

object TooManyEntriesInBatchRequest {
  @scala.inline
  def apply(
    details: _TooManyEntriesInBatchRequestDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.TooManyEntriesInBatchRequest,
    stack: String = null
  ): TooManyEntriesInBatchRequest = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[TooManyEntriesInBatchRequest]
  }
}

