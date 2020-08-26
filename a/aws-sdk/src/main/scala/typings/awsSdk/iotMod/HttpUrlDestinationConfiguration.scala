package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpUrlDestinationConfiguration extends js.Object {
  /**
    * The URL AWS IoT uses to confirm ownership of or access to the topic rule destination URL.
    */
  var confirmationUrl: Url = js.native
}

object HttpUrlDestinationConfiguration {
  @scala.inline
  def apply(confirmationUrl: Url): HttpUrlDestinationConfiguration = {
    val __obj = js.Dynamic.literal(confirmationUrl = confirmationUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpUrlDestinationConfiguration]
  }
  @scala.inline
  implicit class HttpUrlDestinationConfigurationOps[Self <: HttpUrlDestinationConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConfirmationUrl(value: Url): Self = this.set("confirmationUrl", value.asInstanceOf[js.Any])
  }
  
}

