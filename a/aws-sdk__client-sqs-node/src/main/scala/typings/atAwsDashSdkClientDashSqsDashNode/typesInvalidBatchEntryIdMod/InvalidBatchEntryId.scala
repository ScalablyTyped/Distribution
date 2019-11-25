package typings.atAwsDashSdkClientDashSqsDashNode.typesInvalidBatchEntryIdMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesChangeMessageVisibilityBatchExceptionsUnionMod.ChangeMessageVisibilityBatchExceptionsUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesDeleteMessageBatchExceptionsUnionMod.DeleteMessageBatchExceptionsUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesSendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InvalidBatchEntryId
  extends ServiceException[_InvalidBatchEntryIdDetails]
     with ChangeMessageVisibilityBatchExceptionsUnion
     with DeleteMessageBatchExceptionsUnion
     with SendMessageBatchExceptionsUnion {
  @JSName("name")
  var name_InvalidBatchEntryId: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.InvalidBatchEntryId
}

object InvalidBatchEntryId {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _InvalidBatchEntryIdDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.InvalidBatchEntryId,
    stack: String = null
  ): InvalidBatchEntryId = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InvalidBatchEntryId]
  }
}

