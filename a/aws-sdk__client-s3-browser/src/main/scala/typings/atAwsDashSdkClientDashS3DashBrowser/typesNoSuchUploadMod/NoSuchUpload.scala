package typings.atAwsDashSdkClientDashS3DashBrowser.typesNoSuchUploadMod

import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
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
    $metadata: ResponseMetadata,
    details: _NoSuchUploadDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.NoSuchUpload,
    stack: String = null
  ): NoSuchUpload = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[NoSuchUpload]
  }
}

