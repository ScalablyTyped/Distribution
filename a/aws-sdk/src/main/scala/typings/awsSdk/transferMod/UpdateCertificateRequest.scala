package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCertificateRequest extends StObject {
  
  /**
    * An optional date that specifies when the certificate becomes active.
    */
  var ActiveDate: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The identifier of the certificate object that you are updating.
    */
  var CertificateId: typings.awsSdk.transferMod.CertificateId
  
  /**
    * A short description to help identify the certificate.
    */
  var Description: js.UndefOr[typings.awsSdk.transferMod.Description] = js.undefined
  
  /**
    * An optional date that specifies when the certificate becomes inactive.
    */
  var InactiveDate: js.UndefOr[js.Date] = js.undefined
}
object UpdateCertificateRequest {
  
  inline def apply(CertificateId: CertificateId): UpdateCertificateRequest = {
    val __obj = js.Dynamic.literal(CertificateId = CertificateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCertificateRequest]
  }
  
  extension [Self <: UpdateCertificateRequest](x: Self) {
    
    inline def setActiveDate(value: js.Date): Self = StObject.set(x, "ActiveDate", value.asInstanceOf[js.Any])
    
    inline def setActiveDateUndefined: Self = StObject.set(x, "ActiveDate", js.undefined)
    
    inline def setCertificateId(value: CertificateId): Self = StObject.set(x, "CertificateId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: Description): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setInactiveDate(value: js.Date): Self = StObject.set(x, "InactiveDate", value.asInstanceOf[js.Any])
    
    inline def setInactiveDateUndefined: Self = StObject.set(x, "InactiveDate", js.undefined)
  }
}
