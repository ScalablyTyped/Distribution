package typings.atAwsDashSdkClientDashSqsDashNode.typesReceiptHandleIsInvalidMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesChangeMessageVisibilityExceptionsUnionMod.ChangeMessageVisibilityExceptionsUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesDeleteMessageExceptionsUnionMod.DeleteMessageExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiptHandleIsInvalid
  extends ServiceException[_ReceiptHandleIsInvalidDetails]
     with ChangeMessageVisibilityExceptionsUnion
     with DeleteMessageExceptionsUnion {
  @JSName("name")
  var name_ReceiptHandleIsInvalid: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.ReceiptHandleIsInvalid
}

object ReceiptHandleIsInvalid {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _ReceiptHandleIsInvalidDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.ReceiptHandleIsInvalid,
    stack: String = null
  ): ReceiptHandleIsInvalid = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptHandleIsInvalid]
  }
}

