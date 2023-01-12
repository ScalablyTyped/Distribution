package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListCertificatesResponse extends StObject {
  
  /**
    * Returns an array of the certificates that are specified in the ListCertificates call.
    */
  var Certificates: ListedCertificates
  
  /**
    * Returns the next token, which you can use to list the next certificate.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clientsTransferMod.NextToken] = js.undefined
}
object ListCertificatesResponse {
  
  inline def apply(Certificates: ListedCertificates): ListCertificatesResponse = {
    val __obj = js.Dynamic.literal(Certificates = Certificates.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListCertificatesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListCertificatesResponse] (val x: Self) extends AnyVal {
    
    inline def setCertificates(value: ListedCertificates): Self = StObject.set(x, "Certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesVarargs(value: ListedCertificate*): Self = StObject.set(x, "Certificates", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
