package typings.atAwsDashSdkClientDashS3DashNode.typesObjectAlreadyInActiveTierErrorMod

import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
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
    details: _ObjectAlreadyInActiveTierErrorDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.ObjectAlreadyInActiveTierError,
    stack: String = null
  ): ObjectAlreadyInActiveTierError = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ObjectAlreadyInActiveTierError]
  }
}

