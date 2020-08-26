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
    * The mode of the certificate.
    */
  var certificateMode: js.UndefOr[CertificateMode] = js.native
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
  def apply(): CertificateDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateDescription]
  }
  @scala.inline
  implicit class CertificateDescriptionOps[Self <: CertificateDescription] (val x: Self) extends AnyVal {
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
    def setCaCertificateId(value: CertificateId): Self = this.set("caCertificateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCaCertificateId: Self = this.set("caCertificateId", js.undefined)
    @scala.inline
    def setCertificateArn(value: CertificateArn): Self = this.set("certificateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateArn: Self = this.set("certificateArn", js.undefined)
    @scala.inline
    def setCertificateId(value: CertificateId): Self = this.set("certificateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateId: Self = this.set("certificateId", js.undefined)
    @scala.inline
    def setCertificateMode(value: CertificateMode): Self = this.set("certificateMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateMode: Self = this.set("certificateMode", js.undefined)
    @scala.inline
    def setCertificatePem(value: CertificatePem): Self = this.set("certificatePem", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificatePem: Self = this.set("certificatePem", js.undefined)
    @scala.inline
    def setCreationDate(value: DateType): Self = this.set("creationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreationDate: Self = this.set("creationDate", js.undefined)
    @scala.inline
    def setCustomerVersion(value: CustomerVersion): Self = this.set("customerVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCustomerVersion: Self = this.set("customerVersion", js.undefined)
    @scala.inline
    def setGenerationId(value: GenerationId): Self = this.set("generationId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGenerationId: Self = this.set("generationId", js.undefined)
    @scala.inline
    def setLastModifiedDate(value: DateType): Self = this.set("lastModifiedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLastModifiedDate: Self = this.set("lastModifiedDate", js.undefined)
    @scala.inline
    def setOwnedBy(value: AwsAccountId): Self = this.set("ownedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwnedBy: Self = this.set("ownedBy", js.undefined)
    @scala.inline
    def setPreviousOwnedBy(value: AwsAccountId): Self = this.set("previousOwnedBy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreviousOwnedBy: Self = this.set("previousOwnedBy", js.undefined)
    @scala.inline
    def setStatus(value: CertificateStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setTransferData(value: TransferData): Self = this.set("transferData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransferData: Self = this.set("transferData", js.undefined)
    @scala.inline
    def setValidity(value: CertificateValidity): Self = this.set("validity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidity: Self = this.set("validity", js.undefined)
  }
  
}

