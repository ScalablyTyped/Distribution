package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDomainConfigurationRequest extends js.Object {
  
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
  implicit class CreateDomainConfigurationRequestOps[Self <: CreateDomainConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDomainConfigurationName(value: DomainConfigurationName): Self = this.set("domainConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizerConfig(value: AuthorizerConfig): Self = this.set("authorizerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthorizerConfig: Self = this.set("authorizerConfig", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    
    @scala.inline
    def setServerCertificateArnsVarargs(value: AcmCertificateArn*): Self = this.set("serverCertificateArns", js.Array(value :_*))
    
    @scala.inline
    def setServerCertificateArns(value: ServerCertificateArns): Self = this.set("serverCertificateArns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServerCertificateArns: Self = this.set("serverCertificateArns", js.undefined)
    
    @scala.inline
    def setServiceType(value: ServiceType): Self = this.set("serviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceType: Self = this.set("serviceType", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    
    @scala.inline
    def setValidationCertificateArn(value: AcmCertificateArn): Self = this.set("validationCertificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValidationCertificateArn: Self = this.set("validationCertificateArn", js.undefined)
  }
}
