package typings.atAwsDashSdkClientDashGlacierDashNode.typesInsufficientCapacityExceptionMod

import typings.atAwsDashSdkClientDashGlacierDashNode.typesInitiateJobExceptionsUnionMod.InitiateJobExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
    $metadata: ResponseMetadata,
    details: _InsufficientCapacityExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashGlacierDashNode.atAwsDashSdkClientDashGlacierDashNodeStrings.InsufficientCapacityException,
    stack: String = null
  ): InsufficientCapacityException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsufficientCapacityException]
  }
}

