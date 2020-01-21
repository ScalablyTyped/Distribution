package typings.awsSdk.remoteCredentialsMod

import typings.awsSdk.AnonTimeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteCredentialsOptions extends js.Object {
  var httpOptions: js.UndefOr[AnonTimeout] = js.native
  var maxRetries: js.UndefOr[Double] = js.native
}

object RemoteCredentialsOptions {
  @scala.inline
  def apply(httpOptions: AnonTimeout = null, maxRetries: Int | Double = null): RemoteCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    if (httpOptions != null) __obj.updateDynamic("httpOptions")(httpOptions.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteCredentialsOptions]
  }
}

