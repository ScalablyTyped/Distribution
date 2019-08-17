package typings.atAwsDashSdkClientDashSqsDashNode.typesReceiptHandleIsInvalidMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesChangeMessageVisibilityExceptionsUnionMod.ChangeMessageVisibilityExceptionsUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesDeleteMessageExceptionsUnionMod.DeleteMessageExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
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
    details: _ReceiptHandleIsInvalidDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.ReceiptHandleIsInvalid,
    stack: String = null
  ): ReceiptHandleIsInvalid = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ReceiptHandleIsInvalid]
  }
}

