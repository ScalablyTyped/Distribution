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
  def apply(
    certificateId: CertificateId,
    newAutoRegistrationStatus: AutoRegistrationStatus = null,
    newStatus: CACertificateStatus = null,
    registrationConfig: RegistrationConfig = null,
    removeAutoRegistration: js.UndefOr[RemoveAutoRegistration] = js.undefined
  ): UpdateCACertificateRequest = {
    val __obj = js.Dynamic.literal(certificateId = certificateId.asInstanceOf[js.Any])
    if (newAutoRegistrationStatus != null) __obj.updateDynamic("newAutoRegistrationStatus")(newAutoRegistrationStatus.asInstanceOf[js.Any])
    if (newStatus != null) __obj.updateDynamic("newStatus")(newStatus.asInstanceOf[js.Any])
    if (registrationConfig != null) __obj.updateDynamic("registrationConfig")(registrationConfig.asInstanceOf[js.Any])
    if (!js.isUndefined(removeAutoRegistration)) __obj.updateDynamic("removeAutoRegistration")(removeAutoRegistration.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCACertificateRequest]
  }
}

