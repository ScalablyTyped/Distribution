package typings.awsSdk.cloudsearchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainEndpointOptions extends js.Object {
  /**
    * Whether the domain is HTTPS only enabled.
    */
  var EnforceHTTPS: js.UndefOr[Boolean] = js.native
  /**
    * The minimum required TLS version
    */
  var TLSSecurityPolicy: js.UndefOr[typings.awsSdk.cloudsearchMod.TLSSecurityPolicy] = js.native
}

object DomainEndpointOptions {
  @scala.inline
  def apply(
    EnforceHTTPS: js.UndefOr[scala.Boolean] = js.undefined,
    TLSSecurityPolicy: TLSSecurityPolicy = null
  ): DomainEndpointOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(EnforceHTTPS)) __obj.updateDynamic("EnforceHTTPS")(EnforceHTTPS.asInstanceOf[js.Any])
    if (TLSSecurityPolicy != null) __obj.updateDynamic("TLSSecurityPolicy")(TLSSecurityPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainEndpointOptions]
  }
}

