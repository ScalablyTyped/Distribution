package typings.awsSdkClientSqsNode.typesReceiptHandleIsInvalidMod

import typings.awsSdkClientSqsNode.changeMessageVisibilityExceptionsUnionMod.ChangeMessageVisibilityExceptionsUnion
import typings.awsSdkClientSqsNode.deleteMessageExceptionsUnionMod.DeleteMessageExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptHandleIsInvalid
  extends ServiceException[ReceiptHandleIsInvalidDetails]
     with ChangeMessageVisibilityExceptionsUnion
     with DeleteMessageExceptionsUnion {
  @JSName("name")
  var name_ReceiptHandleIsInvalid: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ReceiptHandleIsInvalid = js.native
}

object ReceiptHandleIsInvalid {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ReceiptHandleIsInvalidDetails,
    message: String,
    name: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ReceiptHandleIsInvalid
  ): ReceiptHandleIsInvalid = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReceiptHandleIsInvalid]
  }
  @scala.inline
  implicit class ReceiptHandleIsInvalidOps[Self <: ReceiptHandleIsInvalid] (val x: Self) extends AnyVal {
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
    def setName(value: typings.awsSdkClientSqsNode.awsSdkClientSqsNodeStrings.ReceiptHandleIsInvalid): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

