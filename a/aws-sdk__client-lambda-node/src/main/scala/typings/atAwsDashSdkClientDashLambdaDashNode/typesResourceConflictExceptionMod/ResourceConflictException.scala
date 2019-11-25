package typings.atAwsDashSdkClientDashLambdaDashNode.typesResourceConflictExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesAddPermissionExceptionsUnionMod.AddPermissionExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesCreateAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesCreateEventSourceMappingExceptionsUnionMod.CreateEventSourceMappingExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesCreateFunctionExceptionsUnionMod.CreateFunctionExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesDeleteFunctionExceptionsUnionMod.DeleteFunctionExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUpdateEventSourceMappingExceptionsUnionMod.UpdateEventSourceMappingExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUpdateFunctionConfigurationExceptionsUnionMod.UpdateFunctionConfigurationExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceConflictException
  extends ServiceException[_ResourceConflictExceptionDetails]
     with AddPermissionExceptionsUnion
     with CreateAliasExceptionsUnion
     with CreateEventSourceMappingExceptionsUnion
     with CreateFunctionExceptionsUnion
     with DeleteFunctionExceptionsUnion
     with UpdateEventSourceMappingExceptionsUnion
     with UpdateFunctionConfigurationExceptionsUnion {
  @JSName("name")
  var name_ResourceConflictException: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.ResourceConflictException
}

object ResourceConflictException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _ResourceConflictExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.ResourceConflictException,
    stack: String = null
  ): ResourceConflictException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResourceConflictException]
  }
}

