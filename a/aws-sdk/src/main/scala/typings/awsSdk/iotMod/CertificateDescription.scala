package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CertificateDescription extends js.Object {
  /**
    * The certificate ID of the CA certificate used to sign this certificate.
    */
  var caCertificateId: js.UndefOr[CertificateId] = js.native
  /**
    * The ARN of the certificate.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.native
  /**
    * The ID of the certificate.
    */
  var certificateId: js.UndefOr[CertificateId] = js.native
  /**
    * The certificate data, in PEM format.
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.native
  /**
    * The date and time the certificate was created.
    */
  var creationDate: js.UndefOr[DateType] = js.native
  /**
    * The customer version of the certificate.
    */
  var customerVersion: js.UndefOr[CustomerVersion] = js.native
  /**
    * The generation ID of the certificate.
    */
  var generationId: js.UndefOr[GenerationId] = js.native
  /**
    * The date and time the certificate was last modified.
    */
  var lastModifiedDate: js.UndefOr[DateType] = js.native
  /**
    * The ID of the AWS account that owns the certificate.
    */
  var ownedBy: js.UndefOr[AwsAccountId] = js.native
  /**
    * The ID of the AWS account of the previous owner of the certificate.
    */
  var previousOwnedBy: js.UndefOr[AwsAccountId] = js.native
  /**
    * The status of the certificate.
    */
  var status: js.UndefOr[CertificateStatus] = js.native
  /**
    * The transfer data.
    */
  var transferData: js.UndefOr[TransferData] = js.native
  /**
    * When the certificate is valid.
    */
  var validity: js.UndefOr[CertificateValidity] = js.native
}

object CertificateDescription {
  @scala.inline
  def apply(
    caCertificateId: CertificateId = null,
    certificateArn: CertificateArn = null,
    certificateId: CertificateId = null,
    certificatePem: CertificatePem = null,
    creationDate: DateType = null,
    customerVersion: Int | Double = null,
    generationId: GenerationId = null,
    lastModifiedDate: DateType = null,
    ownedBy: AwsAccountId = null,
    previousOwnedBy: AwsAccountId = null,
    status: CertificateStatus = null,
    transferData: TransferData = null,
    validity: CertificateValidity = null
  ): CertificateDescription = {
    val __obj = js.Dynamic.literal()
    if (caCertificateId != null) __obj.updateDynamic("caCertificateId")(caCertificateId.asInstanceOf[js.Any])
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    if (certificateId != null) __obj.updateDynamic("certificateId")(certificateId.asInstanceOf[js.Any])
    if (certificatePem != null) __obj.updateDynamic("certificatePem")(certificatePem.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (customerVersion != null) __obj.updateDynamic("customerVersion")(customerVersion.asInstanceOf[js.Any])
    if (generationId != null) __obj.updateDynamic("generationId")(generationId.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    if (ownedBy != null) __obj.updateDynamic("ownedBy")(ownedBy.asInstanceOf[js.Any])
    if (previousOwnedBy != null) __obj.updateDynamic("previousOwnedBy")(previousOwnedBy.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (transferData != null) __obj.updateDynamic("transferData")(transferData.asInstanceOf[js.Any])
    if (validity != null) __obj.updateDynamic("validity")(validity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CertificateDescription]
  }
}

