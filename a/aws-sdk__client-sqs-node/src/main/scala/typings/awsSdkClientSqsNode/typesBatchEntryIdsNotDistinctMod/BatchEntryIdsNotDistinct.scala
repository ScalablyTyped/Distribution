package typings.awsSdkClientSqsNode.typesBatchEntryIdsNotDistinctMod

import typings.awsSdkClientSqsNode.changeMessageVisibilityBatchExceptionsUnionMod.ChangeMessageVisibilityBatchExceptionsUnion
import typings.awsSdkClientSqsNode.deleteMessageBatchExceptionsUnionMod.DeleteMessageBatchExceptionsUnion
import typings.awsSdkClientSqsNode.sendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchEntryIdsNotDistinct
  extends ServiceException[BatchEntryIdsNotDistinctDetails]
     with ChangeMessageVisibilityBatchExceptionsUnion
     with DeleteMessageBatchExceptionsUnion
     with SendMessageBatchExceptionsUnion {
  @JSName("name")
  var name_BatchEntryIdsNotDistinct: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.BatchEntryIdsNotDistinct = js.native
}

object BatchEntryIdsNotDistinct {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: BatchEntryIdsNotDistinctDetails,
    message: String,
    name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.BatchEntryIdsNotDistinct
  ): BatchEntryIdsNotDistinct = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchEntryIdsNotDistinct]
  }
  @scala.inline
  implicit class BatchEntryIdsNotDistinctOps[Self <: BatchEntryIdsNotDistinct] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.BatchEntryIdsNotDistinct): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

