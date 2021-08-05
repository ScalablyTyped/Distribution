package typings.awsSdk.elbv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddListenerCertificatesInput extends StObject {
  
  /**
    * The certificate to add. You can specify one certificate per call. Set CertificateArn to the certificate ARN but do not set IsDefault.
    */
  var Certificates: CertificateList
  
  /**
    * The Amazon Resource Name (ARN) of the listener.
    */
  var ListenerArn: typings.awsSdk.elbv2Mod.ListenerArn
}
object AddListenerCertificatesInput {
  
  inline def apply(Certificates: CertificateList, ListenerArn: ListenerArn): AddListenerCertificatesInput = {
    val __obj = js.Dynamic.literal(Certificates = Certificates.asInstanceOf[js.Any], ListenerArn = ListenerArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddListenerCertificatesInput]
  }
  
  extension [Self <: AddListenerCertificatesInput](x: Self) {
    
    inline def setCertificates(value: CertificateList): Self = StObject.set(x, "Certificates", value.asInstanceOf[js.Any])
    
    inline def setCertificatesVarargs(value: Certificate*): Self = StObject.set(x, "Certificates", js.Array(value :_*))
    
    inline def setListenerArn(value: ListenerArn): Self = StObject.set(x, "ListenerArn", value.asInstanceOf[js.Any])
  }
}
