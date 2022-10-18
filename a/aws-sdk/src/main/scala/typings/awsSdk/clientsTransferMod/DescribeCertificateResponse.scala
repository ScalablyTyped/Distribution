package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeCertificateResponse extends StObject {
  
  /**
    * The details for the specified certificate, returned as an object.
    */
  var Certificate: DescribedCertificate
}
object DescribeCertificateResponse {
  
  inline def apply(Certificate: DescribedCertificate): DescribeCertificateResponse = {
    val __obj = js.Dynamic.literal(Certificate = Certificate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeCertificateResponse]
  }
  
  extension [Self <: DescribeCertificateResponse](x: Self) {
    
    inline def setCertificate(value: DescribedCertificate): Self = StObject.set(x, "Certificate", value.asInstanceOf[js.Any])
  }
}
