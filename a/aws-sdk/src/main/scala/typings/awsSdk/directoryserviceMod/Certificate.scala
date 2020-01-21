package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Certificate extends js.Object {
  /**
    * The identifier of the certificate.
    */
  var CertificateId: js.UndefOr[typings.awsSdk.directoryserviceMod.CertificateId] = js.native
  /**
    * The common name for the certificate.
    */
  var CommonName: js.UndefOr[CertificateCN] = js.native
  /**
    * The date and time when the certificate will expire.
    */
  var ExpiryDateTime: js.UndefOr[CertificateExpiryDateTime] = js.native
  /**
    * The date and time that the certificate was registered.
    */
  var RegisteredDateTime: js.UndefOr[CertificateRegisteredDateTime] = js.native
  /**
    * The state of the certificate.
    */
  var State: js.UndefOr[CertificateState] = js.native
  /**
    * Describes a state change for the certificate.
    */
  var StateReason: js.UndefOr[CertificateStateReason] = js.native
}

object Certificate {
  @scala.inline
  def apply(
    CertificateId: CertificateId = null,
    CommonName: CertificateCN = null,
    ExpiryDateTime: CertificateExpiryDateTime = null,
    RegisteredDateTime: CertificateRegisteredDateTime = null,
    State: CertificateState = null,
    StateReason: CertificateStateReason = null
  ): Certificate = {
    val __obj = js.Dynamic.literal()
    if (CertificateId != null) __obj.updateDynamic("CertificateId")(CertificateId.asInstanceOf[js.Any])
    if (CommonName != null) __obj.updateDynamic("CommonName")(CommonName.asInstanceOf[js.Any])
    if (ExpiryDateTime != null) __obj.updateDynamic("ExpiryDateTime")(ExpiryDateTime.asInstanceOf[js.Any])
    if (RegisteredDateTime != null) __obj.updateDynamic("RegisteredDateTime")(RegisteredDateTime.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (StateReason != null) __obj.updateDynamic("StateReason")(StateReason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certificate]
  }
}

