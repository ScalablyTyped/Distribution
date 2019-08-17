package typings.atAwsDashSdkClientDashS3DashBrowser.typesNoSuchBucketMod

import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NoSuchBucket extends ServiceException[_NoSuchBucketDetails] {
  @JSName("name")
  var name_NoSuchBucket: typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.NoSuchBucket
}

object NoSuchBucket {
  @scala.inline
  def apply(
    details: _NoSuchBucketDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashS3DashBrowser.atAwsDashSdkClientDashS3DashBrowserStrings.NoSuchBucket,
    stack: String = null
  ): NoSuchBucket = {
    val __obj = js.Dynamic.literal(details = details, message = message, name = name)
    if (stack != null) __obj.updateDynamic("stack")(stack)
    __obj.asInstanceOf[NoSuchBucket]
  }
}

