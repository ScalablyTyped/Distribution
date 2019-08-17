package typings.atAwsDashSdkClientDashLambdaDashNode.typesResourceConflictExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesAddPermissionExceptionsUnionMod.AddPermissionExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesCreateAliasExceptionsUnionMod.CreateAliasExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesCreateEventSourceMappingExceptionsUnionMod.CreateEventSourceMappingExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesCreateFunctionExceptionsUnionMod.CreateFunctionExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesDeleteFunctionExceptionsUnionMod.DeleteFunctionExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUpdateEventSourceMappingExceptionsUnionMod.UpdateEventSourceMappingExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUpdateFunctionConfigurationExceptionsUnionMod.UpdateFunctionConfigurationExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
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
    details: _ResourceConflictExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.ResourceConflictException,
    stack: String = null
  ): ResourceConflictException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ResourceConflictException]
  }
}

