package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeDomainConfigurationResponse extends StObject {
  
  /**
    * An object that specifies the authorization service for a domain.
    */
  var authorizerConfig: js.UndefOr[AuthorizerConfig] = js.native
  
  /**
    * The ARN of the domain configuration.
    */
  var domainConfigurationArn: js.UndefOr[DomainConfigurationArn] = js.native
  
  /**
    * The name of the domain configuration.
    */
  var domainConfigurationName: js.UndefOr[ReservedDomainConfigurationName] = js.native
  
  /**
    * A Boolean value that specifies the current state of the domain configuration.
    */
  var domainConfigurationStatus: js.UndefOr[DomainConfigurationStatus] = js.native
  
  /**
    * The name of the domain.
    */
  var domainName: js.UndefOr[DomainName] = js.native
  
  /**
    * The type of the domain.
    */
  var domainType: js.UndefOr[DomainType] = js.native
  
  /**
    * The date and time the domain configuration's status was last changed.
    */
  var lastStatusChangeDate: js.UndefOr[DateType] = js.native
  
  /**
    * A list containing summary information about the server certificate included in the domain configuration.
    */
  var serverCertificates: js.UndefOr[ServerCertificates] = js.native
  
  /**
    * The type of service delivered by the endpoint.
    */
  var serviceType: js.UndefOr[ServiceType] = js.native
}
object DescribeDomainConfigurationResponse {
  
  @scala.inline
  def apply(): DescribeDomainConfigurationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDomainConfigurationResponse]
  }
  
  @scala.inline
  implicit class DescribeDomainConfigurationResponseMutableBuilder[Self <: DescribeDomainConfigurationResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthorizerConfig(value: AuthorizerConfig): Self = StObject.set(x, "authorizerConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthorizerConfigUndefined: Self = StObject.set(x, "authorizerConfig", js.undefined)
    
    @scala.inline
    def setDomainConfigurationArn(value: DomainConfigurationArn): Self = StObject.set(x, "domainConfigurationArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainConfigurationArnUndefined: Self = StObject.set(x, "domainConfigurationArn", js.undefined)
    
    @scala.inline
    def setDomainConfigurationName(value: ReservedDomainConfigurationName): Self = StObject.set(x, "domainConfigurationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainConfigurationNameUndefined: Self = StObject.set(x, "domainConfigurationName", js.undefined)
    
    @scala.inline
    def setDomainConfigurationStatus(value: DomainConfigurationStatus): Self = StObject.set(x, "domainConfigurationStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainConfigurationStatusUndefined: Self = StObject.set(x, "domainConfigurationStatus", js.undefined)
    
    @scala.inline
    def setDomainName(value: DomainName): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
    
    @scala.inline
    def setDomainType(value: DomainType): Self = StObject.set(x, "domainType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomainTypeUndefined: Self = StObject.set(x, "domainType", js.undefined)
    
    @scala.inline
    def setLastStatusChangeDate(value: DateType): Self = StObject.set(x, "lastStatusChangeDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastStatusChangeDateUndefined: Self = StObject.set(x, "lastStatusChangeDate", js.undefined)
    
    @scala.inline
    def setServerCertificates(value: ServerCertificates): Self = StObject.set(x, "serverCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServerCertificatesUndefined: Self = StObject.set(x, "serverCertificates", js.undefined)
    
    @scala.inline
    def setServerCertificatesVarargs(value: ServerCertificateSummary*): Self = StObject.set(x, "serverCertificates", js.Array(value :_*))
    
    @scala.inline
    def setServiceType(value: ServiceType): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceTypeUndefined: Self = StObject.set(x, "serviceType", js.undefined)
  }
}
