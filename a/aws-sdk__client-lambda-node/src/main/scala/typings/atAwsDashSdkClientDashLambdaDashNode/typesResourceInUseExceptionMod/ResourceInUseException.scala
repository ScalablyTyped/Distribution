package typings.atAwsDashSdkClientDashLambdaDashNode.typesResourceInUseExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesDeleteEventSourceMappingExceptionsUnionMod.DeleteEventSourceMappingExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUpdateEventSourceMappingExceptionsUnionMod.UpdateEventSourceMappingExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
    $metadata: ResponseMetadata,
    details: _ResourceInUseExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.ResourceInUseException,
    stack: String = null
  ): ResourceInUseException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceInUseException]
  }
}

