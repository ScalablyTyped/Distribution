package typings.atAwsDashSdkClientDashLambdaDashNode.typesResourceInUseExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesDeleteEventSourceMappingExceptionsUnionMod.DeleteEventSourceMappingExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUpdateEventSourceMappingExceptionsUnionMod.UpdateEventSourceMappingExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceInUseException
  extends ServiceException[_ResourceInUseExceptionDetails]
     with DeleteEventSourceMappingExceptionsUnion
     with UpdateEventSourceMappingExceptionsUnion {
  @JSName("name")
  var name_ResourceInUseException: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.ResourceInUseException
}

object ResourceInUseException {
  @scala.inline
  def apply(
    details: _ResourceInUseExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.ResourceInUseException,
    stack: String = null
  ): ResourceInUseException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ResourceInUseException]
  }
}

