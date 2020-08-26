package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ImportCertificateMessage extends js.Object {
  /**
    * A customer-assigned name for the certificate. Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
    */
  var CertificateIdentifier: String = js.native
  /**
    * The contents of a .pem file, which contains an X.509 certificate.
    */
  var CertificatePem: js.UndefOr[String] = js.native
  /**
    * The location of an imported Oracle Wallet certificate for use with SSL.
    */
  var CertificateWallet: js.UndefOr[typings.awsSdk.dmsMod.CertificateWallet] = js.native
  /**
    * The tags associated with the certificate.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ImportCertificateMessage {
  @scala.inline
  def apply(CertificateIdentifier: String): ImportCertificateMessage = {
    val __obj = js.Dynamic.literal(CertificateIdentifier = CertificateIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportCertificateMessage]
  }
  @scala.inline
  implicit class ImportCertificateMessageOps[Self <: ImportCertificateMessage] (val x: Self) extends AnyVal {
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
    def setCertificateIdentifier(value: String): Self = this.set("CertificateIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setCertificatePem(value: String): Self = this.set("CertificatePem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificatePem: Self = this.set("CertificatePem", js.undefined)
    @scala.inline
    def setCertificateWallet(value: CertificateWallet): Self = this.set("CertificateWallet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateWallet: Self = this.set("CertificateWallet", js.undefined)
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("Tags", js.Array(value :_*))
    @scala.inline
    def setTags(value: TagList): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
  }
  
}

