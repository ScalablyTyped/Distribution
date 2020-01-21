package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RegisterCertificateResponse extends js.Object {
  /**
    * The certificate ARN.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.native
  /**
    * The certificate identifier.
    */
  var certificateId: js.UndefOr[CertificateId] = js.native
}

object RegisterCertificateResponse {
  @scala.inline
  def apply(certificateArn: CertificateArn = null, certificateId: CertificateId = null): RegisterCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    if (certificateId != null) __obj.updateDynamic("certificateId")(certificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegisterCertificateResponse]
  }
}

