package typings.atAwsDashSdkClientDashS3DashBrowser.typesObjectAlreadyInActiveTierErrorMod

import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectAlreadyInActiveTierError extends ServiceException[_ObjectAlreadyInActiveTierErrorDetails] {
  @JSName("name")
  var name_ObjectAlreadyInActiveTierError: typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.ObjectAlreadyInActiveTierError
}

object ObjectAlreadyInActiveTierError {
  @scala.inline
  def apply(
    details: _ObjectAlreadyInActiveTierErrorDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.ObjectAlreadyInActiveTierError,
    stack: String = null
  ): ObjectAlreadyInActiveTierError = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ObjectAlreadyInActiveTierError]
  }
}

