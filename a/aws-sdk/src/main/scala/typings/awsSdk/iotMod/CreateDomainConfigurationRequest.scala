package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDomainConfigurationRequest extends StObject {
  
  /**
    * An object that specifies the authorization service for a domain.
    */
  var authorizerConfig: js.UndefOr[AuthorizerConfig] = js.native
  
  /**
    * The name of the domain configuration. This value must be unique to a region.
    */
  var domainConfigurationName: DomainConfigurationName = js.native
  
  /**
    * The name of the domain.
    */
  var domainName: js.UndefOr[DomainName] = js.native
  
  /**
    * The ARNs of the certificates that AWS IoT passes to the device during the TLS handshake. Currently you can specify only one certificate ARN. This value is not required for AWS-managed domains.
    */
  var serverCertificateArns: js.UndefOr[ServerCertificateArns] = js.native
  
  /**
    * The type of service delivered by the endpoint.  AWS IoT Core currently supports only the DATA service type. 
    */
  var serviceType: js.UndefOr[ServiceType] = js.native
  
  /**
    * Metadata which can be used to manage the domain configuration.  For URI Request parameters use format: ...key1=value1&amp;key2=value2... For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..." For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..." 
    */
  var tags: js.UndefOr[TagList] = js.native
  
  /**
    * The certificate used to validate the server certificate and prove domain name ownership. This certificate must be signed by a public certificate authority. This value is not required for AWS-managed domains.
    */
  var validationCertificateArn: js.UndefOr[AcmCertificateArn] = js.native
}
object CreateDomainConfigurationRequest {
  
  @scala.inline
  def apply(domainConfigurationName: DomainConfigurationName): CreateDomainConfigurationRequest = {
    val __obj = js.Dynamic.literal(domainConfigurationName = domainConfigurationName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainConfigurationRequest]
  }
  
  @scala.inline
  implicit class CreateDomainConfigurationRequestMutableBuilder[Self <: CreateDomainConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizerConfig(value: AuthorizerConfig): Self = StObject.set(x, "authorizerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizerConfigUndefined: Self = StObject.set(x, "authorizerConfig", js.undefined)
    
    @scala.inline
    def setDomainConfigurationName(value: DomainConfigurationName): Self = StObject.set(x, "domainConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    @scala.inline
    def setServerCertificateArns(value: ServerCertificateArns): Self = StObject.set(x, "serverCertificateArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCertificateArnsUndefined: Self = StObject.set(x, "serverCertificateArns", js.undefined)
    
    @scala.inline
    def setServerCertificateArnsVarargs(value: AcmCertificateArn*): Self = StObject.set(x, "serverCertificateArns", js.Array(value :_*))
    
    @scala.inline
    def setServiceType(value: ServiceType): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceTypeUndefined: Self = StObject.set(x, "serviceType", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setValidationCertificateArn(value: AcmCertificateArn): Self = StObject.set(x, "validationCertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidationCertificateArnUndefined: Self = StObject.set(x, "validationCertificateArn", js.undefined)
  }
}
