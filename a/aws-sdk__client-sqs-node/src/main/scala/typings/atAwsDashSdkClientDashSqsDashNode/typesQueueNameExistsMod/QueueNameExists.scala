package typings.atAwsDashSdkClientDashSqsDashNode.typesQueueNameExistsMod

import typings.atAwsDashSdkClientDashSqsDashNode.typesCreateQueueExceptionsUnionMod.CreateQueueExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueueNameExists
  extends ServiceException[_QueueNameExistsDetails]
     with CreateQueueExceptionsUnion {
  @JSName("name")
  var name_QueueNameExists: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.QueueNameExists
}

object QueueNameExists {
  @scala.inline
  def apply(
    details: _QueueNameExistsDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashSqsDashNode.atAwsDashSdkClientDashSqsDashNodeStrings.QueueNameExists,
    stack: String = null
  ): QueueNameExists = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[QueueNameExists]
  }
}

