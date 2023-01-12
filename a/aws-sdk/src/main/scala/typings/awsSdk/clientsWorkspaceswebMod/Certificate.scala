package typings.awsSdk.clientsWorkspaceswebMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Certificate extends StObject {
  
  /**
    * The body of the certificate.
    */
  var body: js.UndefOr[CertificateAuthorityBody] = js.undefined
  
  /**
    * The entity that issued the certificate.
    */
  var issuer: js.UndefOr[CertificatePrincipal] = js.undefined
  
  /**
    * The certificate is not valid after this date.
    */
  var notValidAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The certificate is not valid before this date.
    */
  var notValidBefore: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The entity the certificate belongs to.
    */
  var subject: js.UndefOr[CertificatePrincipal] = js.undefined
  
  /**
    * A hexadecimal identifier for the certificate.
    */
  var thumbprint: js.UndefOr[CertificateThumbprint] = js.undefined
}
object Certificate {
  
  inline def apply(): Certificate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Certificate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Certificate] (val x: Self) extends AnyVal {
    
    inline def setBody(value: CertificateAuthorityBody): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setIssuer(value: CertificatePrincipal): Self = StObject.set(x, "issuer", value.asInstanceOf[js.Any])
    
    inline def setIssuerUndefined: Self = StObject.set(x, "issuer", js.undefined)
    
    inline def setNotValidAfter(value: js.Date): Self = StObject.set(x, "notValidAfter", value.asInstanceOf[js.Any])
    
    inline def setNotValidAfterUndefined: Self = StObject.set(x, "notValidAfter", js.undefined)
    
    inline def setNotValidBefore(value: js.Date): Self = StObject.set(x, "notValidBefore", value.asInstanceOf[js.Any])
    
    inline def setNotValidBeforeUndefined: Self = StObject.set(x, "notValidBefore", js.undefined)
    
    inline def setSubject(value: CertificatePrincipal): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
    
    inline def setThumbprint(value: CertificateThumbprint): Self = StObject.set(x, "thumbprint", value.asInstanceOf[js.Any])
    
    inline def setThumbprintUndefined: Self = StObject.set(x, "thumbprint", js.undefined)
  }
}
