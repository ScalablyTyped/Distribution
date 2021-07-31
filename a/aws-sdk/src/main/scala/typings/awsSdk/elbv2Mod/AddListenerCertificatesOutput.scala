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
  
  @scala.inline
  def apply(): AddListenerCertificatesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddListenerCertificatesOutput]
  }
  
  @scala.inline
  implicit class AddListenerCertificatesOutputMutableBuilder[Self <: AddListenerCertificatesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCertificates(value: CertificateList): Self = StObject.set(x, "Certificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCertificatesUndefined: Self = StObject.set(x, "Certificates", js.undefined)
    
    @scala.inline
    def setCertificatesVarargs(value: Certificate*): Self = StObject.set(x, "Certificates", js.Array(value :_*))
  }
}
