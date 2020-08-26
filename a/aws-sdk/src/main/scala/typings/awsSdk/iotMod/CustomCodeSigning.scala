package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomCodeSigning extends js.Object {
  /**
    * The certificate chain.
    */
  var certificateChain: js.UndefOr[CodeSigningCertificateChain] = js.native
  /**
    * The hash algorithm used to code sign the file.
    */
  var hashAlgorithm: js.UndefOr[HashAlgorithm] = js.native
  /**
    * The signature for the file.
    */
  var signature: js.UndefOr[CodeSigningSignature] = js.native
  /**
    * The signature algorithm used to code sign the file.
    */
  var signatureAlgorithm: js.UndefOr[SignatureAlgorithm] = js.native
}

object CustomCodeSigning {
  @scala.inline
  def apply(): CustomCodeSigning = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomCodeSigning]
  }
  @scala.inline
  implicit class CustomCodeSigningOps[Self <: CustomCodeSigning] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCertificateChain(value: CodeSigningCertificateChain): Self = this.set("certificateChain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateChain: Self = this.set("certificateChain", js.undefined)
    @scala.inline
    def setHashAlgorithm(value: HashAlgorithm): Self = this.set("hashAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHashAlgorithm: Self = this.set("hashAlgorithm", js.undefined)
    @scala.inline
    def setSignature(value: CodeSigningSignature): Self = this.set("signature", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignature: Self = this.set("signature", js.undefined)
    @scala.inline
    def setSignatureAlgorithm(value: SignatureAlgorithm): Self = this.set("signatureAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignatureAlgorithm: Self = this.set("signatureAlgorithm", js.undefined)
  }
  
}

