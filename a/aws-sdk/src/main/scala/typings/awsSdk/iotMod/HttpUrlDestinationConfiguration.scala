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
}

