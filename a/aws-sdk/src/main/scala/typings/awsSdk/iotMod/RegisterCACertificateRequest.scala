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
  def apply(caCertificate: CertificatePem, verificationCertificate: CertificatePem): RegisterCACertificateRequest = {
    val __obj = js.Dynamic.literal(caCertificate = caCertificate.asInstanceOf[js.Any], verificationCertificate = verificationCertificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCACertificateRequest]
  }
  @scala.inline
  implicit class RegisterCACertificateRequestOps[Self <: RegisterCACertificateRequest] (val x: Self) extends AnyVal {
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
    def setCaCertificate(value: CertificatePem): Self = this.set("caCertificate", value.asInstanceOf[js.Any])
    @scala.inline
    def setVerificationCertificate(value: CertificatePem): Self = this.set("verificationCertificate", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllowAutoRegistration(value: AllowAutoRegistration): Self = this.set("allowAutoRegistration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowAutoRegistration: Self = this.set("allowAutoRegistration", js.undefined)
    @scala.inline
    def setRegistrationConfig(value: RegistrationConfig): Self = this.set("registrationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistrationConfig: Self = this.set("registrationConfig", js.undefined)
    @scala.inline
    def setSetAsActive(value: SetAsActive): Self = this.set("setAsActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSetAsActive: Self = this.set("setAsActive", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

