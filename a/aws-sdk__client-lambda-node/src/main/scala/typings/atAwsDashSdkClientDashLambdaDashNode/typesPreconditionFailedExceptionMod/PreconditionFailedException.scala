package typings.atAwsDashSdkClientDashLambdaDashNode.typesPreconditionFailedExceptionMod

import typings.atAwsDashSdkClientDashLambdaDashNode.typesAddPermissionExceptionsUnionMod.AddPermissionExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesPublishVersionExceptionsUnionMod.PublishVersionExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesRemovePermissionExceptionsUnionMod.RemovePermissionExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUpdateAliasExceptionsUnionMod.UpdateAliasExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUpdateFunctionCodeExceptionsUnionMod.UpdateFunctionCodeExceptionsUnion
import typings.atAwsDashSdkClientDashLambdaDashNode.typesUpdateFunctionConfigurationExceptionsUnionMod.UpdateFunctionConfigurationExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
    $metadata: ResponseMetadata,
    details: _PreconditionFailedExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashLambdaDashNode.atAwsDashSdkClientDashLambdaDashNodeStrings.PreconditionFailedException,
    stack: String = null
  ): PreconditionFailedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreconditionFailedException]
  }
}

