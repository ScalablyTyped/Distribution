package typings.atAwsDashSdkClientDashS3DashBrowser.typesNoSuchKeyMod

import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoSuchKey extends ServiceException[_NoSuchKeyDetails] {
  @JSName("name")
  var name_NoSuchKey: typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.NoSuchKey
}

object NoSuchKey {
  @scala.inline
  def apply(
    details: _NoSuchKeyDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.NoSuchKey,
    stack: String = null
  ): NoSuchKey = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[NoSuchKey]
  }
}

