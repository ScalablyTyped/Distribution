package typings.atAwsDashSdkClientDashSqsDashNode.typesBatchEntryIdsNotDistinctMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesChangeMessageVisibilityBatchExceptionsUnionMod.ChangeMessageVisibilityBatchExceptionsUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesDeleteMessageBatchExceptionsUnionMod.DeleteMessageBatchExceptionsUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesSendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchEntryIdsNotDistinct
  extends ServiceException[_BatchEntryIdsNotDistinctDetails]
     with ChangeMessageVisibilityBatchExceptionsUnion
     with DeleteMessageBatchExceptionsUnion
     with SendMessageBatchExceptionsUnion {
  @JSName("name")
  var name_BatchEntryIdsNotDistinct: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.BatchEntryIdsNotDistinct
}

object BatchEntryIdsNotDistinct {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _BatchEntryIdsNotDistinctDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.BatchEntryIdsNotDistinct,
    stack: String = null
  ): BatchEntryIdsNotDistinct = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchEntryIdsNotDistinct]
  }
}

