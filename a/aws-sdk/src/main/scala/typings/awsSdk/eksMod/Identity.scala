package typings.awsSdk.eksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Identity extends js.Object {
  /**
    * The OpenID Connect identity provider information for the cluster.
    */
  var oidc: js.UndefOr[OIDC] = js.native
}

object Identity {
  @scala.inline
  def apply(oidc: OIDC = null): Identity = {
    val __obj = js.Dynamic.literal()
    if (oidc != null) __obj.updateDynamic("oidc")(oidc.asInstanceOf[js.Any])
    __obj.asInstanceOf[Identity]
  }
}

