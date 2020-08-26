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
  def apply(): Certificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Certificate]
  }
  @scala.inline
  implicit class CertificateOps[Self <: Certificate] (val x: Self) extends AnyVal {
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
    def setCertificateArn(value: String): Self = this.set("CertificateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateArn: Self = this.set("CertificateArn", js.undefined)
    @scala.inline
    def setCertificateCreationDate(value: TStamp): Self = this.set("CertificateCreationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateCreationDate: Self = this.set("CertificateCreationDate", js.undefined)
    @scala.inline
    def setCertificateIdentifier(value: String): Self = this.set("CertificateIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateIdentifier: Self = this.set("CertificateIdentifier", js.undefined)
    @scala.inline
    def setCertificateOwner(value: String): Self = this.set("CertificateOwner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateOwner: Self = this.set("CertificateOwner", js.undefined)
    @scala.inline
    def setCertificatePem(value: String): Self = this.set("CertificatePem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificatePem: Self = this.set("CertificatePem", js.undefined)
    @scala.inline
    def setCertificateWallet(value: CertificateWallet): Self = this.set("CertificateWallet", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateWallet: Self = this.set("CertificateWallet", js.undefined)
    @scala.inline
    def setKeyLength(value: IntegerOptional): Self = this.set("KeyLength", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyLength: Self = this.set("KeyLength", js.undefined)
    @scala.inline
    def setSigningAlgorithm(value: String): Self = this.set("SigningAlgorithm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSigningAlgorithm: Self = this.set("SigningAlgorithm", js.undefined)
    @scala.inline
    def setValidFromDate(value: TStamp): Self = this.set("ValidFromDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidFromDate: Self = this.set("ValidFromDate", js.undefined)
    @scala.inline
    def setValidToDate(value: TStamp): Self = this.set("ValidToDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidToDate: Self = this.set("ValidToDate", js.undefined)
  }
  
}

