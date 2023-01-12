package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListedCertificate extends StObject {
  
  /**
    * An optional date that specifies when the certificate becomes active.
    */
  var ActiveDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the specified certificate.
    */
  var Arn: js.UndefOr[typings.awsSdk.clientsTransferMod.Arn] = js.undefined
  
  /**
    * An array of identifiers for the imported certificates. You use this identifier for working with profiles and partner profiles.
    */
  var CertificateId: js.UndefOr[typings.awsSdk.clientsTransferMod.CertificateId] = js.undefined
  
  /**
    * The name or short description that's used to identify the certificate.
    */
  var Description: js.UndefOr[typings.awsSdk.clientsTransferMod.Description] = js.undefined
  
  /**
    * An optional date that specifies when the certificate becomes inactive.
    */
  var InactiveDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The certificate can be either ACTIVE, PENDING_ROTATION, or INACTIVE. PENDING_ROTATION means that this certificate will replace the current certificate when it expires.
    */
  var Status: js.UndefOr[CertificateStatusType] = js.undefined
  
  /**
    * The type for the certificate. If a private key has been specified for the certificate, its type is CERTIFICATE_WITH_PRIVATE_KEY. If there is no private key, the type is CERTIFICATE.
    */
  var Type: js.UndefOr[CertificateType] = js.undefined
  
  /**
    * Specifies whether this certificate is used for signing or encryption.
    */
  var Usage: js.UndefOr[CertificateUsageType] = js.undefined
}
object ListedCertificate {
  
  inline def apply(): ListedCertificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListedCertificate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListedCertificate] (val x: Self) extends AnyVal {
    
    inline def setActiveDate(value: js.Date): Self = StObject.set(x, "ActiveDate", value.asInstanceOf[js.Any])
    
    inline def setActiveDateUndefined: Self = StObject.set(x, "ActiveDate", js.undefined)
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setArnUndefined: Self = StObject.set(x, "Arn", js.undefined)
    
    inline def setCertificateId(value: CertificateId): Self = StObject.set(x, "CertificateId", value.asInstanceOf[js.Any])
    
    inline def setCertificateIdUndefined: Self = StObject.set(x, "CertificateId", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInactiveDate(value: js.Date): Self = StObject.set(x, "InactiveDate", value.asInstanceOf[js.Any])
    
    inline def setInactiveDateUndefined: Self = StObject.set(x, "InactiveDate", js.undefined)
    
    inline def setStatus(value: CertificateStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setType(value: CertificateType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setUsage(value: CertificateUsageType): Self = StObject.set(x, "Usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "Usage", js.undefined)
  }
}
