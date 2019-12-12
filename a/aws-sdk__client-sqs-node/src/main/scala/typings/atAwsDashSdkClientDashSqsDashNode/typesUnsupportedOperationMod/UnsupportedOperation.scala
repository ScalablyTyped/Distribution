package typings.atAwsDashSdkClientDashSqsDashNode.typesUnsupportedOperationMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesSendMessageBatchExceptionsUnionMod.SendMessageBatchExceptionsUnion
import typings.atAwsDashSdkClientDashSqsDashNode.typesSendMessageExceptionsUnionMod.SendMessageExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UnsupportedOperation
  extends ServiceException[_UnsupportedOperationDetails]
     with SendMessageBatchExceptionsUnion
     with SendMessageExceptionsUnion {
  @JSName("name")
  var name_UnsupportedOperation: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.UnsupportedOperation = js.native
}

