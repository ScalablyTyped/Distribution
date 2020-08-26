package typings.awsSdkClientSqsNode.typesBatchRequestTooLongMod

import typings.awsSdkClientSqsNode.sendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchRequestTooLong
  extends ServiceException[BatchRequestTooLongDetails]
     with SendMessageBatchExceptionsUnion {
  @JSName("name")
  var name_BatchRequestTooLong: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.BatchRequestTooLong = js.native
}

object BatchRequestTooLong {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: BatchRequestTooLongDetails,
    message: String,
    name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.BatchRequestTooLong
  ): BatchRequestTooLong = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchRequestTooLong]
  }
  @scala.inline
  implicit class BatchRequestTooLongOps[Self <: BatchRequestTooLong] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.BatchRequestTooLong): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

