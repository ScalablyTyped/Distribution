package typings.awsSdk.esMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainEndpointOptions extends js.Object {
  /**
    * Specify if only HTTPS endpoint should be enabled for the Elasticsearch domain.
    */
  var EnforceHTTPS: js.UndefOr[Boolean] = js.native
  /**
    * Specify the TLS security policy that needs to be applied to the HTTPS endpoint of Elasticsearch domain.  It can be one of the following values:  Policy-Min-TLS-1-0-2019-07:  TLS security policy which supports TLSv1.0 and higher. Policy-Min-TLS-1-2-2019-07:  TLS security policy which supports only TLSv1.2  
    */
  var TLSSecurityPolicy: js.UndefOr[typings.awsSdk.esMod.TLSSecurityPolicy] = js.native
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

