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
  def apply(maxRetries: js.UndefOr[Double] = js.undefined, timeout: js.UndefOr[Double] = js.undefined): RemoteProviderInit = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(maxRetries)) __obj.updateDynamic("maxRetries")(maxRetries.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteProviderInit]
  }
}

