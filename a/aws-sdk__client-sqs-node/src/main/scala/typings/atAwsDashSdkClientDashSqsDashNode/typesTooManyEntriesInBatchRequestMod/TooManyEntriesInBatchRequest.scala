package typings.atAwsDashSdkClientDashSqsDashNode.typesTooManyEntriesInBatchRequestMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesChangeMessageVisibilityBatchExceptionsUnionMod.ChangeMessageVisibilityBatchExceptionsUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesDeleteMessageBatchExceptionsUnionMod.DeleteMessageBatchExceptionsUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesSendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
    $metadata: ResponseMetadata,
    details: _TooManyEntriesInBatchRequestDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.TooManyEntriesInBatchRequest,
    stack: String = null
  ): TooManyEntriesInBatchRequest = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooManyEntriesInBatchRequest]
  }
}

