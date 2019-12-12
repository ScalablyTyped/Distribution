package typings.atAwsDashSdkClientDashSqsDashNode.typesReceiptHandleIsInvalidMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesChangeMessageVisibilityExceptionsUnionMod.ChangeMessageVisibilityExceptionsUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesDeleteMessageExceptionsUnionMod.DeleteMessageExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReceiptHandleIsInvalid
  extends ServiceException[_ReceiptHandleIsInvalidDetails]
     with ChangeMessageVisibilityExceptionsUnion
     with DeleteMessageExceptionsUnion {
  @JSName("name")
  var name_ReceiptHandleIsInvalid: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.ReceiptHandleIsInvalid = js.native
}

