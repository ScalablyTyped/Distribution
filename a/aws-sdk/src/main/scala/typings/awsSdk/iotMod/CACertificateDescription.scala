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
  def apply(): CACertificateDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CACertificateDescription]
  }
  @scala.inline
  implicit class CACertificateDescriptionOps[Self <: CACertificateDescription] (val x: Self) extends AnyVal {
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
    def setAutoRegistrationStatus(value: AutoRegistrationStatus): Self = this.set("autoRegistrationStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoRegistrationStatus: Self = this.set("autoRegistrationStatus", js.undefined)
    @scala.inline
    def setCertificateArn(value: CertificateArn): Self = this.set("certificateArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateArn: Self = this.set("certificateArn", js.undefined)
    @scala.inline
    def setCertificateId(value: CertificateId): Self = this.set("certificateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateId: Self = this.set("certificateId", js.undefined)
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
    def setStatus(value: CACertificateStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setValidity(value: CertificateValidity): Self = this.set("validity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValidity: Self = this.set("validity", js.undefined)
  }
  
}

