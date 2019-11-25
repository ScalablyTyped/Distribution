package typings.atAwsDashSdkClientDashS3DashNode.typesObjectAlreadyInActiveTierErrorMod

import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectAlreadyInActiveTierError extends ServiceException[_ObjectAlreadyInActiveTierErrorDetails] {
  @JSName("name")
  var name_ObjectAlreadyInActiveTierError: typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.ObjectAlreadyInActiveTierError
}

object ObjectAlreadyInActiveTierError {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _ObjectAlreadyInActiveTierErrorDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.ObjectAlreadyInActiveTierError,
    stack: String = null
  ): ObjectAlreadyInActiveTierError = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectAlreadyInActiveTierError]
  }
}

