package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribedCertificate extends StObject {
  
  /**
    * An optional date that specifies when the certificate becomes active.
    */
  var ActiveDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The unique Amazon Resource Name (ARN) for the certificate.
    */
  var Arn: typings.awsSdk.clientsTransferMod.Arn
  
  /**
    * The file name for the certificate.
    */
  var Certificate: js.UndefOr[CertificateBodyType] = js.undefined
  
  /**
    * The list of certificates that make up the chain for the certificate.
    */
  var CertificateChain: js.UndefOr[CertificateChainType] = js.undefined
  
  /**
    * An array of identifiers for the imported certificates. You use this identifier for working with profiles and partner profiles.
    */
  var CertificateId: js.UndefOr[typings.awsSdk.clientsTransferMod.CertificateId] = js.undefined
  
  /**
    * The name or description that's used to identity the certificate. 
    */
  var Description: js.UndefOr[typings.awsSdk.clientsTransferMod.Description] = js.undefined
  
  /**
    * An optional date that specifies when the certificate becomes inactive.
    */
  var InactiveDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The final date that the certificate is valid.
    */
  var NotAfterDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The earliest date that the certificate is valid.
    */
  var NotBeforeDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The serial number for the certificate.
    */
  var Serial: js.UndefOr[CertSerial] = js.undefined
  
  /**
    * The certificate can be either ACTIVE, PENDING_ROTATION, or INACTIVE. PENDING_ROTATION means that this certificate will replace the current certificate when it expires.
    */
  var Status: js.UndefOr[CertificateStatusType] = js.undefined
  
  /**
    * Key-value pairs that can be used to group and search for certificates.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsTransferMod.Tags] = js.undefined
  
  /**
    * If a private key has been specified for the certificate, its type is CERTIFICATE_WITH_PRIVATE_KEY. If there is no private key, the type is CERTIFICATE.
    */
  var Type: js.UndefOr[CertificateType] = js.undefined
  
  /**
    * Specifies whether this certificate is used for signing or encryption.
    */
  var Usage: js.UndefOr[CertificateUsageType] = js.undefined
}
object DescribedCertificate {
  
  inline def apply(Arn: Arn): DescribedCertificate = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribedCertificate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribedCertificate] (val x: Self) extends AnyVal {
    
    inline def setActiveDate(value: js.Date): Self = StObject.set(x, "ActiveDate", value.asInstanceOf[js.Any])
    
    inline def setActiveDateUndefined: Self = StObject.set(x, "ActiveDate", js.undefined)
    
    inline def setArn(value: Arn): Self = StObject.set(x, "Arn", value.asInstanceOf[js.Any])
    
    inline def setCertificate(value: CertificateBodyType): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateChain(value: CertificateChainType): Self = StObject.set(x, "CertificateChain", value.asInstanceOf[js.Any])
    
    inline def setCertificateChainUndefined: Self = StObject.set(x, "CertificateChain", js.undefined)
    
    inline def setCertificateId(value: CertificateId): Self = StObject.set(x, "CertificateId", value.asInstanceOf[js.Any])
    
    inline def setCertificateIdUndefined: Self = StObject.set(x, "CertificateId", js.undefined)
    
    inline def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInactiveDate(value: js.Date): Self = StObject.set(x, "InactiveDate", value.asInstanceOf[js.Any])
    
    inline def setInactiveDateUndefined: Self = StObject.set(x, "InactiveDate", js.undefined)
    
    inline def setNotAfterDate(value: js.Date): Self = StObject.set(x, "NotAfterDate", value.asInstanceOf[js.Any])
    
    inline def setNotAfterDateUndefined: Self = StObject.set(x, "NotAfterDate", js.undefined)
    
    inline def setNotBeforeDate(value: js.Date): Self = StObject.set(x, "NotBeforeDate", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeDateUndefined: Self = StObject.set(x, "NotBeforeDate", js.undefined)
    
    inline def setSerial(value: CertSerial): Self = StObject.set(x, "Serial", value.asInstanceOf[js.Any])
    
    inline def setSerialUndefined: Self = StObject.set(x, "Serial", js.undefined)
    
    inline def setStatus(value: CertificateStatusType): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setType(value: CertificateType): Self = StObject.set(x, "Type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "Type", js.undefined)
    
    inline def setUsage(value: CertificateUsageType): Self = StObject.set(x, "Usage", value.asInstanceOf[js.Any])
    
    inline def setUsageUndefined: Self = StObject.set(x, "Usage", js.undefined)
  }
}
