package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateKeysAndCertificateResponse extends js.Object {
  /**
    * The ARN of the certificate.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.native
  /**
    * The ID of the certificate. AWS IoT issues a default subject name for the certificate (for example, AWS IoT Certificate).
    */
  var certificateId: js.UndefOr[CertificateId] = js.native
  /**
    * The certificate data, in PEM format.
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.native
  /**
    * The generated key pair.
    */
  var keyPair: js.UndefOr[KeyPair] = js.native
}

object CreateKeysAndCertificateResponse {
  @scala.inline
  def apply(
    certificateArn: CertificateArn = null,
    certificateId: CertificateId = null,
    certificatePem: CertificatePem = null,
    keyPair: KeyPair = null
  ): CreateKeysAndCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    if (certificateId != null) __obj.updateDynamic("certificateId")(certificateId.asInstanceOf[js.Any])
    if (certificatePem != null) __obj.updateDynamic("certificatePem")(certificatePem.asInstanceOf[js.Any])
    if (keyPair != null) __obj.updateDynamic("keyPair")(keyPair.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateKeysAndCertificateResponse]
  }
}

