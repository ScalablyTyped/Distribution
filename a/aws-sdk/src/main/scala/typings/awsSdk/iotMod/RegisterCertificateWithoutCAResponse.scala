package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterCertificateWithoutCAResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the registered certificate.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.native
  /**
    * The ID of the registered certificate. (The last part of the certificate ARN contains the certificate ID.
    */
  var certificateId: js.UndefOr[CertificateId] = js.native
}

object RegisterCertificateWithoutCAResponse {
  @scala.inline
  def apply(certificateArn: CertificateArn = null, certificateId: CertificateId = null): RegisterCertificateWithoutCAResponse = {
    val __obj = js.Dynamic.literal()
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    if (certificateId != null) __obj.updateDynamic("certificateId")(certificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCertificateWithoutCAResponse]
  }
}

