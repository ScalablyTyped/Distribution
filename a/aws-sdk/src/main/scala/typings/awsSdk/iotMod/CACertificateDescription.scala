package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CACertificateDescription extends js.Object {
  /**
    * Whether the CA certificate configured for auto registration of device certificates. Valid values are "ENABLE" and "DISABLE"
    */
  var autoRegistrationStatus: js.UndefOr[AutoRegistrationStatus] = js.native
  /**
    * The CA certificate ARN.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.native
  /**
    * The CA certificate ID.
    */
  var certificateId: js.UndefOr[CertificateId] = js.native
  /**
    * The CA certificate data, in PEM format.
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.native
  /**
    * The date the CA certificate was created.
    */
  var creationDate: js.UndefOr[DateType] = js.native
  /**
    * The customer version of the CA certificate.
    */
  var customerVersion: js.UndefOr[CustomerVersion] = js.native
  /**
    * The generation ID of the CA certificate.
    */
  var generationId: js.UndefOr[GenerationId] = js.native
  /**
    * The date the CA certificate was last modified.
    */
  var lastModifiedDate: js.UndefOr[DateType] = js.native
  /**
    * The owner of the CA certificate.
    */
  var ownedBy: js.UndefOr[AwsAccountId] = js.native
  /**
    * The status of a CA certificate.
    */
  var status: js.UndefOr[CACertificateStatus] = js.native
  /**
    * When the CA certificate is valid.
    */
  var validity: js.UndefOr[CertificateValidity] = js.native
}

object CACertificateDescription {
  @scala.inline
  def apply(
    autoRegistrationStatus: AutoRegistrationStatus = null,
    certificateArn: CertificateArn = null,
    certificateId: CertificateId = null,
    certificatePem: CertificatePem = null,
    creationDate: DateType = null,
    customerVersion: Int | Double = null,
    generationId: GenerationId = null,
    lastModifiedDate: DateType = null,
    ownedBy: AwsAccountId = null,
    status: CACertificateStatus = null,
    validity: CertificateValidity = null
  ): CACertificateDescription = {
    val __obj = js.Dynamic.literal()
    if (autoRegistrationStatus != null) __obj.updateDynamic("autoRegistrationStatus")(autoRegistrationStatus.asInstanceOf[js.Any])
    if (certificateArn != null) __obj.updateDynamic("certificateArn")(certificateArn.asInstanceOf[js.Any])
    if (certificateId != null) __obj.updateDynamic("certificateId")(certificateId.asInstanceOf[js.Any])
    if (certificatePem != null) __obj.updateDynamic("certificatePem")(certificatePem.asInstanceOf[js.Any])
    if (creationDate != null) __obj.updateDynamic("creationDate")(creationDate.asInstanceOf[js.Any])
    if (customerVersion != null) __obj.updateDynamic("customerVersion")(customerVersion.asInstanceOf[js.Any])
    if (generationId != null) __obj.updateDynamic("generationId")(generationId.asInstanceOf[js.Any])
    if (lastModifiedDate != null) __obj.updateDynamic("lastModifiedDate")(lastModifiedDate.asInstanceOf[js.Any])
    if (ownedBy != null) __obj.updateDynamic("ownedBy")(ownedBy.asInstanceOf[js.Any])
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    if (validity != null) __obj.updateDynamic("validity")(validity.asInstanceOf[js.Any])
    __obj.asInstanceOf[CACertificateDescription]
  }
}

