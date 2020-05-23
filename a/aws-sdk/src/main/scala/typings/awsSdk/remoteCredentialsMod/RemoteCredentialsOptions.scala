package typings.awsSdk.remoteCredentialsMod

import typings.awsSdk.anon.Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RemoteCredentialsOptions extends js.Object {
  var httpOptions: js.UndefOr[Timeout] = js.native
  var maxRetries: js.UndefOr[Double] = js.native
}

object RemoteCredentialsOptions {
  @scala.inline
  def apply(httpOptions: Timeout = null, maxRetries: js.UndefOr[Double] = js.undefined): RemoteCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    if (httpOptions != null) __obj.updateDynamic("httpOptions")(httpOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteCredentialsOptions]
  }
}

