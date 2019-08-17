package typings.atAwsDashSdkClientDashLambdaDashNode.typesPreconditionFailedExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesAddPermissionExceptionsUnionMod.AddPermissionExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesPublishVersionExceptionsUnionMod.PublishVersionExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesRemovePermissionExceptionsUnionMod.RemovePermissionExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUpdateAliasExceptionsUnionMod.UpdateAliasExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUpdateFunctionCodeExceptionsUnionMod.UpdateFunctionCodeExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUpdateFunctionConfigurationExceptionsUnionMod.UpdateFunctionConfigurationExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreconditionFailedException
  extends ServiceException[_PreconditionFailedExceptionDetails]
     with AddPermissionExceptionsUnion
     with PublishVersionExceptionsUnion
     with RemovePermissionExceptionsUnion
     with UpdateAliasExceptionsUnion
     with UpdateFunctionCodeExceptionsUnion
     with UpdateFunctionConfigurationExceptionsUnion {
  @JSName("name")
  var name_PreconditionFailedException: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.PreconditionFailedException
}

object PreconditionFailedException {
  @scala.inline
  def apply(
    details: _PreconditionFailedExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.PreconditionFailedException,
    stack: String = null
  ): PreconditionFailedException = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[PreconditionFailedException]
  }
}

