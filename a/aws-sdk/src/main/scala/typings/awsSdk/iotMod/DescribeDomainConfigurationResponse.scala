package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeDomainConfigurationResponse extends js.Object {
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
  implicit class DescribeDomainConfigurationResponseOps[Self <: DescribeDomainConfigurationResponse] (val x: Self) extends AnyVal {
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
    def setAuthorizerConfig(value: AuthorizerConfig): Self = this.set("authorizerConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthorizerConfig: Self = this.set("authorizerConfig", js.undefined)
    @scala.inline
    def setDomainConfigurationArn(value: DomainConfigurationArn): Self = this.set("domainConfigurationArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainConfigurationArn: Self = this.set("domainConfigurationArn", js.undefined)
    @scala.inline
    def setDomainConfigurationName(value: ReservedDomainConfigurationName): Self = this.set("domainConfigurationName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainConfigurationName: Self = this.set("domainConfigurationName", js.undefined)
    @scala.inline
    def setDomainConfigurationStatus(value: DomainConfigurationStatus): Self = this.set("domainConfigurationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainConfigurationStatus: Self = this.set("domainConfigurationStatus", js.undefined)
    @scala.inline
    def setDomainName(value: DomainName): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    @scala.inline
    def setDomainType(value: DomainType): Self = this.set("domainType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainType: Self = this.set("domainType", js.undefined)
    @scala.inline
    def setServerCertificatesVarargs(value: ServerCertificateSummary*): Self = this.set("serverCertificates", js.Array(value :_*))
    @scala.inline
    def setServerCertificates(value: ServerCertificates): Self = this.set("serverCertificates", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServerCertificates: Self = this.set("serverCertificates", js.undefined)
    @scala.inline
    def setServiceType(value: ServiceType): Self = this.set("serviceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceType: Self = this.set("serviceType", js.undefined)
  }
  
}

