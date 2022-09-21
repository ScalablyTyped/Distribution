package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AwsOpenSearchServiceDomainDomainEndpointOptionsDetails extends StObject {
  
  /**
    * The fully qualified URL for the custom endpoint.
    */
  var CustomEndpoint: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The ARN for the security certificate. The certificate is managed in ACM.
    */
  var CustomEndpointCertificateArn: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * Whether to enable a custom endpoint for the domain.
    */
  var CustomEndpointEnabled: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether to require that all traffic to the domain arrive over HTTPS.
    */
  var EnforceHTTPS: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The TLS security policy to apply to the HTTPS endpoint of the OpenSearch domain.
    */
  var TLSSecurityPolicy: js.UndefOr[NonEmptyString] = js.undefined
}
object AwsOpenSearchServiceDomainDomainEndpointOptionsDetails {
  
  inline def apply(): AwsOpenSearchServiceDomainDomainEndpointOptionsDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AwsOpenSearchServiceDomainDomainEndpointOptionsDetails]
  }
  
  extension [Self <: AwsOpenSearchServiceDomainDomainEndpointOptionsDetails](x: Self) {
    
    inline def setCustomEndpoint(value: NonEmptyString): Self = StObject.set(x, "CustomEndpoint", value.asInstanceOf[js.Any])
    
    inline def setCustomEndpointCertificateArn(value: NonEmptyString): Self = StObject.set(x, "CustomEndpointCertificateArn", value.asInstanceOf[js.Any])
    
    inline def setCustomEndpointCertificateArnUndefined: Self = StObject.set(x, "CustomEndpointCertificateArn", js.undefined)
    
    inline def setCustomEndpointEnabled(value: Boolean): Self = StObject.set(x, "CustomEndpointEnabled", value.asInstanceOf[js.Any])
    
    inline def setCustomEndpointEnabledUndefined: Self = StObject.set(x, "CustomEndpointEnabled", js.undefined)
    
    inline def setCustomEndpointUndefined: Self = StObject.set(x, "CustomEndpoint", js.undefined)
    
    inline def setEnforceHTTPS(value: Boolean): Self = StObject.set(x, "EnforceHTTPS", value.asInstanceOf[js.Any])
    
    inline def setEnforceHTTPSUndefined: Self = StObject.set(x, "EnforceHTTPS", js.undefined)
    
    inline def setTLSSecurityPolicy(value: NonEmptyString): Self = StObject.set(x, "TLSSecurityPolicy", value.asInstanceOf[js.Any])
    
    inline def setTLSSecurityPolicyUndefined: Self = StObject.set(x, "TLSSecurityPolicy", js.undefined)
  }
}
