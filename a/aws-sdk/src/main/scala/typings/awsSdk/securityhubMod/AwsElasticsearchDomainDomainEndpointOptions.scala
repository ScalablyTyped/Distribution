package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsElasticsearchDomainDomainEndpointOptions extends js.Object {
  /**
    * Whether to require that all traffic to the domain arrive over HTTPS.
    */
  var EnforceHTTPS: js.UndefOr[Boolean] = js.native
  /**
    * The TLS security policy to apply to the HTTPS endpoint of the Elasticsearch domain. Valid values:    Policy-Min-TLS-1-0-2019-07, which supports TLSv1.0 and higher    Policy-Min-TLS-1-2-2019-07, which only supports TLSv1.2  
    */
  var TLSSecurityPolicy: js.UndefOr[NonEmptyString] = js.native
}

object AwsElasticsearchDomainDomainEndpointOptions {
  @scala.inline
  def apply(EnforceHTTPS: js.UndefOr[Boolean] = js.undefined, TLSSecurityPolicy: NonEmptyString = null): AwsElasticsearchDomainDomainEndpointOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(EnforceHTTPS)) __obj.updateDynamic("EnforceHTTPS")(EnforceHTTPS.get.asInstanceOf[js.Any])
    if (TLSSecurityPolicy != null) __obj.updateDynamic("TLSSecurityPolicy")(TLSSecurityPolicy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsElasticsearchDomainDomainEndpointOptions]
  }
}

