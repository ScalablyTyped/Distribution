package typings.awsSdkTypes.exceptionMod

import typings.awsSdkTypes.responseMod.MetadataBearer
import typings.awsSdkTypes.responseMod.ResponseMetadata
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServiceException[Details]
  extends Error
     with MetadataBearer {
  var details: Details = js.native
}

object ServiceException {
  @scala.inline
  def apply[Details]($metadata: ResponseMetadata, details: Details, message: String, name: String): ServiceException[Details] = {
    val __obj = js.Dynamic.literal($metadata = $metadata.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceException[Details]]
  }
  @scala.inline
  implicit class ServiceExceptionOps[Self <: ServiceException[_], Details] (val x: Self with ServiceException[Details]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDetails(value: Details): Self = this.set("details", value.asInstanceOf[js.Any])
  }
  
}

