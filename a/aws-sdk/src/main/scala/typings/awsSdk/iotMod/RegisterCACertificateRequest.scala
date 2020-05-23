package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterCACertificateRequest extends js.Object {
  /**
    * Allows this CA certificate to be used for auto registration of device certificates.
    */
  var allowAutoRegistration: js.UndefOr[AllowAutoRegistration] = js.native
  /**
    * The CA certificate.
    */
  var caCertificate: CertificatePem = js.native
  /**
    * Information about the registration configuration.
    */
  var registrationConfig: js.UndefOr[RegistrationConfig] = js.native
  /**
    * A boolean value that specifies if the CA certificate is set to active.
    */
  var setAsActive: js.UndefOr[SetAsActive] = js.native
  /**
    * Metadata which can be used to manage the CA certificate.  For URI Request parameters use format: ...key1=value1&amp;key2=value2... For the CLI command-line parameter use format: &amp;&amp;tags "key1=value1&amp;key2=value2..." For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..." 
    */
  var tags: js.UndefOr[TagList] = js.native
  /**
    * The private key verification certificate.
    */
  var verificationCertificate: CertificatePem = js.native
}

object RegisterCACertificateRequest {
  @scala.inline
  def apply(
    caCertificate: CertificatePem,
    verificationCertificate: CertificatePem,
    allowAutoRegistration: js.UndefOr[AllowAutoRegistration] = js.undefined,
    registrationConfig: RegistrationConfig = null,
    setAsActive: js.UndefOr[SetAsActive] = js.undefined,
    tags: TagList = null
  ): RegisterCACertificateRequest = {
    val __obj = js.Dynamic.literal(caCertificate = caCertificate.asInstanceOf[js.Any], verificationCertificate = verificationCertificate.asInstanceOf[js.Any])
    if (!js.isUndefined(allowAutoRegistration)) __obj.updateDynamic("allowAutoRegistration")(allowAutoRegistration.get.asInstanceOf[js.Any])
    if (registrationConfig != null) __obj.updateDynamic("registrationConfig")(registrationConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(setAsActive)) __obj.updateDynamic("setAsActive")(setAsActive.get.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCACertificateRequest]
  }
}

