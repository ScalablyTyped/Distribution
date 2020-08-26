package typings.awsSdk.docdbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Certificate extends js.Object {
  /**
    * The Amazon Resource Name (ARN) for the certificate. Example: arn:aws:rds:us-east-1::cert:rds-ca-2019 
    */
  var CertificateArn: js.UndefOr[String] = js.native
  /**
    * The unique key that identifies a certificate. Example: rds-ca-2019 
    */
  var CertificateIdentifier: js.UndefOr[String] = js.native
  /**
    * The type of the certificate. Example: CA 
    */
  var CertificateType: js.UndefOr[String] = js.native
  /**
    * The thumbprint of the certificate.
    */
  var Thumbprint: js.UndefOr[String] = js.native
  /**
    * The starting date-time from which the certificate is valid. Example: 2019-07-31T17:57:09Z 
    */
  var ValidFrom: js.UndefOr[TStamp] = js.native
  /**
    * The date-time after which the certificate is no longer valid. Example: 2024-07-31T17:57:09Z 
    */
  var ValidTill: js.UndefOr[TStamp] = js.native
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
    def setCertificateIdentifier(value: String): Self = this.set("CertificateIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateIdentifier: Self = this.set("CertificateIdentifier", js.undefined)
    @scala.inline
    def setCertificateType(value: String): Self = this.set("CertificateType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateType: Self = this.set("CertificateType", js.undefined)
    @scala.inline
    def setThumbprint(value: String): Self = this.set("Thumbprint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThumbprint: Self = this.set("Thumbprint", js.undefined)
    @scala.inline
    def setValidFrom(value: TStamp): Self = this.set("ValidFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidFrom: Self = this.set("ValidFrom", js.undefined)
    @scala.inline
    def setValidTill(value: TStamp): Self = this.set("ValidTill", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidTill: Self = this.set("ValidTill", js.undefined)
  }
  
}

