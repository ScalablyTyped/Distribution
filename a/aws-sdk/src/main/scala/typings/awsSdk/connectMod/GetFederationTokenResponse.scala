package typings.awsSdk.connectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetFederationTokenResponse extends js.Object {
  /**
    * The credentials to use for federation.
    */
  var Credentials: js.UndefOr[typings.awsSdk.connectMod.Credentials] = js.native
}

object GetFederationTokenResponse {
  @scala.inline
  def apply(Credentials: Credentials = null): GetFederationTokenResponse = {
    val __obj = js.Dynamic.literal()
    if (Credentials != null) __obj.updateDynamic("Credentials")(Credentials.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetFederationTokenResponse]
  }
}

