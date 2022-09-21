package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateValidity extends StObject {
  
  /**
    * The certificate is not valid after this date.
    */
  var notAfter: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The certificate is not valid before this date.
    */
  var notBefore: js.UndefOr[js.Date] = js.undefined
}
object CertificateValidity {
  
  inline def apply(): CertificateValidity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateValidity]
  }
  
  extension [Self <: CertificateValidity](x: Self) {
    
    inline def setNotAfter(value: js.Date): Self = StObject.set(x, "notAfter", value.asInstanceOf[js.Any])
    
    inline def setNotAfterUndefined: Self = StObject.set(x, "notAfter", js.undefined)
    
    inline def setNotBefore(value: js.Date): Self = StObject.set(x, "notBefore", value.asInstanceOf[js.Any])
    
    inline def setNotBeforeUndefined: Self = StObject.set(x, "notBefore", js.undefined)
  }
}
