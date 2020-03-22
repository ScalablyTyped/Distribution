package typings.awsSdkCredentialProviderImds.remoteProviderInitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<@aws-sdk/credential-provider-imds.@aws-sdk/credential-provider-imds/build/remoteProvider/RemoteProviderInit.RemoteProviderConfig> */
trait RemoteProviderInit extends js.Object {
  var maxRetries: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object RemoteProviderInit {
  @scala.inline
  def apply(maxRetries: Int | Double = null, timeout: Int | Double = null): RemoteProviderInit = {
    val __obj = js.Dynamic.literal()
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteProviderInit]
  }
}

