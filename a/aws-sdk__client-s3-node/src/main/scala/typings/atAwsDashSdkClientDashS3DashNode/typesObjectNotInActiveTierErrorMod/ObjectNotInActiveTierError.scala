package typings.atAwsDashSdkClientDashS3DashNode.typesObjectNotInActiveTierErrorMod

import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectNotInActiveTierError extends ServiceException[_ObjectNotInActiveTierErrorDetails] {
  @JSName("name")
  var name_ObjectNotInActiveTierError: typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.ObjectNotInActiveTierError
}

object ObjectNotInActiveTierError {
  @scala.inline
  def apply(
    details: _ObjectNotInActiveTierErrorDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashS3DashNode.atAwsDashSdkClientDashS3DashNodeStrings.ObjectNotInActiveTierError,
    stack: String = null
  ): ObjectNotInActiveTierError = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ObjectNotInActiveTierError]
  }
}

