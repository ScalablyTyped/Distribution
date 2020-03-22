package typings.awsSdk.dmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Certificate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the certificate.
    */
  var CertificateArn: js.UndefOr[String] = js.native
  /**
    * The date that the certificate was created.
    */
  var CertificateCreationDate: js.UndefOr[TStamp] = js.native
  /**
    * A customer-assigned name for the certificate. Identifiers must begin with a letter and must contain only ASCII letters, digits, and hyphens. They can't end with a hyphen or contain two consecutive hyphens.
    */
  var CertificateIdentifier: js.UndefOr[String] = js.native
  /**
    * The owner of the certificate.
    */
  var CertificateOwner: js.UndefOr[String] = js.native
  /**
    * The contents of a .pem file, which contains an X.509 certificate.
    */
  var CertificatePem: js.UndefOr[String] = js.native
  /**
    * The location of an imported Oracle Wallet certificate for use with SSL.
    */
  var CertificateWallet: js.UndefOr[typings.awsSdk.dmsMod.CertificateWallet] = js.native
  /**
    * The key length of the cryptographic algorithm being used.
    */
  var KeyLength: js.UndefOr[IntegerOptional] = js.native
  /**
    * The signing algorithm for the certificate.
    */
  var SigningAlgorithm: js.UndefOr[String] = js.native
  /**
    * The beginning date that the certificate is valid.
    */
  var ValidFromDate: js.UndefOr[TStamp] = js.native
  /**
    * The final date that the certificate is valid.
    */
  var ValidToDate: js.UndefOr[TStamp] = js.native
}

object Certificate {
  @scala.inline
  def apply(
    CertificateArn: String = null,
    CertificateCreationDate: TStamp = null,
    CertificateIdentifier: String = null,
    CertificateOwner: String = null,
    CertificatePem: String = null,
    CertificateWallet: CertificateWallet = null,
    KeyLength: Int | Double = null,
    SigningAlgorithm: String = null,
    ValidFromDate: TStamp = null,
    ValidToDate: TStamp = null
  ): Certificate = {
    val __obj = js.Dynamic.literal()
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn.asInstanceOf[js.Any])
    if (CertificateCreationDate != null) __obj.updateDynamic("CertificateCreationDate")(CertificateCreationDate.asInstanceOf[js.Any])
    if (CertificateIdentifier != null) __obj.updateDynamic("CertificateIdentifier")(CertificateIdentifier.asInstanceOf[js.Any])
    if (CertificateOwner != null) __obj.updateDynamic("CertificateOwner")(CertificateOwner.asInstanceOf[js.Any])
    if (CertificatePem != null) __obj.updateDynamic("CertificatePem")(CertificatePem.asInstanceOf[js.Any])
    if (CertificateWallet != null) __obj.updateDynamic("CertificateWallet")(CertificateWallet.asInstanceOf[js.Any])
    if (KeyLength != null) __obj.updateDynamic("KeyLength")(KeyLength.asInstanceOf[js.Any])
    if (SigningAlgorithm != null) __obj.updateDynamic("SigningAlgorithm")(SigningAlgorithm.asInstanceOf[js.Any])
    if (ValidFromDate != null) __obj.updateDynamic("ValidFromDate")(ValidFromDate.asInstanceOf[js.Any])
    if (ValidToDate != null) __obj.updateDynamic("ValidToDate")(ValidToDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certificate]
  }
}

