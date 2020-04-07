package typings.awsSdkClientSqsNode.typesEmptyBatchRequestMod

import typings.awsSdkClientSqsNode.changeMessageVisibilityBatchExceptionsUnionMod.ChangeMessageVisibilityBatchExceptionsUnion
import typings.awsSdkClientSqsNode.deleteMessageBatchExceptionsUnionMod.DeleteMessageBatchExceptionsUnion
import typings.awsSdkClientSqsNode.sendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmptyBatchRequest
  extends ServiceException[EmptyBatchRequestDetails]
     with ChangeMessageVisibilityBatchExceptionsUnion
     with DeleteMessageBatchExceptionsUnion
     with SendMessageBatchExceptionsUnion {
  @JSName("name")
  var name_EmptyBatchRequest: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.EmptyBatchRequest
}

object EmptyBatchRequest {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: EmptyBatchRequestDetails,
    message: String,
    name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.EmptyBatchRequest,
    stack: String = null
  ): EmptyBatchRequest = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyBatchRequest]
  }
}

