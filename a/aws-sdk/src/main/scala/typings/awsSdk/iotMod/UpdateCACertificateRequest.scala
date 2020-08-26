package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCACertificateRequest extends js.Object {
  /**
    * The CA certificate identifier.
    */
  var certificateId: CertificateId = js.native
  /**
    * The new value for the auto registration status. Valid values are: "ENABLE" or "DISABLE".
    */
  var newAutoRegistrationStatus: js.UndefOr[AutoRegistrationStatus] = js.native
  /**
    * The updated status of the CA certificate.  Note: The status value REGISTER_INACTIVE is deprecated and should not be used.
    */
  var newStatus: js.UndefOr[CACertificateStatus] = js.native
  /**
    * Information about the registration configuration.
    */
  var registrationConfig: js.UndefOr[RegistrationConfig] = js.native
  /**
    * If true, removes auto registration.
    */
  var removeAutoRegistration: js.UndefOr[RemoveAutoRegistration] = js.native
}

object UpdateCACertificateRequest {
  @scala.inline
  def apply(certificateId: CertificateId): UpdateCACertificateRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCACertificateRequest]
  }
  @scala.inline
  implicit class UpdateCACertificateRequestOps[Self <: UpdateCACertificateRequest] (val x: Self) extends AnyVal {
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
    def setCertificateId(value: CertificateId): Self = this.set("certificateId", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewAutoRegistrationStatus(value: AutoRegistrationStatus): Self = this.set("newAutoRegistrationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewAutoRegistrationStatus: Self = this.set("newAutoRegistrationStatus", js.undefined)
    @scala.inline
    def setNewStatus(value: CACertificateStatus): Self = this.set("newStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewStatus: Self = this.set("newStatus", js.undefined)
    @scala.inline
    def setRegistrationConfig(value: RegistrationConfig): Self = this.set("registrationConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegistrationConfig: Self = this.set("registrationConfig", js.undefined)
    @scala.inline
    def setRemoveAutoRegistration(value: RemoveAutoRegistration): Self = this.set("removeAutoRegistration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRemoveAutoRegistration: Self = this.set("removeAutoRegistration", js.undefined)
  }
  
}

