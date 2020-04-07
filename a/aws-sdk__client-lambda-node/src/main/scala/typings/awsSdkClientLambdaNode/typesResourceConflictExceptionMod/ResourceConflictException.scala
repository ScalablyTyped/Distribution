package typings.awsSdkClientLambdaNode.typesResourceConflictExceptionMod

import typings.awsSdkClientLambdaNode.addPermissionExceptionsUnionMod.AddPermissionExceptionsUnion
import typings.awsSdkClientLambdaNode.createAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typings.awsSdkClientLambdaNode.createEventSourceMappingExceptionsUnionMod.CreateEventSourceMappingExceptionsUnion
import typings.awsSdkClientLambdaNode.createFunctionExceptionsUnionMod.CreateFunctionExceptionsUnion
import typings.awsSdkClientLambdaNode.deleteFunctionExceptionsUnionMod.DeleteFunctionExceptionsUnion
import typings.awsSdkClientLambdaNode.updateEventSourceMappingExceptionsUnionMod.UpdateEventSourceMappingExceptionsUnion
import typings.awsSdkClientLambdaNode.updateFunctionConfigurationExceptionsUnionMod.UpdateFunctionConfigurationExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceConflictException
  extends ServiceException[ResourceConflictExceptionDetails]
     with AddPermissionExceptionsUnion
     with CreateAliasExceptionsUnion
     with CreateEventSourceMappingExceptionsUnion
     with CreateFunctionExceptionsUnion
     with DeleteFunctionExceptionsUnion
     with UpdateEventSourceMappingExceptionsUnion
     with UpdateFunctionConfigurationExceptionsUnion {
  @JSName("name")
  var name_ResourceConflictException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ResourceConflictException
}

object ResourceConflictException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: ResourceConflictExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.ResourceConflictException,
    stack: String = null
  ): ResourceConflictException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceConflictException]
  }
}

