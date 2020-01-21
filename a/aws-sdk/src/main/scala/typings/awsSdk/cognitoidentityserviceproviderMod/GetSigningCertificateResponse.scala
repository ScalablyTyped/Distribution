package typings.awsSdk.cognitoidentityserviceproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetSigningCertificateResponse extends js.Object {
  /**
    * The signing certificate.
    */
  var Certificate: js.UndefOr[StringType] = js.native
}

object GetSigningCertificateResponse {
  @scala.inline
  def apply(Certificate: StringType = null): GetSigningCertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (Certificate != null) __obj.updateDynamic("Certificate")(Certificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSigningCertificateResponse]
  }
}

