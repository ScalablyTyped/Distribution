package typings.awsSdkClientSqsNode.typesTooManyEntriesInBatchRequestMod

import typings.awsSdkClientSqsNode.changeMessageVisibilityBatchExceptionsUnionMod.ChangeMessageVisibilityBatchExceptionsUnion
import typings.awsSdkClientSqsNode.deleteMessageBatchExceptionsUnionMod.DeleteMessageBatchExceptionsUnion
import typings.awsSdkClientSqsNode.sendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooManyEntriesInBatchRequest
  extends ServiceException[TooManyEntriesInBatchRequestDetails]
     with ChangeMessageVisibilityBatchExceptionsUnion
     with DeleteMessageBatchExceptionsUnion
     with SendMessageBatchExceptionsUnion {
  @JSName("name")
  var name_TooManyEntriesInBatchRequest: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.TooManyEntriesInBatchRequest
}

object TooManyEntriesInBatchRequest {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: TooManyEntriesInBatchRequestDetails,
    message: String,
    name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.TooManyEntriesInBatchRequest,
    stack: String = null
  ): TooManyEntriesInBatchRequest = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TooManyEntriesInBatchRequest]
  }
}

