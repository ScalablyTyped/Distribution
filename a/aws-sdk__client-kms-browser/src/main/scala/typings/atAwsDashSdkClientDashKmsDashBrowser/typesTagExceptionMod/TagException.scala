package typings.atAwsDashSdkClientDashKmsDashBrowser.typesTagExceptionMod

import typings.atAwsDashSdkClientDashKmsDashBrowser.typesCreateKeyExceptionsUnionMod.CreateKeyExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesTagResourceExceptionsUnionMod.TagResourceExceptionsUnion
import typings.atAwsDashSdkClientDashKmsDashBrowser.typesUntagResourceExceptionsUnionMod.UntagResourceExceptionsUnion
import typings.atAwsDashSdkTypes.buildExceptionMod.ServiceException
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TagException
  extends ServiceException[_TagExceptionDetails]
     with CreateKeyExceptionsUnion
     with TagResourceExceptionsUnion
     with UntagResourceExceptionsUnion {
  @JSName("name")
  var name_TagException: typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.TagException
}

object TagException {
  @scala.inline
  def apply(
    $metadata: ResponseMetadata,
    details: _TagExceptionDetails,
    message: String,
    name: typings.atAwsDashSdkClientDashKmsDashBrowser.atAwsDashSdkClientDashKmsDashBrowserStrings.TagException,
    stack: String = null
  ): TagException = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[TagException]
  }
}

