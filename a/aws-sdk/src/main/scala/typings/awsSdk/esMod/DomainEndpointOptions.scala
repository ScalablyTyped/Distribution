package typings.awsSdk.esMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainEndpointOptions extends StObject {
  
  /**
    * Specify the fully qualified domain for your custom endpoint.
    */
  var CustomEndpoint: js.UndefOr[DomainNameFqdn] = js.undefined
  
  /**
    * Specify ACM certificate ARN for your custom endpoint.
    */
  var CustomEndpointCertificateArn: js.UndefOr[ARN] = js.undefined
  
  /**
    * Specify if custom endpoint should be enabled for the Elasticsearch domain.
    */
  var CustomEndpointEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify if only HTTPS endpoint should be enabled for the Elasticsearch domain.
    */
  var EnforceHTTPS: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Specify the TLS security policy that needs to be applied to the HTTPS endpoint of Elasticsearch domain.  It can be one of the following values:  Policy-Min-TLS-1-0-2019-07:  TLS security policy which supports TLSv1.0 and higher. Policy-Min-TLS-1-2-2019-07:  TLS security policy which supports only TLSv1.2  
    */
  var TLSSecurityPolicy: js.UndefOr[typings.awsSdk.esMod.TLSSecurityPolicy] = js.undefined
}
object DomainEndpointOptions {
  
  inline def apply(): DomainEndpointOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainEndpointOptions]
  }
  
  extension [Self <: DomainEndpointOptions](x: Self) {
    
    inline def setCustomEndpoint(value: DomainNameFqdn): Self = StObject.set(x, "CustomEndpoint", value.asInstanceOf[js.Any])
    
    inline def setCustomEndpointCertificateArn(value: ARN): Self = StObject.set(x, "CustomEndpointCertificateArn", value.asInstanceOf[js.Any])
    
    inline def setCustomEndpointCertificateArnUndefined: Self = StObject.set(x, "CustomEndpointCertificateArn", js.undefined)
    
    inline def setCustomEndpointEnabled(value: Boolean): Self = StObject.set(x, "CustomEndpointEnabled", value.asInstanceOf[js.Any])
    
    inline def setCustomEndpointEnabledUndefined: Self = StObject.set(x, "CustomEndpointEnabled", js.undefined)
    
    inline def setCustomEndpointUndefined: Self = StObject.set(x, "CustomEndpoint", js.undefined)
    
    inline def setEnforceHTTPS(value: Boolean): Self = StObject.set(x, "EnforceHTTPS", value.asInstanceOf[js.Any])
    
    inline def setEnforceHTTPSUndefined: Self = StObject.set(x, "EnforceHTTPS", js.undefined)
    
    inline def setTLSSecurityPolicy(value: TLSSecurityPolicy): Self = StObject.set(x, "TLSSecurityPolicy", value.asInstanceOf[js.Any])
    
    inline def setTLSSecurityPolicyUndefined: Self = StObject.set(x, "TLSSecurityPolicy", js.undefined)
  }
}
