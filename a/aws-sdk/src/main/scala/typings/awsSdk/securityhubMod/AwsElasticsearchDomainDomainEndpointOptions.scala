package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsElasticsearchDomainDomainEndpointOptions extends StObject {
  
  /**
    * Whether to require that all traffic to the domain arrive over HTTPS.
    */
  var EnforceHTTPS: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The TLS security policy to apply to the HTTPS endpoint of the Elasticsearch domain. Valid values:    Policy-Min-TLS-1-0-2019-07, which supports TLSv1.0 and higher    Policy-Min-TLS-1-2-2019-07, which only supports TLSv1.2  
    */
  var TLSSecurityPolicy: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsElasticsearchDomainDomainEndpointOptions {
  
  @scala.inline
  def apply(): AwsElasticsearchDomainDomainEndpointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsElasticsearchDomainDomainEndpointOptions]
  }
  
  @scala.inline
  implicit class AwsElasticsearchDomainDomainEndpointOptionsMutableBuilder[Self <: AwsElasticsearchDomainDomainEndpointOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnforceHTTPS(value: Boolean): Self = StObject.set(x, "EnforceHTTPS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnforceHTTPSUndefined: Self = StObject.set(x, "EnforceHTTPS", js.undefined)
    
    @scala.inline
    def setTLSSecurityPolicy(value: NonEmptyString): Self = StObject.set(x, "TLSSecurityPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTLSSecurityPolicyUndefined: Self = StObject.set(x, "TLSSecurityPolicy", js.undefined)
  }
}
