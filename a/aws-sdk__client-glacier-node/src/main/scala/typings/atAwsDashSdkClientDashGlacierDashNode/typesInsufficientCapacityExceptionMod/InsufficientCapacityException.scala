package typings.atAwsDashSdkClientDashGlacierDashNode.typesInsufficientCapacityExceptionMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesInitiateJobExceptionsUnionMod.InitiateJobExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InsufficientCapacityException
  extends ServiceException[_InsufficientCapacityExceptionDetails]
     with InitiateJobExceptionsUnion {
  @JSName("name")
  var name_InsufficientCapacityException: typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.InsufficientCapacityException
}

object InsufficientCapacityException {
  @scala.inline
  def apply(
    details: _InsufficientCapacityExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.InsufficientCapacityException,
    stack: String = null
  ): InsufficientCapacityException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[InsufficientCapacityException]
  }
}

