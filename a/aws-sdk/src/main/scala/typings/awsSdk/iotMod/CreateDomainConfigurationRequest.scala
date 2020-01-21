package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * The type of service delivered by the endpoint.
    */
  var serviceType: js.UndefOr[ServiceType] = js.native
  /**
    * The certificate used to validate the server certificate and prove domain name ownership. This certificate must be signed by a public certificate authority. This value is not required for AWS-managed domains.
    */
  var validationCertificateArn: js.UndefOr[AcmCertificateArn] = js.native
}

object CreateDomainConfigurationRequest {
  @scala.inline
  def apply(
    domainConfigurationName: DomainConfigurationName,
    authorizerConfig: AuthorizerConfig = null,
    domainName: DomainName = null,
    serverCertificateArns: ServerCertificateArns = null,
    serviceType: ServiceType = null,
    validationCertificateArn: AcmCertificateArn = null
  ): CreateDomainConfigurationRequest = {
    val __obj = js.Dynamic.literal(domainConfigurationName = domainConfigurationName.asInstanceOf[js.Any])
    if (authorizerConfig != null) __obj.updateDynamic("authorizerConfig")(authorizerConfig.asInstanceOf[js.Any])
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (serverCertificateArns != null) __obj.updateDynamic("serverCertificateArns")(serverCertificateArns.asInstanceOf[js.Any])
    if (serviceType != null) __obj.updateDynamic("serviceType")(serviceType.asInstanceOf[js.Any])
    if (validationCertificateArn != null) __obj.updateDynamic("validationCertificateArn")(validationCertificateArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDomainConfigurationRequest]
  }
}

