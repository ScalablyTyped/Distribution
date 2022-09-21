package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddListenerCertificatesOutput extends StObject {
  
  /**
    * Information about the certificates in the certificate list.
    */
  var Certificates: js.UndefOr[CertificateList] = js.undefined
}
object AddListenerCertificatesOutput {
  
  inline def apply(): AddListenerCertificatesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddListenerCertificatesOutput]
  }
  
  extension [Self <: AddListenerCertificatesOutput](x: Self) {
    
    inline def setCertificates(value: CertificateList): Self = StObject.set(x, "Certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesUndefined: Self = StObject.set(x, "Certificates", js.undefined)
    
    inline def setCertificatesVarargs(value: Certificate*): Self = StObject.set(x, "Certificates", js.Array(value*))
  }
}
