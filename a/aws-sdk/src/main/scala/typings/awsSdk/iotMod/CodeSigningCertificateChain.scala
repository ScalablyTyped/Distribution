package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CodeSigningCertificateChain extends js.Object {
  /**
    * The name of the certificate.
    */
  var certificateName: js.UndefOr[CertificateName] = js.native
  /**
    * A base64 encoded binary representation of the code signing certificate chain.
    */
  var inlineDocument: js.UndefOr[InlineDocument] = js.native
}

object CodeSigningCertificateChain {
  @scala.inline
  def apply(certificateName: CertificateName = null, inlineDocument: InlineDocument = null): CodeSigningCertificateChain = {
    val __obj = js.Dynamic.literal()
    if (certificateName != null) __obj.updateDynamic("certificateName")(certificateName.asInstanceOf[js.Any])
    if (inlineDocument != null) __obj.updateDynamic("inlineDocument")(inlineDocument.asInstanceOf[js.Any])
    __obj.asInstanceOf[CodeSigningCertificateChain]
  }
}

