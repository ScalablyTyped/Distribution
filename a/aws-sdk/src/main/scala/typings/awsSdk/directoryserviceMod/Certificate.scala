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
  def apply(): Certificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Certificate]
  }
  @scala.inline
  implicit class CertificateOps[Self <: Certificate] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCertificateId(value: CertificateId): Self = this.set("CertificateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateId: Self = this.set("CertificateId", js.undefined)
    @scala.inline
    def setCommonName(value: CertificateCN): Self = this.set("CommonName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommonName: Self = this.set("CommonName", js.undefined)
    @scala.inline
    def setExpiryDateTime(value: CertificateExpiryDateTime): Self = this.set("ExpiryDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpiryDateTime: Self = this.set("ExpiryDateTime", js.undefined)
    @scala.inline
    def setRegisteredDateTime(value: CertificateRegisteredDateTime): Self = this.set("RegisteredDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRegisteredDateTime: Self = this.set("RegisteredDateTime", js.undefined)
    @scala.inline
    def setState(value: CertificateState): Self = this.set("State", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    @scala.inline
    def setStateReason(value: CertificateStateReason): Self = this.set("StateReason", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStateReason: Self = this.set("StateReason", js.undefined)
  }
  
}

