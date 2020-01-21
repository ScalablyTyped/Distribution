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
  def apply(
    CertificateArn: String = null,
    CertificateIdentifier: String = null,
    CertificateType: String = null,
    Thumbprint: String = null,
    ValidFrom: TStamp = null,
    ValidTill: TStamp = null
  ): Certificate = {
    val __obj = js.Dynamic.literal()
    if (CertificateArn != null) __obj.updateDynamic("CertificateArn")(CertificateArn.asInstanceOf[js.Any])
    if (CertificateIdentifier != null) __obj.updateDynamic("CertificateIdentifier")(CertificateIdentifier.asInstanceOf[js.Any])
    if (CertificateType != null) __obj.updateDynamic("CertificateType")(CertificateType.asInstanceOf[js.Any])
    if (Thumbprint != null) __obj.updateDynamic("Thumbprint")(Thumbprint.asInstanceOf[js.Any])
    if (ValidFrom != null) __obj.updateDynamic("ValidFrom")(ValidFrom.asInstanceOf[js.Any])
    if (ValidTill != null) __obj.updateDynamic("ValidTill")(ValidTill.asInstanceOf[js.Any])
    __obj.asInstanceOf[Certificate]
  }
}

