package typings.awsSdk.elbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Certificate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the certificate.
    */
  var CertificateArn: js.UndefOr[typings.awsSdk.elbv2Mod.CertificateArn] = js.native
  /**
    * Indicates whether the certificate is the default certificate. Do not set this value when specifying a certificate as an input. This value is not included in the output when describing a listener, but is included when describing listener certificates.
    */
  var IsDefault: js.UndefOr[Default] = js.native
}

object Certificate {
  @scala.inline
  def apply(CertificateArn: CertificateArn = null, IsDefault: js.UndefOr[Default] = js.undefined): Certificate = {
    val __obj = js.Dynamic.literal()
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn.asInstanceOf[js.Any])
    if (!js.isUndefined(IsDefault)) __obj.updateDynamic("IsDefault")(IsDefault.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certificate]
  }
}

