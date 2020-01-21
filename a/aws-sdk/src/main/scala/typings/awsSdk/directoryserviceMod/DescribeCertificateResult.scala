package typings.awsSdk.directoryserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeCertificateResult extends js.Object {
  /**
    * Information about the certificate, including registered date time, certificate state, the reason for the state, expiration date time, and certificate common name.
    */
  var Certificate: js.UndefOr[typings.awsSdk.directoryserviceMod.Certificate] = js.native
}

object DescribeCertificateResult {
  @scala.inline
  def apply(Certificate: Certificate = null): DescribeCertificateResult = {
    val __obj = js.Dynamic.literal()
    if (Certificate != null) __obj.updateDynamic("Certificate")(Certificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCertificateResult]
  }
}

