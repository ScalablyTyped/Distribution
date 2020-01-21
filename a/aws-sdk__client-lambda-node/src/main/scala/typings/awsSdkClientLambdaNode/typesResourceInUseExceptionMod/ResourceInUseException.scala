package typings.awsSdkClientLambdaNode.typesResourceInUseExceptionMod

import typings.awsSdkClientLambdaNode.deleteEventSourceMappingExceptionsUnionMod.DeleteEventSourceMappingExceptionsUnion
import typings.awsSdkClientLambdaNode.updateEventSourceMappingExceptionsUnionMod.UpdateEventSourceMappingExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceInUseException
  extends ServiceException[ResourceInUseExceptionDetails]
     with DeleteEventSourceMappingExceptionsUnion
     with UpdateEventSourceMappingExceptionsUnion {
  @JSName("name")
  var name_ResourceInUseException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ResourceInUseException = js.native
}

