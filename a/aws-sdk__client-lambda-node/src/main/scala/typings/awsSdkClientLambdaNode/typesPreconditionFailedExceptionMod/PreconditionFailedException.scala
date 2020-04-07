package typings.awsSdkClientLambdaNode.typesPreconditionFailedExceptionMod

import typings.awsSdkClientLambdaNode.addPermissionExceptionsUnionMod.AddPermissionExceptionsUnion
import typings.awsSdkClientLambdaNode.publishVersionExceptionsUnionMod.PublishVersionExceptionsUnion
import typings.awsSdkClientLambdaNode.removePermissionExceptionsUnionMod.RemovePermissionExceptionsUnion
import typings.awsSdkClientLambdaNode.updateAliasExceptionsUnionMod.UpdateAliasExceptionsUnion
import typings.awsSdkClientLambdaNode.updateFunctionCodeExceptionsUnionMod.UpdateFunctionCodeExceptionsUnion
import typings.awsSdkClientLambdaNode.updateFunctionConfigurationExceptionsUnionMod.UpdateFunctionConfigurationExceptionsUnion
import typings.awsSdkTypes.exceptionMod.ServiceException
import typings.awsSdkTypes.responseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreconditionFailedException
  extends ServiceException[PreconditionFailedExceptionDetails]
     with AddPermissionExceptionsUnion
     with PublishVersionExceptionsUnion
     with RemovePermissionExceptionsUnion
     with UpdateAliasExceptionsUnion
     with UpdateFunctionCodeExceptionsUnion
     with UpdateFunctionConfigurationExceptionsUnion {
  @JSName("name")
  var name_PreconditionFailedException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.PreconditionFailedException
}

object PreconditionFailedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: PreconditionFailedExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.PreconditionFailedException,
    stack: String = null
  ): PreconditionFailedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreconditionFailedException]
  }
}

