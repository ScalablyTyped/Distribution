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
  def apply(
    CertificateIdentifier: String,
    CertificatePem: String = null,
    CertificateWallet: CertificateWallet = null,
    Tags: TagList = null
  ): ImportCertificateMessage = {
    val __obj = js.Dynamic.literal(CertificateIdentifier = CertificateIdentifier.asInstanceOf[js.Any])
    if (CertificatePem != null) __obj.updateDynamic("CertificatePem")(CertificatePem.asInstanceOf[js.Any])
    if (CertificateWallet != null) __obj.updateDynamic("CertificateWallet")(CertificateWallet.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportCertificateMessage]
  }
}

