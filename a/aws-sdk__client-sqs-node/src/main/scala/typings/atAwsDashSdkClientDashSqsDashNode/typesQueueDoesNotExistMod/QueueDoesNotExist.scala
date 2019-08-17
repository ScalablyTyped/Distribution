package typings.atAwsDashSdkClientDashSqsDashNode.typesQueueDoesNotExistMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesPurgeQueueExceptionsUnionMod.PurgeQueueExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueDoesNotExist
  extends ServiceException[_QueueDoesNotExistDetails]
     with PurgeQueueExceptionsUnion {
  @JSName("name")
  var name_QueueDoesNotExist: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.QueueDoesNotExist
}

object QueueDoesNotExist {
  @scala.inline
  def apply(
    details: _QueueDoesNotExistDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.QueueDoesNotExist,
    stack: String = null
  ): QueueDoesNotExist = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[QueueDoesNotExist]
  }
}

