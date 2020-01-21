package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpUrlDestinationProperties extends js.Object {
  /**
    * The URL used to confirm the HTTP topic rule destination URL.
    */
  var confirmationUrl: js.UndefOr[Url] = js.native
}

object HttpUrlDestinationProperties {
  @scala.inline
  def apply(confirmationUrl: Url = null): HttpUrlDestinationProperties = {
    val __obj = js.Dynamic.literal()
    if (confirmationUrl != null) __obj.updateDynamic("confirmationUrl")(confirmationUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpUrlDestinationProperties]
  }
}

