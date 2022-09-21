package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CACertificateDescription extends StObject {
  
  /**
    * Whether the CA certificate configured for auto registration of device certificates. Valid values are "ENABLE" and "DISABLE"
    */
  var autoRegistrationStatus: js.UndefOr[AutoRegistrationStatus] = js.undefined
  
  /**
    * The CA certificate ARN.
    */
  var certificateArn: js.UndefOr[CertificateArn] = js.undefined
  
  /**
    * The CA certificate ID.
    */
  var certificateId: js.UndefOr[CertificateId] = js.undefined
  
  /**
    * The mode of the CA.  All the device certificates that are registered using this CA will be registered in the same mode as the CA. For more information about certificate mode for device certificates, see certificate mode.
    */
  var certificateMode: js.UndefOr[CertificateMode] = js.undefined
  
  /**
    * The CA certificate data, in PEM format.
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.undefined
  
  /**
    * The date the CA certificate was created.
    */
  var creationDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The customer version of the CA certificate.
    */
  var customerVersion: js.UndefOr[CustomerVersion] = js.undefined
  
  /**
    * The generation ID of the CA certificate.
    */
  var generationId: js.UndefOr[GenerationId] = js.undefined
  
  /**
    * The date the CA certificate was last modified.
    */
  var lastModifiedDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The owner of the CA certificate.
    */
  var ownedBy: js.UndefOr[AwsAccountId] = js.undefined
  
  /**
    * The status of a CA certificate.
    */
  var status: js.UndefOr[CACertificateStatus] = js.undefined
  
  /**
    * When the CA certificate is valid.
    */
  var validity: js.UndefOr[CertificateValidity] = js.undefined
}
object CACertificateDescription {
  
  inline def apply(): CACertificateDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CACertificateDescription]
  }
  
  extension [Self <: CACertificateDescription](x: Self) {
    
    inline def setAutoRegistrationStatus(value: AutoRegistrationStatus): Self = StObject.set(x, "autoRegistrationStatus", value.asInstanceOf[js.Any])
    
    inline def setAutoRegistrationStatusUndefined: Self = StObject.set(x, "autoRegistrationStatus", js.undefined)
    
    inline def setCertificateArn(value: CertificateArn): Self = StObject.set(x, "certificateArn", value.asInstanceOf[js.Any])
    
    inline def setCertificateArnUndefined: Self = StObject.set(x, "certificateArn", js.undefined)
    
    inline def setCertificateId(value: CertificateId): Self = StObject.set(x, "certificateId", value.asInstanceOf[js.Any])
    
    inline def setCertificateIdUndefined: Self = StObject.set(x, "certificateId", js.undefined)
    
    inline def setCertificateMode(value: CertificateMode): Self = StObject.set(x, "certificateMode", value.asInstanceOf[js.Any])
    
    inline def setCertificateModeUndefined: Self = StObject.set(x, "certificateMode", js.undefined)
    
    inline def setCertificatePem(value: CertificatePem): Self = StObject.set(x, "certificatePem", value.asInstanceOf[js.Any])
    
    inline def setCertificatePemUndefined: Self = StObject.set(x, "certificatePem", js.undefined)
    
    inline def setCreationDate(value: js.Date): Self = StObject.set(x, "creationDate", value.asInstanceOf[js.Any])
    
    inline def setCreationDateUndefined: Self = StObject.set(x, "creationDate", js.undefined)
    
    inline def setCustomerVersion(value: CustomerVersion): Self = StObject.set(x, "customerVersion", value.asInstanceOf[js.Any])
    
    inline def setCustomerVersionUndefined: Self = StObject.set(x, "customerVersion", js.undefined)
    
    inline def setGenerationId(value: GenerationId): Self = StObject.set(x, "generationId", value.asInstanceOf[js.Any])
    
    inline def setGenerationIdUndefined: Self = StObject.set(x, "generationId", js.undefined)
    
    inline def setLastModifiedDate(value: js.Date): Self = StObject.set(x, "lastModifiedDate", value.asInstanceOf[js.Any])
    
    inline def setLastModifiedDateUndefined: Self = StObject.set(x, "lastModifiedDate", js.undefined)
    
    inline def setOwnedBy(value: AwsAccountId): Self = StObject.set(x, "ownedBy", value.asInstanceOf[js.Any])
    
    inline def setOwnedByUndefined: Self = StObject.set(x, "ownedBy", js.undefined)
    
    inline def setStatus(value: CACertificateStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
    
    inline def setValidity(value: CertificateValidity): Self = StObject.set(x, "validity", value.asInstanceOf[js.Any])
    
    inline def setValidityUndefined: Self = StObject.set(x, "validity", js.undefined)
  }
}
