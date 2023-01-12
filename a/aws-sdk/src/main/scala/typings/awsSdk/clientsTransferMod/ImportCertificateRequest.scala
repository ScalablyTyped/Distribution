package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportCertificateRequest extends StObject {
  
  /**
    * An optional date that specifies when the certificate becomes active.
    */
  var ActiveDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The file that contains the certificate to import.
    */
  var Certificate: CertificateBodyType
  
  /**
    * An optional list of certificates that make up the chain for the certificate that's being imported.
    */
  var CertificateChain: js.UndefOr[CertificateChainType] = js.undefined
  
  /**
    * A short description that helps identify the certificate. 
    */
  var Description: js.UndefOr[typings.awsSdk.clientsTransferMod.Description] = js.undefined
  
  /**
    * An optional date that specifies when the certificate becomes inactive.
    */
  var InactiveDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The file that contains the private key for the certificate that's being imported.
    */
  var PrivateKey: js.UndefOr[PrivateKeyType] = js.undefined
  
  /**
    * Key-value pairs that can be used to group and search for certificates.
    */
  var Tags: js.UndefOr[typings.awsSdk.clientsTransferMod.Tags] = js.undefined
  
  /**
    * Specifies whether this certificate is used for signing or encryption.
    */
  var Usage: CertificateUsageType
}
object ImportCertificateRequest {
  
  inline def apply(Certificate: CertificateBodyType, Usage: CertificateUsageType): ImportCertificateRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any], Usage = Usage.asInstanceOf[js.Any])
    __obj.asInstanceOf[ImportCertificateRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImportCertificateRequest] (val x: Self) extends AnyVal {
    
    inline def setActiveDate(value: js.Date): Self = StObject.set(x, "ActiveDate", value.asInstanceOf[js.Any])
    
    inline def setActiveDateUndefined: Self = StObject.set(x, "ActiveDate", js.undefined)
    
    inline def setCertificate(value: CertificateBodyType): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateChain(value: CertificateChainType): Self = StObject.set(x, "CertificateChain", value.asInstanceOf[js.Any])
    
    inline def setCertificateChainUndefined: Self = StObject.set(x, "CertificateChain", js.undefined)
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInactiveDate(value: js.Date): Self = StObject.set(x, "InactiveDate", value.asInstanceOf[js.Any])
    
    inline def setInactiveDateUndefined: Self = StObject.set(x, "InactiveDate", js.undefined)
    
    inline def setPrivateKey(value: PrivateKeyType): Self = StObject.set(x, "PrivateKey", value.asInstanceOf[js.Any])
    
    inline def setPrivateKeyUndefined: Self = StObject.set(x, "PrivateKey", js.undefined)
    
    inline def setTags(value: Tags): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
    
    inline def setUsage(value: CertificateUsageType): Self = StObject.set(x, "Usage", value.asInstanceOf[js.Any])
  }
}
