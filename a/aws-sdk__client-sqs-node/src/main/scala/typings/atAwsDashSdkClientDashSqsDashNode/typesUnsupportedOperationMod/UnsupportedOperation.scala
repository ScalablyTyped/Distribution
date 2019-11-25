package typings.atAwsDashSdkClientDashSqsDashNode.typesUnsupportedOperationMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesSendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesSendMessageExceptionsUnionMod.SendMessageExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UnsupportedOperation
  extends ServiceException[_UnsupportedOperationDetails]
     with SendMessageBatchExceptionsUnion
     with SendMessageExceptionsUnion {
  @JSName("name")
  var name_UnsupportedOperation: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.UnsupportedOperation
}

object UnsupportedOperation {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _UnsupportedOperationDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.UnsupportedOperation,
    stack: String = null
  ): UnsupportedOperation = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[UnsupportedOperation]
  }
}

