package typings.atAwsDashSdkClientDashS3DashBrowser.typesObjectNotInActiveTierErrorMod

import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectNotInActiveTierError extends ServiceException[_ObjectNotInActiveTierErrorDetails] {
  @JSName("name")
  var name_ObjectNotInActiveTierError: typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.ObjectNotInActiveTierError
}

object ObjectNotInActiveTierError {
  @scala.inline
  def apply(
    details: _ObjectNotInActiveTierErrorDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.ObjectNotInActiveTierError,
    stack: String = null
  ): ObjectNotInActiveTierError = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[ObjectNotInActiveTierError]
  }
}

