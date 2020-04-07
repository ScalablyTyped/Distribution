package typings.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod

import typings.awsSdkClientSqsNode.changeMessageVisibilityExceptionsUnionMod.ChangeMessageVisibilityExceptionsUnion
import typings.awsSdkClientSqsNode.deleteMessageExceptionsUnionMod.DeleteMessageExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReceiptHandleIsInvalid
  extends ServiceException[ReceiptHandleIsInvalidDetails]
     with ChangeMessageVisibilityExceptionsUnion
     with DeleteMessageExceptionsUnion {
  @JSName("name")
  var name_ReceiptHandleIsInvalid: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ReceiptHandleIsInvalid
}

object ReceiptHandleIsInvalid {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ReceiptHandleIsInvalidDetails,
    message: String,
    name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ReceiptHandleIsInvalid,
    stack: String = null
  ): ReceiptHandleIsInvalid = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptHandleIsInvalid]
  }
}

