package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificateDescription extends StObject {
  
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
  implicit class CertificateDescriptionMutableBuilder[Self <: CertificateDescription] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCaCertificateId(value: CertificateId): Self = StObject.set(x, "caCertificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaCertificateIdUndefined: Self = StObject.set(x, "caCertificateId", js.undefined)
    
    @scala.inline
    def setCertificateArn(value: CertificateArn): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    @scala.inline
    def setCertificateId(value: CertificateId): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateIdUndefined: Self = StObject.set(x, "certificateId", js.undefined)
    
    @scala.inline
    def setCertificateMode(value: CertificateMode): Self = StObject.set(x, "certificateMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificateModeUndefined: Self = StObject.set(x, "certificateMode", js.undefined)
    
    @scala.inline
    def setCertificatePem(value: CertificatePem): Self = StObject.set(x, "certificatePem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatePemUndefined: Self = StObject.set(x, "certificatePem", js.undefined)
    
    @scala.inline
    def setCreationDate(value: DateType): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    @scala.inline
    def setCustomerVersion(value: CustomerVersion): Self = StObject.set(x, "customerVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomerVersionUndefined: Self = StObject.set(x, "customerVersion", js.undefined)
    
    @scala.inline
    def setGenerationId(value: GenerationId): Self = StObject.set(x, "generationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGenerationIdUndefined: Self = StObject.set(x, "generationId", js.undefined)
    
    @scala.inline
    def setLastModifiedDate(value: DateType): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    @scala.inline
    def setOwnedBy(value: AwsAccountId): Self = StObject.set(x, "ownedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnedByUndefined: Self = StObject.set(x, "ownedBy", js.undefined)
    
    @scala.inline
    def setPreviousOwnedBy(value: AwsAccountId): Self = StObject.set(x, "previousOwnedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviousOwnedByUndefined: Self = StObject.set(x, "previousOwnedBy", js.undefined)
    
    @scala.inline
    def setStatus(value: CertificateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    @scala.inline
    def setTransferData(value: TransferData): Self = StObject.set(x, "transferData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransferDataUndefined: Self = StObject.set(x, "transferData", js.undefined)
    
    @scala.inline
    def setValidity(value: CertificateValidity): Self = StObject.set(x, "validity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidityUndefined: Self = StObject.set(x, "validity", js.undefined)
  }
}
