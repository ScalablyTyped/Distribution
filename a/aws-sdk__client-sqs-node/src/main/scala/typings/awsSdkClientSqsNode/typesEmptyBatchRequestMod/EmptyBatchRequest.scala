package typings.awsSdkClientSqsNode.typesEmptyBatchRequestMod

import typings.awsSdkClientSqsNode.changeMessageVisibilityBatchExceptionsUnionMod.ChangeMessageVisibilityBatchExceptionsUnion
import typings.awsSdkClientSqsNode.deleteMessageBatchExceptionsUnionMod.DeleteMessageBatchExceptionsUnion
import typings.awsSdkClientSqsNode.sendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmptyBatchRequest
  extends ServiceException[EmptyBatchRequestDetails]
     with ChangeMessageVisibilityBatchExceptionsUnion
     with DeleteMessageBatchExceptionsUnion
     with SendMessageBatchExceptionsUnion {
  @JSName("name")
  var name_EmptyBatchRequest: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.EmptyBatchRequest = js.native
}

object EmptyBatchRequest {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: EmptyBatchRequestDetails,
    message: String,
    name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.EmptyBatchRequest
  ): EmptyBatchRequest = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmptyBatchRequest]
  }
  @scala.inline
  implicit class EmptyBatchRequestOps[Self <: EmptyBatchRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.EmptyBatchRequest): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

