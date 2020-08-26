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

@js.native
trait PreconditionFailedException
  extends ServiceException[PreconditionFailedExceptionDetails]
     with AddPermissionExceptionsUnion
     with PublishVersionExceptionsUnion
     with RemovePermissionExceptionsUnion
     with UpdateAliasExceptionsUnion
     with UpdateFunctionCodeExceptionsUnion
     with UpdateFunctionConfigurationExceptionsUnion {
  @JSName("name")
  var name_PreconditionFailedException: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.PreconditionFailedException = js.native
}

object PreconditionFailedException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: PreconditionFailedExceptionDetails,
    message: String,
    name: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.PreconditionFailedException
  ): PreconditionFailedException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreconditionFailedException]
  }
  @scala.inline
  implicit class PreconditionFailedExceptionOps[Self <: PreconditionFailedException] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setName(value: typings.awsSdkClientLambdaNode.awsSdkClientLambdaNodeStrings.PreconditionFailedException): Self = this.set("name", value.asInstanceOf[js.Any])
  }
  
}

