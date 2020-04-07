package typings.awsSdkClientLambdaNode.typesResourceInUseExceptionMod

import typings.awsSdkClientLambdaNode.deleteEventSourceMappingExceptionsUnionMod.DeleteEventSourceMappingExceptionsUnion
import typings.awsSdkClientLambdaNode.updateEventSourceMappingExceptionsUnionMod.UpdateEventSourceMappingExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceInUseException
  extends ServiceException[ResourceInUseExceptionDetails]
     with DeleteEventSourceMappingExceptionsUnion
     with UpdateEventSourceMappingExceptionsUnion {
  @JSName("name")
  var name_ResourceInUseException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ResourceInUseException
}

object ResourceInUseException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ResourceInUseExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ResourceInUseException,
    stack: String = null
  ): ResourceInUseException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceInUseException]
  }
}

