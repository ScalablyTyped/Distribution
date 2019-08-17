package typings.atAwsDashSdkClientDashS3DashBrowser.typesNoSuchUploadMod

import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoSuchUpload extends ServiceException[_NoSuchUploadDetails] {
  @JSName("name")
  var name_NoSuchUpload: typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.NoSuchUpload
}

object NoSuchUpload {
  @scala.inline
  def apply(
    details: _NoSuchUploadDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.NoSuchUpload,
    stack: String = null
  ): NoSuchUpload = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[NoSuchUpload]
  }
}

