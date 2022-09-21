package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDomainConfigurationRequest extends StObject {
  
  /**
    * An object that specifies the authorization service for a domain.
    */
  var authorizerConfig: js.UndefOr[AuthorizerConfig] = js.undefined
  
  /**
    * The name of the domain configuration. This value must be unique to a region.
    */
  var domainConfigurationName: DomainConfigurationName
  
  /**
    * The name of the domain.
    */
  var domainName: js.UndefOr[DomainName] = js.undefined
  
  /**
    * The ARNs of the certificates that IoT passes to the device during the TLS handshake. Currently you can specify only one certificate ARN. This value is not required for Amazon Web Services-managed domains.
    */
  var serverCertificateArns: js.UndefOr[ServerCertificateArns] = js.undefined
  
  /**
    * The type of service delivered by the endpoint.  Amazon Web Services IoT Core currently supports only the DATA service type. 
    */
  var serviceType: js.UndefOr[ServiceType] = js.undefined
  
  /**
    * Metadata which can be used to manage the domain configuration.  For URI Request parameters use format: ...key1=value1&amp;key2=value2... For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..." For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..." 
    */
  var tags: js.UndefOr[TagList] = js.undefined
  
  /**
    * The certificate used to validate the server certificate and prove domain name ownership. This certificate must be signed by a public certificate authority. This value is not required for Amazon Web Services-managed domains.
    */
  var validationCertificateArn: js.UndefOr[AcmCertificateArn] = js.undefined
}
object CreateDomainConfigurationRequest {
  
  inline def apply(domainConfigurationName: DomainConfigurationName): CreateDomainConfigurationRequest = {
    val __obj = js.Dynamic.literal(domainConfigurationName = domainConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainConfigurationRequest]
  }
  
  extension [Self <: CreateDomainConfigurationRequest](x: Self) {
    
    inline def setAuthorizerConfig(value: AuthorizerConfig): Self = StObject.set(x, "authorizerConfig", value.asInstanceOf[js.Any])
    
    inline def setAuthorizerConfigUndefined: Self = StObject.set(x, "authorizerConfig", js.undefined)
    
    inline def setDomainConfigurationName(value: DomainConfigurationName): Self = StObject.set(x, "domainConfigurationName", value.asInstanceOf[js.Any])
    
    inline def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    inline def setServerCertificateArns(value: ServerCertificateArns): Self = StObject.set(x, "serverCertificateArns", value.asInstanceOf[js.Any])
    
    inline def setServerCertificateArnsUndefined: Self = StObject.set(x, "serverCertificateArns", js.undefined)
    
    inline def setServerCertificateArnsVarargs(value: AcmCertificateArn*): Self = StObject.set(x, "serverCertificateArns", js.Array(value*))
    
    inline def setServiceType(value: ServiceType): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
    
    inline def setServiceTypeUndefined: Self = StObject.set(x, "serviceType", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value*))
    
    inline def setValidationCertificateArn(value: AcmCertificateArn): Self = StObject.set(x, "validationCertificateArn", value.asInstanceOf[js.Any])
    
    inline def setValidationCertificateArnUndefined: Self = StObject.set(x, "validationCertificateArn", js.undefined)
  }
}
