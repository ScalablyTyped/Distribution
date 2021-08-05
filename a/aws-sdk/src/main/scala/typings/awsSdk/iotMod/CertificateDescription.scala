package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateDescription extends StObject {
  
  /**
    * The certificate ID of the CA certificate used to sign this certificate.
    */
  var caCertificateId: js.UndefOr[CertificateId] = js.undefined
  
  /**
    * The ARN of the certificate.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.undefined
  
  /**
    * The ID of the certificate.
    */
  var certificateId: js.UndefOr[CertificateId] = js.undefined
  
  /**
    * The mode of the certificate.
    */
  var certificateMode: js.UndefOr[CertificateMode] = js.undefined
  
  /**
    * The certificate data, in PEM format.
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.undefined
  
  /**
    * The date and time the certificate was created.
    */
  var creationDate: js.UndefOr[DateType] = js.undefined
  
  /**
    * The customer version of the certificate.
    */
  var customerVersion: js.UndefOr[CustomerVersion] = js.undefined
  
  /**
    * The generation ID of the certificate.
    */
  var generationId: js.UndefOr[GenerationId] = js.undefined
  
  /**
    * The date and time the certificate was last modified.
    */
  var lastModifiedDate: js.UndefOr[DateType] = js.undefined
  
  /**
    * The ID of the AWS account that owns the certificate.
    */
  var ownedBy: js.UndefOr[AwsAccountId] = js.undefined
  
  /**
    * The ID of the AWS account of the previous owner of the certificate.
    */
  var previousOwnedBy: js.UndefOr[AwsAccountId] = js.undefined
  
  /**
    * The status of the certificate.
    */
  var status: js.UndefOr[CertificateStatus] = js.undefined
  
  /**
    * The transfer data.
    */
  var transferData: js.UndefOr[TransferData] = js.undefined
  
  /**
    * When the certificate is valid.
    */
  var validity: js.UndefOr[CertificateValidity] = js.undefined
}
object CertificateDescription {
  
  inline def apply(): CertificateDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateDescription]
  }
  
  extension [Self <: CertificateDescription](x: Self) {
    
    inline def setCaCertificateId(value: CertificateId): Self = StObject.set(x, "caCertificateId", value.asInstanceOf[js.Any])
    
    inline def setCaCertificateIdUndefined: Self = StObject.set(x, "caCertificateId", js.undefined)
    
    inline def setCertificateArn(value: CertificateArn): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    inline def setCertificateId(value: CertificateId): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
    
    inline def setCertificateIdUndefined: Self = StObject.set(x, "certificateId", js.undefined)
    
    inline def setCertificateMode(value: CertificateMode): Self = StObject.set(x, "certificateMode", value.asInstanceOf[js.Any])
    
    inline def setCertificateModeUndefined: Self = StObject.set(x, "certificateMode", js.undefined)
    
    inline def setCertificatePem(value: CertificatePem): Self = StObject.set(x, "certificatePem", value.asInstanceOf[js.Any])
    
    inline def setCertificatePemUndefined: Self = StObject.set(x, "certificatePem", js.undefined)
    
    inline def setCreationDate(value: DateType): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setCustomerVersion(value: CustomerVersion): Self = StObject.set(x, "customerVersion", value.asInstanceOf[js.Any])
    
    inline def setCustomerVersionUndefined: Self = StObject.set(x, "customerVersion", js.undefined)
    
    inline def setGenerationId(value: GenerationId): Self = StObject.set(x, "generationId", value.asInstanceOf[js.Any])
    
    inline def setGenerationIdUndefined: Self = StObject.set(x, "generationId", js.undefined)
    
    inline def setLastModifiedDate(value: DateType): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    inline def setOwnedBy(value: AwsAccountId): Self = StObject.set(x, "ownedBy", value.asInstanceOf[js.Any])
    
    inline def setOwnedByUndefined: Self = StObject.set(x, "ownedBy", js.undefined)
    
    inline def setPreviousOwnedBy(value: AwsAccountId): Self = StObject.set(x, "previousOwnedBy", value.asInstanceOf[js.Any])
    
    inline def setPreviousOwnedByUndefined: Self = StObject.set(x, "previousOwnedBy", js.undefined)
    
    inline def setStatus(value: CertificateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setTransferData(value: TransferData): Self = StObject.set(x, "transferData", value.asInstanceOf[js.Any])
    
    inline def setTransferDataUndefined: Self = StObject.set(x, "transferData", js.undefined)
    
    inline def setValidity(value: CertificateValidity): Self = StObject.set(x, "validity", value.asInstanceOf[js.Any])
    
    inline def setValidityUndefined: Self = StObject.set(x, "validity", js.undefined)
  }
}
