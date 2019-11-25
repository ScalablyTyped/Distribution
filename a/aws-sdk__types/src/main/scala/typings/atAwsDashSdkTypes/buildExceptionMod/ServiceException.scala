package typings.atAwsDashSdkTypes.buildExceptionMod

import typings.atAwsDashSdkTypes.buildResponseMod.MetadataBearer
import typings.atAwsDashSdkTypes.buildResponseMod.ResponseMetadata
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServiceException[Details]
  extends Error
     with MetadataBearer {
  var details: Details
}

object ServiceException {
  @scala.inline
  def apply[Details]($metadata: ResponseMetadata, details: Details, message: String, name: String, stack: String = null): ServiceException[Details] = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    if (stack != null) __obj.updateDynamic("stack")(stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceException[Details]]
  }
}

