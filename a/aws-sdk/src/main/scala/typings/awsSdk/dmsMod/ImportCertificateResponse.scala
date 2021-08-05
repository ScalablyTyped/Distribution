package typings.awsSdk.dmsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImportCertificateResponse extends StObject {
  
  /**
    * The certificate to be uploaded.
    */
  var Certificate: js.UndefOr[typings.awsSdk.dmsMod.Certificate] = js.undefined
}
object ImportCertificateResponse {
  
  inline def apply(): ImportCertificateResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImportCertificateResponse]
  }
  
  extension [Self <: ImportCertificateResponse](x: Self) {
    
    inline def setCertificate(value: Certificate): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
    
    inline def setCertificateUndefined: Self = StObject.set(x, "Certificate", js.undefined)
  }
}
