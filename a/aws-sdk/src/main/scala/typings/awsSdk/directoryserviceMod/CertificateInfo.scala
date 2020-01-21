package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateInfo extends js.Object {
  /**
    * The identifier of the certificate.
    */
  var CertificateId: js.UndefOr[typings.awsSdk.directoryserviceMod.CertificateId] = js.native
  /**
    * The common name for the certificate.
    */
  var CommonName: js.UndefOr[CertificateCN] = js.native
  /**
    * The state of the certificate.
    */
  var State: js.UndefOr[CertificateState] = js.native
}

object CertificateInfo {
  @scala.inline
  def apply(
    CertificateId: CertificateId = null,
    CommonName: CertificateCN = null,
    State: CertificateState = null
  ): CertificateInfo = {
    val __obj = js.Dynamic.literal()
    if (CertificateId != null) __obj.updateDynamic("CertificateId")(CertificateId.asInstanceOf[js.Any])
    if (CommonName != null) __obj.updateDynamic("CommonName")(CommonName.asInstanceOf[js.Any])
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateInfo]
  }
}

